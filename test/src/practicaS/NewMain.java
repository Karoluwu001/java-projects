/*
 hacer un programa que calcule e imprima el salarios
semanal de un empleado a partir de sus horas semanales
trabajadas.
 */
package practicaS;

import java.util.Scanner;

/**
 *
 * @author karll
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner  leer = new Scanner(System.in);
        int horas;
        horas=(4000);
        int semana;
        int resultado;
        
        System.out.println("Cuantas horas trabajo esta semana?");
        horas=leer.nextInt();
        resultado = (168*horas);
         
        System.out.println("Su paga sera de" + resultado);
    }}
