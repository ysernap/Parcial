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
public class Artista extends Usuario{
    
    private String curriculum;
    private String distinciones;
    private ArrayList<Obra> obras;

    public Artista(String nombre, String apellido, String curriculum, String distinciones) {
        super(nombre, apellido);
        this.curriculum = curriculum;
        this.distinciones = distinciones;
        this.obras = new ArrayList<>();
    }

    public ArrayList<Obra> getObras() {
        return obras;
    }

    public void setObras(ArrayList<Obra> obras) {
        this.obras = obras;
    }
    
    public void agregarObra(Obra o){
        this.obras.add(o);
    }
    
    public String listarObras(){
        String informacion = "";
        for (Obra obra : obras) {
            informacion += obra.informacionObra() + "\n";
        }
        return informacion;
    }

    public String getCurriculum() {
        return curriculum;
    }

    public void setCurriculum(String curriculum) {
        this.curriculum = curriculum;
    }

    public String getDistinciones() {
        return distinciones;
    }

    public void setDistinciones(String distinciones) {
        this.distinciones = distinciones;
    }
    
    

    @Override
    public String informacionUsuario() {
        return ("Nombre: " + this.nombre + " " + this.apellido + " Curriculum: " + this.curriculum + " Distinciones: " + this.distinciones);
    }
    
}
