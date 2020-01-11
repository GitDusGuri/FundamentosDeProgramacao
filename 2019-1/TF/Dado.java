/**
 * Classe de funcionamento do dado no jogo Speculate.
 * 
 * @author Vinicius de Borba
 * @version 14 jun. 2019
*/

import java.util.Random;

public class Dado {
    private static Random r = new Random();
    
    /** 
     * Metodo de rolagem do dado
    */
    public static int rolar() {
        int face = r.nextInt(6)+1;
        return face;
    }
}