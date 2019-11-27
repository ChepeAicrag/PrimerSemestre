/**PROGRAMA PARA LA LOTERIA MAYOR A 80 PREMIO MAYOR, MENOR A 20 CANTIDAD MINIMA Y MAY*/
import java.util.*;
public class loteri
{
   public static void main(String[]args){
    double v;   
    v=Math.random()*100;
     if(v==0){
       System.out.println("Sigue participando, no ganas con" +v);
       }
      else if(v<=50 && v>=20){
          
      System.out.println("Ha ganado un premio mediano con "+v);
       }
       else if(v>0 && v<=20){
        System.out.println("Ha ganado un premio chico con "+v);
        }
       else if(v==100){
       System.out.println("Ha ganado el premio maximo con "+v);}
    }
}
