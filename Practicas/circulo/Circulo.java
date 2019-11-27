import java.util.*;
public class Circulo{
public int cont=0;
public static void main(){
int espacio=22;
int lineas=14;
for(int x=0;x<lineas;x++){
    if(x<(lineas/2)-1){
    espacio=espacio-5;
}
    else{
    espacio=espacio+5;
}

   for(int y=0;y<40;y++){
     if(y<espacio||y>40-espacio){
     System.out.print(" ");
    }
     else 
     System.out.print("*");
    }
     System.out.print("\n");
    }    
}
}
