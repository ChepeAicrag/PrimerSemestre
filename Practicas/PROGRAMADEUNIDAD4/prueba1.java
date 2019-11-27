import java.util.*;
public class prueba1
{
    public static void main(){
      Scanner leer=new Scanner(System.in);
      System.out.println("Introuce lo requerido para las matrices");
      int matriz1[][]=llena1();
      int matriz2[][]=llena1();
      System.out.println("La matrices son:");      
      imprimir(matriz2,matriz1);
      System.out.println("\nLas matrices ordenadas son:\n");
      acomodar(matriz1);
      acomodar(matriz2);
      imprimir(matriz1,matriz2);
      System.out.println("------------------------------");
      comparar(matriz1,matriz2);
      System.out.println("\nSumas de la matrices");
      sumar(matriz1,matriz2);
      int op=0;
      System.out.println("\nMatrices multiplicadas: ");
      int matm[][]=multiplicar(matriz1,matriz2);
      /*if(matm[][]==multiplicar(matriz1,matriz2)){
          op=1;
        }*/
      impr(matriz1,matriz2,matm,op);
      System.out.println("Matrices sumadas:");
      int mats[][]=sumar2(matriz1,matriz2);
      /*if(mats==sumar2(matriz1,matriz2)){
          op=2;
        }*/
      impr(matriz1,matriz2,mats,op);
      System.out.println("Matrices divididas:");
      int matd[][]=dividir(matriz1,matriz2);
      /*if(matd==dividir(matriz1,matriz2)){
          op=3;
      }*/
      
      impr(matriz1,matriz2,matd,op);
      System.out.println("Matrices combinadas:");
      int matc[][]=combinar(matriz1,matriz2);
      if(matc==sumar2(matriz1,matriz2)){
          op=4;
      }
      impr(matriz1,matriz2,matc,op);
    } 
    public static int[][] llena1(){
    Scanner leer=new Scanner(System.in); 
    System.out.println("Introduce el tamaño (Debe ser cuadrada)");
    int f=3;
    int mat1[][]=new int [f][f];
    for(int i=0;i<mat1.length;i++){
     for(int j=0;j<mat1[i].length;j++){
         System.out.printf("Introduce el elemento del arreglo["+i+"]["+j+"]:");
         mat1[i][j]=(int)(Math.random()*15+1);
     }
    } 
    return mat1;
    }
    public static void impr(int matriz[][], int mat2[][],int mas[][],int op){        
    for(int i=0;i<matriz.length;i++){
     for(int j=0;j<matriz[i].length;j++){
        System.out.printf("%3d",matriz[i][j]);
    }

    if((int)i==(matriz.length/2)){
    System.out.printf("%4S","  x\t");
    }
    /*
    if(op==2){
    if((int)i==(matriz.length/2)){
    System.out.printf("%5S","+");
    }}
    if(op==3){
    if((int)i==(matriz.length/2)){
    System.out.printf("%5S","/");
    }}
    if(op==1){
    if((int)i==(matriz.length/2)){
    System.out.printf("%5S","y");
    }}
    */
   else{
    System.out.printf("\t");
    }
     for(int x=0;x<matriz[i].length;x++){
    System.out.printf("%3d",mat2[i][x]);
    }
    if((int)i==(mat2.length/2)){
    System.out.printf("%4S","=\t");
    }
    else{
    System.out.printf("\t");
    }
     for(int x2=0;x2<matriz[i].length;x2++){
    System.out.printf("%3d",mas[i][x2]);
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
    public static void acomodar(int matriz[][]){
    for(int i=0;i<matriz.length;i++){
      for(int j=0;j<matriz[i].length;j++){
         for(int k=0;k<matriz.length;k++){
           for(int l=0;l<matriz[k].length;l++){  
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
    System.out.printf("\t");
    for(int i=0;i<matriz.length;i++){
     System.out.printf("%3S","|");
    }
    
    System.out.println("");
    for(int j=0;j<matriz.length;j++){
         s=0;
            for(int i=0;i<matriz[j].length;i++){
                 s+=matriz[i][j];
                }   
         System.out.printf(" "+s);
         s=0;
         if(j==1){
         System.out.printf("\t");
        }
         for(int k=0;k<matriz[j].length;k++){
                 s+=mat2[k][j];
                }   
         System.out.printf(" "+s);       
    }
    }
    /*
    int x=0,y=0,sd=0;
    System.out.println("La suma de la diagonal es:");
    for(int i=0;i<matriz.length;i++){
       sd+=matriz[x][y];
       System.out.print(matriz[x][y]+" ");
       x++;
       y++; 
    }   
    System.out.printf("="+sd+"\n");
    System.out.println("La suma de la diagonal inversa es:");
    int sd2=0,f=0,c; 
    for(int i=0;i<matriz.length;i++){
             c=(matriz[i].length)-i;
             sd2+=matriz[f][c-1];
             System.out.print(matriz[f][c-1]+" ");
             f++;  
    }   
    System.out.printf("="+sd2+"\n");
    }
    */
    
    
    
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
                        mat3[i][j]=mat1[i][j];
            }
            else{
            mat3[i][j]=mat2[i][j];
    }
    }
    }
    return mat3;
    }}
