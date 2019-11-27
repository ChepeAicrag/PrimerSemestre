import java.util.*;
public class nuevoarreglo22
{
    public static void main(){
    Scanner sc=new Scanner(System.in);
    System.out.println("Introduce el tamaño del arreglo");
    int tam=sc.nextInt();
    int arreglo[]=new int[tam];
    for(int i=0;i<tam;i++){
      System.out.println("Introduce el elemento del arreglo ["+i+"]");
      arreglo[i]=sc.nextInt();
    }
    System.out.printf("\nEl arreglo desordenado es:");
    for(int i=0;i<tam;i++){
      System.out.printf(" "+arreglo[i]);
    }
    for(int i=0;i<tam-1;i++){
      for(int j=0;j<tam-1;j++){
      if(arreglo[j]>arreglo[j+1]){
          int aux=arreglo[j];
          arreglo[j]=arreglo[j+1];
          arreglo[j+1]=aux;
      }
      }
    }
    System.out.printf("\nEl arreglo ordenado es:");
    for(int i=0;i<tam;i++){
      System.out.printf(" "+arreglo[i]);
    }
    System.out.println("");
    int M=arreglo[0];
    int m=arreglo[0];
    int n=0;
    for(int i=0;i<tam;i++){
        n=arreglo[i];
        if(n>M){
           M=n;
        }
        if(n<m){
        m=n;
        }
    }
    int conM=0;
    int conm=0;
    for(int j=0;j<tam;j++){
    n=arreglo[j];
    if(n==M){
        conM++;
    }
    if(n==m){
        conm++;
    }
    }
    System.out.println("");
    System.out.println("El numero mayor es "+M+" y se repite "+conM);
    System.out.println("El numero menor es "+m+" y se repite "+conm);
}
}
