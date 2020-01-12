/**Faca um programa que leia um numero correspondente a opcao desejada pelo usuario (conforme a lista a seguir),
 * receba os dados necessarios para executar a operacao e mostre o resultado.  
 * Verifique a possibilidade de opcao invalida (imprimindo "ERRO") e nao se preocupe com restricoes,
 * como salario negativo. Lista de opcoes:
 *		1. Imposto:
 *			- Receber o salario de um funcionario, calcular e mostrar o valor do imposto seguindo as regras:
 * 				Menor que RS500,00 -> 5%
 *				De RS500,00 (inclusive) a RS850,00 (inclusive) -> 10%
 *				Acima de RS850,00 -> 15%
 *		2. Novo Salario:
 *			- Receber o salario de um funcionario calcular e mostrar o valor do novo salario, usando as regras a seguir:
 *				Maior que RS1.500,00 -> RS25,00
 *				De RS750,00 (inclusive) a RS1.500,00 (inclusive) -> RS50,00
 *     			De RS450,00 (inclusive) a RS750,00 -> RS75,00
 *				Menor que RS450 -> RS100,00
 *		3. Classificacao:
 *			- Receber o salario de um funcionario e mostrar sua classificacao usando a tabela a seguir:
 *				Ate RS750,00 (inclusive) = Mal remunerado
 *				Acima de RS750,00 = Bem remunerado
 *
 */
 
 import java.util.Scanner;
 import java.util.Locale;
 public class Exercicio23{
	 public static void main(String[] args){
		 Locale.setDefault(Locale.ENGLISH);
		 Scanner in = new Scanner(System.in);
		 
		 int opcao = in.nextInt();
		 double salario;
		 switch(opcao){
			 case 1: {
				 salario = in.nextDouble();
				 double imposto;
				 if(salario < 500){
					 imposto = salario * 0.05;
				 }
				 else if(salario >= 500 && salario <= 850){
					 imposto = salario * 0.1;
				 }
				 else{
					 imposto = salario * 0.15;
				 }
				 System.out.printf("%.4f", imposto);
				 break;
			 }
			 case 2: {
				 salario = in.nextDouble();
				 double novoSalario;
				 if(salario > 1500){
					 novoSalario = salario + 25;
				 }
				 else if(salario >= 750 && salario <= 1500){
					 novoSalario = salario + 50;
				 }
				 else if(salario >= 450 && salario < 750){
					 novoSalario = salario + 75;
				 }
				 else{
					 novoSalario = salario + 100;
				 }
				 System.out.printf("%.4f", novoSalario);
				 break;
			 }
			 case 3:{
				 salario = in.nextDouble();
				 String mensagem;
				 if(salario > 750){
					mensagem = "Bem remunerado";
				 }
				 else{
					mensagem = "Mal remunerado";
				 }
				 System.out.printf("%s", mensagem);
				 break;
			 }
			 default: System.out.println("ERRO"); break;
		 }
	 }
 }
 