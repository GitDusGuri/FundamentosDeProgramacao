/**
 * 84. Faca um programa que leia uma matriz 3×3 com numeros reais 
 * e um valor real digitado pelo usuario. O programa devera calcular 
 * e mostrar a matriz resultante da multiplicacao do numero digitado 
 * por cada elemento da matriz.
 * 
 * @author Vinicius de Borba
 * @version 16 mai. 2019
 */

import java.util.Scanner;
import java.util.Locale;
public class Exercicio084{
    public static void main(String[] args){
        Locale.setDefault(Locale.ENGLISH);
        Scanner in = new Scanner(System.in);

        // preenche a matriz de reais
        double[][] matriz = new double[3][3];
        for(int i = 0;i < matriz.length;i++){
            for(int j = 0;j < matriz[0].length;j++){
                matriz[i][j] = in.nextDouble();
            }
        }

        // recebe o numero e imprime a matriz com o produto de cada elemento pelo valor
        double valor = in.nextDouble();
        for(int i = 0;i < matriz.length;i++){
            for(int j = 0;j < matriz[0].length;j++){
                System.out.printf("%.4f ",(matriz[i][j] * valor));
            }
            System.out.println();
        }
    }
}