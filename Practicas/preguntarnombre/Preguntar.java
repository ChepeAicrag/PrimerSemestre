
/**
 PROGRAMA 2 DEL 20 DE SEPTIEMBRE DEL 2018
 */
import java.util.Scanner; //podemos poner * si ocupamos toda la paqueteria
public class Preguntar
{
   public static void main(String []args){
    Scanner entrada= new Scanner (System.in); /** escaner entrada de teclado*/
    System.out.println("¿como te llamas?");  /** enviar a pantalla la cuestion*/
    String entrad= entrada.nextLine(); /** String es el tipo de dato, se ocupa line porque es un caracter*/
    System.out.println("Hola mi nombre es "+ entrad);
}
}
