/** Un obrero desea calcular su salario mensual, el cual se obtiene de la siguiente manera, si trabaja 40hrs o menos se le paga $100 por hora
  y si trabaja mas de 40hrs se le paga 150 por cada una de las primeras 40hrs y $200 por cada hora extra*/
import java.util.Scanner;
public class obrero
{
    public static void main(String[]args){
    int salario,hrs,pagar,extra;    
    Scanner num1=new Scanner(System.in);
    System.out.println("Introduce las horas que trabajaste");
    hrs=num1.nextInt();
    if(hrs<=40){
       salario=hrs*100;
       System.out.println("No trabajo horas extras");
       System.out.println("Su salario es "+salario);
     }
    else{
       salario=40*150;
       extra=(hrs-40)*200;
       pagar=salario+extra; 
       System.out.println("Su salario total es "+pagar);
    }
    }
    }

