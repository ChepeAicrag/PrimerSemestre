/**programa que adivine un numero */
import java.util.*;
public class adivinarnumero
{
    public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Introduce el numero");
    int n=sc.nextInt();
    System.out.println("Introduce el numero que crees que es");
    int ns=sc.nextInt();
    while(ns!=n){
        if(ns<n){
        System.out.println("El numero es mayor");
        }
        else{
        System.out.println("El numero es menor");
        } 
        System.out.println("Vuelve a introducir otro");
        ns=sc.nextInt();
    }
    System.out.println("¡Felicidades!, acertaste");
    }
}
