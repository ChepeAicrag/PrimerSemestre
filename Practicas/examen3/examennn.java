import java.util.*;
public class examennn
{
   public static void main(){
   Scanner op=new Scanner(System.in);
   System.out.println("Introduce el tamaño de la estrella");
   int t=op.nextInt();
	for(int i=1; i<=t/2; i++){ 
           for(int es=t-i; es>0; es--){//controla espacios       
               System.out.print(" ");
           }
           for(int p1=1;p1<2*i;p1++){
            System.out.printf("*");
            }  
           System.out.printf("\n"); 
        }
        for (int m=t-1;m>=(t/2)+2;m--){ 
           for (int es=t-m;es>0;es--){       
                System.out.print(" ");
           }     
           for (int d=1;d<2*m;d++){ 
                System.out.print("*");
           }     
                System.out.printf("\n"); 
        }
            for (int m=(t/2)+2;m<=t-1;m++){ 
           for (int es=t-m;es>0;es--){       
                System.out.print(" ");
           }     
           for (int d=1;d<2*m;d++){ 
                System.out.print("*");
           }     
                System.out.printf("\n"); 
        }          
        for(int i=(t/2); i>=1; i--){ 
           for(int es=t-i; es>0; es--){//controla espacios       
               System.out.print(" ");
           }
           for(int p1=1;p1<2*i;p1++){
            System.out.printf("*");
            }  
           System.out.printf("\n"); 
        }
        
    }
}
