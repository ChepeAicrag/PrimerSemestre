import java.util.*;
public class proyectodeunidad3
{
    public static void main(){    
    Scanner S= new Scanner(System.in);
    int c=0;
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
             int apt=ap*v; //calcula lo que cuesta jugar un juego, todas las jugadas 
       if(apt<=c){ //condiciona que la apuesta no puede ser mayor a su dinero 
        boolean r=false;
        int i=1,n=0,np=0;
        double s,sp=0,sg=0;
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
        r=true;
        c+=ap;
        System.out.println("Felicidades gano con la suma de "+(int)s);
        System.out.println("Acabas de ganar $"+ap);
        n++;
        sg=s;
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
   System.out.println("Sus estadisticas son ");
   if(s==num){
   System.out.println("Usted gano "+n+" vez un total de "+ap*n+" con la suma "+sg);
   }
   else if(s!=num){
   System.out.println("Usted perdio "+np+" veces un total de "+ap*np+"\n");
   }
   if((ap*np<ap*n)){
   System.out.println("En resumen gano $"+((ap*n)-(ap*np)));
   }else{
    System.out.println("En resumen perdio $"+((ap*np)-(ap*n)));
    }
    System.out.println("\nAhora su capital es $"+c+"\n");
    System.out.println("\nSeleccione lo que deseee hacer ahora \n 1)Volver a jugar\n 2)Salir");
    op=S.nextInt();
    
   if(op==2){
    System.out.println("Usted se retira a casa con $"+c); 
    break;//para saltar hasta el final del if
    }
   
   }//fin del if de apostar cantidad
   else{ //de if c>ap
          System.out.println("Usted no puede apostar dicha cantidad\n");
         //System.out.println("¿Cuanto desea apostar?");
         //ap=S.nextInt();
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