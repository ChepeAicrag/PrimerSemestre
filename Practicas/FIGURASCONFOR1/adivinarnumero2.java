/**programa con randomn*/
import java.util.*;
public class adivinarnumero2
{
    public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    double x=Math.random()*100;
    x=(int)x;
    System.out.println("El numero a adivinar es "+x);
    System.out.println("Introduce el valor que cree que es ");
    int ns=sc.nextInt();
    while(ns!=x){
         if(ns<x){
            System.out.println("El numero es mayor");
            }
         else{
            System.out.println("El numero es menor");
            }   
          System.out.println("Vuelve a intentarlo");
           ns=sc.nextInt();  
    
    }
    System.out.println("¡Felicidades!, acertaste el numero");
    }
}
