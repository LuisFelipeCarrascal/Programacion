import java.io.*;
import java.util.Scanner;

public class gestionDeNotas {
    private static final String NOMBRE_ARCHIVO = "notas.txt";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean salir = false;

        while (!salir) {
            System.out.println("\nMenú:");
            System.out.println("1. Agregar una nota");
            System.out.println("2. Mostrar todas las notas");
            System.out.println("3. Salir");
            System.out.print("Elige una opción: ");
            int opcion = scanner.nextInt();
            scanner.nextLine(); 

            switch (opcion) {
                case 1:
                    agregarNota(scanner);
                    break;
                case 2:
                    mostrarNotas();
                    break;
                case 3:
                    salir = true;
                    break;
                default:
                    System.out.println("Opción no válida. Intenta de nuevo.");
            }
        }

        System.out.println("Programa finalizado.");
        scanner.close();
    }

    private static void agregarNota(Scanner scanner) {
        System.out.print("Escribe la nota que deseas agregar: ");
        String nota = scanner.nextLine();

        try (BufferedWriter escritor = new BufferedWriter(new FileWriter(NOMBRE_ARCHIVO, true))) {
            escritor.write(nota);
            escritor.newLine();
            System.out.println("Nota guardada con éxito.");
        } catch (IOException e) {
            System.out.println("Error al guardar la nota: " + e.getMessage());
        }
    }

    private static void mostrarNotas() {
        try (BufferedReader lector = new BufferedReader(new FileReader(NOMBRE_ARCHIVO))) {
            String linea;
            System.out.println("\nNotas guardadas:");
            while ((linea = lector.readLine()) != null) {
                System.out.println("- " + linea);
            }
        } catch (FileNotFoundException e) {
            System.out.println("No hay notas guardadas aún.");
        } catch (IOException e) {
            System.out.println("Error al leer las notas: " + e.getMessage());
        }
    }
}
