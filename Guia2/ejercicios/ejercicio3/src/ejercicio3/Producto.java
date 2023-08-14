/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio3;

/**
 *
 * @author Owner
 */
public abstract class Producto {
    
    private String nombre;
    private double preciol;
    private String categoria;

    public Producto(String nombre, double preciol, String categoria) {
        this.nombre = nombre;
        this.preciol = preciol;
        this.categoria = categoria;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPreciol() {
        return preciol;
    }

    public void setPreciol(double preciol) {
        this.preciol = preciol;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    
    
    
}
