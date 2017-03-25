package calculadorav01;
import java.util.Scanner;


public class CarritoDeCompras{
    public void asignación(){
        int[] precio = new int [5];
        int[] cantidad = new int [5];
        precio[0] = 1000;
        precio[1] = 1500;
        precio[2] = 2000;
        precio[3] = 2500;
        precio[4] = 3000;
        Scanner teclado = new Scanner(System.in);
        
        for(int i = 0; i<=4; i++){
            System.out.println("Cuanto desea del producto:" + (i+1));
            cantidad[i] = teclado.nextInt();
           }
    }
    //public int totalCompras (){
        
        
    }
 
     