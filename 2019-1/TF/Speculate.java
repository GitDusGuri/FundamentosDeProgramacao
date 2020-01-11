/** 
 * Classe de controle do jogo Speculate.
 * 
 * @author Vinicius de Borba
 * @version 15 jun. 2019
*/

import java.util.Scanner;

public class Speculate{
    private Tabuleiro tabuleiro;
    private Jogador[] jogadores;
    private Scanner in;


    /** 
     * Construtor do jogo.
     * @param jog   array com as informacoes dos jogadores
     * @param input scanner do terminal usado para ler entradas
    */
    public Speculate(Jogador[] jog, Scanner input) {
        jogadores = jog;
        in = input;
        tabuleiro = new Tabuleiro();
    }

    /** 
     * Metodo que realiza a jogada do jogador.
     * @param in scanner do terminal
     * 
     */
    public void jogadaJogador(Scanner in){
        boolean buraco;
        int jogada, bolasJogador = jogadores[0].obtemBolas();
        // informacoes para situar o jogador do jogo
        System.out.printf("Voce tem %d bolas.\n", bolasJogador);
        System.out.println("Quantas vezes deseja rolar o dado?");
        System.out.printf("Minimo 1, maximo %d.\n", bolasJogador);
        int rolagens = in.nextInt();
        // validacao da entrada do jogador
        while(rolagens < 1 || rolagens > bolasJogador) {
            System.out.println("Jogada invalida, tente novamente!");
            System.out.println("Quantas vezes deseja rolar o dado?");
            System.out.printf("Minimo 1, maximo %d.\n", bolasJogador);
            rolagens = in.nextInt();
        }
        // permite o jogador ter uma interacao a mais com o jogo
        // vendo as jogadas sendo realizadas de forma individual
        // ao final de cada iteracao do laco for
        System.out.println("Pressione 'Enter' entre cada jogada pra prosseguir.");
        // rolagens de dado do jogador
        for (int i=0;i<rolagens;i++) {
            jogada = Dado.rolar();
            System.out.printf("\nVoce rolou o dado e tirou a face %d!\n", jogada);
            buraco = tabuleiro.modificaTabuleiro(jogada);
            jogadores[0].contabilizaBolas(!buraco);
            System.out.printf("Voce agora tem %d bolas.\n",jogadores[0].obtemBolas());
            tabuleiro.imprimeTabuleiro();
            if(jogadores[0].obtemBolas() == 0) break; // quebra o laco caso o jogador nao tenha mas bolas
            in.nextLine();
        }
    }

    /** 
     * Metodo que realiza a jogada do computador.
    */
    public void jogadaComputador() {
        boolean buraco;
        int jogada, bolas = jogadores[1].obtemBolas();
        // informacoes da situacao do computador
        System.out.printf("\nO computador tem %d bolas.\n", bolas);
        System.out.printf("O computador rolara o dado %d vezes.\n", bolas);
        // permite o jogador ter uma interacao a mais com o jogo
        // vendo as jogadas sendo realizadas de forma individual
        // ao final de cada iteracao do laco for
        System.out.println("Pressione 'Enter' entre cada jogada pra prosseguir.");
        // rolagens do computador
        for (int i=0;i<bolas;i++){
            jogada = Dado.rolar();
            System.out.printf("O computador rolou o dado e tirou a face %d!\n", jogada);
            buraco = tabuleiro.modificaTabuleiro(jogada);
            jogadores[1].contabilizaBolas(!buraco);
            System.out.printf("O computador agora tem %d bolas.\n",jogadores[1].obtemBolas());
            tabuleiro.imprimeTabuleiro();
            if(jogadores[1].obtemBolas() == 0) break; // quebra o laco caso o computador nao tenha mas bolas
            in.nextLine();
        }
    }

    /** 
     * Metodo de controle do jogo, realiza as jogadas,
     * contabiliza turnos e valida o fim do jogo.
    */
    public int jogar() {
        Scanner in = new Scanner(System.in);
        int turnos = 1;
        boolean acabou = false;
        while(!acabou){
            System.out.printf("\nTurno %d:\n", turnos);
            tabuleiro.imprimeTabuleiro();
            jogadaJogador(in);
            // testa se o jogador ganhou o jogo
            if(jogadores[0].obtemBolas() == 0){
                System.out.println("FIM DE JOGO!");
                System.out.println("Voce ganhou, parabens!");
                return turnos; // retorna o numero de turnos para a main e quebra o laco
            }
            jogadaComputador();
            // testa se o computador ganhou o jogo
            if(jogadores[1].obtemBolas() == 0){
                System.out.println("FIM DE JOGO!");
                System.out.println("Voce perdeu, mais sorte na proxima vez!");
                acabou = true; // quebra o laco while se o computador ganha o jogo
            }
            turnos++;
        }
        return 0;
    }
}