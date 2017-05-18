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
public class Obra {
    private String nombre;
    private String descripcion;
    private String estilo;
    private int precio;

    public Obra(String nombre, String descripcion, String estilo, int precio) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.estilo = estilo;
        this.precio = precio;
    }
    
    public String informacionObra(){
        return ("Nombre :" + this.nombre + " Descripcion: " + this.descripcion + " Estilo: " + this.estilo + " Precio: " + this.precio);
    }
}
