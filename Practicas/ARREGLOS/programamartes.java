public class programamartes
{
    public static void main(){
    int tam[]={3,5,7,18,15,19,14,11,4,30};
    System.out.printf("%S %13S %13S \n" ,"posicion","valor","#Deasteriscos");
    for(int i=0;i<=9;i++){
      System.out.printf("%7d %13d \t" ,i,tam[i]);
      for(int j=0;j<tam[i];j++){
        System.out.printf("*");
        }
    System.out.println(" ");
}
    }
}
