import java.util.*;
public class practica2
{
    public static void main(String[]args){
    Scanner leer=new Scanner(System.in);
    System.out.println("Ingrese su numero para ver si es feliz");
    int n=leer.nextInt();
    int separar, d, total;
    boolean salir=false;
  if(n>0&&n<10000){ 
    do{ 
    separar=n%10;
    n=n/10;
    d=n%10;
    n=n/10;
    total =((separar*separar)+(n*n)+(d*d));
    if(total==1){
     salir=true;
     System.out.println("Es un numero feliz");
    }
    if(total!=1 && n==total){
    salir=true;
    System.out.println("No es un numero feliz");
    }
   }while(salir!=true);        
  }
  else{
            System.out.println("Error al introducir numero");
        } 
}
}
