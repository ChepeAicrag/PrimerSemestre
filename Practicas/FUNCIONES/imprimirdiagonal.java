import java.util.*;
public class imprimirdiagonal
{
    public static void main(){
    Scanner leer=new Scanner(System.in);
    System.out.println("Introduce el valor de la fila");
    int f=leer.nextInt();
    System.out.println("Introduce el valor de la columna");
    int c=leer.nextInt();
    int matriz1[][]=llena(f,c);
    System.out.println("La matriz es:");
    imp(matriz1);
    System.out.println("\nLa diagonal de la matriz es ");
    imprimir(matriz1);
    sumardiagonal(matriz1);
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
    public static void imp(int matriz[][]){
    for(int i=0;i<matriz.length;i++){
       for(int j=0;j<matriz[i].length;j++){
        System.out.printf("%3d",matriz[i][j]);
        }
       System.out.printf("\n");
    }
    }
    public static void imprimir(int matriz[][]){ 
    for(int i=0;i<matriz.length;i++){
     for(int j=0;j<matriz[i].length;j++){
         if(i==j){
        System.out.print(matriz[i][j]);
     }
    }
    System.out.println("\t");
    }
    }
    public static void sumardiagonal(int matriz[][]){
    int suma=0;
    for(int i=0;i<matriz.length;i++){
       for(int j=0;j<matriz[i].length;j++){
        if(i==j){
        suma+=matriz[i][j]; 
        }
        }
    }
    System.out.println("\nLa suma de la diagonal es: "+suma);
    }

}
