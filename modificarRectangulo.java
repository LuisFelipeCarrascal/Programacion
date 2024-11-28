class Rectangulo{
    int ancho;
    int alto;

    Rectangulo(int ancho, int alto){
        this.ancho = ancho;
        this.alto = alto;
    }
}

public class modificarRectangulo{
    public static void modificar(Rectangulo r){
        r.ancho = 30;
        r.alto = 10;

        System.out.println("Dentro del metodo: ancho = " + r.ancho + ", alto = " + r.alto);
    }

    public static void main(String[] args){
        Rectangulo miRectangulo = new Rectangulo(10, 20);
        System.out.println("Antes de modificar: ancho = " + miRectangulo.ancho + ", alto = " + miRectangulo.alto);
        modificar(miRectangulo);
        System.out.println("Después de modificar: ancho = " + miRectangulo.ancho + ", alto = " + miRectangulo.alto);
    }
}