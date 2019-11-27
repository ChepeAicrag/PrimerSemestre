
/**
 * Write a description of class Squart here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.*;
public class Squart
{
    public static void main(){
        Scanner leer = new Scanner(System.in);
        StdOut.println("Introduce el tamaño del cuadrado");
        int a = leer.nextInt();
        int x = a;
        while(a <= x && a > 0){
           int b = x;
            while(b != 0){
            StdOut.printf("*");
            b--;
           }
           StdOut.println(""); 
           a--;
        }
    }
}
