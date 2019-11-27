
/** PROGRAMA PARA SABER SI APROBASTE O NO, SI APROBASTE QUE IMRPRIMA DE QUE MANERA*/
import java.util.Scanner;
public class aprobar
{
    public static void main(String[]arg){
    int promedio;
    Scanner p= new Scanner(System.in);
    System.out.println("INTRODUZCA SU CALIFICACIÓN");
    promedio= p.nextInt();
    if(promedio>=70){
       if(promedio>=70 & promedio <80){
        System.out.println("Aprobado de manera regular");
       }
       else if (promedio>=80 & promedio<90){
        System.out.println("Aproabdo de manera buena");
       }
       else if(promedio>=90 & promedio<100){
        System.out.println("Aprobado de manera muy buena");
       }
       else {
        System.out.println("Aprobado de manera excelente");
       }   
    }
    else{ 
    System.out.println("Reprobado :(");
    }

}
}
