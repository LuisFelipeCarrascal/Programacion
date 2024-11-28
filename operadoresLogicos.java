import java.util.Scanner;
public class operadoresLogicos {
    public static void main(String[] args){
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese numero 1: ");
        int num1 = scanner.nextInt();
        System.out.println("Ingrese numero 2: ");
        int num2 = scanner.nextInt();
        System.out.println("Ingrese numero 3: ");
        int num3 = scanner.nextInt();

        boolean resultado = (num1 > num2) && (num1 < num3);
        System.out.println("¿El primer numero es mayor que el segundo y menor que el tercero? " + resultado);
    }
}
