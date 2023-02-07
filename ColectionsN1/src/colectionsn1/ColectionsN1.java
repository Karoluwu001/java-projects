/*Diseñar un programa que lea y guarde razas de perros en un ArrayList de tipo String. El
programa pedirá una raza de perro en un bucle, el mismo se guardará en la lista y
después se le preguntará al usuario si quiere guardar otro perro o si quiere salir. Si decide
salir, se mostrará todos los perros guardados en el ArrayList.*/

package colectionsn1;
import java.util.ArrayList;
import java.util.Scanner;

public class ColectionsN1 {

    public static void main(String[] args) {
        /*.size*/
        Scanner leer = new Scanner(System.in);
        String raza = null;
        
        ArrayList<String>nombreArrayList= new ArrayList();
        
        System.out.println("nombreArrayList");
        
        do {            
            System.out.println("ingrese una raza de perro");
            raza=leer.next();
            ArrayList<String> nombreStrings = nombreArrayList;
        } while (true);
          
        
        }
    }
    

