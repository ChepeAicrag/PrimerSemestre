import java.util.*;
public class matriz2
{
       public static void main(String[]args){
    Scanner en=new Scanner(System.in);
    System.out.println("Introduce el numero de filas");
    int f=en.nextInt();
    System.out.println("Introduce el numero de columnas");
    int c=en.nextInt();
    int matriz[][]=new int [f][c]; 
    System.out.println("Digite los elementos de la matirz");
    for(int i=0;i<f;i++){
    for(int j=0;j<c;j++){
        System.out.println("Elemento de ["+i+"] ["+j+"]: ");
        matriz[i][j]=en.nextInt();
    }
    }
    for(int i=0;i<f;i++){//controlar numero de filas
    for(int j=0;j<c;j++){//controla numero de columnas
      System.out.printf(" "+matriz[i][j]);
    }
      System.out.println("");
    }
    }
}
