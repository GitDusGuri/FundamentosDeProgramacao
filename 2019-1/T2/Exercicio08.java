/**
 * Faca um programa que receba tres numeros e mostre-os em ordem crescente.
 *
 */

import java.util.Scanner;
import java.util.Locale;
public class Exercicio08
{
    
    public static void main(String[] args){
        Locale.setDefault(Locale.ENGLISH);
        Scanner in = new Scanner(System.in);
        
        double n1 = in.nextDouble();
        double n2 = in.nextDouble();
        double n3 = in.nextDouble();
        
        if(n1 >= n2){
            if((n1 > n3) && (n2 > n3)){
                System.out.printf("%.4f %.4f %.4f", n3, n2, n1);
            }
            
            else if((n1 > n3) && (n2 < n3)){
                System.out.printf("%.4f %.4f %.4f", n2, n3, n1);
            }
            
            else if(n3 > n1){
                System.out.printf("%.4f %.4f %.4f", n2, n1, n3);
            }
			
			else{
				System.out.printf("%.4f %.4f %.4f");
			}
        }
        
        else if(n2 > n1){
            if((n2 > n3) && (n1 > n3)){
                System.out.printf("%.4f %.4f %.4f", n3, n1, n2);
            }
            
            else if(n2 > n3 && (n1 <= n3)){
                System.out.printf("%.4f %.4f %.4f", n1, n3, n2);
            }
            
            else if(n3 > n2){
                System.out.printf("%.4f %.4f %.4f", n1, n2, n3);
            }
        }
    }
    
}
