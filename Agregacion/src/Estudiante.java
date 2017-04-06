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
        
    }
    
    public Estudiante(int a, Materia[] b){
        if(b.length < 6){
            this.bs = b;
        }
    }
    
    public void addMateria(Materia b){
        if(mRegistradas < 6){
            this.bs[mRegistradas] = b;
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
