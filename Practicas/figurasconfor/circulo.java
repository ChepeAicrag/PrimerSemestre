/**CIRCULO CON FOR */
import java.util.*;
public class circulo
{
    public static void main(String[]args){
    Scanner s=new Scanner(System.in);
    System.out.println("Introduce el valor radio");
    int r=s.nextInt();
    for(int x=0;x<=r*2;x++ ){
       for(int y=0;y<=r*2;y++){
          while(Math.pow(y-r,2)+Math.pow(x-r,2)<=Math.pow(r,2)){
            System.out.printf("*");
            y++;
            }
                System.out.printf(" ");
        }
       System.out.printf("\n");
    }
    }
}
