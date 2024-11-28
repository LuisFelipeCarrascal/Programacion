import java.util.ArrayList;
import java.util.Scanner;

public class gestionDeListas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> lista = new ArrayList<>();
        
        
        lista.add("1");
        lista.add("2");
        lista.add("3");

        System.out.println("Lista inicial: " + lista);

        try {
            
            System.out.print("Introduce el índice del elemento que deseas ver: ");
            int indice = scanner.nextInt();

            
            String elemento = lista.get(indice);
            System.out.println("El elemento en el índice " + indice + " es: " + elemento);

        } catch (IndexOutOfBoundsException e) {
            System.out.println("Error: El índice está fuera del rango válido. La lista tiene " + lista.size() + " elementos.");
        } catch (Exception e) {
            System.out.println("Error inesperado: " + e.getMessage());
        } finally {
            System.out.println("Programa finalizado.");
            scanner.close();
        }
    }
}
