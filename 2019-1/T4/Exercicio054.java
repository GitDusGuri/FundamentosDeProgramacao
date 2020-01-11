/**
 * 54. Crie um programa que preencha uma matriz 3×5 com numeros inteiros 
 * e some cada uma das linhas, armazenando o resultado das somas em um vetor. 
 * A seguir, o programa devera multiplicar cada elemento da matriz 
 * pela soma da linha correspondente e mostrar a matriz resultante.
 * 
 * @author Vinicius de Borba
 * @version 16 mai. 2019
 */

import java.util.Scanner;
import java.util.Locale;
public class Exercicio054{
    public static void main(String[] args){
        Locale.setDefault(Locale.ENGLISH);
        Scanner in = new Scanner(System.in);

        int[][] matriz = new int[3][5];
        int[] soma = new int[3];

        // preenche a matriz e soma os elementos da linha conforme sao inseridos
        for(int i = 0;i < matriz.length;i++){
            for(int j = 0;j < matriz[0].length;j++){
                matriz[i][j] = in.nextInt();
                soma[i] += matriz[i][j];
            }
        }
        
        // imprime a matriz resultante do elemento multiplicado pela soma da linha
        for(int i = 0;i < matriz.length;i++){
            for(int j = 0;j < matriz[i].length;j++){
                System.out.printf("%d ", (matriz[i][j] * soma[i]));
            }
            System.out.println();
        }
    }
}