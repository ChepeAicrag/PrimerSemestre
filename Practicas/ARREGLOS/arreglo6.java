import java.util.*;
public class arreglo6
{
   public static void main(){
    Scanner leer=new Scanner(System.in);
    int x=10;
    char [] arreglo=new char[x];
    System.out.println("Los elemenos del arreglo son");
    for(int i=0;i<x;i++){
        System.out.println("Arrelgo en la poscion ["+i+"]:");
        arreglo[i]=leer.next().charAt(0);
    }
    for(int i=0;i<x;i++){
        System.out.println("Los valores del arreglo llenado son ["+i+"]="+arreglo[i]);
    }
    }
}
