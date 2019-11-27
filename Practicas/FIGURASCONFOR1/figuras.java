/**PROGRAMA QUE CON SIWTCH CASE QUE IMPRIMA LAS FIGURAS HECHAS CON CICLOS HECHO POR JOSE ANGEL GARCIA GARCIA*/
import java.util.*;
public class figuras
{
    public static void main(String[]args){
    Scanner op=new Scanner(System.in);
    System.out.println("Introduzca el numero correspondiente a la figura a imprimir \n 1)Cuadrado\n 2)Circulo\n 3)Flecha\n 4)Rombo\n 5)Rectangulo");
    int fig=op.nextInt();
    switch(fig){
    case 1:
        System.out.println("Introduce el valor del lado");
        int l=op.nextInt();
        for(int f=1;f<=l;f++){
           for(int c=1;c<=l;c++){
              System.out.printf("* ");
           }
         System.out.printf("\n");
        }
        break;
    case 2:
        System.out.println("Introduce el valor del radio");
        int r=op.nextInt();
        for(int x=0;x<=r*2;x++ ){
           for(int y=0;y<=r*2;y++){
               if(Math.pow(y-r,2)+Math.pow(x-r,2)<=Math.pow(r,2)){
                  System.out.printf("* ");
                }
                else {
                   System.out.printf("  ");
                }
        }
         System.out.printf("\n");
        }
        break;
    case 3:
        System.out.println("Introduce el tamaño de la flecha");
        int m=op.nextInt();
        for(int i=1;i<=m;i++){
            for(int es=m-i;es>0; es--){       
               System.out.print(" ");
            }
            for(int p=1;p<2*i;p++){ 
               System.out.printf("*");
            }
           System.out.println(" ");
        }
        for(int i=1;i<=m;i++){
           for(int es=1;es<=m-1;es++){
              System.out.printf(" ");
           }
           System.out.printf("*");
           System.out.printf("\n");     
        }
        break;
    case 4:
        System.out.println("Introduce el tamaño del rombo");
        int t=op.nextInt();
	for(int i=1; i<=t; i++){ 
           for(int es=t-i; es>0; es--){       
               System.out.print(" ");
           }  
           for (int d=1;d<2*i;d++){ 
               System.out.print("*");
           }       
           System.out.printf("\n"); 
        }
        for (int i=t-1;i>=1;i--){ 
           for (int es=t-i;es>0;es--){       
                System.out.print(" ");
           }     
           for (int d=1;d<2*i;d++){ 
                System.out.print("*");
           }     
                System.out.printf("\n"); 
        } 
        break;
    case 5:
        System.out.println("Introduce el valor de lo ancho");
        int a=op.nextInt();
        System.out.println("Introduce el valor de lo largo");
        int la=op.nextInt();
        for(int k=1;k<=a;k++){
           for(int z=1;z<=la;z++){
            System.out.printf("* ");
            }
         System.out.println("");
        }
        break;
    default:
        System.out.println("No selecciono correctamente");
    }
}
}
