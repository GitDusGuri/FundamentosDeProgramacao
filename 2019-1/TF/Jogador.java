/**
 * Classe para definição de propriedades do jogador.
 * 
*/

public class Jogador {
    private String nome;
    private int bolas;
    /** 
     * Construtor de jogador
     * @param nome nome do jogador
    */
    public Jogador(String nome) {
        this.nome = nome;
        this.bolas = 15;
    }

    /** 
     * Metodo que retorna o nome do jogador
    */
    public String obtemNome() {
        return nome;
    }

    /** 
     * Metodo que obtem a quantidade de bolas do jogador
    */
    public int obtemBolas() {
        return bolas;
    }

    /** 
     * Metodo que opera as bolas, diminuindo ou aumentando
     * conforme a jogada e o resultado do tabuleiro
     * @param diminuiu controla se a jogada diminui ou aumenta
     *                 o numero de bolas do jogador
    */
    public void contabilizaBolas(boolean diminuiu) {
        if (diminuiu) {
            bolas--;
        } else {
            bolas++;
        }
    }
}