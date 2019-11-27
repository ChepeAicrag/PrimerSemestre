import java.util.*;
public class cuadrado
{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Introduce el lado del cuadrado");
    int l=sc.nextInt();
    for(int f=1; f<=l;f++){
      for(int c=1; c<=l;c++){
          System.out.printf("* ");
          }
      System.out.printf("\n");
    }
    }
}
