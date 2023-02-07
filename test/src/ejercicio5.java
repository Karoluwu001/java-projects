
import java.util.Scanner;

/*
 *Escribir un programa que lea un número entero por teclado y muestre por pantalla el
doble, el triple y la raíz cuadrada de ese número. Nota: investigar la función Math.sqrt().
 */

/**
 * @author karll
 */
public class ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {


        int num1;
        
        
        Scanner entrada=new  Scanner(System.in);
           System.out.println("Ingrese un numero");
           num1=entrada.nextInt();
           
          
            int suma;
        suma = num1 + num1;

                    System.out.println("el doble de su numero es" + suma );
             
            int trip;
        trip= num1* 3;
        
                System.out.println("el triple de su numero es " + trip );
                
            double raiz;
        raiz = Math.sqrt(num1);
        
                System.out.println("la raiz de su numero es " + raiz );
            
    }
    
}
