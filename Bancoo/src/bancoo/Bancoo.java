/*
Realizar una clase llamada Cuenta (bancaria) que debe tener como mínimo los atributos:
numeroCuenta (entero), el DNI del cliente (entero largo) y el saldo actual (entero).
Las operaciones asociadas a dicha clase son:
a) Constructor por defecto y constructor con DNI, saldo, número de cuenta e interés.
b) Agregar los métodos getters y setters correspondientes
c) Metodo para crear un objeto Cuenta, pidiéndole los datos al usuario.
d) Método ingresar(double ingreso): el método recibe una cantidad de dinero a ingresar
y se la sumara a saldo actual.
e) Método retirar(double retiro): el método recibe una cantidad de dinero a retirar y se
la restará al saldo actual. Si la cuenta no tiene la cantidad de dinero a retirar, se
pondrá el saldo actual en 0.
f) Método extraccionRapida(): le permitirá sacar solo un 20% de su saldo. Validar que el
usuario no saque más del 20%.
g) Método consultarSaldo(): permitirá consultar el saldo disponible en la cuenta.
h) Método consultarDatos(): permitirá mostrar todos los datos de la cuenta
 */
package bancoo;

import java.util.Scanner;
import javax.swing.JOptionPane;
import javax.swing.SpringLayout;
import jdk.nashorn.internal.ir.BreakNode;

/**
 *
 * @author karll
 */
public class Bancoo {

    public static void main(String[] args) {
        Scanner entrada= new Scanner (System.in);
        
        Double SaldoActual = null;
        Double SaldoIngresado = null;
        int Total = 0;
        int retiro=0;
        int x;
 
       System.out.println("digitar un numero de 1-6");
        x=entrada.nextInt();
        
                switch(x){
                    case 1: System.out.print("digitar el saldo de mi cuenta: ");
                    SaldoActual=entrada.nextDouble(); 
                    break;
                    
                    case 2:  System.out.print("Abonar a la cuenta");
                     SaldoIngresado=entrada.nextDouble();
                     break;
                    case 3:  System.out.println("Sumar saldos, actual y abonados ");
         
                      Total=(int) (SaldoActual + SaldoIngresado);
            
                         System.out.println("Su  saldo quedó en: " +Total);
        break;
                    case 4: System.out.println("Retiros");
                    
                      
                    System.out.println("¿Cuánto desea retirar?");
                      retiro=entrada.nextInt();
            
                          retiro= Total - retiro;
        
                      if (Total >= retiro) {
                     System.out.println("Su retiro fue exitoso" );
            
                     } else {
                     System.out.println("Fondos no suficientes ");
                      }
                    break;
                    case 5: System.out.println("Retiro rapido");
                    
                     if ( Total>0 ) {
            System.out.println("Fondos no suficientes");
        } else {
             int retiroR= Total* 20 /100;
             System.out.println("Se retiró el 20%" + retiroR);
        }
        break;
                    case 6: System.out.println("Consultar mi saldo" + Total);
                    break;
                    
                    case 7: System.out.println("Saldo inicial: "+SaldoActual+" Saldo abonado: "+SaldoIngresado+"Total: " + Total +"Retiros: "+retiro);
                }
        return;
   
    }}
    

