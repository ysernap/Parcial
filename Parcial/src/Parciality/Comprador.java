/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Parciality;

/**
 *
 * @author Estudiante
 */
public class Comprador extends Usuario{

    public Comprador(String nombre, String apellido) {
        super(nombre, apellido);
    }

   @Override
    public String informacionUsuario() {
        return ("Nombre: " + this.nombre + " " + this.apellido);
    }
    
}
