
package practicaS;
public class matriz {

    public static void main(String[] args) {
       int matriz [][] = new int [5][5];
       //relleno matriz
       for(int i=0;i<5;i++){
           for(int j=0;j<5;j++){
               if(i==0  && i==4){
                   matriz[i][j]=1;
               }
               else if (j==0 && j==4) {
                  
                  matriz[i][j]=1;
               }
               else{
                   matriz[i][j]=0;
               }
               
           }
       }
        System.out.println("La matriz es: \n");
            for ( int i=0; i<5; i++){
                for(int j=0; i<5;j++){
                    System.out.println(matriz[i][j]+"");
            }
             
    }
        
    }
    
}
