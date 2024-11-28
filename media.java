import java.util.Scanner;
public class media {
    public static void main(String[] args){
        @SuppressWarnings("resource")
		Scanner scanner = new Scanner (System.in);
        System.out.print("Ingrese tres numeros: ");
        double num1 = scanner.nextDouble();
        double num2 = scanner.nextDouble();
        double num3 = scanner.nextDouble();

        double totalAverage = (num1 + num2 + num3) / 3;

        System.out.println("La media de los numeros dados es de: " + totalAverage);
    }
}
