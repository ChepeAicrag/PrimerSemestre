/**PROYECTO DE UNIDAD*/ //JOSÉ ÁNGEL GARCÍA GARCÍA
import java.util.*;
public class proyecto
{
    public static void main(String[]args){
        double p,c,d,b1000=0,b500=0,b200=0,b100=0,b50=0,b20=0,m10=0,m5=0,m2=0,m1=0,mc=0;
        Scanner n=new Scanner(System.in);
        System.out.printf("\rIntroduce el valor del producto\n");
        d=n.nextDouble();
        System.out.printf("\rIntroduce la cantidad que pago\n");
        p=n.nextDouble();
         if(d==0 || p==0 || p<d){ 
            System.out.println("Error de los datos");
        }else {
        c=p-d;
        if(c==0){
            System.out.println("Sin cambio");
        } else {
        System.out.printf("Su cambio es "+(float)c+ " repartido en\r");
        if(c>=1000){
            b1000=(int) c/1000;
            c=c%1000;
            System.out.printf("\t"+(int)b1000+" Billete(s) de 1000\r");
        }
        if(c>=500){
           b500=(int)c/500;
           c=c%500;
           System.out.printf("\t"+(int)b500+" Billete(s) de 500\r");
        }
        if(c>=200){
           b200=(int)c/200;
           c=c%200;
           System.out.printf("\t"+(int)b200+" Billete(s) de 200\r");
        }
        if(c>=100){
          b100=(int)c/100;
          c=c%100;
          System.out.printf("\t"+(int)b100+" Billete(s) de 100\r");
        }
        if(c>=50){
          b50=(int)c/50;
          c=c%50;
          System.out.printf("\t"+(int)b50+" Billete(s) de 50\r");
        }
        if(c>=20){
            b20=(int)c/20;
            c=c%20;
            System.out.printf("\t"+(int)b20+" Billete(s) de 20\r");
        }
        if(c>=10){
            m10=(int)c/10;
            c=c%10;
            System.out.printf("\t"+(int)m10+" Moneda(s) de 10\r");
        }
        if(c>=5){
            m5=(int)c/5;
            c=c%5;
            System.out.printf("\t"+(int)m5+" Moneda(s) de 5\r");
        }
        if(c>=2){
            m2=(int)c/2;
            c=c%2;
            System.out.printf("\t"+(int)m2+" Moneda(s) de 2\r");
        }
        if(c>=1){
            m1=(int)c/1;
            c=c%1;
            System.out.printf("\t"+(int)m1+" Moneda(s) de 1\r");
        }
        if(c>=0.50){
            mc=(double)c/0.50;
            c=c%(int)0.50;
            System.out.printf("\t"+(int)mc+" Moneda(s) de 50 centavos\r");
        } 
        System.out.printf("\t Gracias por su compra");
    }
}
}
}
