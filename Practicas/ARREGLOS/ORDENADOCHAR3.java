public class ORDENADOCHAR3
{
   public static void main(){  //metodo pburbuja
   char [] vec={'h','f','y','d','z','g','a','m'};
   for(int i=0;i<8;i++){
    System.out.println("Arrelgo en la posicion ["+i+"]"+"="+vec[i]);
    }
   System.out.printf("\nEl arreglo desordenado son:");
      for(int j=0;j<8;j++){
        System.out.printf(" "+vec[j]);
      }
   for(int i=0;i<8-1;i++){
      for(int j=0;j<8-1;j++){
         if(vec[j]>vec[j+1]){
            char aux=vec[j];
            vec[j]=vec[j+1];
            vec[j+1]=aux;
        }
      }
     }
    System.out.printf("\nEl arreglo ordenado es:");
    for(int i=0;i<8;i++){
       System.out.printf(" "+vec[i]);
    } 
    
    }
}
