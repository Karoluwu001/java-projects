
import java.util.Scanner;
import jdk.nashorn.internal.runtime.regexp.joni.ScanEnvironment;

/*Escribir un programa que pida una frase y la muestre toda en mayúsculas y después toda 
en minúsculas. Nota: investigar la función toUpperCase() y toLowerCase() en Java*/

/**
 *
 * @author karll
 */
public class ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String frase;
        Scanner entrada= new Scanner(System.in);
         System.out.println("Ingrese una frase");
            frase=entrada.nextLine();
            
            System.out.println(frase.toLowerCase());
            
            System.out.println(frase.toUpperCase());
            
         
  
    }
    
}
