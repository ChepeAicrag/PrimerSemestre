import java.util.*;
public class UNIDAD3
{
  public static void main(){
   Scanner t=new Scanner(System.in);   
   System.out.println("Seleccione lo que deseee hacer\n 1)Jugar\n 2)Salir");
   int op=t.nextInt();
   int c=1000;
  if(c>0){ 
    while(op==1){ //para jugar la partida
      System.out.println("Su capital es "+c);
      System.out.println("¿Cuanto desea apostar?");
      int ap=t.nextInt();
      if(ap<c){
         System.out.println("Tirando dados...Mucha suerte");
         double p=Math.random()*6+1;
         double d=Math.random()*6+1;
         p=(int)p;
         d=(int)d;  
         double s=p+d;                         //para iniciar las operaciones de la partida
       if(s==7||s==11){
         System.out.println("Le ha salido "+p+" y "+d+" como resultado "+s+"\n"); 
         c+=ap; 
         System.out.println("Usted ha ganado "+ap+" usted ahora tiene "+c+"\n");
         System.out.println("Seleccione lo que deseee hacer ahora \n 1)Volver a jugar\n 2)Salir");
         op=t.nextInt();
         }
       else if(s==2||s==3||s==12){
         System.out.println("Le ha salido "+p+" y "+d+" como resultado "+s+"\n");
         c-=ap;
         System.out.println("Usted ha perdido "+ap+" ahora tiene "+c+"\n");
         System.out.println("Seleccione lo que deseee hacer ahora \n 1)Volver a jugar\n 2)Salir");
         op=t.nextInt();
         }
       else if(s==4||s==5||s==6||s==8||s==9||s==10){
         System.out.println("Su tirada es "+s);
         double ti=s;
         boolean con;
          do{
            System.out.println("Usted tiene la suerte de seguir jugando..."); 
            System.out.println("Debe obtener su tirada");  
            System.out.println("Tirando dados... Mucha suerte");
            double p2=Math.random()*6+1;
            double d2=Math.random()*6+1;
            p2=(int)p2;
            d2=(int)d2;
            double s2=p2+d2;
            con=false;
            System.out.println("Le ha salido "+p2+" y "+d2+" como resultado "+s2+"\n");
          if(s2==7){
            con=true;  
            c-=ap;
            System.out.println("Uy...:c");
            System.out.printf("Usted ha perdio "+ap);
            }
          else if(s2==ti){
            con=true;
            c+=ap;
            System.out.printf("Felicidades ha ganado "+ap);
            }  
        }while(con==false); 
        System.out.printf(" Su capital ahora es "+c+"\n");
        System.out.println("Seleccione lo que deseee hacer ahora \n 1)Volver a jugar\n 2)Salir");
        op=t.nextInt();
       }
      }
      else{
         System.out.println("Usted no cuenta con el saldo suficiente");
      }
    }
    {      //para decir que no quiere jugar
    System.out.println("Que tenga un buen dia");
    } 
    }
  else{
      System.out.println("Usted ya no puede seguir jugando, su saldo es insuficiente");
      }
 }
}