import java.util.*;
public class MARTES27
{
    public static void main(String[]args){
        Scanner leer=new Scanner(System.in);
        System.out.println("Introduce tu usuario");
        String nombre=leer.nextLine();
        System.out.println("Introduce tu contraseña");
        String contraseña=leer.nextLine();
        validadatos(nombre,contraseña);
    }
    public static String saludo(String nombre){
    String saludo="Hola como estas "+nombre;
    return saludo;
    }
    public static String error(String nombre){
    String error="Lo lamento, no pudimos validar tus datos, "+nombre+" ¿es tu usuario?";
    return error;
    }
    public static void validadatos(String usuario, String contraseña ){
    String vnombre="pedro";
    String vcontraseña="123456";
    if(vnombre.equals(usuario)&& vcontraseña.equals(contraseña)){
      System.out.println(saludo(usuario)); //un metodo llama a otros metodos
      return;
    }
    System.out.println(error(usuario));
    }
}
