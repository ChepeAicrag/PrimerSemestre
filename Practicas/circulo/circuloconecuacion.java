/**CIRCULO CON ECUACION */
import java.util.*;
public class circuloconecuacion
{
    public static void main(){
    Scanner sc= new Scanner(System.in);
    System.out.println("Introduce el tamaño del circulo");
    int n=sc.nextInt();
    for(int i=0;i<=n*2;i++){
       for(int j=0;j<=n*2;j++){
          if((int)((Math.pow(j-n,2.0))+(Math.pow(i-n,2.0)))<=(int)(Math.pow(n,2.0))){
            System.out.printf("* ");
            }
          else {
            System.out.print("  ");
            }
        }
        System.out.print("\n");
    }
    }
}
