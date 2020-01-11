/** Uma empresa decide aplicar descontos nos seus precos usando a tabela a seguir.
 * Faca um programa que receba o preco atual de um produto,
 * calcule e mostre o valor do desconto e o novo preco.
 * 			- Ate RS30,00 (inclusive) -> Sem desconto
 *			- Entre RS30,00 e RS100,00 (inclusive) -> 10%
 *			- Acima de RS100,00 -> 15%
 *
 * @author Vinicius de Borba
 * @versio 01 abr. 2019
 */

import java.util.Scanner;
import java.util.Locale;
public class Exercicio33{
	public static void main(String[] args){
		Locale.setDefault(Locale.ENGLISH);
		Scanner in = new Scanner(System.in);
		
		double preco = in.nextDouble();
		double desconto;
		double novoPreco;
		
		if(preco <= 30){
			desconto = 0;
			novoPreco = preco - desconto;
		}
		else if(preco > 30 && preco <= 100){
			desconto = preco * 0.1;
			novoPreco = preco - desconto;
		}
		else{
			desconto = preco * 0.15;
			novoPreco = preco - desconto;
		}
		
		System.out.printf("%.4f %.4f", desconto, novoPreco);
	}
}