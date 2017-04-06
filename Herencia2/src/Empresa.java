
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Estudiante
 */
public class Empresa {
    private ArrayList<Empleado> empleados;
    
    public Empresa(){
        this.empleados = new ArrayList<>();
    }
    
    public void agregarEmpleado(Empleado e){
        this.empleados.add(e);
    }
    
    public void echarEmpleado(Empleado e){
        e = null;
    }
    public double calcularNomina(){
        double nomina = 0;
        //Polimorfismo de asignación
        for (Empleado empleado : empleados) {
            //Lugadura tardía
            nomina += empleado.calcularSalario();
        }
        return nomina;
    }
    
    public double calcularNominaProgramadores(){
        double nomina = 0;
        for (Empleado empleado : empleados) {
            if (empleado instanceof Programador) {
                nomina += empleado.calcularSalario();
            }
        }
        return nomina;
    }
    
    public ArrayList<Empleado> listarEmpleado(){
        return this.empleados;
    }
    
    
    
}
