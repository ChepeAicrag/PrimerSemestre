
/** CALCULADORA*/
import java.util.Scanner;
public class calculadora
{
   public static void main(String[]args){
       int a,b;
       int suma,resta,division,multiplicacion;
       char s='*';
       Scanner num1= new Scanner(System.in);
       System.out.println("Introduce el valor del numero 1");
       a= num1.nextInt();
       System.out.println("Introduce el valor del numero 2");
       b= num1.nextInt();   
       if (s=='+'){
        suma=a+b;
        System.out.println("El resultado de la suma es "+ suma);
        }
        else if(s=='-'){
        resta=a-b;
        System.out.println("El resultado de la resta es "+resta);
        }
        else if(s=='/'){
        division= a/b;
        System.out.println("El resultado de la division es"+division);
        }
        else {
        multiplicacion=a*b;
        System.out.println("El resultado de la multipliacion es "+ multiplicacion);
    }
        
    }
}
