import java.util.*;
public class ENTEROORDENADO1
{
    public static void main(){
    Scanner leer=new Scanner(System.in); 
    int x=10;
    int [] arreglo=new int[x];
    System.out.println("Los elemenos del arreglo son");
    for(int i=0;i<x;i++){
        System.out.println("Arrelgo en la poscion ["+i+"]:");
        arreglo[i]=leer.nextInt();
    }
        System.out.printf("\nEl arreglo desordenado es:");
    for(int i=0;i<x;i++){
        System.out.printf(" "+arreglo[i]);
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
