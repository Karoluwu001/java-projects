/*
9. Programación en Java || Introducción || Entrada y salida de datos con JOptionPane
 */
package practicaS;

import javax.swing.JOptionPane;

/**
 *
 * @author karll
 */
public class ejercicio1 {

           
    public static void main(String[] args) {
        
        
        String cadena;
        int entero;
        char letra;
        double decimal;
    cadena= JOptionPane. showInputDialog("digite la candena");
    //muestro un mensaje y guardo un string
    entero =Integer.parseInt(JOptionPane.showInputDialog("digite un entero"));
    //guardamos tipo entero convertido a string
    letra = JOptionPane.showInputDialog("Digite un caracter (letra)").charAt(0);
    //convierto un dato en char con charAt(0)
    decimal= Double.parseDouble( JOptionPane. showInputDialog("digite un decimal: "));
       
    
    JOptionPane.showMessageDialog(null, "owo su cadena es -->" +cadena);
    JOptionPane.showMessageDialog(null, "owo su entero es -->" +entero);
    JOptionPane.showMessageDialog(null, "owo su letra es -->" +letra);
    JOptionPane.showMessageDialog(null, "owo su decimal es -->" +decimal);
    
    
    }
    
}
