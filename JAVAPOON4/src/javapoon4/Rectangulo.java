/*Crear una clase Rectángulo que modele rectángulos por medio de un atributo privado
base y un atributo privado altura. La clase incluirá un método para crear el rectángulo
con los datos del Rectángulo dados por el usuario. También incluirá un método para
calcular la superficie del rectángulo y un método para calcular el perímetro del
rectángulo. Por último, tendremos un método que dibujará el rectángulo mediante
asteriscos usando la base y la altura. Se deberán además definir los métodos getters,
setters y constructores correspondientes.
Superficie = base * altura / Perímetro = (base + altura) * 2.*/


package javapoon4;

public class Rectangulo {   

    static int length;    
     double base;
     double  altura;
    int n;
    
    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }
    public double obtenerPerimetro(){
        double perimetro = (base + altura) * 2;
        return perimetro;
    }
    public double obtenerSuperficie(){
        double superficie = base * altura;
        return superficie;
    }
    public String mostrarDatos(){
    return "Base: "+base+"\nAltura: "+altura+"\nPerimetro: "+obtenerPerimetro()+"\nSuperficie:"+obtenerSuperficie()+"\n";
    }}

  
    

                
      

