import java.util.*;
public class practica4
{
    public static void main(){
    Scanner leer=new Scanner(System.in);
    System.out.println("Introduce el numero para el factorial ");
    int n=leer.nextInt();
    int r=1,f=1;
    do{
    f*=r;
    r++;
    }while(r<=n);
    System.out.println("El factorial de "+n+" es = "+f);
    }
}
