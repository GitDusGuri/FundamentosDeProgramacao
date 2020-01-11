/**
 *  Faca um programa que leia o numero de termos (sempre maior do que zero) e um valor inteiro positivo para X(tambem sempre maior do que zero).
 *  Calcule e mostre o valor da serie a seguir:
 *          S = -X2/1! + X3/2! - X4/3! + X5/4! - X6/3! + X7/2! - X8/1! + X9/2! - X10/3! + X11/4!...
 *          
 * @author Vinicius de Borba
 * @version 15 abr. 2019
 */

import java.util.Scanner;
import java.util.Locale;
public class Exercicio05
{
    public static void main(String[] args){
        Locale.setDefault(Locale.ENGLISH);
        Scanner in = new Scanner(System.in);
        
        int Termos = in.nextInt();
        int X = in.nextInt();
        double S = 0, resultado, fatorial = 1;
        int j = 1, incremento = 1;
        for(int i = 1;i <= Termos;i++){
            switch(j){
				case 1: fatorial = 1; break;
				case 2: fatorial = 1*2; break;
				case 3: fatorial = 1*2*3; break;
				default: fatorial = 1*2*3*4; break;
			}
            if(i % 4 ==0)
                incremento *= -1;
            j += incremento;
            if(j == 0)
                j += 2;
			
            resultado = Math.pow(X, (i+1))/fatorial;

            if((i % 2) == 1){
                S -= resultado;
            }
            else{
                S += resultado;
            }
        } 
        
        System.out.printf("%.4f", S);
    }
}
