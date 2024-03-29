import java.util.*;
public class UNIDAD4
{
     public static void main(){
      Scanner leer=new Scanner(System.in);
      System.out.println("Introuce lo requerido para las matrices");
      int matriz1[][]=llena1();
      int matriz2[][]=llena1();
      System.out.println("\nLa matriz 1 es:");
      imprimir(matriz1);
      System.out.println("------------------------------");
      System.out.println("La matriz 2 es:");      
      imprimir(matriz2);
      System.out.println("\nLas matrices ordenadas son:\n");
      acomodar(matriz1);
      imprimir(matriz1);
      System.out.println("------------------------------");
      acomodar(matriz2);
      imprimir(matriz2);
      comparar(matriz1,matriz2);
      System.out.println("\nSumas de la matriz 1");
      sumar(matriz1);
      System.out.println("Sumas de la matriz 2");
      sumar(matriz2);  
      System.out.println("\nMatrices multiplicadas: ");
      int matm[][]=multiplicar(matriz1,matriz2);
      imprimir(matm);
      System.out.println("Matrices sumadas:");
      int mats[][]=sumar2(matriz1,matriz2);
      imprimir(mats);
      System.out.println("Matrices divididas:");
      int matd[][]=dividir(matriz1,matriz2);
      imprimir(matd);
      System.out.println("Matrices combinadas:");
      int matc[][]=combinar(matriz1,matriz2);
      imprimir(matc);
    } 
    public static int[][] llena1(){
    Scanner leer=new Scanner(System.in); 
    System.out.println("Introduce el tamaño (Debe ser cuadrada)");
    int f=leer.nextInt();
    int mat1[][]=new int [f][f];
    for(int i=0;i<mat1.length;i++){
     for(int j=0;j<mat1[i].length;j++){
         System.out.printf("Introduce el elemento del arreglo["+i+"]["+j+"]:");
         mat1[i][j]=leer.nextInt();
     }
    } 
    return mat1;
    }
    public static void imprimir(int matriz[][]){ 
    for(int i=0;i<matriz.length;i++){
     for(int j=0;j<matriz[i].length;j++){
        System.out.printf(matriz[i][j]+"\t");
     }
     System.out.println("");
    }
    }
    public static void acomodar(int matriz[][]){
    for(int i=0;i<matriz.length;i++){
      for(int j=0;j<matriz[i].length;j++){
         for(int k=0;k<matriz[i].length;k++){
           for(int l=0;l<matriz[i].length;l++){  
                if(matriz[k][l]>matriz[i][j]){ 
                 int aux=matriz[k][l];
                 matriz[k][l]=matriz[i][j];
                 matriz[i][j]=aux;
                }
                }
                 }
                }
              }
    }
    public static void comparar(int matriz1[][],int matriz2[][]){
      if(matriz1.length==matriz2.length){
        boolean igual=true;    
        for(int i=0;i<matriz1.length;i++){
           for(int j=0;j<matriz1[i].length;j++){
              if(matriz1[i][j]!=matriz2[i][j]){
                 igual=false;
              }
           }
        }
     if(igual==true){
        System.out.println("Las matrices son iguales");
        }
       else{
        System.out.println("Las matrices son diferentes");
        } 
     }
     else{
     System.out.println("Las matrices son diferentes");
     }
    }
    public static void sumar(int matriz[][]){
    int s;
    for(int i=0;i<matriz.length;i++){
         s=0;
            for(int j=0;j<matriz[i].length;j++){
                 s+=matriz[i][j];
            }
            System.out.printf("La suma de la fila "+i+" = "+s+"\n");
    }
    for(int j=0;j<matriz.length;j++){
         s=0;
            for(int i=0;i<matriz[j].length;i++){
                 s+=matriz[i][j];
                }   
         System.out.printf("La suma de la columna "+j+" = "+s+"\n");
    }
    int x=0,y=0,sd=0;
    for(int i=0;i<matriz.length;i++){
       sd+=matriz[x][y];
       x++;
       y++;
    }   
    System.out.printf("La suma de la diagonal es "+sd+"\n");
    int sd2=0,f=0,c;
    for(int i=0;i<matriz.length;i++){
             c=(matriz[i].length)-i;
             sd2+=matriz[f][c-1];
             f++;  
    }   
    System.out.printf("La suma de la diagonal inversa es "+sd2+"\n");
    }
    public static int[][] multiplicar(int mat1[][],int mat2[][]){
    int mat3[][]=new int[mat1.length][mat1[0].length];
        for(int i=0;i<mat3.length;i++){
            for(int j=0;j<mat3[i].length;j++){
                  mat3[i][j]=mat1[i][j]*mat2[i][j];
            }
    }
    return mat3;
    }
    public static int[][] sumar2(int mat1[][],int mat2[][]){
    int mat3[][]=new int[mat1.length][mat1[0].length];
        for(int i=0;i<mat3.length;i++){
            for(int j=0;j<mat3[i].length;j++){
                  mat3[i][j]=mat1[i][j]+mat2[i][j];
            }
    }
    return mat3;
    }
    public static int[][] dividir(int mat1[][],int mat2[][]){
    int mat3[][]=new int[mat1.length][mat1[0].length];
        for(int i=0;i<mat3.length;i++){
            for(int j=0;j<mat3[i].length;j++){
                  mat3[i][j]=mat1[i][j]/mat2[i][j];
            }
    }
    return mat3;
    }
    public static int [][] combinar(int mat1[][],int mat2[][]){
    int mat3[][]=new int[mat1.length][mat1[0].length];
        for(int i=0;i<mat3.length;i++){
            for(int j=0;j<mat3[i].length;j++){   
                if(i%2==0){
                    for(int k=0;k<mat3.length;k++){
                        mat3[i][j]=mat1[i][j];
                  } 
            }
            else{
            mat3[i][j]=mat2[i][j];
    }
    }
    }
    return mat3;
    }
}
