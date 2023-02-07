/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mascotapp;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class MascotAPP {

    
    public static void main(String[] args) {
        
         
         
        
         HashMap<String, Mascota> mascotas =new HashMap();
         
            mascotas.put("1", new Mascota("fer","chiquito","perro"));
            mascotas.put("2", new Mascota("fer","chiquito","gato"));
         
            for (Map.Entry<String, Mascota> aux : mascotas.entrySet()) {
            String key = aux.getKey();
            Mascota value = aux.getValue();
        }
    }
    
}
