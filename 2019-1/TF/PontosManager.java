/** 
 * Classe para controlar e escrever o placar
 * 
 * @author Vinicius de Borba
 * @version 16 jun. 2019
*/
import java.io.FileWriter;
import java.io.File;
import java.util.Scanner;

public class PontosManager {

    private static String path = "Placar.txt"; //variavel com o nome do arquivo do placar

    /** 
     * Classe tupla para armazenar e manipular dados dos jogadores
     * para serem impressos no arquivo de placar
    */
    private static class Tupla{
        String nome;
        int pontos;

        public Tupla(String nome, int pontos){
            this.pontos = pontos;
            this.nome = nome;
        }
        /**
         * Metodo para transofrmar a tupla em uma string
         * @return nome-pontos
        */
        public String toString(){
            return nome + "-" + pontos;
        }
    }

    /** 
     * Metodo que le o arquivo do placar e retorna uma lista com tuplas(jogador,ponto)
     * @return lista lista de tuplas com o jogador e seus pontos
    */
    private static Tupla[] lerPontos(){
        Tupla[] lista = new Tupla[11];
        
        File arq = new File(path);
        Scanner in = null;
        try {
            arq.createNewFile();
            in = new Scanner(new File(path));
            
            int i = 0;
            while(in.hasNextLine()){
                String aux = in.nextLine();
                String[] auxs = aux.split("-");
                lista[i] = new Tupla(auxs[0],Integer.parseInt(auxs[1]));
                i++;
                System.out.println("i le lista: " + i);
            }
            return lista;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            in.close();
        }
        return lista;
    }

    /** 
     * Recebe o jogador e seus pontos e salva os 10 maiores no arquivo
     * @param jogador jogador da partida atual
     * @param pontos  pontuacao do jogador da partida
    */
    public static void salvarPontos(String jogador, int pontos){
        FileWriter fw = null;

        try{
            Tupla[] lista = lerPontos();

            boolean menor = false;
            Tupla aux = new Tupla("nome", 0), aux2 = new Tupla("nome", 0);
            for(int i=0;i<lista.length;i++){
                if(lista[i] == null && !menor){
                    lista[i] = new Tupla(jogador, pontos);
                    break;
                } else {
                    if(menor){
                        aux2 = lista[i];
                        lista[i] = aux;
                        aux = aux2;
                        continue;
                    }
                    if((pontos < lista[i].pontos && !menor)){
                        aux = lista[i];
                        lista[i] = new Tupla(jogador, pontos);
                        menor = true;
                    }
                }
            }

            fw = new FileWriter(path);
            // escreve no maximo 10 resultados no arquivo de placar
            for(int i=0;i<lista.length && i<10;i++){
                if(lista[i] == null){
                    break;
                } else {
                    fw.write(lista[i].toString() + "\n"); 
                }
            }
            
            fw.close();

        } catch(Exception e){
            e.printStackTrace();
        }
    }
}
