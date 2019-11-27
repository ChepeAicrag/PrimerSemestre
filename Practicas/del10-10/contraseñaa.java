import java.util.*;
public class contraseñaa
{
   public static void main(String[]args){
    String contraseña="pedro";
    String usuario="Pedro1999";
    int i=0;
    Scanner num= new Scanner(System.in);
    System.out.println("Introduce tu usuario");
    String u=num.nextLine();
    System.out.println("Introduce la contraseña");
    String c=num.nextLine();
    i=i+1;
    if (usuario.equals(u)&& contraseña.equals(c)){
       System.out.println("Los datos son correcto\nIniciando sesion con "+usuario);
    }
      else if (i==1){
            System.out.println("Introduce tu usuario");
             u=num.nextLine();
            System.out.println("Introduce la contraseña");
             c=num.nextLine();
            i=i+1;     
            }
      else if (usuario.equals(u)&& contraseña.equals(c)){
            System.out.println("Los datos son correcto\nIniciando sesion con "+usuario);
        }
      else{
       System.out.println("Intentos caducados");
            }
}
}