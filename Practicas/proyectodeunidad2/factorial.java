import java.util.*;
public class factorial
{
   public static void main(){
    Scanner leer=new Scanner(System.in);
    System.out.println("Ibtroduce el numero");
    int n=leer.nextInt();
    int f=1,r=1;
    do{
    f*=r;
    r++;
    }while(r<=n);
    System.out.println("EL factorial de "+n+" es: "+f);
}
}
