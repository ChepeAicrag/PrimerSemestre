import java.util.*;
public class metodoburbujar
{
    public static void main(String[] args) {
      Scanner leer=new Scanner(System.in); 
      System.out.println("Introduce el tamaño del arreglo");
      int t=leer.nextInt();
      int arreglo[]=new int[t];
    for(int i=0;i<t;i++){
      System.out.println("Introduce el elemento del arreglo ["+i+"]");
      arreglo[i]=leer.nextInt();
     }      
    //mtedoo burbuja
    for(int i=0;i<(t-1);i++){ //le sierve al programa para que sepa cuantas vueltas va a dar
        for(int j=0;j<(t-1);j++){//sirve para ordenar ela arreglo
         if(arreglo[j]>arreglo[j+1]){//si numero actual es mayor a numero siguiente, intercambiar valores 
           int cambio=arreglo[j];
               arreglo[j]=arreglo[j+1];
               arreglo[j+1]=cambio;
         }
        }
     }
    System.out.println("Mostrando el arreglo de forma creciente");
    for(int i=0;i<t;i++){
        System.out.println("El valor del arreglo ["+i+"]="+arreglo[i]);
    }
      System.out.println("\nMostrando el arrelgo de forma decreciente");
    for(int j=(t-1);j>=0;j--){
        System.out.println("El valor del arreglo ["+j+"]="+arreglo[j]);
    }
  }
}
