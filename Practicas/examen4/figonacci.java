import java.util.*;
public class figonacci
{
 public static void main(String[]args){
    int mat[][]=tam();
    serie(mat);
    imp(mat);
    }
 public static int[][] tam(){
    Scanner leer=new Scanner(System.in);    
    System.out.println("Introduce el tamaño de la matriz");
    int t=leer.nextInt();
    if(t==0){
    System.out.println("No se puede crear una matriz de dicho tamaño");
    }
    int ta[][]=new int[t][t];
    return ta;
   }
  public static void serie(int mat[][]){
  double s=1,s2=0,su=0;
   for(int i=0;i<mat.length;i++){  
       for(int j=0;j<mat[i].length;j++){      
     if(i==0&&j==0){
        mat[i][j]=(int)s2;
        } 
     else if(i==0&&j==1){
        mat[i][j]=(int)s;
        }   
     else {
        su=s2+s;
        s2=s;
        s=su; 
        mat[i][j]=(int)su;
    }
  }
}
  }
  public static void imp(int mat[][]){
    for(int i=0;i<mat.length;i++){
       for(int j=0;j<mat[i].length;j++){
        System.out.printf("%4d",mat[i][j]);   
    }
       System.out.println("");
    }
   }
}
