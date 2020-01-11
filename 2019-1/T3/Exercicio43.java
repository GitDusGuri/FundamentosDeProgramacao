/**
 * Foi feita uma pesquisa entre os habitantes de uma regiao. Foram coletados os dados de idade, sexo (M/F) e salario.
 * Faca um programa que calcule e mostre:
 *   1) a media dos salarios do grupo;
 *   2) a maior e a menor idade do grupo;
 *   3) a quantidade de mulheres com salario ate R$ 200,00 (inclusive);
 *   4) a idade e o sexo da pessoa que possui o menor salario (no caso de mais de uma pessoa com o menor salario, considerar os dados da primeira pessoa).
 * Finalize a entrada de dados ao ser digitada uma idade negativa.
 * 
 * @author Vinicius de Borba
 * @version 15 abr. 2019
 */

import java.util.Scanner;
import java.util.Locale;
public class Exercicio43
{
	public static void main(String[] args){
		Locale.setDefault(Locale.ENGLISH);
		Scanner in = new Scanner(System.in);
		
		char sexo, sexoMenor = 'F';
		double salario, mediaSalarios, salarioMenor = 99999, somaSalarios = 0;
		int qntMulheres = 0, idade, i = 0, maiorIdade = 0, menorIdade = 1000, idadeMenorSal = 0;
		
		do{
			idade = in.nextInt();
			if(idade < 0)
				break;
			sexo = in.next().charAt(0);
			salario = in.nextDouble();
			
			somaSalarios += salario;
			
			if(sexo == 'F' && salario <= 200)
				qntMulheres++;
			
			if(salario < salarioMenor){
				salarioMenor = salario;
				idadeMenorSal = idade;
				sexoMenor = sexo;
			}
			
			if(idade > maiorIdade)
				maiorIdade = idade;
			if(idade < menorIdade)
				menorIdade = idade;
			
			i++;
		}while(idade >= 0);
		if(i != 0){
			mediaSalarios = somaSalarios/i;
		
			System.out.printf("%.4f %d %d %d %d %c", mediaSalarios, maiorIdade, menorIdade, qntMulheres, idadeMenorSal, sexoMenor);
		}
	}
}