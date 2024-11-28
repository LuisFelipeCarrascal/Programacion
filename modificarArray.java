public class modificarArray {

    public static void modificar(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] *= 2;
        }
        System.out.println("Dentro del método: " + java.util.Arrays.toString(arr));
    }

    public static void main(String[] args) {
        int[] numeros = {2, 4, 6, 8, 10};
        System.out.println("Antes de modificar: " + java.util.Arrays.toString(numeros));
        modificar(numeros);
        System.out.println("Después de modificar: " + java.util.Arrays.toString(numeros));
    }
}