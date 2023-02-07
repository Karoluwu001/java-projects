/*Crear una clase llamada Libro que contenga los siguientes atributos: ISBN, Título, Autor,
Número de páginas, y un constructor con todos los atributos pasados por parámetro y un
constructor vacío. Crear un método para cargar un libro pidiendo los datos al usuario y
luego informar mediante otro método el número de ISBN, el título, el autor del libro y el
numero de páginas.*/
package LibroObj;

public class Caracteristica{
    
    int ISBN;
    String titulo;
    String autor;
    int numeropag;

    public Caracteristica(int ISBN, String titulo, String autor, int numeropag) {
        this.ISBN = ISBN;
        this.titulo = titulo;
        this.autor = autor;
        this.numeropag = numeropag;
    }

  
    
   

    
    public void mastrarDatos(){
        System.out.println("ISBN: "+ISBN);
        System.out.println("titulo: "+titulo);
        System.out.println("autor: "+autor);
        System.out.println("numero de paginas: "+numeropag);
    }    
   
   
    
    
}
