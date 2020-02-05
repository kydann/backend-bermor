package org.websparrow.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Producto")
public class Producto implements Serializable {

    private static long serialVersionUID = 1681261145191719508L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String cliente;
    private String fecha;
    private String no_operacion;
    private String pedido;
    private String ref_sae;
    private String producto;
    private String color;
    private String pigmentado;
    private String sae;
    private String cantidad;
    private String clave;
    private String factor_conversion;
    private String piezas;
    private String caja;
    private String bolsa;
    private String clave_empaque;
    private String observaciones;
    private String descripcion;
    private String cant_insumos;
    private String cant_arr_maquina;
    private String desc_arr_maquina;
    private String cant_produccion;
    private String desc_produccion;
    private String cant_total_mat_prima;
    private String desc_total_mat_prima;
    private String observaciones_gral;

    /**
     * @return the serialVersionUID
     */
    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    /**
     * @param aSerialVersionUID the serialVersionUID to set
     */
    public static void setSerialVersionUID(long aSerialVersionUID) {
        serialVersionUID = aSerialVersionUID;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the cliente
     */
    public String getCliente() {
        return cliente;
    }

    /**
     * @param cliente the cliente to set
     */
    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    /**
     * @return the fecha
     */
    public String getFecha() {
        return fecha;
    }

    /**
     * @param fecha the fecha to set
     */
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    /**
     * @return the no_operacion
     */
    public String getNo_operacion() {
        return no_operacion;
    }

    /**
     * @param no_operacion the no_operacion to set
     */
    public void setNo_operacion(String no_operacion) {
        this.no_operacion = no_operacion;
    }

    /**
     * @return the pedido
     */
    public String getPedido() {
        return pedido;
    }

    /**
     * @param pedido the pedido to set
     */
    public void setPedido(String pedido) {
        this.pedido = pedido;
    }

    /**
     * @return the ref_sae
     */
    public String getRef_sae() {
        return ref_sae;
    }

    /**
     * @param ref_sae the ref_sae to set
     */
    public void setRef_sae(String ref_sae) {
        this.ref_sae = ref_sae;
    }

    /**
     * @return the producto
     */
    public String getProducto() {
        return producto;
    }

    /**
     * @param producto the producto to set
     */
    public void setProducto(String producto) {
        this.producto = producto;
    }

    /**
     * @return the color
     */
    public String getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * @return the pigmentado
     */
    public String getPigmentado() {
        return pigmentado;
    }

    /**
     * @param pigmentado the pigmentado to set
     */
    public void setPigmentado(String pigmentado) {
        this.pigmentado = pigmentado;
    }

    /**
     * @return the sae
     */
    public String getSae() {
        return sae;
    }

    /**
     * @param sae the sae to set
     */
    public void setSae(String sae) {
        this.sae = sae;
    }

    /**
     * @return the cantidad
     */
    public String getCantidad() {
        return cantidad;
    }

    /**
     * @param cantidad the cantidad to set
     */
    public void setCantidad(String cantidad) {
        this.cantidad = cantidad;
    }

    /**
     * @return the clave
     */
    public String getClave() {
        return clave;
    }

    /**
     * @param clave the clave to set
     */
    public void setClave(String clave) {
        this.clave = clave;
    }

    /**
     * @return the factor_conversion
     */
    public String getFactor_conversion() {
        return factor_conversion;
    }

    /**
     * @param factor_conversion the factor_conversion to set
     */
    public void setFactor_conversion(String factor_conversion) {
        this.factor_conversion = factor_conversion;
    }

    /**
     * @return the piezas
     */
    public String getPiezas() {
        return piezas;
    }

    /**
     * @param piezas the piezas to set
     */
    public void setPiezas(String piezas) {
        this.piezas = piezas;
    }

    /**
     * @return the caja
     */
    public String getCaja() {
        return caja;
    }

    /**
     * @param caja the caja to set
     */
    public void setCaja(String caja) {
        this.caja = caja;
    }

    /**
     * @return the bolsa
     */
    public String getBolsa() {
        return bolsa;
    }

    /**
     * @param bolsa the bolsa to set
     */
    public void setBolsa(String bolsa) {
        this.bolsa = bolsa;
    }

    /**
     * @return the clave_empaque
     */
    public String getClave_empaque() {
        return clave_empaque;
    }

    /**
     * @param clave_empaque the clave_empaque to set
     */
    public void setClave_empaque(String clave_empaque) {
        this.clave_empaque = clave_empaque;
    }

    /**
     * @return the observaciones
     */
    public String getObservaciones() {
        return observaciones;
    }

    /**
     * @param observaciones the observaciones to set
     */
    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    /**
     * @return the descripcion
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * @param descripcion the descripcion to set
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     * @return the cant_insumos
     */
    public String getCant_insumos() {
        return cant_insumos;
    }

    /**
     * @param cant_insumos the cant_insumos to set
     */
    public void setCant_insumos(String cant_insumos) {
        this.cant_insumos = cant_insumos;
    }

    /**
     * @return the cant_arr_maquina
     */
    public String getCant_arr_maquina() {
        return cant_arr_maquina;
    }

    /**
     * @param cant_arr_maquina the cant_arr_maquina to set
     */
    public void setCant_arr_maquina(String cant_arr_maquina) {
        this.cant_arr_maquina = cant_arr_maquina;
    }

    /**
     * @return the desc_arr_maquina
     */
    public String getDesc_arr_maquina() {
        return desc_arr_maquina;
    }

    /**
     * @param desc_arr_maquina the desc_arr_maquina to set
     */
    public void setDesc_arr_maquina(String desc_arr_maquina) {
        this.desc_arr_maquina = desc_arr_maquina;
    }

    /**
     * @return the cant_produccion
     */
    public String getCant_produccion() {
        return cant_produccion;
    }

    /**
     * @param cant_produccion the cant_produccion to set
     */
    public void setCant_produccion(String cant_produccion) {
        this.cant_produccion = cant_produccion;
    }

    /**
     * @return the desc_produccion
     */
    public String getDesc_produccion() {
        return desc_produccion;
    }

    /**
     * @param desc_produccion the desc_produccion to set
     */
    public void setDesc_produccion(String desc_produccion) {
        this.desc_produccion = desc_produccion;
    }

    /**
     * @return the cant_total_mat_prima
     */
    public String getCant_total_mat_prima() {
        return cant_total_mat_prima;
    }

    /**
     * @param cant_total_mat_prima the cant_total_mat_prima to set
     */
    public void setCant_total_mat_prima(String cant_total_mat_prima) {
        this.cant_total_mat_prima = cant_total_mat_prima;
    }

    /**
     * @return the desc_total_mat_prima
     */
    public String getDesc_total_mat_prima() {
        return desc_total_mat_prima;
    }

    /**
     * @param desc_total_mat_prima the desc_total_mat_prima to set
     */
    public void setDesc_total_mat_prima(String desc_total_mat_prima) {
        this.desc_total_mat_prima = desc_total_mat_prima;
    }

    /**
     * @return the observaciones_gral
     */
    public String getObservaciones_gral() {
        return observaciones_gral;
    }

    /**
     * @param observaciones_gral the observaciones_gral to set
     */
    public void setObservaciones_gral(String observaciones_gral) {
        this.observaciones_gral = observaciones_gral;
    }

    
    
    
}
