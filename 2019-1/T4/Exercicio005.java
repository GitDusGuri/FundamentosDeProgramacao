/**
 * Faca um programa que leia dois vetores, X e Y, com dez numeros inteiros cada. 
 * Calcule e mostre os seguintes vetores resultantes:
 * 
 * 1) A uniao de X com Y (todos os elementos de X e de Y sem repeticoes).
 * 2) A diferenca entre X e Y (todos os elementos de X que nao existam em Y, sem repeticoes).
 * 3) A soma entre X e Y (soma de cada elemento de X com o elemento de mesma posicao em Y).
 * 4) O produto entre X e Y (multiplicacao de cada elemento de X com o elemento de mesma posicao em Y).
 * 5) A interseccao entre X e Y (apenas os elementos que aparecem nos dois vetores, sem repeticoes).
 *
 * Caso o vetor resultante seja vazio, mostre apenas uma linha em branco.
 *
 * @author Vinicius de Borba
 * @version 11 mai. 2019
 */
 
import java.util.Scanner;
import java.util.Locale;
public class Exercicio005{
	
	/**
	 * Realiza operacoes para calcular tamanho e elementos de um vetor resultante
	 * da diferenca dos dois vetores passados como parametro.
	 * @param vet1 primeiro vetor, da os elementos que ficarao no vetor resultante
	 * @param vet2 vetor o qual da os valores a serem retirados do primeiro vetor
	 * @return     vetor resultante da operacao.
	 */
	public static int[] diferenca(int[] vet1, int[] vet2){
		// calcula quantos elementos ha em comum entre os vetores
		int comum = 0;
		for(int i = 0;i < vet1.length;i++){
			for(int j = 0, k = i+1;j < vet2.length;j++, k++){
				if(vet1[i] == vet2[j]){
					comum++;
					break;
				}
				if(k < vet1.length){
					if(vet1[i] == vet1[k]){
						comum++;
						break;
					}
				}
			}
		}
		// inicializa um vetor com o tamanho igual ao numero de elementos
		int[] diferenca = new int[10 - comum];
		boolean presente;
		for(int i = 0, k = 0;i < vet1.length;i++){
			presente = false;
			for(int j = 0, l = 0;j < vet2.length;j++, l++){
				// teste e verificacao para elementos iguais entre os vetores
				if(vet1[i] == vet2[j]){
					presente = true;
					break;
				}
				// teste e verificacao para elementos iguais no proprio vetor
				if(vet1[i] == vet1[l]){
					if(l < i){
						presente = true;
						break;
					}
				}
			}
			// valida o elemento a ser inserido no vetor
			if(!presente){
				diferenca[k] = vet1[i];
				k++;
			}
		}
		return diferenca;
	}
	
	/**
	 * Realiza uma operacao de contagem de quantos elementos repetem e quantas vezes
	 * ao longo dos dois vetores, a partir da concatenacao deles.
	 * @param vet1 vetor X
	 * @param vet2 vetor Y
	 * @return     numero de repeticoes de elementos nos dois vetores
	 */
	public static int qntcomuns(int[] vet1, int[] vet2){
		int[] concatenado = concatenaVetores(vet1, vet2);
		int numcomuns = 0;
		for(int i = 0;i < concatenado.length;i++){
			for(int j = i+1;j < concatenado.length;j++){
				// contador de vezes que elementos repetem nos dois vetores
				if(concatenado[i] == concatenado[j]){
					numcomuns++;
					break;
				}
			}
		}
		return numcomuns;
	}
	
	/**
	 * Preenchimento de vetor.
	 * @param input scanner usado para ler elementos do terminal
	 * @return      vetor preenchido
	 */
	public static int[] preencheVetor(Scanner input){
		int[] vetor = new int[10];
		for(int i = 0;i < 10;i++){
			vetor[i] = input.nextInt();
		}
		return vetor;
	}
	
	/**
	 * Realiza operacao de concatenacao de dois vetores.
	 * @param vet1 vetor X
	 * @param vet2 vetor Y
	 * @return     vetor resultante da concatenacao
	 */
	public static int[] concatenaVetores(int[] vet1, int[] vet2){
		int[] concatenado = new int[vet1.length+vet2.length];
		for(int i = 0;i < vet1.length;i++){
			concatenado[i] = vet1[i];
		}
		for(int i = vet1.length, j = 0;j < vet2.length;i++, j++){
			concatenado[i] = vet2[j];
		}
		return concatenado;
	}
	
	/**
	 * Realiza operacao de uniao de dois vetores.
	 * @param vet1 vetor X
	 * @param vet2 vetor Y
	 * @return     vetor resultante da uniao dos dois vetores, em repetir elementos
	 */
	public static int[] uniao(int[] vet1, int[] vet2){
		// calcula o numero de elementos do vetor uniao
		int tam = (vet1.length+vet2.length) - (qntcomuns(vet1, vet2));
		int[] uniao = new int[tam];
		int[] concatenado = concatenaVetores(vet1, vet2);
		boolean repetido;
		int k = 0;
		// testa se o elemento eh repetido ou nao
		for(int i = 0;i < concatenado.length;i++){
			repetido = false;
			for(int j = 0; j < concatenado.length;j++){
				if(concatenado[i] == concatenado[j]){
					if(i > j){
						repetido = true;
						break;
					}
				}
			}
			// valida o elemento a ser inserido no vetor
			if(!repetido){
				uniao[k] = concatenado[i];
				k++;
			}
		}
		return uniao;
	}
	
	/**
	 * Imprime o vetor passado como parametro na tela.
	 * @param vetor vetor a ser impresso
	 */
	public static void imprimeVetor(int[] vetor){
		for(int i = 0;i < vetor.length;i++){
			System.out.printf("%d ",vetor[i]);
		}
		System.out.println();
	}
	
	/**
	 * Faz a soma de elementos na mesma posicao de dois vetores diferentes.
	 * @param vet1 vetor X
	 * @param vet2 vetor Y
	 * @return     vetor com o resultado das somas dos elementos
	 */
	public static int[] somaVetores(int[] vet1, int[] vet2){
		int[] soma = new int[10];
		for(int i = 0, j = 0, k = 0;i < vet1.length;i++, j++, k++){
			soma[i] = (vet1[j] + vet2[k]);
		}
		return soma;
	}
	
	/**
	 * Faz o produto de elementos na mesma posicao de dois vetores diferentes.
	 * @param vet1 vetor X
	 * @param vet2 vetor Y
	 * @return     vetor com os produtos dos elementos
	 */
	public static int[] multiplicaVetores(int[] vet1, int[] vet2){
		int[] produto = new int[10];
		for(int i = 0, j = 0, k = 0;i < vet1.length;i++, j++, k++){
			produto[i] = (vet1[j] * vet2[k]);
		}
		return produto;
	}
	
	/**
	 * Realiza operacoes para formar um vetor com elementos da interseccao de
	 * dois vetores quaisquer, sem repetir elementos.
	 * @param vet1 vetor X
	 * @param vet2 vetor Y
	 * @return     vetor com os elementos da interseccao, sem repeticoes
	 */
	public static int[] interseccao(int[] vet1, int[] vet2){
		// calcula quantos elementos ha em comum nos vetores
		int emcomum = 0;
		int i, j, k;
		for(i = 0;i < vet1.length;i++){
			for(j = 0;j < vet2.length;j++){
				if(vet1[i] == vet2[j]){
					emcomum++;
					break;
				}
			}
		}
		// cria e preenche um vetor com os elementos em comum
		int[] comuns = new int[emcomum];
		for(k = 0, i = 0;i < vet1.length;i++){
			for(j = 0;j < vet2.length;j++){
				if(vet1[i] == vet2[j]){
					comuns[k] = vet1[i];
					k++;
					break;
				}
			}
		}
		// calcula o tamanho necessario para o vetor interseccao
		// sem que elementos se repitam
		boolean repetido;
		int tamReal = 0;
		for(i = 0;i < comuns.length;i++){
			repetido = false;
			for(j = i+1;j < comuns.length;j++){
				if(comuns[i] == comuns[j]){
					repetido = true;
					break;
				}
			}
			if(!repetido){
				tamReal++;
			}
		}
		// cria e preenche o vetor interseccao
		int[] interseccao = new int[tamReal];
		if(tamReal > 0){
			for(i = 0, k = 0;i < comuns.length;i++){
				if(i == 0){
					interseccao[k] = comuns[i];
					k++;
				}
				else{
					repetido = false;
					// teste de repeticao do elemento no vetor de elementos em comum
					for(j = 0;j < comuns.length;j++){
						if(comuns[i] == comuns[j]){
							// checa se eh a primeira entrada do elemento
							if(i > j){
								repetido = true;
								break;
							}
							else break;
						}
					}
					// valida o elemento a ser inserido no vetor
					if(!repetido){
						interseccao[k] = comuns[i];
						k++;
					}
				}
			}
		}
		return interseccao;
	}
	
	public static void main(String[] args){
		Locale.setDefault(Locale.ENGLISH);
		Scanner in = new Scanner(System.in);
		
		int[] X = preencheVetor(in);
		int[] Y = preencheVetor(in);
		int[] uniao = uniao(X, Y);
		int[] diferenca = diferenca(X, Y);
		int[] soma = somaVetores(X, Y);
		int[] produto = multiplicaVetores(X, Y);
		int[] interseccao = interseccao(X, Y);
		imprimeVetor(uniao);
		imprimeVetor(diferenca);
		imprimeVetor(soma);
		imprimeVetor(produto);
		imprimeVetor(interseccao);
	}
}