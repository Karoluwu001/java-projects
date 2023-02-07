/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicaS;

import java.util.Scanner;

/**
 *
 * @author karll
 */
public class sumas_cuadradas {

    
    public static void main(String[] args) {
     
        Scanner leer= new Scanner(System.in);
        
        float numero1 ;
        float numero2;
        float resultado1;
        float resultado2;
        float suma;
        float eleva2;
        
        System.out.println("Ingrese los numeros que desea sacar la suma y el cuadrado: ");
        numero1=leer.nextInt();
        numero2=leer.nextInt();
        
        suma=(numero1+numero2);
         System.out.println("Su suma es: "+suma);
        //eleva2=(float)((numero1+numero2**2));
        
       eleva2=(float) Math.pow((numero1+numero2),2);
       
        System.out.println("El resultado elevado es"+ eleva2);
        
        
        
        
      
        
        
        
    }
    
}
