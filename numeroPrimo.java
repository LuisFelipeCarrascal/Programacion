package Programacion;

import java.util.Scanner;

public class numeroPrimo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ingrese un numero");
        int numero = scanner.nextInt();

        boolean esPrimo = true;
        if(numero <= 1){
            esPrimo = false;
        }
        else{
            for (int i = 2; i <= 100; i++){
                if( numero % i == 0){
                    esPrimo = false;
                    break;
                }
            }
        }
        if (esPrimo){
            System.out.println(numero + "es primo");
        }
        else{
            System.out.println(numero + "no es primo");
        }

        for (int i = 1; i <= 100; i++){
            boolean esPrimoActual = true;
            if (i <= 1) {
                esPrimoActual = false;
            }
            else{
                for(int j = 2; j <= 100; j++){
                    if(i % j == 0){
                        esPrimoActual = false;
                        break;
                    }
                }
            }
            if (esPrimoActual) {
                System.out.println(i);
            }
        }
        scanner.close();
    }
}
