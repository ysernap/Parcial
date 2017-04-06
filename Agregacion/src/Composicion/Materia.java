package Composicion;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Estudiante
 */
public class Materia {
    private int b1;

    public Materia(int b1) {
        this.b1 = b1;
    }

    public int getB1() {
        return b1;
    }

    public void setB1(int b1) {
        this.b1 = b1;
    }

    @Override
    public String toString() {
        return "Materia{" + "b1=" + b1 + '}';
    }
    
    
}
