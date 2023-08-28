import java.util.Scanner;

// Mi clase en Java
public class HolaMundo {
    public static void main(String args[]){
        var consola = new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        String numero = consola.nextLine();
        
        double div = Double.parseDouble(numero);
        if (div % 2 == 0){
            System.out.println("Es divisible entre 2");
        }else{
            System.out.println("No es divisible entre 2");
        }
    }
}
