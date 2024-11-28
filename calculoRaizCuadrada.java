import java.util.Scanner;

class NumeroNegativoException extends Exception {
    public NumeroNegativoException(String mensaje) {
        super(mensaje);
    }
}

public class calculoRaizCuadrada {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            
            System.out.print("Introduce un número para calcular su raíz cuadrada: ");
            double numero = scanner.nextDouble();
            
            // Verificar si el número es negativo
            if (numero < 0) {
                throw new NumeroNegativoException("No se puede calcular la raíz cuadrada de un número negativo.");
            }
            
        
            double raizCuadrada = Math.sqrt(numero);
            System.out.println("La raíz cuadrada de " + numero + " es: " + raizCuadrada);
            
        } catch (NumeroNegativoException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Ha ocurrido un error inesperado: " + e.getMessage());
        } finally {
            System.out.println("Programa finalizado.");
            scanner.close();
        }
    }
}