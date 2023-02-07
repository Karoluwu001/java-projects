/*
Programa Nespresso. Desarrolle una clase Cafetera con los atributos capacidadMaxima
(la cantidad máxima de café que puede contener la cafetera) y cantidadActual (la
cantidad actual de café que hay en la cafetera). Implemente, al menos, los siguientes
métodos:
 Constructor predeterminado o vacío
 Constructor con la capacidad máxima y la cantidad actual

 Métodos getters y setters.
 Método llenarCafetera(): hace que la cantidad actual sea igual a la capacidad
máxima.
 Método servirTaza(int): se pide el tamaño de una taza vacía, el método recibe el
tamaño de la taza y simula la acción de servir la taza con la capacidad indicada. Si la
cantidad actual de café “no alcanza” para llenar la taza, se sirve lo que quede. El
método le informará al usuario si se llenó o no la taza, y de no haberse llenado en
cuanto quedó la taza.
 Método vaciarCafetera(): pone la cantidad de café actual en cero.
 Método agregarCafe(int): se le pide al usuario una cantidad de café, el método lo
recibe y se añade a la cafetera la cantidad de café indicada.
 */
package nespresso;

import java.util.Scanner;

/**
 * @author karll
 */
public class Nespresso {

    public static void main(String[] args) {
     Scanner entrada= new Scanner (System.in);
         int CapacidadMaxima= 200;
         int cantidadActual=0;
         int llenarcafetera=200;
         int servirTaza;
         int vaciarcafetera=0;
         
          if (llenarcafetera>0) {
             
             cantidadActual=llenarcafetera;
             System.out.println("Cafetera llena");
            
         }else{
             System.out.println("No se pudo llenar");
        }
          System.out.println("-------------------------------------------------------");
          
         System.out.println("1. Servir una taza");
         System.out.println("2. Vaciar cafetera");
         System.out.println("3. Llenar cafetera");
         System.out.println("4. Llenar taza");
         System.out.println("5. Digite una opción");
         int opcion=entrada.nextInt();
        
         /*--------------------------------------------------------------------*/
               switch(opcion){
                   
                   case 1: 
                          System.out.println("Ingrese el tamaño de su taza");
             servirTaza=entrada.nextInt();
            
             if (servirTaza>=cantidadActual) {
                 System.out.println("Su taza se llenó");
                 
             }else{
                 System.out.println("Su taza no se llenó");
             }
                 
          break;
              
              case 2:
                   
                   System.out.println("desea vacias la cafetera?" );
                   System.out.println("Cafetera vaciada con éxito =0");
                   
 break; 
              case 3: 
                  System.out.println("cafetera llena = 200ml");
                  break;
                  
              case 4:
                  System.out.println("Taza llena");
                  break;
                  
 
             }
                   
               }
          
         /*--------------------------------------------------------------------*/
       
           
    }
    


