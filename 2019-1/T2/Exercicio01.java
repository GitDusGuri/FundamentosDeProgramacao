/**
 * 1.  A nota final de um estudante e calculada a partir de
 * tres notas atribuıdas,  respectivamente,  a um trabalho de
 * laboratorio,  a uma avaliacao semestral e a um exame final.
 * A media das tres notas mencionadas obedece aos
 * pesos a seguir:
 *      Trabalho laboratorio: 2
 *      Avaliaçao semestral: 3
 *      Exame final: 5
 *Faça um programa que receba as tres notas, calcule e mostre a media ponderada e o conceito que segue a tabela:
 *      8 a 10: A
 *      7 a 8: B
 *      6 a 7: C
 *      5 a 6: D
 *      0 a 5: E
 *      
 */

import java.util.Scanner;
import java.util.Locale;
public class Exercicio01
{
    public static void main(String[] args){
        Locale.setDefault(Locale.ENGLISH);
        Scanner in = new Scanner(System.in);
        
        double trabLab = in.nextDouble();
        double avalSem = in.nextDouble();
        double exFin = in.nextDouble();
        char conceito;
        double mediaPond = (((trabLab * 2) + (avalSem * 3) + (exFin * 5))/10);
        if((mediaPond >= 8.0) && (mediaPond <= 10.0)){
            conceito = 'A';
            System.out.printf("%.4f %c", mediaPond, conceito);
        }
        
        else if((mediaPond >= 7) && (mediaPond < 8)){
            conceito = 'B';
            System.out.printf("%.4f %c", mediaPond, conceito);
        }
        
        else if((mediaPond >= 6) && (mediaPond < 7)){
            conceito = 'C';
            System.out.printf("%.4f %c", mediaPond, conceito);
        }
        
        else if((mediaPond >= 5) && (mediaPond < 6)){
            conceito = 'D';
            System.out.printf("%.4f %c", mediaPond, conceito);
        }
        
        else{
            conceito = 'E';
            System.out.printf("%.4f %c", mediaPond, conceito);
        }
    }
}
