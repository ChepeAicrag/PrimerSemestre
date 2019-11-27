/** programa para saber la cifra de cualquier numero de 0.001 a 9.999*/
import java.util.*;
public class cifras
{
    public static void main(String[]args){
        Scanner num=new Scanner(System.in);
        System.out.println("Introduce el numero");
        float n=num.nextFloat();
        if ( n>=0&&n<10 ){
            System.out.println("El numero tiene 1 cifra");
        }
        else if(n/1000==0.0){
            System.out.println("El numero tiene 2 cifras");
        }
        else if(n/10000==0.00){
            System.out.println("El numero tiene 3 cifras");
        }
        else if(n/1000000==0.000){
            System.out.println("El numero tiene 4 cifra");   
        }
    }
}
