/**EXAMEN*/
import java.util.*;
public class examen
{
    public static void main(String[]args){
    Scanner n=new Scanner(System.in);
    System.out.println("Introduce la hora");
    int h=n.nextInt();
    System.out.println("Introduce los minutos");
    int m=n.nextInt();
    System.out.println("Introduce los segundos");
    int s=n.nextInt();
    if(h>=0 && h<=23 && m>=0 && h<=59 && s>=0 && h<=59){
    h=h;
    m=m;
    s=s+1;
    System.out.println("La hora es "+h+":"+m+":"+s);
}
   else {
   System.out.println("Error ");
}    
}
 }

