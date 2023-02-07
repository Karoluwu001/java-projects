/*Crear una clase Rectángulo **********que modele rectángulos por medio de un atributo privado
base y un atributo privado altura************. La clase incluirá un método para crear el rectángulo con
los datos del Rectángulo dados por el usuario. También incluirá un método para calcular la
superficie del rectángulo y un método para calcular el perímetro del rectángulo. Por último,
tendremos un método que dibujará el rectángulo mediante asteriscos usando la base y la
altura. Se deberán además definir los métodos getters, setters y constructores
correspondientes.
Superficie = base * altura / Perímetro = (base + altura) * 2.*/
package rectan;
public class Rect {

    private final int base;
    private final int altura;
   public String mostrarrsult;

    public Rect(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    Rect() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
   public void mostrarResult(){
        System.out.println(altura+" altura " +base+"y base");
        
    }
        
    }
    
    
   
  
