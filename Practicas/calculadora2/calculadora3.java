/**PROGRAMA DE CALCULADORA CON SWITCH SIN CHAR**/
import java.util.Scanner;
public class calculadora3
{
    public static void main(String[]args){
    int numero;
    int suma,resta,division,multiplicacion;
    int a,b;
    Scanner m= new Scanner(System.in);
    System.out.println("Seleccione la operación a realizar\n 1-Division\n 2-Suma\n 3-Resta\n 4-Multiplicacion\n");
    numero= m.nextInt();
    System.out.println("Introduce el valor del numero 1");
    a= m.nextInt();
    System.out.println("Introduce el valor del numero 2");
    b= m.nextInt();
    switch (numero){
    case 1:
        division=a/b;
        System.out.println("El resultado de la division es "+division);
        break;
    case 2:
        suma=a+b;
        System.out.println("El resultado de la suma es "+suma);
        break;    
    case 3:
        resta=a-b;
        System.out.println("El resultado de la resta es "+resta);
        break;
    case 4:
        multiplicacion=a*b;
        System.out.println("El resultado de la multiplicacion es "+multiplicacion);
        break;
    default:
        System.out.println("Error");
    }
    }
}
