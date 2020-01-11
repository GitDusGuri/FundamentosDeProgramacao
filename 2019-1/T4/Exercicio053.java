/**
 * 53. Faca um programa que leia:
 * 
 * 1) um vetor com oito posicoes, contendo nomes de lojas;
 * 
 * 2) outro vetor com quatro posicoes, com nomes de produtos;
 * 
 * 3) uma matriz com os precos de todos os produtos em cada loja.
 * 
 * O programa devera mostrar todas as relacoes 
 * (nome do produto - nome da loja) em que o preco 
 * nao ultrapasse R$120,00. 
 * Considere que nao ha linhas em branco na entrada e que nomes de lojas 
 * e de produtos sao lidos como uma linha inteira. 
 * Uma linha da matriz de precos corresponde aos precos de uma loja, 
 * e as colunas da matriz correspondem aos precos de um produto. 
 * A matriz eh fornecida na entrada linha a linha.
 * 
 * @author Vinicius de Borba
 * @version 16 mai. 2019
 */

import java.util.Scanner;
import java.util.Locale;
public class Exercicio053{
    public static void main(String[] args){
        Locale.setDefault(Locale.ENGLISH);
        Scanner in = new Scanner(System.in);
        
        // vetor com nome das lojas
        String[] lojas = new String[8];
        for(int i = 0;i < lojas.length;i++){
            lojas[i] = in.nextLine();
        }


        // vetor com produtos
        String[] produtos = new String[4];
        for(int i = 0;i < produtos.length;i++){
            produtos[i] = in.nextLine();
        }

        // matriz com os preços, imprime o produto e loja caso preco seja 120 ou menor
        double[][] precos = new double[8][4];
        for(int i = 0;i < precos.length;i++){
            for(int j = 0;j < precos[0].length;j++){
                precos[i][j] = in.nextDouble();

                if(precos[i][j] <= 120.00){
                    System.out.printf("%s - %s\n",produtos[j], lojas[i]);
                }
            }
        }


    }
}