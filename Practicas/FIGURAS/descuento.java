/**PROGRAMA QUE APLIQUE UN 20% DE DESCUENTO AL COMPRAR MAS O IGUAL A 500*/
import java.util.Scanner;
public class descuento
{
    public static void main(String[]args){
    int compra;
    double pagar,descuento;
    Scanner num1=new Scanner(System.in);
    System.out.println("¿Cuanto compraste?");
    compra= num1.nextInt();
    if(compra>=500){
       descuento=compra*0.20; 
       pagar=compra-descuento;
       System.out.println("Su descuento es "+descuento);
       System.out.println("Su total a pagar es "+pagar);
    }
    else {
        System.out.println("No alcanza el descuento");}
    }
    
    
}
