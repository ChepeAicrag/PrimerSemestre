/**PROGRAMA PARA SUMAR CUALQUIER 45 NUMEROS*/
import java.util.*;
public class cualquier45
{
   public static void main(String[]args){
    Scanner S=new Scanner(System.in);
    int su=0;
    for(int i=0; i<45;i++){
    System.out.println("Introduce el numero a sumar");
    int n=S.nextInt();
    su+=n;
}
    System.out.println("La suma es "+su);
}
}
    
