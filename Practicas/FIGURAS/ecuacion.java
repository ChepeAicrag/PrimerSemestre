/**PROGRAMA DE ECUACION*/
import java.util.Scanner;
public class ecuacion
{
    public static void main(String[]args){
    int x,b,c,r;
    Scanner num= new Scanner(System.in);
    System.out.println("Introduce el valor de x");
    x=num.nextInt();
    System.out.println("Introduce el valor de b");
    b=num.nextInt();
    System.out.println("Introduce el valor de c");
    c=num.nextInt();
    r=(3*(x*x))+(b*x)+c;
    System.out.println("Paso 1: 3x^2+bx+c");
    System.out.println("Paso 2: 3("+x*x+")+("+b+")("+x+")+"+c);
    System.out.println("Paso 3: "+3*(x*x)+"+"+b*x+"+"+c);
    System.out.println("Paso 4: "+3*(x*x)+"+"+b*x+"+"+c+"= "+r);
}
}
