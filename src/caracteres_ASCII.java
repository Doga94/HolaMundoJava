import java.util.Scanner;

public class caracteres_ASCII {
    
    public static void main(String args[]){
        
        Scanner consola = new Scanner(System.in);
        System.out.println("Ingrese el caracter en letra para validar su ASCII: ");
        
        // Caracteres por medio de letras
        String char_caracter = consola.nextLine();
        char representacion = char_caracter.charAt(0); // Trae el primer valor
        int ascii = (int)representacion;
        
        System.out.println("El caracter es: " + ascii);
        
        
        
        /*
        //Caracteres por medio de numeros
        int num_caracter = consola.nextInt();
        
        char representacion = (char)num_caracter;
        System.out.println("El caracter es: " + representacion);

        int caracter = 97;
        char representacion = (char)caracter;

        System.out.println("El caracter es: " + representacion);
*/
    }
}
