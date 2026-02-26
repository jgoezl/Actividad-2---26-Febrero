package actividad2.pkg3;

import actividad2.pkg3.Automovil.Colores;
import actividad2.pkg3.Automovil.tipoAuto;
import actividad2.pkg3.Automovil.tipoCombustible;
import java.util.Scanner;

public class Actividad23 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        String marca;
        int year;
        int motor;
        tipoCombustible combustible = tipoCombustible.gasolina;
        tipoAuto auto = tipoAuto.subcompacto;
        short numeroPuertas;
        short numeroAsientos;
        int vel_max;
        Colores color = Colores.rojo;
        int vel_actual;
        
        System.out.println("Ingrese la marca de su atomivil:");
        marca = input.next();
        System.out.println("Ingrese el año de su atomivil:");
        year = input.nextInt();
        System.out.println("Ingrese el motor de su atomivil:");
        motor = input.nextInt();
        System.out.println("Ingrese el numero de puertas de su atomivil:");
        numeroPuertas = input.nextShort();
        System.out.println("Ingrese el numero de asientos de su atomivil:");
        numeroAsientos = input.nextShort();
        System.out.println("Ingrese la velocidad maxima de su atomivil:");
        vel_max = input.nextInt();
        vel_actual = 100;    
        
        Automovil auto1 = new Automovil(marca, year, motor, combustible, auto, numeroPuertas, numeroAsientos, vel_max, color, vel_actual);
        
        auto1.imprimir();
        auto1.Acelerar(20);
        auto1.Desacelerar(50);
        auto1.Frenar();
        
    }
    
}
