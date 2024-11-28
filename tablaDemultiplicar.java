import java.util.Scanner;
public class tablaDemultiplicar {
    public static void main(String[] args){
        Scanner scanner = new Scanner (System.in);

        System.out.println("ingrese un numero: ");
        int numero = scanner.nextInt();

        for(int i = 1; i <= 10; i++){
            System.out.println(numero + "x" + i + "=" + (numero * i));
        }
        scanner.close();
    }
}
