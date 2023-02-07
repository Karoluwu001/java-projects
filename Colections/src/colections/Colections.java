
package colections;

import java.util.*;
import sun.nio.cs.StreamEncoder;



public class Colections {

    public static void main(String[] args) {
    Cliente cl1=new Cliente("Antonio","0001", 2000);
    Cliente cl2=new Cliente("Anto","0002", 3000);
    Cliente cl3=new Cliente("Ana","0003", 4000);
    Cliente cl4=new Cliente("Andrea","0004", 5000);
    
     Set<Cliente>ClientesBanco=new HashSet<Cliente>();
        ClientesBanco.add(cl1);
        ClientesBanco.add(cl2);
        ClientesBanco.add(cl3);
        ClientesBanco.add(cl4 );
        
        for(Cliente cliente : ClientesBanco){
            
            System.out.println(cliente.getNombre()+""+
                    cliente.getN_cuenta()+""+ cliente.getSaldo());
        
        }
                
    }
    
}
