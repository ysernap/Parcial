
import java.util.ArrayList;
import java.util.Scanner;

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
    public static int menu(){
        int opcion = 0;
        Scanner leer = new Scanner(System.in);
        System.out.println("\n1.Agregar\n2.Listar\n3.Nomina\n4.Nomina Programador\n5.Eliminar empleado\n6.Salir");
        opcion = leer.nextInt();
        return opcion;
    }
    public static void main(String[] args) {
        int opcion = -10;
        Empresa empresa = new Empresa();
        Scanner teclado = new Scanner(System.in);
        do{
            opcion = menu();
            switch(opcion){
                case 1: 
                    System.out.println("Ingrese nombre empleado: ");
                    String nombre = teclado.next();
                    System.out.println("Ingrese apellido empleado: ");
                    String apellido = teclado.next();
                    System.out.println("Tipo empleado: 1. Programador 2. Arquitecto");
                    int tipo = teclado.nextInt();
                    Empleado empleado = null;
                    //Faltan validaciones
                    if (tipo == 1){
                        empleado = new Programador(nombre,apellido);
                    }
                    else if(tipo == 2){
                        empleado = new Arquitecto(nombre,apellido);
                    }
                    empresa.agregarEmpleado(empleado);
                    break;
                case 2: 
                    ArrayList<Empleado> empleados = empresa.listarEmpleado();
                    for (int i = 0; i < empleados.size(); i++) {
                        Empleado e = empleados.get(i);
                        if (e instanceof Programador) {
                            System.out.println(e.getNombre() + " " + e.getApellido() + " Programador");                            
                        }
                        else{
                            System.out.println(e.getNombre() + " " + e.getApellido() + " Arquitecto");
                        }                        
                    }
                    break;
                case 3: 
                    double nomina = empresa.calcularNomina();
                    System.out.println("Nomina: " + nomina);
                    break;
                case 4: 
                    double nominaProgramadores = empresa.calcularNominaProgramadores();
                    System.out.println("Nomina programadores: " + nominaProgramadores);
                    break;
                case 5:
                    System.out.println("Ingrese el nombre del empleado que quiere echar: ");
                    String nomb = teclado.next();
                    
                    break;
                case 6:
                    System.out.println("Nos vemos :v ");
                    break;
                default:
                    System.out.println("Invalido");
            }
        }while(opcion != 5);
    }
}
