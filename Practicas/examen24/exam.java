import java.util.*;
public class exam
{
    public static void main(String[]args){
    Scanner leer=new Scanner(System.in);
    System.out.println("Tamaño de la fila matriz");
    int t=leer.nextInt();
    System.out.println("Tamaño de la columna matriz");
    int t2=leer.nextInt();
    if(t==t2){
    int mat[][]=new int[t][t2];
    metodo(mat);
    impr(mat);
    metodo2(mat);
    impr(mat);
    }
    else{
    System.out.println("No se puede crear");
    }
    }
    public static int [][]llenar(int t,int t2){
    int mat[][]=new int[t][t];
    return mat;
    }
    public static void metodo(int mat[][]){    
    for(int i=0;i<mat.length;i++){
       for(int j=0;j<mat[i].length;j++){
        if(j==i){
        mat[i][j]=1;
        }
        }
    }
    }    
    public static void metodo2(int mat[][]){
    Scanner leer=new Scanner(System.in);
    System.out.println("¿Que numero quiere?");
    int n=leer.nextInt();
    for(int i=0;i<mat.length;i++){
       for(int j=0;j<mat.length;j++){
        if(j==i){    
        mat[i][j]=n;
        }
        }
    }
    }
    public static void impr(int mat[][]){
    for(int i=0;i<mat.length;i++){
       for(int j=0;j<mat[i].length;j++){
        System.out.printf("%3d",mat[i][j]);
        }
       System.out.println(); 
    }
    }
}

