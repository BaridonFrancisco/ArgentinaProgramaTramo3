/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio2;

/**
 *
 * @author Owner
 */
class NumeroTelefonico {
    private String codigoPais;
    private String area;
    private String numero;

    public NumeroTelefonico(String codigoPais, String area, String numero) {
        this.codigoPais = codigoPais;
        this.area = area;
        this.numero = numero;
    }

    public String getCodigoPais() {
        return codigoPais;
    }

    public void setCodigoPais(String codigoPais) {
        this.codigoPais = codigoPais;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }
    
    

    @Override
    public String toString() {
        return this.codigoPais+this.area+this.numero;
    }
    
    
    
}
