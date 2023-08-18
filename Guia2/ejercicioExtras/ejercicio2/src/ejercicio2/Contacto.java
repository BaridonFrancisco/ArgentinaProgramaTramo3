/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio2;

import java.util.regex.Pattern;

/**
 *
 * @author Owner
 */
public class Contacto {
    private String nombre;
    private String apellido;
    private String email;
    private NumeroTelefonico numerol;

    public Contacto(String nombre, String apellido, String email, NumeroTelefonico numerol) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.numerol = numerol;
    }
    
    
    private void verificarEmail(String email){
        Pattern patron=Pattern.compile("^[A-Za-z]+@.*$");
        
    }
}
