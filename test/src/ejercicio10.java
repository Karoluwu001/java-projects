
import java.util.Scanner;

/*
Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación solicite
números al usuario hasta que la suma de los números introducidos supere el límite inicial.
 */

/**
 *
 * @author karll
 */
public class ejercicio10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int limite;
        int numeros;
        int i=0;
        
        
       Scanner sc=new Scanner(System.in);
         System.out.println("Ingrese un valor limite positivo");
          limite=sc.nextInt();
          
          while (i<=limite) {
              System.out.println("Ingrese los numeros a sumar");
              numeros=sc.nextInt();
              
              i=i + numeros;
        }
         System.out.println("limite "+ limite + " la suma fue " + i);
    }
    
}
