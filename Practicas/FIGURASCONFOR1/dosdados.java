
/**
 * Write a description of class dosdados here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class dosdados
{
    public static void main(){
             double p=Math.random()*6+1;
     double d=Math.random()*6+1;
      p=(int)p;
      d=(int)d;
           for(int f=1;f<=p;f++){   //para mostrar los dados
         if(p==1){
            System.out.print("\n  "+f);
            }
         else if(p==2||p==3){
            System.out.printf(f+"");
            if(f==1){
            System.out.print("\n  ");
            }
            else if(f==2){
            System.out.print("\n    ");
            }
            }
         else if(p==4){
            System.out.printf(f+"  ");
            if(f==2){
            System.out.printf("\n");
            }
            }
         else if(p==5){
            System.out.printf(f+"   ");
            if(f==2){
            System.out.printf("\n  ");
            }
            else if(f==3){
            System.out.printf("\n");
            }  
            }
         else if(p==6){
            System.out.printf(f+"  ");
            if(f==3){
            System.out.print("\n");
            }
         }
        }
        System.out.printf("\n");
         for(int f=1;f<=d;f++){
         if(d==1){
            System.out.print("\n  "+f);
            }
         else if(d==2||d==3){
            System.out.printf(f+"");
            if(f==1){
            System.out.print("\n  ");
            }
            else if(f==2){
            System.out.print("\n    ");
            }
            }
         else if(d==4){
            System.out.printf(f+"  ");
            if(f==2){
            System.out.printf("\n");
            }
            }
         else if(d==5){
            System.out.printf(f+"   ");
            if(f==2){
            System.out.printf("\n  ");
            }
            else if(d==3){
            System.out.printf("\n");
            }  
            }
         else if(d==6){
            System.out.printf(f+"  ");
            if(f==3){
            System.out.print("\n");
            }
         }
         } 
}
}