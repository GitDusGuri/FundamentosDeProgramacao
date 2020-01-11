/**
 * 10.  Faca um programa para corrigir provas de multipla escolha.
 * Cada prova tem oito questoes e cada questao vale um ponto.
 * O primeiro conjunto de dados a ser lido e o gabarito da prova.
 * Os outros dados sao os numeros de matricula dos alunos e as respostas que deram as questoes.
 * Existem dez alunos matriculados. Calcule e mostre:
 * 
 * 1) o numero de matrıcula e o numero de pontos de cada aluno; e
 * 2) a porcentagem de aprovacao, sabendo-se que a nota mínima e 6 (pontos).
 * 
 * @author Vinicius de Borba
 * @version 15 mai. 2019
 */

import java.util.Scanner;
import java.util.Locale;
public class Exercicio010{
    public static void main(String[] args){
        Locale.setDefault(Locale.ENGLISH);
        Scanner in = new Scanner(System.in);

        // cria e le o vetor das respostas
        String[] respostas = new String[8];
        int i, j, k, acertos, aprovados = 0;
        for(i = 0;i < respostas.length;i++){
            respostas[i] = in.next();
        }
        
        // cria e le o vetor dos alunos
        // matricula fica armazenado em aluno[i][0]
        // respostas em aluno[i][1] a aluno[i][8]
        String[][] alunos = new String[10][9];
        for(i = 0;i < alunos.length;i++){
            for(j = 0;j < alunos[i].length;j++){
                alunos[i][j] = in.next();
            }
        }

        // compara as respostas com o gabarito
        // contabiliza e imprime acertos e porcentagem de aprovados
        for(i = 0;i < alunos.length;i++){
            for(j = 1, k = 0, acertos = 0;j < alunos[i].length;j++,k++){
                if(alunos[i][j].equals(respostas[k])){
                    acertos++;
                }
            }
            if(acertos > 5){
                aprovados++;
            }
            System.out.printf("%s %d\n", alunos[i][0], acertos);
        }
        System.out.printf("%.4f\n",(aprovados/10.0));
    }
}