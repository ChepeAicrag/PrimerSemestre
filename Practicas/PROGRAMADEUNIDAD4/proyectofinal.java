import java.util.*;
public class proyectofinal
{
    public static void main(){
      Scanner leer=new Scanner(System.in);
      int matriz1[][]=llena1();
      int matriz2[][]=llena1();
      System.out.println("La matrices son:");      
      imprimir(matriz2,matriz1);
      System.out.println("------------------------------");
      comparar(matriz1,matriz2);
      System.out.println("------------------------------");
      System.out.println("\nSumas de las filas y columnas de las matrices");
      sumar(matriz1,matriz2);
      System.out.println("\nMatriz 1\t  Matriz 2 \t Multiplicadas ");
      int matm[][]=multiplicar(matriz1,matriz2);
      impr(matriz1,matriz2,matm);
      System.out.println("\nMatriz 1\t  Matriz 2 \t  Sumadas ");
      int mats[][]=sumar2(matriz1,matriz2);
      impr(matriz1,matriz2,mats);
      System.out.println("\nMatriz 1\t  Matriz 2 \t  Divididas ");
      int matd[][]=dividir(matriz1,matriz2);
      impr(matriz1,matriz2,matd);
      System.out.println("\nMatriz 1\t  Matriz 2 \t  Combinadas ");
      int matc[][]=combinar(matriz1,matriz2);
      impr(matriz1,matriz2,matc);
    } 
    public static int[][] llena1(){
    Scanner leer=new Scanner(System.in); 
    System.out.println("Introduce el tamaño (Debe ser cuadrada e iguales las dos)");
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
    public static void impr(int matriz[][], int mat2[][],int mas[][]){        
    for(int i=0;i<matriz.length;i++){
     for(int j=0;j<matriz[i].length;j++){
        System.out.printf("%5d",matriz[i][j]);
    }
    System.out.printf("\t");
     for(int x=0;x<matriz[i].length;x++){
    System.out.printf("%5d",mat2[i][x]);
    }
    System.out.printf("\t");
     for(int x2=0;x2<matriz[i].length;x2++){
    System.out.printf("%6d",mas[i][x2]);
    }
    System.out.println("");
    }
    }
    public static void imprimir(int matriz[][],int mat2[][]){
    for(int i=0;i<matriz.length;i++){
     for(int j=0;j<matriz[i].length;j++){
        System.out.printf("%3d",matriz[i][j]);
     }
     System.out.printf("\t");
     for(int j2=0;j2<matriz[i].length;j2++){
        System.out.printf("%3d",mat2[i][j2]);
        }
     System.out.println("");    
    }
    }
    public static void comparar(int matriz1[][],int matriz2[][]){
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
    public static void sumar(int matriz[][],int mat2[][]){
    int s;
    for(int i=0;i<matriz.length;i++){
     s=0;
        for(int j=0;j<matriz[i].length;j++){
        s+=matriz[i][j]; 
        System.out.printf("%3d",matriz[i][j]);
    }
    System.out.printf(" = "+s+"\t");
     s=0;        
        for(int k=0;k<matriz.length;k++){
        s+=mat2[i][k]; 
        System.out.printf("%3d",mat2[i][k]);
        }
        System.out.printf(" = "+s+"\n");
    }
    for(int i=0;i<matriz.length;i++){
     System.out.printf("%3S","|");
     }
    for(int e=0;e<matriz.length+3;e++){ 
    System.out.printf(" ");
    }
    for(int i=0;i<matriz.length;i++){
     System.out.printf("%3S","|");
    }
    System.out.println("");
    for(int j=0;j<matriz.length;j++){
         s=0;
            for(int i=0;i<matriz[j].length;i++){
                 s+=matriz[i][j];
                }   
         System.out.printf("%3d",s);
        }
    for(int e=0;e<matriz.length+3;e++){ 
    System.out.printf(" ");
    }
    for(int j=0;j<mat2.length;j++){
         s=0;  
         for(int k=0;k<matriz[j].length;k++){
                 s+=mat2[k][j];
                }   
         System.out.printf("%3d",s);       
    }
    System.out.printf("\nSuma de diagonales\n");
    int sd=0,s2=0;
    for(int i=0;i<matriz.length;i++){   
      for(int j=0;j<matriz[i].length;j++){ 
       if(i==j){
       sd+=matriz[i][j];
       System.out.print(matriz[i][j]+"\t");
    }
    if(i!=j){
        System.out.printf(" ");
        }
    }
     for(int k=0;k<matriz[i].length;k++){
       if(i==k){
       s2+=mat2[i][k]; 
       System.out.print(mat2[i][k]);
    }
    if(i!=k){
        System.out.printf("  ");
        }
    }
    System.out.println(" ");
    }
    System.out.printf("Total="+sd+"  "+"Total="+s2+"\n");
    
    System.out.println("\nLa suma de la diagonal inversa es:");     
    sd=0;s2=0;
    int f=0,c,c2,f2=0;
      for(int i=0;i<matriz.length;i++){    
       c=(matriz[i].length-1)-i;
       sd+=matriz[i][c];
       if(i==0){
       System.out.printf("\t"+matriz[f][c]);
       }
       else{
       System.out.printf(matriz[f][c]+"  ");
       }
       f++;
       c2=(matriz[i].length-1)-i;
       s2+=mat2[i][c2];
       if(i==0){
       System.out.printf("\t"+mat2[f2][c2]+"\n");
       }
       else{
       System.out.printf("   "+mat2[f2][c2]+"\n");
       }
       f2++;
       for(int j=0;j<(matriz.length-1)-i;j++){
       System.out.printf("  ");
       }
      } 
    System.out.println("Total="+sd+"  "+"Total="+s2);
   }
   public static int[][] multiplicar(int mat1[][],int mat2[][]){
    int mat3[][]=new int[mat1.length][mat1[0].length];
        for(int i=0;i<mat3.length;i++){
            for(int j=0;j<mat3[i].length;j++){
               int var=0,ac=0; 
                 for(int m=0;m<mat3[j].length;m++){  
                var=mat1[i][m]*mat2[m][j];
                ac+=var;
            }
            mat3[i][j]=ac;
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
                        mat3[i][j]=mat1[i][j];
            }
            else{
            mat3[i][j]=mat2[i][j];
    }
    }
    }
    return mat3;
    }
}