import java.util.*;
public class practica5
{
 public static void main(){
 Scanner sc=new Scanner(System.in);
 System.out.println("Introduce el numero :V");
 int n=sc.nextInt();
 int f=1;
 for(int i=1;i<=n;i++){
    f*=i;
    }
 System.out.println("El factorial de "+n+" es= "+f);   
 }   
}
