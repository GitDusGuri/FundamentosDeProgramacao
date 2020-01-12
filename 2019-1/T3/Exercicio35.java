/**
 * Faca um programa que receba dez numeros, calcule e mostre a soma dos numeros pares e a soma dos numeros primos.
 *
 */

import java.util.Scanner;
import java.util.Locale;
public class Exercicio35
{
	public static void main(String[] args){
		Locale.setDefault(Locale.ENGLISH);
		Scanner in = new Scanner(System.in);
		
		int numero, somaPares = 0, somaPrimos = 0, multiplos;
		for(int i = 0;i < 10;i++){
			numero = in.nextInt();
			
			if((numero % 2) == 0)
				somaPares += numero;
			
			multiplos = 0;
			for(int j = numero; j > 0; j--){
				if((numero % j) == 0)
					multiplos++;
			}
			if(multiplos == 2)
				somaPrimos += numero;
		}
		
		System.out.printf("%d %d", somaPares, somaPrimos);
	}
}