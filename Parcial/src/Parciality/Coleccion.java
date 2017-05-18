/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Parciality;

import java.util.ArrayList;

/**
 *
 * @author Estudiante
 */
public class Coleccion {
    
    private ArrayList<Obra> obrasDisponibles;
    
    public Coleccion(){
        this.obrasDisponibles = new ArrayList<>();
    }
    
    public void agregarObra(Obra o){
        this.obrasDisponibles.add(o);
    }
    
    public String listarObras(){
        System.out.println("Obras Disponibles: ");
        String informacion = "";
        for (Obra obra : obrasDisponibles) {
            informacion += obra.informacionObra() + "\n";
        }
        return informacion;
    }
}
