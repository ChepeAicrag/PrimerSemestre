
/** PROGRAMA QUE IMPRIMA SI APROBASTE O NO   */
import java.util.Scanner; 
public class Aprobar
{
    public static void main (String[] arg){
    int promedio;
    Scanner p= new Scanner(System.in);
    System.out.println("INTRODUCE TU CALIFICACIÓN\n");
    promedio= p.nextInt();
    if (promedio>=70 & promedio<=100){
    System.out.println("Usted está probado\n");
    }
}
}
