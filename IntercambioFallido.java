public class IntercambioFallido {

    // Método para intentar intercambiar dos valores
    public static void intercambiar(int x, int y) {
        // Intercambio dentro del método
        int temp = x;
        x = y;
        y = temp;
        System.out.println("Dentro del método intercambiar: x = " + x + ", y = " + y);
    }

    public static void main(String[] args) {
        // Declaración e inicialización de las variables
        int a = 5;
        int b = 10;

        // Imprime los valores originales
        System.out.println("Antes de llamar a intercambiar: a = " + a + ", b = " + b);

        // Llama al método intercambiar
        intercambiar(a, b);

        // Imprime los valores después de llamar al método
        System.out.println("Después de llamar a intercambiar: a = " + a + ", b = " + b);
    }
}