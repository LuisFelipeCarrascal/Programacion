public class tiendaDeRopa {
    public static void main(String[] args) {
        double precioCamiseta = 25.0;
        double precioPantalon = 30.0;
        double descuento = 0.85;
        double adicional = 0.95;

        double precioCamisetaDescontada = precioCamiseta *  descuento;
        double precioPantalonDescontado = precioPantalon *  descuento;

        double precioSegundaCamisetaDescontada = (double)precioCamisetaDescontada *  adicional;

        double precioTotal_1 = precioCamisetaDescontada + precioPantalonDescontado;
        double precioTotal_2 = precioCamisetaDescontada + precioSegundaCamisetaDescontada + precioPantalonDescontado;
        
        System.out.println("precio total de una camiseta y un pantalon: " + precioTotal_1);
        System.out.println("precio total de 2 camisas y un pantalon: " + precioTotal_2);
    
    
    
        
    }
}
