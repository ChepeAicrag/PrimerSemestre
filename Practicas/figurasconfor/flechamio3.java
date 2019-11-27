/**FLECHA CON FOR*/
import java.util.*;
public class flechamio3
{
    public static void main(){
    Scanner s=new Scanner(System.in);
    System.out.println("Introduce el tamaño de la flecha");
    int m=s.nextInt();
     for (int i=1;i<=m;i++){
       for (int es=m-i;es>0; es--){       
        System.out.printf(" ");
        }
         for (int l=1;l<2*i;l++){ 
          System.out.printf("*");
         }
       System.out.println(" ");
     }
     for(int i=1;i<=m;i++){
       for(int es=1;es<=m-1;es++){
        System.out.printf(" ");
       }
       System.out.printf("*\n");    
    }
    }
}

