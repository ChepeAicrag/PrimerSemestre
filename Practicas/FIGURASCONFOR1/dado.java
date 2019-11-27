/**programa del dado */
public class dado
{
   public static void main(String[]args){
    double p=Math.random()*6+1;
      p=(int)p;
     System.out.println("Imprimir "+p);
     for(int f=1;f<=p;f++){
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
}
}

