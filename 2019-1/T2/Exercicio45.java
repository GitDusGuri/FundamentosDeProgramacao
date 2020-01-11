/** Faca um programa que receba:
 *   - o codigo do estado de origem da carga de um caminhao, supondo que o codigo sempre seja valido (inteiro entre 1 e 5)
 *	 - o peso da carga em toneladas
 *   - o codigo da carga, supondo que o codigo sempre seja valido (inteiro entre 10 e 40)
 *
 *     Tabela entre codigo de Estado e Imposto:
 *        	- 1 -> 35%
 *		  	- 2 -> 25%
 *		  	- 3 -> 15%
 *		  	- 4 -> 5%
 *			- 5 -> Isento
 *		Tabela entre codigo da carga e preco/kg:
 *			- 10 a 20 -> 100
 *			- 21 a 30 -> 250
 *			- 31 a 40 -> 340
 *
 * Calcule e mostre:
 *  - o peso da carga convertido em Kg
 *  - o preco da carga do caminhao
 *  - o valor do imposto cobrado sobre o preco da carga e dependendo da origem
 *  - o valor total transportado pelo caminhao, preco da carga mais imposto
 *
 * @author Vinicius de Borba
 * @versio 01 abr. 2019
 */

import java.util.Scanner;
import java.util.Locale;
public class Exercicio45{
	public static void main(String[] args){
		Locale.setDefault(Locale.ENGLISH);
		Scanner in = new Scanner(System.in);
		
		int estado = in.nextInt();
		double pesoT = in.nextDouble();
		int codCarga = in.nextInt();
		double precoCarga, valorTotal;
		double imposto = 0;
		double pesoKg = pesoT * 1000;
		if(codCarga > 9 && codCarga < 21){
			precoCarga = pesoKg * 100;
		}
		else if(codCarga > 20 && codCarga < 31){
			precoCarga = pesoKg * 250;
		}
		else{
			precoCarga = pesoKg * 340;
		}
		
		switch(estado){
			case 1:{
				imposto = precoCarga * 0.35;
				break;
			}
			case 2:{ 
				imposto = precoCarga * 0.25; 
				break;
			}
			case 3:{
				imposto = precoCarga * 0.15;
				break;
			}
			case 4:{
				imposto = precoCarga * 0.05;
				break;
			}
			case 5:{
				imposto = 0;
				break;
			}
		}
		
		valorTotal = precoCarga + imposto;
		System.out.printf("%.4f %.4f %.4f %.4f", pesoKg, precoCarga, imposto, valorTotal);
	}
}