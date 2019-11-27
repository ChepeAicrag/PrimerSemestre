import java.util.*;
public class ORDENADO3
{
       public static void main(){  //metodo pburbuja
    int [] vec={5,8,12,23,67,78,7,12,88,15};
    for(int i=0;i<10;i++){
         System.out.println("Arrelgo en la posicion ["+i+"]"+"="+vec[i]);
         }
    System.out.printf("\nLo valores del arreglo desordenado son:");
      for(int j=0;j<10;j++){
        System.out.printf(" "+vec[j]);
      }
     for(int i=0;i<10-1;i++){
        for(int j=0;j<10-1;j++){
           if(vec[j]>vec[j+1]){
            int aux=vec[j];
            vec[j]=vec[j+1];
            vec[j+1]=aux;
        }
      }
     }
    System.out.printf("\nEl arreglo ordenado es:");
    for(int i=0;i<10;i++){
       System.out.printf(" "+vec[i]);
    }
    }
}
