import java.util.*;
public class jueves
{
    public static void mian(){
    Scanner leer=new Scanner(System.in);
    int fila=2,columna=2;
    int [][]Mat=new int[fila][columna];
    for(int i=0;i<fila;i++){
    for(int j=0;j<columna;j++){
        System.out.print("Elemento de ["+i+"] ["+j+"]: ");
        Mat[i][j]=leer.nextInt();
    }
    }
     System.out.printf("Los valores de la matriz desordenados son:\n");
    for(int i=0;i<fila;i++){
    for(int j=0;j<columna;j++){
      System.out.printf(" "+Mat[i][j]); 
    }
    System.out.println("");
    }
    
     for(int i=0;i<fila;i++){
            for(int j=0;j<columna;j++){
               for(int k=0;k<fila;k++){
                 for(int l=0;l<columna;l++){  
                  if(Mat[k][l]>Mat[i][j]){ 
                  int aux=Mat[k][l];
                  Mat[k][l]=Mat[i][j];
                  Mat[i][j]=aux;
                }
                }
                 }
                }
              }
     System.out.println("\nLos valores de la matriz ordenados son:");
     for(int i=0;i<fila;i++){
    for(int j=0;j<columna;j++){
      System.out.printf(" "+Mat[i][j]); 
    }
    System.out.println("");
    }
}
}