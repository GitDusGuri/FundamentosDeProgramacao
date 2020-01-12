/**
 * Faca um programa que receba dez idades, pesos e alturas, calcule e mostre:
 * 	1)	a media das idades das dez pessoas;
 * 	2)	a quantidade de pessoas com peso superior a 90 kg e altura inferior a 1,50 metro;
 * 	3)	a porcentagem de pessoas com idade entre 10 e 30 anos entre as pessoas que medem mais de 1,90 m
 *
 */
 
import java.util.Scanner;
import java.util.Locale;
public class Exercicio34
{
	public static void main(String[] args){
		Locale.setDefault(Locale.ENGLISH);
		Scanner in = new Scanner(System.in);
		
		int idade, qnt90 = 0, acumulaIdade = 0;
		double peso, altura, mediaIdade, porcentagem, qnt10 = 0, qnt19 = 0;
		
		for(int i = 0;i < 10;i++){
			idade = in.nextInt();
			peso = in.nextDouble();
			altura = in.nextDouble();
			
			acumulaIdade = acumulaIdade + idade;
			if((peso > 90) && (altura < 1.5))
				qnt90 += 1;
			else if(altura > 1.9){
				qnt19 += 1;
				if((idade > 10) && (idade < 30))
					qnt10++;
			}
			
		}
		
		
		mediaIdade = (acumulaIdade / 10.0);
		porcentagem = (qnt10/qnt19) * 100.0;
		
		System.out.printf("%.4f %d %.4f", mediaIdade, qnt90, porcentagem);
	}
}
