package actividad2.pkg4;

import java.util.Scanner;

public class PruebaFiguras {
  
public static void main(String args[]) {
    
    Scanner input = new Scanner(System.in);
    
    System.out.println("Ingrese el radio del circulo");
    int radio = input.nextInt();  
    System.out.println("Ingrese la base del rectangulo");
    int base = input.nextInt();
    System.out.println("Ingrese la altura del rectangulo");
    int altura = input.nextInt();
    System.out.println("Ingrese la medida del lado del cuadrado");
    int lado = input.nextInt();
    System.out.println("Ingrese la base del triangulo");
    int baseT = input.nextInt();
    System.out.println("Ingrese la altura del triangulo");
    int alturaT = input.nextInt();
    
    Circulo figura1 = new Circulo(radio);
    Rectangulo figura2 = new Rectangulo(base, altura);
    Cuadrado figura3 = new Cuadrado(lado);
    TrianguloRectangulo figura4 = new TrianguloRectangulo(baseT, alturaT);
      
    System.out.println("El área del círculo es: " + figura1.calcularArea());    
    System.out.println("El perímetro del círculo es: " + figura1.calcularPerimetro());
    System.out.println();
  
    System.out.println("El área del rectángulo es: " + figura2.calcularArea());
    System.out.println("El perímetro del rectángulo es: " + figura2.calcularPerimetro());
    System.out.println();
  
    System.out.println("El área del cuadrado es: " + figura3.calcularArea());
    System.out.println("El perímetro del cuadrado es: " + figura3.calcularPerimetro());
    System.out.println();
  
    System.out.println("El área del triángulo es: " + figura4.calcularArea());
    System.out.println("El perímetro del triángulo es: " + figura4.calcularPerimetro());
    System.out.println("El tipo de triangulo es: " + figura4.determinarTipoTriangulo());
    }
  
}
