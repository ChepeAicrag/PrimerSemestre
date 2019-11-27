public class funciones2
{
    public static void main(String[]args){
    int arreglo[]={5,7,9,4,2};
    int total=sumatoria(arreglo);
    System.out.print(total);
    }
    public static int sumatoria(int[]numeros){
        int suma=0;
        for(int c=0;c<5;c++){
        suma+=numeros[c];
        }
        return suma;
    }
    
}
