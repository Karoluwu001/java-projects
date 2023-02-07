
import java.util.Scanner;

/*
 Realizar un programa que pida dos números enteros positivos por teclado y muestre por 
pantalla el siguiente menú:
MENU
1. Sumar
2. Restar
3. Multiplicar
4. Dividir
5. Salir
Elija opción:
El usuario deberá elegir una opción y el programa deberá mostrar el resultado por pantalla 
y luego volver al menú. El programa deberá ejecutarse hasta que se elija la opción 5. 
Tener en cuenta que, si el usuario selecciona la opción 5, en vez de salir del programa 
directamente, se debe mostrar el siguiente mensaje de confirmación: ¿Está seguro que 
desea salir del programa (S/N)? Si el usuario selecciona el carácter ‘S’ se sale del 
programa, caso contrario se vuelve a mostrar el menú

 */

/**
 *
 * @author karll
 */
public class ejercicio11 {

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        
        int numero1, numero2;
        int opcion;
         
                
         Scanner leer=new Scanner(System.in);
        System.out.println("Ingrese un numero");
        numero1=leer.nextInt();
        System.out.println("Ingrese un numero");
        numero2=leer.nextInt();
        
      int suma, resta, multiplicacion, division, salir;
      String opcionSalir;
        
      
        do {        
            
        System.out.println("MENU");
        System.out.println("1. Sumar ");
        System.out.println("2. Restar ");
        System.out.println("3. Multiplicar ");
        System.out.println("4. Dividir ");
        System.out.println("5. Salir ");
        System.out.println("Elija opción: ");
        
 opcion=leer.nextInt();
        
              switch(opcion){
            case 1: suma=numero1+numero2;
                System.out.println("Resultado es"+ suma);
          
            break;
            case 2: resta=numero1-numero2;
                System.out.println("Resultado es"+ resta);
           break;
            case 3: multiplicacion=numero1*numero2;
                System.out.println("Resultado es"+ multiplicacion);
           break;
            case 4: division= numero1/numero2;
                System.out.println("Resultado es"+ division);
           break;
           case 5: System.out.println("¿estas seguro que quieres salir?  (S/N)");
           opcionSalir=leer.next();
           
               if ("S".equals(opcionSalir.toUpperCase())) {
                   opcion=5;
               } else{ opcion=0;
               
               }
            break;
            default: System.out.println("seleccionó una opción invalida");
            
              } 
        }while (opcion !=5);
        


    }
}
        
        