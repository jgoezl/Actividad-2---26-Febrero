package actividad2.pkg5;
public class CuentaBancaria {
    String nombre;
    String apellido;
    int numeroCuenta;
    double saldo;
    enum TipoCuenta {AHORROS, CORRIENTE}
    TipoCuenta tipo;
    
    CuentaBancaria(String nombre, String apellido, int numeroCuenta, double saldo, TipoCuenta tipo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
        this.tipo = tipo;
    }
    
    void imprimir() {
    
        System.out.println("Nombre del titular: " + nombre);
        System.out.println("Apellido del titular: " + apellido);
        System.out.println("Numero de cuenta: " + numeroCuenta);
        System.out.println("Tipo de cuenta: " + tipo);
        System.out.println("Saldo del titular: " + saldo);
    }
    
    void consultarSaldo(){
        System.out.println("Tu saldo actual es: " + saldo);
    }
    
    boolean consignar(int valor) {
        
        if (valor > 0) {
            saldo = saldo + valor;
            System.out.println("Se ha consignado $" + valor + " en la cuenta. Ahora es $" + saldo);
            return true;
        } else {
            System.out.println("El valor a consignar debe ser positivo");
            return false;
        }
        
    }
    
    boolean retirar(int valor) {

        if ((valor > 0) && (valor <= saldo)) {
            saldo = saldo - valor;
            System.out.println("Se ha retirado $" + valor + " en la cuenta. El nuevo saldo es $" + saldo);
            return true;
        } else {
            System.out.println("El valor a retirar debe ser menor que el saldo actual");
            return false;
            }
    }
    
}
