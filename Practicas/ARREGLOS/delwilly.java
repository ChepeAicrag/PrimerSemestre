import java.util.*;//porgrama de arreglo que pide el tamaño del arreglo 
public class delwilly
{
    public static void main(){
    Scanner leer=new Scanner(System.in);
    System.out.println("Introduce el tamaño del arreglo");
    int x=leer.nextInt();
    String arreglo[]=new String[x];
    System.out.println("Introduce los elementos del arreglo"); 
    int i;
    for(i=0;i<x;i++){
       System.out.println("Arreglo en la posicion ["+i+"]:");
       arreglo[i]=leer.next();
       }
    System.out.println("");  
    for(i=0;i<x;i++){
       System.out.println("Lo valores del arreglo llenado son ["+i+"]"+"= "+arreglo[i]);
    } 
    }
}
