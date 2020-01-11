/**
 * 11. Faca um programa que receba a temperatura media de 
 * cada mes do ano, armazenando-as em um vetor. 
 * Calcule e mostre a maior e a menor temperatura do ano 
 * e em que mes ocorreram (mostrar o mes por extenso: 
 * 1 – janeiro, 2– fevereiro, etc.). 
 * Em caso de empate mostrar apenas o primeiro mes com a 
 * respectiva temperatura.
 * 
 * @author Vinicius de Borba
 * @version 16 mai. 2019
 */


import java.util.Scanner;
import java.util.Locale;
public class Exercicio011{
    public static void main(String[] args){
        Locale.setDefault(Locale.ENGLISH);
        Scanner in = new Scanner(System.in);
        
        // vetor de string com os meses
        String[] meses = {"janeiro", "fevereiro", "marco", 
                          "abril", "maio", "junho", "julho",
                          "agosto", "setembro", "outubro", 
                          "novembro", "dezembro"};
        
        // vetor para registrar as temperaturas
        int  menor = 0, maior = 0;
        double[] temperaturas = new double[12];
        for(int i = 0;i < temperaturas.length;i++){
            temperaturas[i] = in.nextDouble();
            // testa e capta os indices da maior e menor temperatura
            if(i == 0){
                menor = i;
                maior = i;
            }
            if(temperaturas[i] > temperaturas[maior]){
                maior = i;
            }
            else if(temperaturas[i] < temperaturas[menor]){
                menor = i;
            }
        }
        System.out.printf("%.4f %s\n", temperaturas[maior], meses[maior]);
        System.out.printf("%.4f %s\n", temperaturas[menor], meses[menor]);
    }
}