/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Pablo
 */
public class Calculadorav01{
    private double numero1, numero2;
        public void setNum1(double numero){
        numero1 = numero;
        }
        public void setNum2(double numero){
        numero2 = numero;
        }
        public double getNum1(){
            return numero1;
        }
        public double getNum2(){
            return numero2;
        }
        
        public double suma (){
           return numero1 + numero2;
        }
        public double resta (){
           return numero1 - numero2;
       }
        public double division(){
           return numero1 / numero2;
       }
        public double multiplicar (){
           return numero1 * numero2;
       }
           
}

