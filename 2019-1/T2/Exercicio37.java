/** Faça um programa que receba o codigo do produto comprado e
 * a quantidade comprada do produto (que pode ser fracionaria).
 * Calcule e mostre:
 *		- preco unitario do produto comprado, seguindo a tabela 1
 *		- preco total da nota
 *		- o valor de desconto, seguindo a tabela 2 e aplicado sobre o preco total
 *		- preco final da nota depois do desconto
 *
 *	Tabela 1:
 *		1 a 10 -> RS10,00
 *		11 a 20 -> RS15,00
 *		21 a 30 -> RS20,00
 *		31 a 40 -> RS30,00
 *
 *	Tabela 2:
 *		Ate RS250,00 (inclusive) -> 5%
 *		Entre RS250,00 e RS500,00 (inclusive) -> 10%
 *		Acima de RS500,00 -> 15%
 *
 
 */

import java.util.Scanner;
import java.util.Locale;
public class Exercicio37{
	public static void main(String[] args){
		Locale.setDefault(Locale.ENGLISH);
		Scanner in = new Scanner(System.in);
		
		int codigo = in.nextInt();
		double quantidade = in.nextDouble();
		double precoUnitario, precoTotal, desconto, precoFinal;
		
		if(codigo > 0 && codigo < 11){
			precoUnitario = 10;
		}
		else if(codigo > 10 && codigo < 21){
			precoUnitario = 15;
		}
		else if(codigo > 20 && codigo < 31){
			precoUnitario = 20;
		}
		else{
			precoUnitario = 30;
		}
		
		precoTotal = precoUnitario * quantidade;
		if(precoTotal <= 250){
			desconto = precoTotal * 0.05;
		}
		else if(precoTotal > 250 && precoTotal <= 500){
			desconto = precoTotal * 0.1;
		}
		else{
			desconto = precoTotal * 0.15;
		}
		
		precoFinal = precoTotal - desconto;
		System.out.printf("%.4f %.4f %.4f %.4f", precoUnitario, precoTotal, desconto, precoFinal);
	}
}