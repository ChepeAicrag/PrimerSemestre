
import java.util.*;
public class fibonacci
{
    public static void main(){
        Scanner leer = new Scanner(System.in);
        System.out.println("Introduce hasta donde calcular el fibonacci");
        int x = leer.nextInt();
        int a = 0;
        int b = 1;
        int resultado = 1;
        if(x == 1 || x == 0)
            System.out.printf("1");
        else
        for(int i = 0; i < x; i++){
            System.out.printf(resultado + " " );
            resultado = a + b;
            a = b;
            b = resultado;
        }
    }
}

