import java.util.Scanner;
public class operaciones {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner Scanner = new Scanner(System.in);
        
        System.out.print("Ingrese un numero: ");
        int num1 = Scanner.nextInt();
        
        System.out.print("Ingrese otro numero: ");
        int num2 = Scanner.nextInt();
        
        int suma = num1 + num2;
        int resta = num1 - num2;
        int multiplicacion = num1 * num2; 
        double division = (double)num1 / num2; 
        double modulo = (double) num1 % num2;
        
        System.out.println("el resultado de las operaciones son:");
        System.out.println("suma: " + suma);
        System.out.println("resta: " + resta);
        System.out.println("multiplicacion: " + multiplicacion);
        System.out.println("division: " + division);
        System.out.println("modulo: " + modulo);
     }
}
