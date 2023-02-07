
import java.util.Scanner;

/*
Crear un programa que dado un numero determine si es par o impar.
 */

/**
 *
 * @author karll
 */
public class ejercicio7 {

    public static void main(String[] args) {
  
            int num1;
                    
                    Scanner entrada= new Scanner(System.in);
                        System.out.println("Digite un numero para calcular si es par o inpar");
                        num1=entrada.nextInt();
   
            if (num1 % 2 == 0) {
                
                System.out.println("Su numero es par");
            
        } else{
                
                System.out.println("Su numero no es par");
            }
                        
                       
                        
                        
    }
    
}
