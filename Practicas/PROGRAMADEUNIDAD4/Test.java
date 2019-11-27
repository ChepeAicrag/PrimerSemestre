
/**
 * Ordenar matriz por filas
   */
public class Test
{
    public static void main(){
        //int mat[][] = {{3,1,2,2,5},{10,1,4,2,4},{1,7,5,4,7}};
        int mat[][] = {{3,2,1},{6,5,4},{7,6,5}};
        StdOut.println("Sin acomodar");
        imprimir(mat);
        acomodar(mat);
        StdOut.println("Acomodando");
        imprimir(mat);
    }
    
    public static void acomodar(int matriz[][]){
        for(int i=0;i<matriz.length;i++){
            for(int j=0;j<matriz[i].length-1;j++){
                 for(int k=0;k<matriz.length;k++){
                        for(int l=0;l<matriz[k].length-1;l++){
                    if(matriz[k][l] > matriz[k][l+1]){ 
                        int aux = matriz[k][l];
                        matriz[k][l]=matriz[k][l+1];
                        matriz[k][l+1]=aux;
                      }
                   }
                 }}}
    }
    
    public static void imprimir(int mat[][]){
    for(int i=0;i<mat.length;i++){//controlar numero de filas
        for(int j=0;j<mat[i].length;j++){//controla numero de columnas
            System.out.printf(" "+mat[i][j]);
        }
       System.out.println("");
      }
    }            
}
    

