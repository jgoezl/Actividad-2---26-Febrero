package actividad2.pkg2;

import java.util.Scanner;

public class Actividad22 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // variables
        String nombre;
        int satelites;
        double masa; 
        double volumen;
        int diametro;
        int distancia;
        tipoPlaneta tipo = tipoPlaneta.TERRESTRE;
        boolean observable = true;
        // entradas
        
        System.out.println("Ingrese nombre del planeta:");
        nombre = input.next();
        
        System.out.println("Ingrese cuantos satelites orbitan alrededor del planeta:");
        satelites = input.nextInt();
        
        System.out.println("Ingrese la masa del planeta (kg):");
        masa = input.nextDouble();
        
        System.out.println("Ingrese volumen del planeta (kg cubicos):");
        volumen = input.nextDouble();
        
        System.out.println("Ingrese el diametro del planeta (km):");
        diametro = input.nextInt();
        
        System.out.println("Ingrese la distancia del planeta al sol (millones de km):");
        distancia = input.nextInt();
        
        System.out.println("");
        // Objeto planeta 1
        Planeta planeta1 = new Planeta(nombre, satelites, masa, volumen, diametro, distancia, tipo, observable);
        
        planeta1.imprimir();
        System.out.println("La densidad del planeta es: " + planeta1.densidad());
        System.out.println("El planeta se considera exterior: " + planeta1.exterior());

    }
    
}
