/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.edu.com.unlar.Objetos;

/**
 *
 * @author Fabry
 */
public class TipoCliente {
    private Integer id;
    
    private String descripcion;
   

    public TipoCliente() {
    }

    public TipoCliente(Integer id, String descripcion) {
        this.id = id;
        this.descripcion = descripcion;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    

    @Override
    public String toString() {
        return  this.getDescripcion();
    }
    
    
    
}
