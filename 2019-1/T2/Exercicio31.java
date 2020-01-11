/** Uma agencia bancaria possui dois tipos de investimentos, conforme o quadro a seguir.  
 * Faca um programa quereceba o tipo de investimento e seu valor,
 * calcule e mostre o valor corrigido apos um mes de investimento,
 * deacordo com o tipo de investimento.
 * 		1: Poupanca -> 3%
 *		2: Fundos de renda fixa -> 4%
 *
 * @author Vinicius de Borba
 * @versio 01 abr. 2019
 */

import java.util.Scanner;
import java.util.Locale;
public class Exercicio31{
	public static void main(String[] args){
		Locale.setDefault(Locale.ENGLISH);
		Scanner in = new Scanner(System.in);
		
		int tipo = in.nextInt();
		double valor = in.nextDouble();
		double valorCorrigido;
		switch(tipo){
			case 1:{
				valorCorrigido = valor * 1.03;
				System.out.printf("%.4f", valorCorrigido);
				break;
			}
			case 2:{
				valorCorrigido = valor * 1.04;
				System.out.printf("%.4f", valorCorrigido);
			}
		}
	}
}