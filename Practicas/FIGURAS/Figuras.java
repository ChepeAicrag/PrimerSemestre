/**PROGRAMA QUE CALCULE AREA DE LAS FIGURAS*/
import java.util.Scanner;
public class Figuras
{
   public static void main(String[]args){
   double op;
   int numero;
   double b,h,l,r,pi=3.1416;
   Scanner sc= new Scanner(System.in);
   System.out.println("Seleccione lo que desea calcular\n 1-Area del circulo\n 2-Area del cuadrado\n 3-Area del triangulo\n 4-Area del rectangulo\n");
   numero= sc.nextInt();
   switch (numero){
    case 1:
          System.out.println("Introduce el valor del radio");
          r= sc.nextDouble();
          op=pi*r*r;
          System.out.println("El area del circulo es "+ op);
          break;
    case 2:
          System.out.println("Introduce el valor del lado");
          l=sc.nextDouble();
          op=l*l;
          System.out.println("El area del cuadrado es "+op);
          break;
    case 3:
          System.out.println("Introduce el valor de la base");
          b=sc.nextDouble();
          System.out.println("Introduce el valor de la altura");
          h=sc.nextDouble();
          op=b*h/2;
          System.out.println("El area del triangulo es "+op);
          break;
    case 4:
          System.out.println("Introduce el valor de la base");
          b=sc.nextDouble();
          System.out.println("Introduce el valor de altura");
          h=sc.nextDouble();
          op=b*h;
          System.out.println("El area del rectangulo es "+op);
          break; 
    default:
          System.out.println("Error");
    }
    }
}
