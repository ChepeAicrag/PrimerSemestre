
/** PROGRAMA DE ECUACION GENERAL*/
import java.util.*;
public class Ecuacion {
    public static void main(String[] args) 
      {
      int a,b,c;
      double d,x1,x2;
      Scanner num=new Scanner(System.in);
      System.out.println("Ingresa el valor de a");
      a= num.nextInt();
      System.out.println("Ingresa el valor de b");
      b= num.nextInt();
      System.out.println("Ingresa el valor de c");
      c= num.nextInt();
      d=(b*b)-4*a*c;
      if(a!=0){
          if(d<0){
            System.out.println("Tiene raices imaginarias");
          }else{
             x1=(-b+Math.sqrt(d))/(2*a);
             x2=(-b-Math.sqrt(d))/(2*a);
          System.out.println("X1 = "+x1+" X2 = "+x2);
        }
      }else{
      System.out.println("No es funcion cuadratica");
      }      
      }
}