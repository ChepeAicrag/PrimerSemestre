/**programa con do while de 45 numeros*/
public class PRIMEROS45
{
  public static void main(String[]args){
   int s=0;
   int i=1;
   do {
       s+=i;
       i++;
    } while(i<=45);
    System.out.println("La suma total es "+s);
   }
}
