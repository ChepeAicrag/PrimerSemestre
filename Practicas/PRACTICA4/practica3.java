import java.util.*;
public class practica3
{
       public static void main(String[]args){
    Scanner leer=new Scanner(System.in);
    System.out.println("Ingrese su numero para ver si es feliz");
    int n=leer.nextInt();
    int n2, d, total;
    n2=n%10;
    n=n/10;
    d=n%10;
    n=n/10;
    total =((n2*n2)+(n*n)+(d*d));
    System.out.println(" "+n+" "+d+" "+n2+" "+total);
}
}

