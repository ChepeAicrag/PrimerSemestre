/**PROGRAMA CON EQUALS*/
import java.util.*;
public class contraseña
{
   public static void main(String[]args){
    String contraseña="pedro";
    String usuario="Pedro1999";
    Scanner num= new Scanner(System.in);
    System.out.println("Introduce tu usuario");
    String u=num.nextLine();
    System.out.println("Introduce la contraseña");
    String c=num.nextLine();
    if (usuario.equals(u)&& contraseña.equals(c)){
       System.out.println("Los datos son correctos\nIniciando sesion con "+usuario);
    }
     else {
       System.out.println("Datos incorrectos");
        }
    }
}
