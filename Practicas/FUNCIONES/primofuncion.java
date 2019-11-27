import java.util.*;
public class primofuncion
{
public static void main(){
    Scanner leer=new Scanner(System.in);
    int d=0,p=0;
    System.out.println("Introduce el valor de la fila");
    int f=leer.nextInt();
    System.out.println("Introduce el valor de la columna");
    int c=leer.nextInt();
    int matriz1[][]=llena(f,c);
    int mat3[][]=new int[f][c];
    System.out.println("\nLa matriz es");
    imprimir(matriz1,f,c);
    System.out.println("La matriz ordenada es:");
    ordenar(matriz1);
    imprimir(matriz1,f,c);
    primo(matriz1,f,c,d,p,mat3);
    } 
    public static int[][] llena(int f,int c){
    Scanner leer=new Scanner(System.in);
    int mat[][]=new int [f][c];
    for(int i=0;i<f;i++){
     for(int j=0;j<c;j++){
         System.out.printf("Introduce el elemento del arreglo["+i+"]["+j+"]:");
         mat[i][j]=leer.nextInt();
     }
    } 
    return mat;
    }
    public static void imprimir(int matriz[][],int f,int c){ 
    for(int i=0;i<f;i++){
     for(int j=0;j<c;j++){
        System.out.printf(matriz[i][j]+"\t");
     }
     System.out.println("");
    }
    } 
    public static void ordenar(int mat[][]){
    for(int i=0;i<mat.length;i++){
      for(int j=0;j<mat[i].length;j++){
        for(int k=0;k<mat.length;k++){
          for(int l=0;l<mat[k].length;l++){
            if(mat[i][j]<mat[k][l]){
            int aux=mat[i][j];
            mat[i][j]=mat[k][l];
            mat[k][l]=aux;
            }
            }
        }
        }
    }
    }
    public static int[][] primo(int mat2[][],int f,int c,int d,int p,int imp[][]){
    for(int i=0;i<f;i++){
     for(int j=0;j<c;j++){   
        for(int m=1;m<=mat2[i][j];m++){
                if(mat2[i][j]%m==0){ 
                d++;
                }
            }
                if(d==2){
                 p++;
                 imp[i][j]=mat2[i][j];
                 }
                 d=0; 
    }
     }
     System.out.printf("\nUsted tiene "+p+" numeros primos"+"\nSon primos: ");
        for(int i=0;i<f;i++){ 
            for(int j=0;j<c;j++){
            if(imp[i][j]!=0){ 
            System.out.print(imp[i][j]+" ");
            } 
        }
    } 
    return imp;
    } 
}
