public class arreglorandom
{
    public static void main(){
        int x=(int)(Math.random()*25+1);
        int []arreglo=new int[x];
        System.out.println("El tamaño del arreglo es "+x);
        for(int i=0;i<x;i++){
         arreglo[i]=(int)(Math.random()*50+1);   
         System.out.println("El elemento del arreglo "+i+" es="+arreglo[i]);
        }
        System.out.printf("\nEl arreglo desordenado es:");
         for(int j=0;j<x;j++){
            System.out.printf(" "+arreglo[j]);
          }   
         for(int i=0;i<x-1;i++){
            for(int j=0;j<x-1;j++){
               if(arreglo[j]>arreglo[j+1]){
                  int aux=arreglo[j];
                  arreglo[j]=arreglo[j+1];
                  arreglo[j+1]=aux;
                  }
              }
         }
        System.out.printf("\nEl arreglo ordenado es:");
        for(int i=0;i<x;i++){
           System.out.printf(" "+arreglo[i]);
         }
    }
}