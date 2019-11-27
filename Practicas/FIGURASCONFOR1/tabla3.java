
/**
 * Write a description of class tabla3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class tabla3
{
    public static void main(){
    int t=1;
    int m=1;
    do{
        for(int x=1;x<10;x++){
    t=x*m;
    System.out.printf(x+"*"+m+"="+t+" \t");
}
System.out.println(" ");
m++;
    }while(m<=10);
    }
}
