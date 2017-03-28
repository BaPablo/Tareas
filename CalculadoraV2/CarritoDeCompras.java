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
        int editar, opcion,  producto, seguir;
              
        for(int i = 0; i<=4; i++){
            System.out.println("Cuanto desea del producto:" + i);
            cantidad[i] = teclado.nextInt();
           }
        System.out.println("¿Desea editar su compra?");
        System.out.println("1: Si     2: No");
        editar = teclado.nextInt();         
        while(editar == 1){
            System.out.println("¿Qué quiere hacer?:");
            System.out.println("1: Agregar  2: Quitar   3:Terminar ");
            opcion = teclado.nextInt();
                switch(opcion){
                    case 1: 
                        System.out.println("¿A que producto desea agregar?");
                        producto = teclado.nextInt();
                        switch(producto){
                            case 0: System.out.println("¿Cuanto desea agregar?");
                                    cantidad[0]= cantidad [0]+ teclado.nextInt();
                                    System.out.println("¿Desea continuar?");
                                    System.out.println("1: Si   2:No");
                                    seguir = teclado.nextInt();
                                    if(seguir == 1){
                                        opcion=3;
                                    }
                                    else{
                                        opcion=4;
                                    }
                                   
                                    break;
                                    
                            case 1: System.out.println("¿Cuanto desea agregar?");
                                    cantidad[1]= cantidad [1]+ teclado.nextInt();
                                    System.out.println("¿Desea continuar?");
                                    System.out.println("1: Si   2:No");
                                    seguir = teclado.nextInt();
                                    if(seguir==1){
                                        opcion=3;
                                        
                                    }
                                    else{
                                        opcion=4;
                                             
                                    }
                                    
                                    break;
                                
                            case 2: System.out.println("¿Cuanto desea agregar?");
                                    cantidad[2]= cantidad [2]+ teclado.nextInt();
                                   System.out.println("¿Desea continuar?");
                                    System.out.println("1: Si   2:No");
                                    seguir = teclado.nextInt();
                                    if(seguir==1){
                                        opcion=3;
                                    }
                                    else{
                                        opcion=4;
                                    }
                                    break;
                            case 3: System.out.println("¿Cuanto desea agregar?");
                                    cantidad[3]= cantidad [3]+ teclado.nextInt();
                                   System.out.println("¿Desea continuar?");
                                    System.out.println("1: Si   2:No");
                                    seguir = teclado.nextInt();
                                    if(seguir==1){
                                        opcion=3;
                                    }
                                    else{
                                        opcion=4;
                                    }
                                    break;
                            case 4: System.out.println("¿Cuanto desea agregar?");
                                    cantidad[4]= cantidad [4]+ teclado.nextInt();
                                   System.out.println("¿Desea continuar?");
                                    System.out.println("1: Si   2:No");
                                    seguir = teclado.nextInt();
                                    if(seguir==1){
                                        opcion=3;
                                    }
                                    else{
                                        opcion=4;
                                    }
                                    break;
                                  
                        }
                        break;
                    case 2:
                        System.out.println("¿A que producto desea quitarle?");
                        producto = teclado.nextInt();
                        switch(producto){
                            case 0: System.out.println("¿Cuanto desea quitar?");
                                    cantidad[0]= cantidad [0]- teclado.nextInt();
                                    if (cantidad[0]<=0)
                                        cantidad[0]=0;
                                    System.out.println("¿Desea continuar?");
                                    System.out.println("1: Si   2:No");
                                    seguir = teclado.nextInt();
                                    if(seguir==1){
                                        opcion=3;
                                        break;
                                    }
                                    else{
                                        opcion=4;
                                        break;
                                    }
                            case 1: System.out.println("¿Cuanto desea quitar?");
                                    cantidad[1]= cantidad [1]- teclado.nextInt();
                                    if (cantidad[1]<=0)
                                        cantidad[1]=0;
                                    System.out.println("¿Desea continuar?");
                                    System.out.println("1: Si   2:No");
                                    seguir = teclado.nextInt();
                                    if(seguir==1){
                                        opcion=3;
                                        break;
                                    }
                                    else{
                                        opcion=4;
                                        break;
                                    }
                                
                            case 2: System.out.println("¿Cuanto desea quitar?");
                                    cantidad[2]= cantidad [2]- teclado.nextInt();
                                    if (cantidad[2]<=0)
                                        cantidad[2]=0;
                                    System.out.println("¿Desea continuar?");
                                    System.out.println("1: Si   2:No");
                                    seguir = teclado.nextInt();
                                    if(seguir==1){
                                        opcion=3;
                                        break;
                                    }
                                    else{
                                        opcion=4;
                                        break;
                                    }
                                
                            case 3: System.out.println("¿Cuanto desea quitar?");
                                    cantidad[3]= cantidad [3]- teclado.nextInt();
                                    if (cantidad[3]<=0)
                                        cantidad[3]=0;
                                    System.out.println("¿Desea continuar?");
                                    System.out.println("1: Si   2:No");
                                    seguir = teclado.nextInt();
                                    if(seguir==1){
                                        opcion=3;
                                        break;
                                    }
                                    else{
                                        opcion=4;
                                        break;
                                    }
                                
                            case 4: System.out.println("¿Cuanto desea quitar?");
                                    cantidad[4]= cantidad [4]- teclado.nextInt();
                                    if (cantidad[4]<=0)
                                        cantidad[4]=0;
                                    System.out.println("¿Desea continuar?");
                                    System.out.println("1: Si   2:No");
                                    seguir = teclado.nextInt();
                                    if(seguir==1){
                                        opcion=3;
                                        break;
                                    }
                                    else{
                                        opcion=4;
                                        break;
                                    }
                        }
                        break;    
                    case 3: editar = 1;
                            break;    
                    case 4: editar = 0;
                            break;    
                }
                        
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
     