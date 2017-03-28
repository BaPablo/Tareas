package CalculadoraV2;
import java.util.Scanner;


public class CarritoDeCompras{
    Calculadora calc = new Calculadora();
    int[] precio = new int [5];
    int[] cantidad = new int [5];
    
    public void asignación(){
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
        System.out.println("El resultado de su compra es:" + totalDeCompras());
    }
    
    public int totalDeCompras(){
        int totalparcial = 0;
        int totalfinal = 0;
        calc.setNum1(precio[0]);
        calc.setNum2(cantidad[0]);
        totalfinal = (int)calc.multiplicar();
            for(int i=1; i<=4; i++){
                calc.setNum1(precio[i]);
                calc.setNum2(cantidad[i]);
                totalparcial = (int) calc.multiplicar();
                calc.setNum1(totalparcial);
                calc.setNum2(totalfinal);
                totalfinal= (int)calc.suma();
            } 
        return totalfinal; 
        }
         
    }
 
     