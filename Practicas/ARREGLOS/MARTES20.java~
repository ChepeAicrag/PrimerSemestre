public class MARTES20
{
    public static void main(String[]args){
        int x=5,d=0,m,p=0;
        int []arreglo=new int[x];
        int[]imp=new int[x];
        System.out.println("El tamaño del arreglo es "+x);
        for(int i=0;i<x;i++){   
         arreglo[i]=(int)(Math.random()*20+1);   
         System.out.println("El elemento del arreglo "+i+" es="+arreglo[i]);
         for(m=1;m<=arreglo[i];m++){
                if(arreglo[i]%m==0){ 
                d++;
                }
            }
                if(d==2){
                 p++;
                 imp[i]=arreglo[i];
                 }
                 d=0;  
      }
        System.out.printf("\nEl arreglo desordenado es:");
         for(int j=0;j<x;j++){ 
            System.out.printf(" "+arreglo[j]);
           
        }
         for(int i=0;i<x-1;i++){
            for(int j=0;j<x-1;j++){
               if(arreglo[j]>arreglo[j+1]){
                  int aux=arreglo[j];
                  arreglo[j]=arreglo[j+1];
                  arreglo[j+1]=aux;
                } 
               
                }        
        } 
        System.out.printf("\nEl arreglo ordenado es:");
        for(int im=0;im<x;im++){
           System.out.printf(" "+arreglo[im]);
        }   
         System.out.printf("\nUsted tiene "+p+" numeros primos son primos: ");
         for(int j=0;j<x;j++){
            if(imp[j]!=0){ 
            System.out.print(imp[j]+" ");
            } 
        }
    }
    }   
