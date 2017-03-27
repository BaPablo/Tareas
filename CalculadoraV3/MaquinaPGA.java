/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CalculadoraV3;
import java.util.Scanner;

/*
 * @author Pablo
 */
public class MaquinaPGA {
    double[] notas;
    int[] horassemana;
    int asignaturas; 
    double totalhoras, PGA;
    double [] peso;
    Scanner teclado = new Scanner(System.in);
    Calculadora calc = new Calculadora();
    
    
    //cantidad de horas y asignaturas, tamaño del arreglo
    public void asignacion(){
        System.out.println("Hola, ¿cuántas asignaturas tomó?");
        asignaturas = teclado.nextInt();
        double [] notas = new double[asignaturas];
        int [] horassemana = new int [asignaturas];
        double[] peso = new double [asignaturas];
            for(int i = 0; i<asignaturas; i++){
                System.out.println("¿Cuántas horas tiene el ramo?" + i+1);
                horassemana[i]= teclado.nextInt();
            }
        sumaHoras();   
        pesoAsignaturas();
        pga();
        System.out.println("Su PGA es:"+ PGA );
               
    }    
    public void sumaHoras(){
        double acumulacion;
        calc.setNum1(horassemana[0]);
        calc.setNum2(horassemana[1]);
        acumulacion = calc.suma();
        for(int i = 2 ; i < asignaturas;i++){
            calc.setNum1(acumulacion);
            calc.setNum2(horassemana[i]);
            acumulacion=calc.suma();
        }
        totalhoras = acumulacion;
        
    }
    public void pesoAsignaturas(){
        for(int i=0;i<asignaturas;i++){
            calc.setNum1(horassemana[i]);
            calc.setNum2(totalhoras);
            peso[i] = calc.division();
        }
    }
    public void pga(){
        double [] acumulacionmult = new double[asignaturas];//acumula los Pe*Pa
        double acumulacionsuma = 0;
        calc.setNum1(peso[0]);
        calc.setNum2(notas[0]);
        acumulacionmult[0] = calc.multiplicar();
            for(int i=1; i<asignaturas;i++){
                calc.setNum1(peso[i]);
                calc.setNum2(notas[i]);
                acumulacionmult[i] = calc.multiplicar();
            }
        calc.setNum1(acumulacionmult[0]);    
        calc.setNum2(acumulacionmult[1]);
        acumulacionsuma = calc.suma();
            for(int i=2; i<asignaturas; i++){
                calc.setNum1(acumulacionsuma);
                calc.setNum2(acumulacionmult[i]);
                acumulacionsuma = calc.suma();
            }
       PGA = acumulacionsuma;
    }
        
    }
