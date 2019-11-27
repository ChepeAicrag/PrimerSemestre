import java.util.*;
class rombo{
	public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Introduce el tamaño del rombo");
        int m=sc.nextInt();
	 for (int i=1; i<=m; i++){ 
           for (int es=m-i;es>0;es--){       
                System.out.print(" "); 
            }
                 for (int l=1;l<2*i;l++){ 
                   System.out.print("*");
                }
                   System.out.println(""); 
        }
          for (int i=m-1;i>=1;i--){ 
           for (int es=m-i;es>0;es--)       
                System.out.print(" "); 
                 for (int l=1;l<2*i;l++){ 
                   System.out.print("*");
                }
                   System.out.println(" "); 
        } 
    }
} 