/**PROGRAMA DE CALCULADORA CON SWITCH CON CHAR**/
import java.util.Scanner;
public class calculadora2
{
    public static void main(String[]args){
    char s='+';
    int suma,resta,division,multiplicacion;
    int a,b;
    Scanner n1= new Scanner(System.in);
    System.out.println("introduce el valor del numero 1");
    a= n1.nextInt();
    Scanner n2= new Scanner(System.in);
    System.out.println("introduce el valor del numero 2");
    b= n2.nextInt();
    switch (s){
    case '/':
        division=a/b;
        System.out.println("La division es "+division);
        break;
    case '+':
        suma=a+b;
        System.out.println("La suma es "+suma);
        break;    
    case '-':
        resta=a-b;
        System.out.println("La resta es "+resta);
        break;
    case '*':
        multiplicacion=a*b;
        System.out.println("La multiplicacion es "+multiplicacion);
        break;
    default:
        System.out.println("Error");
    }
    }
}

