/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package ejercicio2;

/**
 *
 * @author Owner
 */
public enum CodigosPaises {
    ARGENTINA("+54"),CANADA("+1"),ESTADOS_UNIDOS("+1"),MEXICO("+52"),
    PERU("+51"),BRASIL("+55"),COLOMBIA("+57"),CHILE("+56"),BOLIVIA("+591"),VENEZUELA("+58"),
    GUAYANA("+592"),ECUADOR("+593"),PARAGUAY("+595"),URUGUAY("++598"),GUAYANA_FRANCESA("+594"),
    SURINAM("+597");
    ;
    
    private String codigo;
    
    private CodigosPaises(String codigo) {
        this.codigo = codigo;
    }
    
    public String getCodigo(){
        return this.codigo;
    }
}
