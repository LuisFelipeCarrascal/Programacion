import java.util.Scanner;
public class mayorDetresNumeros {
    public static void main(String[] args){
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner (System.in);
        System.out.println("ingrese tres numeros: ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();

        if (num1 > num2 && num1 > num3) {
            System.out.println("El numero mayor es " + num1);
        } 
        else if (num2 > num1 && num2 > num3) {
            System.out.println("el numero mayor es " + num2);
        }
        else{
            System.out.println("el numero mayor es " + num3);
        }

    }
}
