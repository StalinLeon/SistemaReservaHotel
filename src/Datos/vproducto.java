/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

/**
 *
 * @author stalin
 */
public class vproducto {
    private int idProducto;
    private String nombre;
    private String descripcion;
    private String unidadMedida;
    private Double precioVenta;

    public vproducto(int idProducto, String nombre, String descripcion, String unidadMedida, Double precioVenta) {
        this.idProducto = idProducto;
        this.nombre = nombre;
        this.descripcion = descripcion;        
        this.unidadMedida = unidadMedida;
        this.precioVenta = precioVenta;
    }

    public vproducto() {
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getUnidadMedida() {
        return unidadMedida;
    }

    public void setUnidadMediad(String unidadMedida) {
        this.unidadMedida = unidadMedida;
    }

    public Double getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(Double precioVenta) {
        this.precioVenta = precioVenta;
    }
    
    
    
}
