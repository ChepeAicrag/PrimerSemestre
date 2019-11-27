public class imprimirmatrices
{
    public static void main(){
    System.out.println("Las matrices son");
    int m[][]={{5,3},{4,2},{5,3}};
    int m2[][]={{1,2},{6,5},{0,7}};
    int mas[][]=sumar2(m,m2);
    System.out.println("Separadas son ");
    imp(m);
    System.out.println("---------------------------------");
    imp(m2);
    System.out.println("");
    imprimir(m,m2,mas);
    }
    public static void imprimir(int matriz[][], int mat2[][],int mas[][]){        
    for(int i=0;i<matriz.length;i++){
     for(int j=0;j<matriz[i].length;j++){
        System.out.printf("%2d",matriz[i][j]);
    }
    if((int)i==(matriz.length/2)){
    System.out.printf("%3S","+");
    }    
    System.out.printf("\t");
     for(int x=0;x<matriz[i].length;x++){
    System.out.printf("%2d",mat2[i][x]);
    }
    if((int)i==(mat2.length/2)){
    System.out.printf("%3S","=");
    }
    System.out.printf("\t");
     for(int x=0;x<matriz[i].length;x++){
    System.out.printf("%2d",mas[i][x]);
    }
    System.out.println("");
    }
    }
    
    public static void imp(int matriz[][]){
    for(int i=0;i<matriz.length;i++){
     for(int j=0;j<matriz[i].length;j++){
        System.out.printf("%2d",matriz[i][j]);
    }
    System.out.println("");
    }
    }
    public static int[][] sumar2(int mat1[][],int mat2[][]){
    int mat3[][]=new int[mat1.length][mat1[0].length];
        for(int i=0;i<mat3.length;i++){
            for(int j=0;j<mat3[i].length;j++){
                  mat3[i][j]=mat1[i][j]+mat2[i][j];
            }
    }
    return mat3;
    }
}
