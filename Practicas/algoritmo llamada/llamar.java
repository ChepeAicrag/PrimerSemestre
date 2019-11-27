
/**algoritmo para llamar por telefono
 */
import java.util.Scanner;
public class llamar
{
    public static void main(String []arg){
    int estado;
    Scanner E= new Scanner (System.in);
    System.out.println("¿El telefono está encendido?\n"+"Introduzca 1 si es así\n"+"Introduzca 2 si no");
    estado= E.nextInt();
    if(estado==2 ){
    System.out.println("Encienda el telefono");
    }
    System.out.println("Realice la llamada");
}
}

