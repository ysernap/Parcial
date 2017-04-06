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
public class Estudiante {
    private int a1;
    private int mRegistradas;
    private Materia[] bs;
    
    public Estudiante(){
        bs = new Materia[6];
        bs[0] = new Materia(1);
        bs[1] = new Materia(2);
        bs[2] = new Materia(3);
        bs[3] = new Materia(4);
        bs[4] = new Materia(5);
        bs[5] = new Materia(6);
    }
    
    
    public void addMateria(int b){
        if(mRegistradas < 6){
            this.bs[mRegistradas] = new Materia(b);
            mRegistradas++;
        }
    }
    
    public void imprimirMaterias(){
            for (Materia b : bs){
                System.out.println(b);
            }
    }

    public int getA1() {
        return a1;
    }

    public void setA1(int a1) {
        this.a1 = a1;
    }

    public Materia[] getBs() {
        return bs;
    }

    public void setBs(Materia[] bs) {
        this.bs = bs;
    }
    
    
}
