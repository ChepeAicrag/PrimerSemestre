/**PROGRAMA QUE PIDA EL NUMERO*/
import java.util.*;
public class numero
{
  public static void main(String[]args){
  Scanner num= new Scanner(System.in);
  System.out.println("Introduce un numero del 1 al 10");
  int p=num.nextInt();
  if(p==1){
    System.out.println("Verdadero");
    }
  else {
    System.out.println("Falso");
}
}
}