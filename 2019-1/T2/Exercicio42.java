/** Faca um programa que receba a altura (em metros) e o sexo ("M" - masculino; ou "F" - feminino)
 * de uma pessoa e calcule e mostre seu peso ideal, utilizando as seguintes formulas (onde h eh altura):
 *  - para homens: (72.7 * h) - 58
 *  - para mulheres (62.1 * h) - 44.7
 *
 
 */

import java.util.Scanner;
import java.util.Locale;
public class Exercicio42{
	public static void main(String[] args){
		Locale.setDefault(Locale.ENGLISH);
		Scanner in = new Scanner(System.in);
		
		double altura = in.nextDouble();
		char sexo = in.next().charAt(0);
		double pesoIdeal;
		if(sexo == 'M'){
			pesoIdeal = (72.7 * altura) - 58;
		}
		else{
			pesoIdeal = (62.1 * altura) - 44.7;
		}
		
		System.out.printf("%.4f", pesoIdeal);
	}
}