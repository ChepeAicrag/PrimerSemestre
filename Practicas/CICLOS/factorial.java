/**INTRODUCE UN NUMERO Y QUE TE MUESTRE SU FACTORIAL*/
import java.util.*;
import java.math.BigInteger;
public class factorial
{
   public static void main(String[]args){
    Scanner s=new Scanner(System.in);
    System.out.println("Introduce el numero");
    int n=s.nextInt();
    long f=1;
    for(int i=(int)f; i<=n; i++){
        f*=i;
    }
    System.out.println("El factorial de "+n);
    System.out.println("Es "+f);
}
}
