
import java.util.Scanner;

/*
 Crear un programa que dado un numero determine si es mayor o menor .
 */

/**
 *
 * @author karll
 */
public class ejercicio6 {
    
    public static void main(String[] args) {
        
        int num1;
        int num2;
        
        Scanner entrada = new Scanner(System.in);
            System.out.println("escriba un numero");
            num1=entrada.nextInt();
            
            System.out.println("escriba un numero");
            num2=entrada.nextInt();
            
            if (num1>num2) {
                
                System.out.println(num1+" es mayor "+num2);
            
        } else if (num1<num2){
            
                System.out.println(num2+" es mayor "+num1);
        } else {
          
                 System.out.println(" INTENTE DE NUEVO ");
    }
                    
                    
        

        
    }
    
}
