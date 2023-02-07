
package ClasesyObjetos;

import javax.swing.JOptionPane;

public class Operacion {
    
    int numero1;
    int numero2;
    int suma;
    int resta;
    int multiplicacion;
    int division;

    
    //Metodos
    
    //metodo para pedir digitar dos numeros
    
    public void leerNumeros(){
        numero1=Integer.parseInt(JOptionPane.showInputDialog("Digite un número: "));
        numero2 =Integer.parseInt(JOptionPane.showInputDialog("Digite un número: "));
        } 
    //metodo sumar 
    public void suma(){
        suma=numero1+numero2;
    }
    // metodo restar
    public void resta(){
        resta=numero1-numero2;
    }
    //metodo multiplicar
    
    public void multiplicacion(){
            multiplicacion=numero1*numero2;
    //metodo division 
    }
     public void division(){
            division=numero1/numero2;
         
     }
      void mostrarResult(){
          System.out.println("La suma es:"+suma);
        System.out.println("La resta es: "+resta);
        System.out.println("la multiplicacion es: "+multiplicacion);
        System.out.println("La division es "+division);
      }
         
     }
    

