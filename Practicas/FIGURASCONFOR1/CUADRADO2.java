import java.util.*;
public class CUADRADO2
{
   public static void main(){
   Scanner x=new Scanner(System.in);
   System.out.println("Introduzca el tamaño del lado del cuadrado");
   int l=x.nextInt();
   for(int i=0;i<l;i++){
    System.out.printf("* ");
    }
    System.out.println("");
    for(int j=0;j<l-2;j++){
        System.out.printf("*");
        for(int m=0;m<l-2;m++){
        System.out.printf("  "); 
        }
        System.out.printf(" *\n");
    }
   for(int i=0;i<l;i++){
    System.out.printf("* ");
    } 
   }
}
