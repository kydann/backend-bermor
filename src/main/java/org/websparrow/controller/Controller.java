package org.websparrow.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.websparrow.entity.Clientes;
import org.websparrow.entity.Usuarios;
import org.websparrow.entity.Producto;
import org.websparrow.model.Response;
import org.websparrow.service.ClientService;
import org.websparrow.service.UserService;
import org.websparrow.service.ProductService;

@RestController(value = "/api")
public class Controller {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/allUsers", method = RequestMethod.GET)
    public ResponseEntity<Response> getUsers() {
        return ResponseEntity.status(HttpStatus.OK).body(new Response(userService.get(), new Date()));
    }

    @RequestMapping(value = "/postUser", method = RequestMethod.POST)
    public ResponseEntity<Response> saveUsers(@RequestBody Usuarios user) {
        return ResponseEntity.status(HttpStatus.OK).body(new Response(userService.save(user), new Date()));
    }

    @RequestMapping(value = "/updateUser", method = RequestMethod.PUT)
    public ResponseEntity<Response> updateUsers(@RequestBody Usuarios user) {
        return ResponseEntity.status(HttpStatus.OK).body(new Response(userService.save(user), new Date()));
    }

    @RequestMapping(value = "/deleteUser", method = RequestMethod.DELETE)
    public ResponseEntity<Response> deleteUsers(@RequestParam("id") int id) {
        userService.delete(id);
        return ResponseEntity.status(HttpStatus.OK).body(new Response(true, new Date()));
    }

    @Autowired
    private ClientService clientService;

    @RequestMapping(value = "/allClients", method = RequestMethod.GET)
    public ResponseEntity<Response> getClient() {
        return ResponseEntity.status(HttpStatus.OK).body(new Response(clientService.get(), new Date()));
    }

    @RequestMapping(value = "/postClient", method = RequestMethod.POST)
    public ResponseEntity<Response> saveClient(@RequestBody Clientes client) {
        return ResponseEntity.status(HttpStatus.OK).body(new Response(clientService.save(client), new Date()));
    }

    @RequestMapping(value = "/updateClient", method = RequestMethod.PUT)
    public ResponseEntity<Response> updateClient(@RequestBody Clientes client) {
        return ResponseEntity.status(HttpStatus.OK).body(new Response(clientService.save(client), new Date()));
    }

    @RequestMapping(value = "/deleteClient", method = RequestMethod.DELETE)
    public ResponseEntity<Response> deleteClient(@RequestParam("id") int id) {
        clientService.delete(id);
        return ResponseEntity.status(HttpStatus.OK).body(new Response(true, new Date()));
    }
    
    @Autowired
    private ProductService productService;

    @RequestMapping(value = "/allProducts", method = RequestMethod.GET)
    public ResponseEntity<Response> get() {
        return ResponseEntity.status(HttpStatus.OK).body(new Response(productService.get(), new Date()));
    }

    @RequestMapping(value = "/postProduct", method = RequestMethod.POST)
    public ResponseEntity<Response> save(@RequestBody Producto product) {
        return ResponseEntity.status(HttpStatus.OK).body(new Response(productService.save(product), new Date()));
    }

    @RequestMapping(value = "/updateProduct", method = RequestMethod.PUT)
    public ResponseEntity<Response> update(@RequestBody Producto product) {
        return ResponseEntity.status(HttpStatus.OK).body(new Response(productService.save(product), new Date()));
    }

    @RequestMapping(value = "/deleteProduct", method = RequestMethod.DELETE)
    public ResponseEntity<Response> delete(@RequestParam("id") int id) {
        productService.delete(id);
        return ResponseEntity.status(HttpStatus.OK).body(new Response(true, new Date()));
    }
    
}
