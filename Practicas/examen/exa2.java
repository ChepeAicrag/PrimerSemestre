import java.util.*;
public class exa2
{
    public static void main(String[]args){
    Scanner n=new Scanner(System.in);
    System.out.println("Introduce la hora");
    int h=n.nextInt();
    System.out.println("Introduce los minutos");
    int m=n.nextInt();
    System.out.println("Introduce los segundos");
    int s=n.nextInt();
    if(h>=0 && h<=23 && m>=0 && m<=58 && s>=0 && s<=58){
    s=s+1;
    System.out.println("La hora es "+h+":"+m+":"+s);
    }
    else if(h>=0 && h<=23 && m>=0 && m<=58 && s==59){
    m=m+1;
    s=0;
    System.out.println("La hora es "+h+":"+m+":"+s);
   }
    else if(h>=0 && h<=23 && m==59 && s==59){
   h=h+1;
   m=0;
   s=0;
   System.out.println("La hora es "+h+":"+m+":"+s);
   }
}
 }


