/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CalculadoraV3;
import java.util.Scanner;

/** - Se requiere desarrollar una clase llamada MaquinaPGA que permite 
 * calcular el Promedio General Acumulado (PGA) para los promedios de las 
 * asignaturas de un alumno para un semestre dado.
 * - Dicha clase debe almacenar los promedios de las asignaturas en un arreglo.
 * - Luego, para hacer los cálculos debe usar la clase Calculadora. - El PGA se
 * calcula como sigue: i. cada nota tiene un "peso" en función del % de horas
 * totales semana para el semestre cursado. ii. lo anterior significa que debe
 * almacenar también las horas-semana que cada curso consideraba, en otro
 * arreglo. Ej. un alumno cursó 5 asignaturas (A) cuyos promedios (P) fueron:
 * P-A1:5.0, P-A2:4.3, P-A3:3,5, P-A4:5.5, P-A5: 4,8 Cada Ai, tenía la siguiente
 * cantidad de horas-semana (H): H-A1: 4, H-A2: 4, H-A3: 8, H-A4: 4, H-A5: 4
 * Total hrs-semana (THS): 24 --> el peso (Pe) de A1 es Pe-A1: H-A1/THS -->
 * 16,6% (4/24), etc...etc... Luego el PGA = Pe_A1 * P_A1 + Pe_A2 * P_A2 +....+
 * .... = ∑ n i=1 (Pe_Ai * P_Ai) 
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
