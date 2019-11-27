public class matriz3
{
    public static void main(String[]args){
    int f=(int)(Math.random()*5+1);
    int c=(int)(Math.random()*7+1);
    System.out.println("Las filas de la matriz son "+f);
    System.out.println("Las columnas de la matriz son "+c);
    int matriz[][]=new int[f][c];
    for(int i=0;i<f;i++){
    for(int j=0;j<c;j++){
        matriz[i][j]=(int)(Math.random()*10);
    }
    }
    System.out.println("La matriz desordenada es:");
    for(int i=0;i<f;i++){
    for(int j=0;j<c;j++){
      System.out.printf(" "+matriz[i][j]);
    }
      System.out.println("");
    }

     for(int i=0;i<f;i++){
            for(int j=0;j<c;j++){
               for(int k=0;k<f;k++){
                 for(int l=0;l<c;l++){  
                  if(matriz[i][j]<matriz[k][l]){ 
                  int aux=matriz[i][j];
                  matriz[i][j]=matriz[k][l];
                  matriz[k][l]=aux;
                }
                }
                 }
                }
              }
     System.out.println("La matriz ordenada es:");
     for(int i=0;i<f;i++){
    for(int j=0;j<c;j++){
      System.out.printf(" "+matriz[i][j]);
    }
      System.out.println("");
    }
   }
}
