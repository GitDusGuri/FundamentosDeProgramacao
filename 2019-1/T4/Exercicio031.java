/**
 * 31. Faca um programa que receba os nomes desses vendedores 
 * e armazene-os em um vetor. Receba o total das vendas de cada 
 * vendedor de uma loja e armazene-os em um outro vetor. 
 * Receba tambem o percentual de comissao a que cada vendedor 
 * tem direito e armazene-os em um terceiro vetor. 
 * Existem apenas dez vendedores na loja. Calcule e mostre:
 * 
 * 1) um relatorio iniciando com uma linha com o texto "RELATORIO: ", 
 * apresentando os nomes dos vendedores e os valores que cada um tem 
 * a receber referentea comissao;
 * 
 * 2) o total das vendas de todos os vendedores, precedido do texto "TOTAL: ";
 * 
 * 3) o maior valor (ou maiores valores) a receber e o nome de quem o recebera 
 * cada valor, precedido do texto "MAIOR(ES): ";
 * 
 * 4) o menor valor (ou menores valores) a receber e o nome de quem o recebera cada valor, 
 * precedido do texto "MENOR(ES): ".
 * 
 * Cada informacao sera fornecida em uma linha separada.
 * 
 * @author Vinicius de Borba
 * @version 16 mai. 2019
 */


import java.util.Scanner;
import java.util.Locale;
public class Exercicio031{
    /**
     * Metodo de impressao do relatorio completo.
     * @param nomes    nomes dos vendedores
     * @param vendas   valor de vendas de cada vendedor
     * @param comissao valor da comissao de cada vendedor
     */
    public static void imprimeRelatorio(String[] nomes, double[] vendas, double[] comissao){
        double totalVendas = 0;
        double valorVenda;
        int maior = 0, menor = 0;
        System.out.println("RELATORIO:");
        for(int i = 0; i < 10;i++){
            valorVenda = vendas[i] * comissao[i]/100;
            System.out.printf("%s %.4f\n",nomes[i], valorVenda);
            totalVendas += vendas[i];
            if(i == 0){
                maior = i;
                menor = i;
            }

            if(valorVenda > (vendas[maior] * comissao[maior]/100)){
                maior = i;
            }
            else if(valorVenda < (vendas[menor] * comissao[menor]/100)){
                menor = i;
            }
        }
        System.out.printf("TOTAL: %.4f\n", totalVendas);
        System.out.println("MAIOR(ES):");
        for(int i = maior;i < 10;i++){
            if((vendas[i] * comissao[i]/100) >= (vendas[maior] * comissao[maior]/100)){
                System.out.printf("%.4f %s\n",(vendas[i] * comissao[i]/100), nomes[i]);
            }
        }
        System.out.println("MENOR(ES):");
        for(int i = menor;i < 10;i++){
            if((vendas[i] * comissao[i]/100) <= (vendas[menor] * comissao[menor]/100)){
                System.out.printf("%.4f %s\n",(vendas[i] * comissao[i]/100), nomes[i]);
            }
        }
    }

    public static void main(String[] args){
        Locale.setDefault(Locale.ENGLISH);
        Scanner in = new Scanner(System.in);

        String[] nomes = new String[10];
        for(int i = 0;i < nomes.length;i++){
            nomes[i] = in.nextLine();
        }

        double[] vendas = new double[10];
        for(int i = 0;i < vendas.length;i++){
            vendas[i] = in.nextDouble();
        }

        double[] comissao = new double[10];
        for(int i = 0;i < comissao.length;i++){
            comissao[i] = in.nextDouble();
        }

        imprimeRelatorio(nomes, vendas, comissao);
    }
}