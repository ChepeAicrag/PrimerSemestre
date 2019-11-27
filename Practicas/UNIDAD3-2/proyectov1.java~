import java.util.*;
public class proyectov1
{
    public static void main(){    
    Scanner S= new Scanner(System.in);
    int c=0,juego=0;
    int pres=3;
    System.out.println("Bienvenido al juego\n Seleccione lo que deseee hacer\n 1)Jugar\n 2)Salir");
    int op=S.nextInt();
     if(op==1){
       c=1000;  
       while(c!=0 && op==1){
           
       System.out.println("Su capital es $"+c);
       System.out.println("¿Con que suma desea ganar?");
       int num=S.nextInt();
       if(num<13&& num>=2){ //delimitar que solo puede apostar maximo con 12     
       System.out.println("¿Cuantas veces desea apostar?");
       int v=S.nextInt();
       if(v>0){     //condicion para apostar mas de una vez 
        System.out.println("¿Cuanto desea apostar por jugada?");
        int ap=S.nextInt();
        if(juego==1){
        c+=ap;    
        System.out.println("Usted tiene en juego "+c);
        }
        else{
            
        System.out.println("Usted tiene en juego "+c);
        }
        boolean r=false;
        int i=1,n=0,np=0;
        double s,sp=0,sg=0,ngana=0;
        do{       
       System.out.println("**********************************");     
       System.out.println("Apuesta "+i+" suerte");     
       double d1=Math.random()*6+1;
       double d2=Math.random()*6+1;
       d1=(int)d1;
       d2=(int)d2;
       s=d1+d2;
       System.out.println("Dado1 "+" |"+(int)d1+"| "+" Dado2 "+" |"+(int)d2+"| "+" su suma de puntos es "+(int)s);
       if(s==num){ //para parar el juego al acertar el numero y le indica que gano
        c+=ap;
        System.out.println("Felicidades gano con la suma de "+(int)s);
        System.out.println("Acabas de ganar $"+ap);
        n++;
        sg++;;
        ngana=s;
        }
        else if(s!=num){// si no acerta el numero, le indica que perdio 
        c-=ap;
        np++;
        System.out.println("Perdio con la suma de "+(int)s);
        System.out.println("Acabas de perder $"+ap);
        sp=s;
        }
        v--; //decrementa las veces que apuesta 
        if(v==0){    
        r=true;
        System.out.println("**********************************");
        System.out.println("\nSus jugadas han terminado");
       }
       i++; //incremento en el numero de apuesta
    }while(r!=true);
    juego++;
   System.out.println("Sus estadisticas son ");
   if(sg>0){
   System.out.println("Usted gano "+n+" vez un total de "+ap*n+" con la suma "+ngana);
   }
   else if(s!=num){
   System.out.println("Usted perdio "+np+" veces un total de "+ap*np+"\n");
   }
   if((ap*np<ap*n)){
   System.out.println("En resumen gano $"+((ap*n)-(ap*np)));
   }else{
    System.out.println("En resumen perdio $"+((ap*np)-(ap*n)));
    }
    if(c<=0){
    //c=c*(-1);
    System.out.println("Usted esta debiendo"+c*(-1));
    }else{
    System.out.println("\nAhora su capital es $"+c+"\n");
    }
    System.out.println("\nSeleccione lo que deseee hacer ahora \n 1)Volver a jugar\n 2)Salir");
    op=S.nextInt();
   if(op==1&&c<=0){
        System.out.println("Usted no tiene dinero suficiente para jugar\n ¿Desea qe la casa le preste?\n 1) Si 2)No gracias, deseo retirarme");
        int op2=S.nextInt();
  
        if(op2==1){
        System.out.println("¿Cuanto gusta que le preste la casa?");
        int prestado=S.nextInt();
        pres--;
        c+=prestado;        
        }
        else{
        System.out.println("Mala decision ");
        break;
        }
    } 
   if(op==2&&c<0){
    System.out.println("Usted se retira a casa con $"+c); 
    break;//para saltar hasta el final del if
    }
       }
    else{
          System.out.println("Debe jugar por lo menos una vez");
          }
    }//final de apsotar menos de 12   
      else{
          System.out.println("Usted no puede ganar con esa suma");
          //System.out.println("¿Con que numero desea ganar?");
          //num=S.nextInt();  
       }  
   } //fin del while c!=0
  }//fin del if de la opcion jugar      
   System.out.println("Que tenga un buen día");//si elige la opcion 2
   } 
}