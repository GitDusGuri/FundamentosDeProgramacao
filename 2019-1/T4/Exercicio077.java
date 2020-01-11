/**
 * 77. Crie um programa que preencha uma 
 * matriz 2×4 com numeros inteiros, 
 * calcule e mostre:
 * 
 * 1) a quantidade de elementos entre 12 e 20 em cada linha;
 * 
 * 2) a media dos elementos pares da matriz. 
 *    Se nao houver elementos pares na matriz, imprima "-".
 */

import java.util.Scanner;
import java.util.Locale;
public class Exercicio077{
    public static void main(String[] args){
        Locale.setDefault(Locale.ENGLISH);
        Scanner in = new Scanner(System.in);

        int[][] matriz = new int[2][4];
        int qntElem, qntPares = 0;
        double somaPares = 0;
        // preenche a matriz e faz a contabilidade de numeros pares e numero entre 12 e 20 em cada linha
        for(int i = 0;i < matriz.length;i++){
            qntElem = 0;
            for(int j = 0;j < matriz[i].length;j++){
                matriz[i][j] = in.nextInt();

                if(matriz[i][j] % 2 == 0){
                    somaPares += matriz[i][j];
                    qntPares++;
                }
                if(matriz[i][j] > 12 && matriz[i][j] < 20){
                    qntElem++;
                }
            }
            System.out.println(qntElem);
        }
        // checa se ha pares na matriz, caso negativo, imprime "-"
        if(qntPares != 0){
            double mediaPares = somaPares/qntPares;
            System.out.printf("%.4f\n", mediaPares);
        }
        else{
            System.out.println("-");
        }
    }
}
