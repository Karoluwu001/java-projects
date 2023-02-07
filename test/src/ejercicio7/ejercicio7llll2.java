/*
Crear un programa que pida una frase y si esa frase es igual a “eureka” el programa
pondrá un mensaje de Correcto, sino mostrará un mensaje de Incorrecto. Nota: investigar
la función equals() en Java.
 */
package ejercicio7;

import java.util.Scanner;

/**
 *
 * @author karll
 */
public class ejercicio7llll2 {
    
    public static void main(String[] args) {
        
        String fraseeu;
        
        String frase;
        fraseeu="eureka";
        
      Scanner entrada= new Scanner(System.in);
        System.out.println("Escriba la palabra correcta");
        frase=entrada.next();
                    
                    if (frase.equals(fraseeu)){
                    System.out.println(frase + " y " + fraseeu+ " son IGUALES");
                        }else{
                    System.out.println(frase + " y " + fraseeu+" son DIFERENTES");
                    }
                    
                }
}
           