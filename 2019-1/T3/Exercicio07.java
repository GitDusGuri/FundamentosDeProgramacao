/**
 * Faca um programa que leia um numero n (inteiro maior ou igual a zero), e a seguir mostre os n termos da sequencia de Fibonacci.  
 * Lembre-se que na sequencia de Fibonacci, os dois primeiros termos sao, respectivamente, 0 e 1.
 * E cada um dos demais termos corresponde sempre a soma dos dois anteriores. 
 * Sequencia de Fibonacci:0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, ...
 *
 */

import java.util.Scanner;
import java.util.Locale;
public class Exercicio07
{
	public static void main(String[] args){
		Locale.setDefault(Locale.ENGLISH);
		Scanner in = new Scanner(System.in);
		int n1 = 0, n2 = 1, aux;
		int elementos = in.nextInt();
		//System.out.printf("%d %d",n1, n2);
		for(int i = 0;i < elementos;i++){
			System.out.printf(" %d", n1);
			aux = n1;
			n1 = n1 + n2;
			n2 = aux;
		}
	}
}
