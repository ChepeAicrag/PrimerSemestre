/**TECLEAR UN NUMERO DEL 1-10 IMPRIMIR LA TABLA DEL NUMERO QUE YO LE INTRODUJE*/
import java.util.*;
public class lunes29
{
    public static void main(){
    Scanner sc=new Scanner(System.in);
    System.out.println("Introduce el numero");
    int x=sc.nextInt();
    int m=1;
    do{
    System.out.println(x+"x"+m+"="+m*x);
    m++;
}
    while(m<=10);
    }
}
