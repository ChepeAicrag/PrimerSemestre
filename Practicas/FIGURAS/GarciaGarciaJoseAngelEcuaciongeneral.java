/** PROGRAMA DE ECUACION GENERAL*/
import java.util.*;
public class GarciaGarciaJoseAngelEcuaciongeneral {
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
      d=(mul(b,b))-4*a*c;  /**Se puede utilizar el Math.pow(b,2)-(4*(a*c))**/
      if(a!=0){
          if(d<0){
            System.out.println("Tiene raices imaginarias");
          }else{
             x1=(-b+Math.sqrt(d))/(2*a);
             x2=(-b-Math.sqrt(d))/(2*a);
          System.out.println("x1= (-"+b+"+√("+b+"^2+-4"+a*c+"))/2"+a);
          System.out.println("x2= (-"+b+"-√("+b+"^2+-4"+a*c+"))/2"+a);
        }
      }else{
      System.out.println("No es funcion cuadratica");
      }      
      }
    public static int mul(int a, int b){
    return a*b;
    }  
}