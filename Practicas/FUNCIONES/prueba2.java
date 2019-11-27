/*Las funciones regresan un valor, los metodos (prueba) siempre se ejecutan sin retornar nada, el return funciona como el break en los ciclos*/
public class prueba2 
{
    public static void main(){ //declarar un metodo prncipal
    int a;
    a=restar();
    System.out.println("El resultado es: "+a);
    }
    public static int restar(){//declaracion de la funcion
    int a=20,b=3,c=a-b;
    return c;
    
}
}
