/** 
 * Classe principal para iniciar o jogo Speculate.
 * 
 * @author Vinicius de Borba
 * @version 15 jun. 2019
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Bem vindo ao jogo Speculate!");
        System.out.println("As regras do jogo são simples:");
        System.out.println("Cada jogador começa com 15 bolas e o tabuleiro com 3");
        System.out.println("Cada posicao do tabuleiro representa uma face de um dado");
        System.out.println("A cada rodada, o dado ser rolado e a face rolada");
        System.out.println("determina a jogada do jogador.");
        System.out.println("O jogador deve depositar ou retirar uma bola conforme sua jogada");
        System.out.println("As posicoes 1, 3 e 5 do tabuleiro comecam preenchidas e");
        System.out.println("A posicao 6 sempre descarta uma bola, nunca sendo preenchida");
        // pede o nome do jogador que vai jogar Speculate
        System.out.print("Agora, poor favor, insira seu nome: ");
        String nomeJogador = in.nextLine();
        Jogador[] jogadores = {
            new Jogador(nomeJogador),
            new Jogador("Computador")
        }; // cria um array com o jogador e o computador
 
        Speculate speculate = new Speculate(jogadores, in); // cria um novo jogo
        int turnos = speculate.jogar();
        if(turnos > 0){
            PontosManager.salvarPontos(nomeJogador, turnos);
        }
        
    }
}