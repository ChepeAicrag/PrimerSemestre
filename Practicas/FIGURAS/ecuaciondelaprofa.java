/**PRORAMA DE LA ECUACION DE LA PROFA**/
import java.util.*;
public class ecuaciondelaprofa
{
   public static void main(String[]args){
    double a,b,c,x1,x2,rd;
    Scanner teclado=new Scanner(System.in);
    System.out.println("Introduce el valor de a");
    a=teclado.nextDouble(); 
    System.out.println("Introduce el valor de b");
    b=teclado.nextDouble();
    System.out.println("Introduce el valor de c");
    c=teclado.nextDouble();
    rd=Math.pow(b,2)-(4*a*c);
    System.out.println("El valor de la determinante es "+rd);
    if(rd==0){
      System.out.println("Solo hay una solucion");
      x1=-b/(2*a);
      System.out.println("El resultado es "+x1);
    }
      else if(rd>0){
        System.out.println("Hay 2 soluciones");
        x1=((-b)+Math.sqrt(rd))/(2*a);
        x2=((-b)-Math.sqrt(rd))/(2*a);
        System.out.println("El resultado de x1:"+x1+ "x2: "+x2);
    }
      else{ 
        System.out.println("La ecuacion tiene soluciones imaginarias");
    }
    }
   }

