import java.util.Scanner;

public class menuInteractivo {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("ingrese el primer numero:");
        int num1 = scanner.nextInt();
        System.out.print("ingrese el segundo numero:");
        int num2 = scanner.nextInt();
        
        System.out.println("elegia una opcion: ");
        System.out.println("1.sumar");
        System.out.println("2.restar");
        System.out.println("3.multiplicar");
        System.out.println("4.dividir");
        
        int opcion = scanner.nextInt(); 
        
        switch (opcion){
            case 1 :
                System.out.println("el resultado es: " + (num1 + num2));
                break;
            case 2 :
                System.out.println("el resultado es: " + (num1 - num2));
                break;
            case 3 :
                System.out.println("el resultado es: " + (num1 * num2));
                break;
            case 4 :
                if( num2 != 0){
                    System.out.println("el resultado es: " + (num1/num2));
                }
                else {
                    System.out.println("error: division por cero");
                }
                break;
            default :
                System.out.println("opcion no valida");
                break;
                
                
        }
       
        
        
        
    }
}
