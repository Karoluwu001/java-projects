/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicaS;

import static java.lang.System.out;
import java.util.Scanner;

public class ejerciciovendedor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer= new Scanner (System.in);
        
        int salario;
        int comision;
        int carro_vendido;
        float calculo;
        float resultado;
 
        System.out.println("Ingrese el salario del empleado" );
        salario=leer.nextInt();
        System.out.println("ingrese la comision");
        comision=leer.nextInt();
        System.out.println("Ingrese el precio del carro vendido");
        carro_vendido=leer.nextInt();
        
        calculo=(carro_vendido*5);
        resultado=(salario + comision + calculo);
        
        System.out.println("El salario es:" + salario);
        System.out.println("La comision es: "+comision);
        System.out.println("el precio por carro es: "+ calculo);
        System.out.println("\n EL TOTAL ES:"  + resultado);
        
        
        // TODO code application logic here
    }
    
}
