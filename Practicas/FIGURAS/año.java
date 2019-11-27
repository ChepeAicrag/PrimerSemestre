/**PROGRAMA PARA SABER SI ES BICIESTO*/
import java.util.Scanner;
public class año
{
   public static void main(String[]args){
       int año;
       Scanner num1=new Scanner(System.in);
       System.out.println("Introduce el año");
       año=num1.nextInt();
   if((año%4==0)&&(año%100!=0)||(año%400==0)){
    System.out.println("El año es biciesto");
    } 
    else{
    System.out.println("No es biciesto");
}
    }
}
