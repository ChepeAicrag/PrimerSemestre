
/**
 * Write a description of class exam here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.*;
public class exam
{
    public static void main(){
    Scanner n=new Scanner(System.in);
    System.out.println("Introduce la hora");
    int h=n.nextInt();
    System.out.println("Introduce los minutos");
    int m=n.nextInt();
    System.out.println("Introduce los segundos");
    int s=n.nextInt();
    s+=1;
    if(s==60){
    m+=1;
    s=0;    
    System.out.println(+h+" "+m+" "+s);
     }
    else{ 
    System.out.println(+h+" "+m+" "+s);
   }
}
}