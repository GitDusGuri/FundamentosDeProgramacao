/**
 * Classe para manipulação do tabuleiro de Speculate.
 * 
*/

public class Tabuleiro {
    private boolean[] tabuleiro = new boolean[6];

    /** 
     * Construtor do tabuleiro do jogo
    */
    public Tabuleiro() {
        for(int i=0;i<tabuleiro.length;i++){
            if(i % 2 == 0){
                tabuleiro[i] = true; // faz com que as posicoes 1, 3 e 5 estejam preenchidas no inicio
            } else {
                tabuleiro[i] = false; // faz com que as posicoes 2, 4 e 6 estejam vazias no inicio
            }
        }
    }

    /** 
     * Metodo que modifica os buracos do tabuleiro conforme a jogada
     * @param pos posicao da jogada do jogador
    */
    public boolean modificaTabuleiro(int pos) {
        if(pos == 6) {
            return tabuleiro[pos-1]; // garante que o 6 sempre retira uma bola
        } else {
            tabuleiro[pos-1] = !tabuleiro[pos-1]; // inverte a posicao para vazio ou preenchido
            return !tabuleiro[pos-1]; // retorna a posicao antes de ser invertida
        }
    }

    /** 
     * Metodo para imprimir o tabuleiro
    */
    public void imprimeTabuleiro() {
        System.out.println("==============================");
        for(int i=0;i<tabuleiro.length;i++){
            if(tabuleiro[i]){
                System.out.printf("%d(X) ",(i+1)); // imprime posicao preenchida
            } else {
                System.out.printf("%d( ) ",(i+1)); // imprime posicao vazia
            }
        }
        System.out.println("\n==============================");
    }
}