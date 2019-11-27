/**RECTANGULO*/
import java.util.*;
public class rectangulo
{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Introduce el valor de lo ancho");
        int a=sc.nextInt();
        System.out.println("Introduce el valor de lo largo");
        int la=sc.nextInt();
        for(int k=1;k<=a;k++){
           for(int z=1;z<=la;z++){
            System.out.printf("* ");
            }
            System.out.println("");
        }
    }
}
