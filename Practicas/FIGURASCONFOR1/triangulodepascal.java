 import java.util.*;
public class triangulodepascal
{
     public static void main(){   
    Scanner p= new Scanner(System.in);
    System.out.println("Introduce el nivel que desee");
    int ni=p.nextInt();     
    for(int i=0;i<=ni;i++){      
      for( int x=0;x<=(ni-i);x++){ 
         System.out.printf(" ");
       }
      for(int t=i;t>=0;t--){  
         double m=1;
         double k=1;
         double l=1;
         double h=i-t;
           for(double c=m;c<=i;c++){ //factorial para la parte del nivel que siempre es la misma
             m*=c; 
            }
           for(double c=k;c<=t;c++){ //factorial para t que decrementa en cada combinacion
            k*=c;
            }
           for(double c=l;c<=h;c++){ //factorial de la diferencia de i y t
             l*=c;
            }
               System.out.print((int)(m/(k*l))+" ");
      }
         System.out.print("\n");
 }  
    }
}
