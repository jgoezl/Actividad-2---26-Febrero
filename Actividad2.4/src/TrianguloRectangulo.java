package actividad2.pkg4;
public class TrianguloRectangulo {
    int base;
    int altura;
    double hipotenusa;
    
    TrianguloRectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }
    
    double calcularArea() {
        return (base * altura / 2);
    }
    
    double calcularHipotenusa() {
        hipotenusa = Math.pow(base*base + altura*altura, 0.5);
        return Math.round(hipotenusa);
    }
    
    double calcularPerimetro() {
        return (base + altura + calcularHipotenusa());
    }
    
    String determinarTipoTriangulo() {
        if ((base == altura) && (base == calcularHipotenusa()) && (altura == calcularHipotenusa())){
            return "Es un triángulo equilátero";
        }else if ((base != altura) && (base != calcularHipotenusa()) && (altura != calcularHipotenusa())){
            return "Es un triángulo escaleno";
        }else
            return "Es un triángulo isósceles";
    }
}
