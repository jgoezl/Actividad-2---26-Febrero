package actividad2.pkg1;

public class Persona {
    String nombre;
    String apellidos;
    String documento;
    int añoNacimiento;
    

    Persona(String nombre, String apellidos, String documento, int añoNacimiento) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.documento = documento;
        this.añoNacimiento = añoNacimiento;
    }    
    
    void imprimir() {
    System.out.println("Nombre = " + nombre);
    System.out.println("Apellidos = " + apellidos);
    System.out.println("Numero de documento de identidad = " + documento);
    System.out.println("Año de nacimiento = " + añoNacimiento);
    System.out.println();
    }
}
