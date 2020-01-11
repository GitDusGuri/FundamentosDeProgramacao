/**
 * Faca um programa que leia um vetor com oito numeros inteiros, calcule e mostre dois vetores resultantes. 
 * O primeiro vetor resultante deve conter os numeros positivos e o segundo, os numeros negativos. 
 * Cada vetor resultante vai ter, no maximo, oito posicoes, que nao poderao ser completamente utilizadas. 
 * Considere que zero nao e nem positivo, nem negativo.  
 * Podem nao haver valores positivos ou negativos no vetor original, 
 * neste caso deve-se imprimir uma linha vazia na saida.
 *
 * @author Vinicius de Borba
 * @version 11 mai. 2019
 */

import java.util.Scanner;
import java.util.Locale;
public class Exercicio004{
	public static void main(String[] args){
		Locale.setDefault(Locale.ENGLISH);
		Scanner in = new Scanner(System.in);
		
		int[] vet1 = new int[8];
		int[] vetPos = new int[8];
		int[] vetNeg = new int[8];
		int numNeg = 0, numPos = 0, numZeros = 0;
		
		for(int i = 0;i < 8;i++){
			vet1[i] = in.nextInt();
			// contadores dos tipos(positivos, negativos, zeros)
			if(vet1[i] > 0){
				vetPos[numPos] = vet1[i];
				numPos++;
			}
			else if(vet1[i] < 0){
				vetNeg[numNeg] = vet1[i];
				numNeg++;
			}
			else numZeros++;
		}
		// se todas entradas forem zero, imprime uma linha em branco
		if(numZeros == 8) System.out.println();
		else{
			for(int i = 0;i < numPos;i++)
				System.out.printf("%d ", vetPos[i]);
			System.out.println();
			for(int i = 0;i < numNeg;i++)
				System.out.printf("%d ", vetNeg[i]);
		}
	}
}