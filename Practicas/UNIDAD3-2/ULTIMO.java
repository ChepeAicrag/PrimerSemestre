import java.util.*;
public class ULTIMO
{
  public static void main(String[]args){    
     Scanner S= new Scanner(System.in);
     int c=0,juego=0,prestado = 0,db=0,pres=3,pagar=0,op2,salir=0;
     System.out.println("Bienvenido al juego");
        c=1000;
          while(c!=0 ||salir!=0){ 
          if(c<=0&&pres!=0){
           System.out.println("No tiene dinero para jugar");   
           System.out.println("¿Cuanto gusta que le preste la casa?");
           prestado=S.nextInt();
           pres--;
           c+=prestado;        
           pagar+=prestado;
          }
          if(c<0){
           System.out.println(" Usted sera embargado");
           break;  
          } 
           System.out.println("Su capital es $"+c);
           System.out.println("¿Con que suma desea ganar?");
           int num=S.nextInt();
          if(num<13&& num>=2){ 
           System.out.println("¿Cuantas veces desea apostar?");
           int v=S.nextInt();
          if(v>0){ 
           System.out.println("¿Cuanto desea apostar por jugada?");
           int ap=S.nextInt();
          if(juego==0){
             c+=ap;    
             System.out.println("Usted tiene en juego $"+c);
            }
          else{   
             System.out.println("Usted tiene en juego $"+c);
             }
          boolean r=false;
          int i=1,n=0,np=0;
          double s,sp=0,sg=0,ngana=0;
          do{
            juego++;     
            System.out.println("**********************************");     
            System.out.println("Apuesta "+i+" suerte");     
            double d1=Math.random()*6+1;
            double d2=Math.random()*6+1;
            d1=(int)d1;
            d2=(int)d2;
            s=d1+d2;
            System.out.println("Dado1 "+" |"+(int)d1+"| "+" Dado2 "+" |"+(int)d2+"| "+" su suma de puntos es "+(int)s);
           if(s==num){ 
             c+=ap;
             System.out.println("Felicidades gano con la suma de "+(int)s);
             System.out.println("Acabas de ganar $"+ap);
             n++;
             sg++;
             ngana=s;
            }
            else if(s!=num){
                   c-=ap;
                   np++;
                   System.out.println("Perdio con la suma de "+(int)s);
                   System.out.println("Acabas de perder $"+ap);
                 sp++;
           }
           v--; 
           if(v==0){    
             r=true;
             System.out.println("**********************************");
             System.out.println("\nSus jugadas han terminado");
           }
           i++;
         }while(r!=true);
         System.out.println("Sus estadisticas son:");
         if(sg>0&&sg<2){
            System.out.println("Usted gano "+n+" vez un total de $"+ap*n+" con la suma "+(int)ngana);
         }
          else if(sg>1){
            System.out.println("Usted gano "+n+" veces un total de $"+ap*n+" con la suma "+(int)ngana); 
         }
         if(sp>0&&sp<2){
            System.out.println("Usted perdio "+np+" vez un total de "+ap*np+"\n");
         }
         if(sp>1){
            System.out.println("Usted perdio "+np+" veces un total de "+ap*np+"\n");
            }
         if((ap*np<ap*n)){
            System.out.println("En resumen gano $"+((ap*n)-(ap*np)));
         }
         else if(ap*np>ap*n && ap*np!=0){
            System.out.println("En resumen perdio $"+((ap*np)-(ap*n)));
         }
         if(pres>=0&& pres<3 &&c>pagar){
            System.out.println("Pagando a la casa");
            c-=pagar;
            db--;
         }
         if(c<0){
            System.out.println("Usted esta debiendo $"+c*(-1));
            db++;
         }
         else{
            System.out.println("\nAhora su capital es $"+c+"\n");
         }
         System.out.println("\nSeleccione lo que desee hacer ahora \n 1)Volver a jugar\n 2)Retirarme");
         int op=S.nextInt();
         if(op==1&&c<=0){
            System.out.println("Usted no tiene dinero suficiente para jugar\n ¿Desea qe la casa le preste?\n 1) Si 2)No gracias, deseo retirarme");
            op2=S.nextInt();
            do{
              if(op2==1 && pres!=0){
                System.out.println("¿Cuanto gusta que le preste la casa?");
                prestado=S.nextInt();
                pres--;
                c+=prestado;        
                pagar+=prestado;
                salir++;
                break;
              }
               else if(op2==1 && pres==0 && pagar>0){
                System.out.println("La casa ya no le puede prestar más!!! \n Usted ya esta debiendo $"+pagar+" cantidad que no podra pagar");
                salir++;
                break;
              }
              else if(op2==2&&c<0){
                System.out.println("Usted no se puede retirar porque esta debiendo, debe volver a jugar");
                op2=1;
              }
           }while(salir!=0||op2==1||c>0);  
           }
           else if(op==2&&c==0&&pagar==0){
              System.out.println("Se retira sin nada :c\n Suerte para la proxima");
           } 
           else if(op==2&&c>=0&&pagar==0){
              System.out.println("Usted se retira a casa con $"+c); 
              System.out.println("Que tenga un excelente día");
              break;
           }
           else if(op==2&&db>0&&c<0){ 
              System.out.println("Usted no puede retirarse, esta debiendo dinero");
              op=1;
              System.out.println("Su deuda es $"+c*(-1));
              if(pres==0){
                 System.out.println("Ya no se le puede prestar y quedo endeudado con nosotros");
                 break;
               }   
           }
          else if(op==2&&c>=0&&pagar>0&&pagar>c){
              c-=pagar;
              System.out.println("Usted sigue debiendo $"+c*(-1));
           }
         }
         else{
          System.out.println("Debe jugar por lo menos una vez");
         }
        }
        else{
          System.out.println("Usted no puede ganar con esa suma");
        }  
      } 
    }
}

