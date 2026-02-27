package actividad2.pkg5;

import actividad2.pkg5.CuentaBancaria.TipoCuenta;
import java.util.Scanner;

public class Actividad25 {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Ingrese nombre");
        String nombre = input.next();
        
        System.out.println("Ingrese apellido");
        String apellido = input.next();
        
        System.out.println("Ingrese el numero de cuenta");
        int numeroCuenta = input.nextInt();

        TipoCuenta tipo = CuentaBancaria.TipoCuenta.AHORROS;
        double saldo = 0;

        System.out.println("");
        
        CuentaBancaria cuenta1 = new CuentaBancaria(nombre, apellido, numeroCuenta, saldo, tipo);
        
        System.out.println("Ingrese valor a consignar");
        int valor = input.nextInt();
        cuenta1.consignar(valor);
        
        System.out.println("Ingrese valor a retirar");
        int valorR = input.nextInt();
        cuenta1.retirar(valorR);
        
        cuenta1.consultarSaldo();
        cuenta1.imprimir();
    }
    
}
