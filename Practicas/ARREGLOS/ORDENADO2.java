import java.util.*;
public class ORDENADO2
{
    public static void main(){
    Scanner leer=new Scanner(System.in);
    System.out.println("Introduce el tamaño del arreglo");
    int x=leer.nextInt();
    int arreglo[]=new int[x];
    System.out.println("Introduce los elementos del arreglo"); 
    int i;
    for(i=0;i<x;i++){
       System.out.println("Arreglo en la posicion ["+i+"]:");
       arreglo[i]=leer.nextInt();
       }
    System.out.printf("\nEl arreglo dcesordenado es:");
        for(i=0;i<x;i++){
        System.out.printf(" "+arreglo[i]);
        }   
    for(i=0;i<x-1;i++){
       for(int j=0;j<x-1;j++){
           if(arreglo[j]>arreglo[j+1]){
            int aux=arreglo[j];
            arreglo[j]=arreglo[j+1];
            arreglo[j+1]=aux;
        }
      }
    }
    System.out.printf("\nEl arreglo desordenado:");
    for(i=0;i<x;i++){
       System.out.printf(" "+arreglo[i]);
    }
    
    }
}
