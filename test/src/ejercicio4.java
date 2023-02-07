
import java.util.Scanner;



/*
 Dada una cantidad de grados centígrados se debe mostrar su equivalente en grados
Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).

 */
/**
 * @author karll
 */
public class ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        double numgrado;
        double resultado;
        
        Scanner entrada= new Scanner(System.in);
        System.out.println("Ingrese grados");
        numgrado=entrada.nextDouble();
        
        resultado= 32+(9*numgrado/5);
        
        System.out.println(resultado);
        
                
              
        // TODO code application logic here
    }
    
}
