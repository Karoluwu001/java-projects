
import java.util.Scanner;


/*Escribir un programa que pida dos números enteros por teclado y calcule la suma de los 
dos. El programa deberá después mostrar el resultado de la suma*/

public class NewMain {

    public static void main(String[] args) {
        // TODO code application logic here
        
        int num1;
        int num2;
        int resultado;
        
       Scanner entrada= new Scanner(System.in);
        System.out.println("INGRESE UN NÚMERO");
            num1=entrada.nextInt();
            
        System.out.println("INGRESE UN NÚMERO");
            num2=entrada.nextInt();
            
        resultado=num1+num2;
                
        System.out.println("SU RESULTADO ES" + resultado);
            
  
    }
    
}
