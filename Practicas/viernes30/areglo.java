import java.util.*;
public class areglo
{
  public static void main(){
  int array[]=llenar();
  System.out.println("El arreglo desordenado es:");
  imp(array);  
  System.out.println("\nEL arreglo ordenado es:");
  ord(array);
  imp(array);
  }
  public static int[] llenar(){
   Scanner leer=new Scanner(System.in);
   System.out.println("Introduce el tamaño del arreglo");
   int t=leer.nextInt();
   int ar[]=new int[t];
   for(int i=0;i<ar.length;i++){
    System.out.print("Valor para ["+i+"]=");
    ar[i]=leer.nextInt();
    }
   return ar; 
    }  
  public static void imp(int ar[]){
  for(int i=0;i<ar.length;i++){
    System.out.printf("%3d",ar[i]);
    }
  }
  public static void ord(int ar[]){
  for(int i=0;i<ar.length;i++){
    for(int j=0;j<ar.length;j++){
    if(ar[i]<ar[j]){
    int aux=ar[i];
    ar[i]=ar[j];
    ar[j]=aux;
    }
    }
    }  
  }
}
