public class cadena {

    public static void modificarCadena(String texto) {
        texto = texto + " mundo";
        System.out.println("Dentro del método: " + texto);
    }

    public static void main(String[] args) {
        String textoOriginal = "Hola";
        System.out.println("Antes de modificar: " + textoOriginal);
        modificarCadena(textoOriginal);
        System.out.println("Después de modificar: " + textoOriginal);  
    }
}
