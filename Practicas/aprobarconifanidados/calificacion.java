
/** PROGRAMA PARA SABER SI APROBASTE CON IF ANIDADOS*/
import java.util.Scanner;
public class calificacion
{
    public static void main(String[]arg){
    int promedio;
    Scanner p= new Scanner(System.in);
    System.out.println("\nINTRODUZCA SU CALIFICACIÓN");
    promedio= p.nextInt();
    if (promedio>=70& promedio<80){
      System.out.println("Usted aprobo de manera regular");
    }
     if(promedio>=80 & promedio<90){
       System.out.println("Usted aprobo de manera buena");
    }
       if(promedio>=90 & promedio<100){
        System.out.println("Usted aprobo de manera muy bueno");
    }
        if(promedio==100){
         System.out.println("Usted aprobo de manera excelente");
}
}
}
