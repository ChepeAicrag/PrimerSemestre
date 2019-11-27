/**/
import java.util.*;
public class viernea
{
    public static void mian(String[]args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Introduce el numero");
    int n=sc.nextInt();
    int resultado=1;
    for(int f=n;f>0;f--){
      resultado=resultado*f;
    }
    System.out.println("El resultado es "+resultado);
}
}
