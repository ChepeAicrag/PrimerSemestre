import java.util.*;
public class cuadrado
{
  public static void main(){
    Scanner sc=new Scanner(System.in);
    System.out.println("Introduce el tamaño  de fila cuadrado");
    int f=sc.nextInt();
    System.out.println("Introduce el tamaño  de columna cuadrado");
    int c=sc.nextInt();
    for(int i=0; i<f;i++){
    for(int j=0; j<c;j++){
    System.out.print("* ");
    }
    System.out.print("\n");
    }
    }
}
