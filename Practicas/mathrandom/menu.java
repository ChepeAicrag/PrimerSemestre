/**PROGRAMA CON SWITCH CASE Y CHAR A ELEGIR*/
import java.util.*;
public class menu
{
   public static void main(String[]args){
       int pago = 0;
       Scanner lectura= new Scanner(System.in);
       System.out.println("El menu para desayunos de hoy es de :");
       System.out.println("\n1 - Chilaquiles,cafe,pan......... $35");
       System.out.println("2 - enfrijoladas,chocolate,churros......... $40");
       System.out.println("3 - omelet,jugo,fruta......... $45");
       System.out.println("4 - tacos rojos,licuado......... $30");
       
       System.out.println("\n¿Que desea desayunar?");
       int a = lectura.nextInt();
       System.out.println("¿Que desea desayunar?");
       int b = lectura.nextInt();
       System.out.println("¿Que desea desayunar?");
       int c = lectura.nextInt();
       System.out.println("¿Que desea desayunar?");
       int d = lectura.nextInt();
       
       switch(a){
         case (1):
         System.out.println("Hola, eligio una orden de Chilaquiles,cafe,pan......... $35");
         pago += 35;
         break;
         case (2):
         System.out.println("Hola, eligio una orden de enfrijoladas,chocolate,churros......... $40");
         pago += 40;
         break;
         case(3):
         System.out.println("Hola, eligio una orden de omelet,jugo,fruta......... $45");
         pago += 45;
         break;
         case(4):
         System.out.println("Hola, elegiste una orden de tacos rojos,licuado......... $30");
         pago += 30;
         break;
      }
       
      switch(b){
         case (1):
         System.out.println("Hola, eligio una orden de Chilaquiles,cafe,pan......... $35");
         pago += 35;
         break;
         case (2):
         System.out.println("Hola, eligio una orden de enfrijoladas,chocolate,churros......... $40");
         pago += 40;
         break;
         case(3):
         System.out.println("Hola, eligio una orden de omelet,jugo,fruta......... $45");
         pago += 45;
         break;
         case(4):
         System.out.println("Hola, elegiste una orden de tacos rojos,licuado......... $30");
         pago += 30;
         break;
      }
      
      switch(c){
         case (1):
         System.out.println("Hola, eligio una orden de Chilaquiles,cafe,pan......... $35");
         pago += 35;
         break;
         case (2):
         System.out.println("Hola, eligio una orden de enfrijoladas,chocolate,churros......... $40");
         pago += 40;
         break;
         case(3):
         System.out.println("Hola, eligio una orden de omelet,jugo,fruta......... $45");
         pago += 45;
         break;
         case(4):
         System.out.println("Hola, elegiste una orden de tacos rojos,licuado......... $30");
         pago += 30;
         break;
      }
      
      switch(d){
         case (1):
         System.out.println("Hola, eligio una orden de Chilaquiles,cafe,pan......... $35");
         pago += 35;
         break;
         case (2):
         System.out.println("Hola, eligio una orden de enfrijoladas,chocolate,churros......... $40");
         pago += 40;
         break;
         case(3):
         System.out.println("Hola, eligio una orden de omelet,jugo,fruta......... $45");
         pago += 45;
         break;
         case(4):
         System.out.println("Hola, elegiste una orden de tacos rojos,licuado......... $30");
         pago += 30;
         break;
      }
      System.out.println("\nSu cuenta total es " + pago);
    }
}
