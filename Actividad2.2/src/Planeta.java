package actividad2.pkg2;

public class Planeta {
    // Atributos
    String nombre = null; 
    int satelites = 0;
    double masa = 0; // kilogramos
    double volumen = 0; // kilometros cubicos
    int diametro = 0; // kilometrps
    int distancia = 0; // Millones de km
    tipoPlaneta tipo;
    boolean observable = false;
    
// Inicializacion de atributos    
    Planeta(String nombre, int satelites, double masa, double volumen, int diametro, int distancia, tipoPlaneta tipo, boolean observable) {
    
        this.nombre = nombre;
        this.satelites = satelites;
        this.masa = masa;
        this.volumen = volumen;
        this.diametro = diametro;
        this.distancia = distancia;
        this.tipo = tipo;
        this.observable = observable;
    }
    // metodo de mostrar valores
    void imprimir(){
        System.out.println("Nombre: " + nombre);
        System.out.println("Numero de satelites: " + satelites);
        System.out.println("Masa: " + masa + " kg");
        System.out.println("Volumen: " + volumen + " kilometros cubicos");
        System.out.println("Diametro: " + diametro + " km");
        System.out.println("Distancia media al sol: " + distancia +" millones de km");
        System.out.println("Tipo de planeta: " + tipo);
        System.out.println("Es observable: " + observable);
    }
    // metodo de calcular densidad
    double densidad() {
        return masa/volumen;
    }
    // metodo si el planeta es exterior o no
    boolean exterior(){
        float limite = 149597870 * 3.4f;
        return distancia > limite;
    }
}
