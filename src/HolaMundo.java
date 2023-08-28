import java.util.Scanner;
import javax.swing.JOptionPane;

// Mi clase en Java
public class HolaMundo {
    public static void main(String args[]){
        /*
        int enteros = 10;
        long largo = enteros;
        
        System.out.println("enteros es de tipo " +  ((Object)enteros).getClass().getSimpleName() + " " + enteros);
        System.out.println("enteros es de tipo " +  ((Object)largo).getClass().getSimpleName() + " " + largo);
        
        double flotante = 3.1416;
        int entero_2 = (int) flotante;
        
        System.out.println("enteros es de tipo " +  ((Object)flotante).getClass().getSimpleName() + " " + flotante);
        System.out.println("enteros es de tipo " +  ((Object)entero_2).getClass().getSimpleName() + " " + entero_2);
    
        var consola = new Scanner(System.in);
        System.out.println("Ingrese su edad: ");
        int edad = Integer.parseInt(consola.nextLine());
        System.out.println("Su edad es: " + edad);
         
        var opciones = new Scanner(System.in);
        System.out.println("Escoja la operación que desea hacer:\n1- Suma\n2- Resta\n3- Multiplicación\n4- División\n");
        var opcion = Integer.parseInt(opciones.nextLine());
        
        var number_1 = new Scanner(System.in);
        System.out.println("Ingrese un numero entero: ");
        var num_1 = Integer.parseInt(number_1.nextLine());

        System.out.println("Ingrese el segundo numero entero: ");
        var num_2 = Integer.parseInt(number_1.nextLine());
        
        var resultado = 0;

        switch (opcion) {
            case 1:
                resultado = num_1 + num_2;
                break;
            case 2:
                resultado = num_1 - num_2;
                break;
            case 3:
                resultado = num_1 * num_2;
                break;
            case 4:
                resultado = num_1 / num_2;
                break;
            default:
                System.out.println("Opción inválida");
                return;
        }

        System.out.println("Resultado: " + resultado);

        
        var usuario = new Scanner(System.in);
        System.out.println("Ingrese su nombre:");
        String nombre = usuario.nextLine();
        
        System.out.println("\nBienvenido " + nombre);
        */
        String name = JOptionPane.showInputDialog("Ingrese su nombre");
        JOptionPane.showMessageDialog(null, "Bienvenido " + name);
        
    }
}
