import java.util.*;
public class practica1
{
    public static void main(){
    Scanner leer=new Scanner(System.in);
    System.out.println("Introduce el numero par factorial");
    int n=leer.nextInt();
    int f=1,r=1;
    while(r<=n){
    f*=r;
    r++;
    }
    System.out.println("El factorial de "+n+" es = "+f);
    }
}
