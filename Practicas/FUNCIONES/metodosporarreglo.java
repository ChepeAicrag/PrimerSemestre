/**/
public class metodosporarreglo
{
    public static void main(){
    int matriz1[][]=llena();//no lleva parametros porque el metodo no los tiene
    System.out.printf("La matriz desordenada es\n");
    imprimir(matriz1);
    System.out.println("");
    System.out.printf("La matriz ordenada es\n");
    ordenar(matriz1);
    imprimir(matriz1);
    }
    public static int[][] llena(){//con [][]por que indica que es una matriz
    int mat[][]=new int [5][5];
    for(int i=0;i<5;i++){
     for(int j=0;j<5;j++){
        mat[i][j]=(int)(Math.random()*50);
     }
    } 
    return mat;
    }
    public static void imprimir(int matriz[][]){ //el parametro se puede llamar diferente y es void porque no retorna nada
    for(int i=0;i<5;i++){
     for(int j=0;j<5;j++){
        System.out.printf(matriz[i][j]+"\t");
     }
     System.out.println("");
    }
    }
    public static void ordenar(int mat2[][]){
     for(int i=0;i<5;i++){
            for(int j=0;j<5;j++){
               for(int k=0;k<5;k++){
                 for(int l=0;l<5;l++){  
                  if(mat2[k][l]>mat2[i][j]){ 
                  int aux=mat2[k][l];
                  mat2[k][l]=mat2[i][j];
                  mat2[i][j]=aux;
                }
                }
                 }
                }
              }
    }
}
