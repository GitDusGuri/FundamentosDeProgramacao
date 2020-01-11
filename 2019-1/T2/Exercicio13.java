/**Faca um programa que receba dois numeros e execute as
 * operacoes listadas a seguir,
 * de acordo com a escolha do usuario.
 *      1: Media entre os numeros digitados
 *      2: Diferença do maior pelo menor
 *      3: Produto entre os numeros digitados
 *      4: Divisao do primeiro pelo segundo
 * Se a opcao digitada foi invalida, mostre a mensagem de erro "Escolha errada"
 * e termine a execucao do programa. Lembre-se de que, na operacao 4, o segundo numero
 * deve ser diferente de zero.
 *      
 * @author Vinicius de Borba
 * @version 31 mar. 2019
 */

import java.util.Scanner;
import java.util.Locale;
public class Exercicio13
{

    public static void main(String[] args){
        Locale.setDefault(Locale.ENGLISH);
        Scanner in = new Scanner(System.in);

        double n1 = in.nextDouble();
        double n2 = in.nextDouble();
        if(n2 != 0){
            int escolha = in.nextInt();
            if((escolha < 0) || (escolha > 4)){
                System.out.println("Escolha errada");
            }
            else{
                switch(escolha){
                    case 1: System.out.printf("%.4f", ((n1 + n2)/2)); break;
                    case 2: if(n1 >= n2){
                        System.out.printf("%.4f", (n1-n2));
                    }
                        else{
                            System.out.printf("%.4f", (n2 - n1));
                        }
                        break;
                    case 3: System.out.printf("%.4f", (n1*n2)); break;
                    case 4: System.out.printf("%.4f", (n1/n2)); break;
                }
            }
        }
    }
}