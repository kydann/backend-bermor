package org.websparrow.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Usuarios")
public class Usuarios implements Serializable {

	private static long serialVersionUID = 1681261145191719508L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String nombre;
	private String ap_pat;
	private String ap_mat;
	private String email;
	private String puesto;
	private String id_unico;

// Generate Getters and Setters...

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
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the ap_pat
     */
    public String getAp_pat() {
        return ap_pat;
    }

    /**
     * @param ap_pat the ap_pat to set
     */
    public void setAp_pat(String ap_pat) {
        this.ap_pat = ap_pat;
    }

    /**
     * @return the ap_mat
     */
    public String getAp_mat() {
        return ap_mat;
    }

    /**
     * @param ap_mat the ap_mat to set
     */
    public void setAp_mat(String ap_mat) {
        this.ap_mat = ap_mat;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the puesto
     */
    public String getPuesto() {
        return puesto;
    }

    /**
     * @param puesto the puesto to set
     */
    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    /**
     * @return the id_unico
     */
    public String getId_unico() {
        return id_unico;
    }

    /**
     * @param id_unico the id_unico to set
     */
    public void setId_unico(String id_unico) {
        this.id_unico = id_unico;
    }
    
}