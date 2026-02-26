package actividad2.pkg3;

public class Automovil {
    // Atributos
    String marca;
    int year;
    int motor;
    enum tipoCombustible{gasolina, bioetanol, diésel, biodiésel, gasNatural}
    tipoCombustible combustible;
    enum tipoAuto{carroDeCiudad, subcompacto, compacto, familiar, ejecutivo, suv}
    tipoAuto auto;
    short numeroPuertas;
    short numeroAsientos;
    int vel_max;
    enum Colores{blanco, negro, rojo, naranja, amarillo, verde, azul, violeta}
    Colores color;
    int vel_actual;
    
    // Constructor
    
    Automovil(String marca, int year, int motor, tipoCombustible combustible, tipoAuto auto, short numeroPuertas, short numeroAsientos, int vel_max, Colores color, int vel_actual) {
        this.marca = marca;
        this.year = year;
        this.motor = motor;
        this.combustible = combustible;
        this.auto = auto;
        this.numeroPuertas = numeroPuertas;
        this.numeroAsientos = numeroAsientos;
        this.vel_max = vel_max;
        this.color = color;
        this.vel_actual = vel_actual;
    }
    
    // GETS
    
    String getMarca() {
        return marca;
    }
    int getYear() {
        return year;
    }
    int getMotor(){
        return motor;
    }
    tipoCombustible getTipoCombustible(){
        return combustible;
    }
    tipoAuto getTipoAutomovil(){
        return auto;
    }
    short getNumeroPuertas(){
        return numeroPuertas;
    }
    short getNumeroAsientos(){
        return numeroAsientos;
    }
    int getVelocidadMaxima(){
        return vel_max;
    }
    Colores getColor(){
        return color;
    }
    int getVelocidadActual(){
        return vel_actual;
    }
    
    // SETS
    
    void setMarca(String marca) {
        this.marca = marca;
    }
    void setYear(int year) {
        this.year = year;
    }
    void setMotor(int motor) {
        this.motor = motor;
    }
    void setTipoCombustible(tipoCombustible combustible) {
        this.combustible = combustible;
    }
    void setTipoAutomóvil(tipoAuto auto) {
        this.auto = auto;
    }
    void setNumeroPuertas(short numeroPuertas) {
        this.numeroPuertas = numeroPuertas;
    }
    void setNumeroAsientos(short numeroAsientos) {
        this.numeroAsientos = numeroAsientos;
    }
    void setVelocidadMaxima(int vel_max){
        this.vel_max = vel_max;
    }
    void setColor(Colores color){
        this.color = color;
    }
    void setVelocidadActual(int vel_actual){
        this.vel_actual = vel_actual;
    }
    
    // Metdodo Acelerar, desacelerar, frenar
    
    void Acelerar(int velocidad_incrementada){
        if (velocidad_incrementada + vel_actual <= vel_max){
            vel_actual = velocidad_incrementada + vel_actual;
        } else {
            System.out.println("No puedes incrementar más de la velocidad maxima de tu carro");
        }
        System.out.println("Velocidad actual: " + vel_actual);
        System.out.println("");
    }   
    void Desacelerar(int velocidad_reducida){
        if (vel_actual - velocidad_reducida >= 0){
            vel_actual = vel_actual - velocidad_reducida;
        } else {
            System.out.println("No puedes desacelerar tanto");
        }
        System.out.println("Velocidad actual: " + vel_actual);
        System.out.println("");
    }
    void Frenar(){
        vel_actual = 0;
        System.out.println("Velocidad actual: " + vel_actual);
        System.out.println("");
    }
    
    // Calcular tiempo de llegada
    
    double calcularTiempoLlegada(int distancia) {
        return distancia/vel_actual;
    }
    
    // Imprimir atributos
    void imprimir() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + year);
        System.out.println("Motor: " + motor);
        System.out.println("Tipo de combustible: " + combustible);
        System.out.println("Tipo de automóvil: " + auto);
        System.out.println("Número de puertas: " + numeroPuertas);
        System.out.println("Numero de sillas: " + numeroAsientos);
        System.out.println("Velocida máxima: " + vel_max);
        System.out.println("Color: " + color);
        System.out.println("Velocidad actual: " + vel_actual);
    }    
}
