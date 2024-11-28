
class FondosInsuficientesException extends Exception {
    public FondosInsuficientesException(String mensaje) {
        super(mensaje);
    }
}

// Clase CuentaBancaria
class CuentaBancaria {
    private double saldo;

    
    public CuentaBancaria(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    
    public double getSaldo() {
        return saldo;
    }

    
    public void retirar(double cantidad) throws FondosInsuficientesException {
        if (cantidad > saldo) {
            throw new FondosInsuficientesException("Fondos insuficientes. Tu saldo actual es: " + saldo);
        }
        saldo -= cantidad;
        System.out.println("Has retirado: " + cantidad + ". Tu saldo actual es: " + saldo);
    }
}

// Clase principal para probar la simulación
public class simulacionBanco {
    public static void main(String[] args) {
        CuentaBancaria cuenta = new CuentaBancaria(1000.0);
        System.out.println("Saldo inicial: " + cuenta.getSaldo());

        try {
            
            System.out.println("Intentando retirar 500...");
            cuenta.retirar(500);

            System.out.println("Intentando retirar 600...");
            cuenta.retirar(600); 
        } catch (FondosInsuficientesException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}