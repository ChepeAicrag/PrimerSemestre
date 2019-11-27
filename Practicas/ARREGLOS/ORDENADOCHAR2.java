import java.util.*;
public class ORDENADOCHAR2
{
    public static void main(){
    Scanner leer=new Scanner(System.in);
    System.out.println("Introduce el tamaño del arreglo");
    int x=leer.nextInt();
    char arreglo[]=new char[x];
    System.out.println("Introduce los elementos del arreglo"); 
    int i;
    for(i=0;i<x;i++){
       System.out.println("Arreglo en la posicion ["+i+"]:");
       arreglo[i]=leer.next().charAt(0);
       }
    System.out.printf("\nEl arreglo desordenado es:");
     for(int j=0;j<x;j++){
        System.out.printf(" "+arreglo[j]);
     }   
     for(i=0;i<x-1;i++){
        for(int j=0;j<x-1;j++){
           if(arreglo[j]>arreglo[j+1]){
            char aux=arreglo[j];
            arreglo[j]=arreglo[j+1];
            arreglo[j+1]=aux;
        }
      }
    }
    System.out.printf("\nEl arreglo ordenado es:");
    for( i=0;i<x;i++){
        System.out.printf(" "+arreglo[i]);
    }
}
}
