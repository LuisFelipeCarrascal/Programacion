import java.util.Scanner;
public class variables_2 {
    public static void main(String[] args){
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner (System.in);
        
        System.out.println("Ingrese su nombre:");
        String name = scanner.nextLine();

        System.out.println("ingrese su edad: ");
        int age = scanner.nextInt();

        System.out.println("ingrese su altura: ");
        double height = scanner.nextDouble();

        System.out.println("Hola " + name + " tienes " + age + " años y mides " + height + " metros");
    }
}
