package javapoon4;

import java.util.Scanner;

public class JAVAPOON4 {
    public static void main(String[] args) {
      Scanner entrada= new Scanner (System.in);
      
        System.out.println("Digite Base:");
        double base=entrada.nextDouble();
        
       System.out.println("Digite Altura:");
        double altura=entrada.nextDouble();
        
        Rectangulo r1= new Rectangulo(base, altura);

        
for (int fila =1; fila<=base; fila++)
{  
    for(int columna =1; columna<= altura; columna++)
    {
        System.out.print("*");
    }
    System.out.println();
    
    }
        System.out.println("" +r1.mostrarDatos());
  
        
    }
}
    
    

