package paquete1;

import javax.swing.JOptionPane;


public class MAIN {
    public static void main(String[] args){  
    int objeto= Integer.parseInt(JOptionPane.showInputDialog("Digite area"));          
        
        Circunfere op=new Circunfere();
        
     op.SetObjeto(objeto);
     op.area(objeto);
     op.perimetro(objeto);
        
       }}
        
    
    

