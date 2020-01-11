/**Faca um programa que receba o codigo correspondente ao cargo de um funcionario e seu salario atual e mostre
 * o cargo, o valor do aumento e seu novo salario. Os cargos estao na tabela a seguir.
 * 		1: Escriturario, 50%
 *		2: Secretario, 35%
 *		3: Caixa, 20%
 *		4: Gerente, 10%
 *		5: Diretor, sem aumento
 *
 * @author Vinicius de Borba
 * @version 01 abr. 2019
 */
 
 import java.util.Scanner;
 import java.util.Locale;
 public class Exercicio22{
	 public static void main(String[] args){
		 Locale.setDefault(Locale.ENGLISH);
		 Scanner in = new Scanner(System.in);
		 
		 int codigo = in.nextInt();
		 double salAtual = in.nextDouble();
		 double aumento;
		 double novoSal;
		 switch(codigo){
			 case 1: {
				 String cargo = "Escriturario";
				 aumento = salAtual*0.5;
				 novoSal = salAtual + aumento;
				 System.out.printf("%s %.4f %.4f", cargo, aumento, novoSal);
				 break;
			 }
			 case 2: {
				 String cargo = "Secretario";
				 aumento = salAtual*0.35;
				 novoSal = salAtual + aumento;
				 System.out.printf("%s %.4f %.4f", cargo, aumento, novoSal);
				 break;
			 }
			 case 3: {
				 String cargo = "Caixa";
				 aumento = salAtual*0.2;
				 novoSal = salAtual + aumento;
				 System.out.printf("%s %.4f %.4f", cargo, aumento, novoSal);
				 break;
			 }
			 case 4: {
				 String cargo = "Gerente";
				 aumento = salAtual*0.1;
				 novoSal = salAtual + aumento;
				 System.out.printf("%s %.4f %.4f", cargo, aumento, novoSal);
				 break;
			 }
			 case 5: {
				 String cargo = "Diretor";
				 aumento = 0;
				 novoSal = salAtual + aumento;
				 System.out.printf("%s %.4f %.4f", cargo, aumento, novoSal);
				 break;
			 }
		 }
	 }
 }