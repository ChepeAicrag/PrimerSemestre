/**Ejemplo de metodo que utiliza parametros*/
public class prueba3
{
    public static void sumar(int a,int b){//definicion de un metodo
    int c=a+b;
    System.out.println("EL resultado de la suma es: "+c);
    }
    public static int restar(int a,int b){//definciion de una funcion
    int c=a-b;
    return c;
    }
    public static void main(String[]args){ //clase principal que llama a la funcion y al metodo
    sumar(10,5);
    int resta=restar(5,2);
    System.out.println("El resultado de la resta es: "+resta);
    }
}
