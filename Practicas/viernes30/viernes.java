import java.util.*;
public class viernes
{
    public static void main(){
    System.out.println("La matriz es");
    int mat1[][]=llenar();
    imprimir(mat1);
    }
    public static int[][] llenar(){
    int mat[][]=new int[11][11];
    for(int i=0;i<mat.length;i++){
      mat[i][0]=i;
      mat[0][i]=i;
    }
    for(int i=1;i<mat.length;i++){
        for(int j=1;j<mat[i].length;j++){
        mat[i][j]=i*j;
        }
    }
    return mat;
    }
    public static void imprimir(int mat[][]){
    for(int i=0;i<mat.length;i++){
        for(int j=0;j<mat[i].length;j++){
          System.out.printf("%4d",mat[i][j]);
        }
        System.out.println("");
    }
    }
}
