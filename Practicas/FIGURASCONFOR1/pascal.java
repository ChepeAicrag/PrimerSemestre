import java.util.*;
public class pascal
{
    public static void main(){
    Scanner t=new Scanner(System.in);
    System.out.println("Introduce el nivel");
    int ni=t.nextInt();
    for(int f=0;f<=ni;f++){   
     int n=1;
      for(int es=ni-f; es>0; es--){       
         System.out.printf(" ");
         }
      for(int c=0;c<=f;c++){
         System.out.printf(n+" ");
         n=n*(f-c)/(c+1);
         }
     System.out.print("\n");
    }
    }
}
