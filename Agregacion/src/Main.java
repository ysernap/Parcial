/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Estudiante
 */
public class Main {
    public static void main(String[] args) {
        Estudiante estudiante = new Estudiante();
        
        Materia m1 = new Materia(1);
        Materia m2 = new Materia(2);
        Materia m3 = new Materia(3);
        Materia m4 = new Materia(4);
        Materia m5 = new Materia(5);
        Materia m6 = new Materia(6);
        
        estudiante.addMateria(m1);
        estudiante.addMateria(m2);
        estudiante.addMateria(m3);
        estudiante.addMateria(m4);
        estudiante.addMateria(m5);
        estudiante.addMateria(m6);
        
        estudiante.imprimirMaterias();
    }
}
