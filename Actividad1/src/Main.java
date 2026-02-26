package actividad2.pkg1;

import java.util.Scanner;


public class Actividad21 {


    public static void main(String[] args) {
        // escaner
        Scanner input = new Scanner(System.in);
        // variables
        String nombre;
        String apellido;
        String documento;
        int añoNacimiento;
        
        System.out.println("Ingrese su nombre:");
        nombre = input.next();
        System.out.println("Ingrese su apellido:");
        apellido = input.next();
        System.out.println("Ingrese su documento");
        documento = input.next();
        System.out.println("Igrea tu año de nacimiento:");
        añoNacimiento = input.nextInt();
        System.out.println("");
        // Instancia
        Persona persona1 = new Persona(nombre, apellido, documento, añoNacimiento);
        persona1.imprimir();  
        
    }
    
}
