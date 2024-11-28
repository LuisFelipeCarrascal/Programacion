package Programacion;

public class fibonacci {
    public static void main(String[] args) {
        int n = 50;
        long numero_1 = 0;
        long numero_2 = 1;

        System.out.println(numero_1);

        for (int i = 0; i < n; i++){
            System.out.println(numero_2);
            long next = numero_1 + numero_2;
            numero_1 = numero_2;
            numero_2 = next;
        }
    }
}
