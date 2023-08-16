/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio4;

/**
 *
 * @author Owner
 */
public class Producto implements Comparable<Producto> {
    
    private int stock;
    private int codigo;
    private String descripcion;
    private double precio;
    private Categorias rubro;

    public Producto() {
    }
 

    public Producto(int stock, int codigo, String descripcion, double precio, Categorias rubro) {
        this.stock = stock;
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.precio = precio;
        this.rubro = rubro;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public Categorias getRubro() {
        return rubro;
    }

    public void setRubro(Categorias rubro) {
        this.rubro = rubro;
    }
    
    @Override
    public int compareTo(Producto o) {
        return Integer.compare(this.codigo,o.getCodigo());
    }

    @Override
    public String toString() {
        return "Producto{" + "stock=" + stock + ", codigo=" + codigo + ", descripcion=" + descripcion + ", precio=" + precio + ", rubro=" + rubro + '}';
    }
    
    
    
    
}
