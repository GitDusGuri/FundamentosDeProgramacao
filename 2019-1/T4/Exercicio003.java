/**
 * Faca um programa que leia dois vetores de dez valores inteiros cada um, 
 * e mostre o vetor resultante da intercalacao deles.
 *
 */

import java.util.Scanner;
import java.util.Locale;
public class Exercicio003{
	public static void main(String[] args){
		Locale.setDefault(Locale.ENGLISH);
		Scanner in = new Scanner(System.in);
		
		int[] vet1 = new int[10];
		int[] vet2 = new int[10];
		int[] vet3 = new int[20];

		for(int i = 0;i < 10;i++){
			vet1[i] = in.nextInt();
		}
		
		for(int i = 0;i < 10;i++){
			vet2[i] = in.nextInt();
		}
		
		for(int i = 0, j = 0, k = 0;i < 20;i++){
			// intercala os elementos dos dois vetores no resultante
			if(i % 2 == 0){
				vet3[i] = vet1[j];
				j++;
			}
			else{
				vet3[i] = vet2[k];
				k++;
			}
		}
		
		for(int i = 0;i < 20;i++){
			System.out.printf("%d ",vet3[i]);
		}
	}
}