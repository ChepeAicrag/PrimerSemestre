import java.util.*;
public class viernes232
{
    public static void main(String[]args){
    Scanner en=new Scanner(System.in);
    System.out.println("Introduce el tamaño de la matriz");
    int f=en.nextInt();
    int matriz[][]=new int[f][f]; 
    System.out.println("Digite los elementos de la matirz");
    int suma[][]=new int[f][f];
    int s=0;
    for(int i=0;i<f;i++){
     for(int j=0;j<f;j++){
        System.out.printf("Elemento de ["+i+"] ["+j+"]: ");
        matriz[i][j]=en.nextInt();
     }
    }
    for(int i=0;i<f;i++){
        s=0;
            for(int j=0;j<f;j++){
                 s+=matriz[i][j];
                 System.out.print(" "+matriz[i][j]);
            }
            System.out.printf(" = "+s+"\n");
    }
    for(int i=0;i<f;i++){
    System.out.printf(" ▼");
    }
    System.out.println("");
    for(int j=0;j<f;j++){
        s=0;
            for(int i=0;i<f;i++){
                 s+=matriz[i][j];
                }  
         System.out.printf(" "+s);
    }
   }
}
