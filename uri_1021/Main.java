/*Leia um valor de ponto flutuante com duas casas decimais. 
Este valor representa um valor monetário. 
A seguir, calcule o menor número de notas e moedas possíveis no qual o valor pode ser decomposto. 
As notas consideradas são de 100, 50, 20, 10, 5, 2. As moedas possíveis são de 1, 0.50, 0.25, 0.10, 0.05 e 0.01. 
A seguir mostre a relação de notas necessárias.

Entrada
O arquivo de entrada contém um valor de ponto flutuante N (0 ≤ N ≤ 1000000.00).

Saída
Imprima a quantidade mínima de notas e moedas necessárias para trocar o valor inicial, conforme exemplo fornecido.

Obs: Utilize ponto (.) para separar a parte decimal.*/
package uri_1021;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Double entrada = 0.00;
        sc.useLocale(Locale.ENGLISH);
        int notaDeCem = 0,
            notaDeCinquenta = 0,
            notaDeVinte = 0,
            notaDeDez = 0,
            notaDeCinco = 0,
            notaDeDois = 0;
        int moedaDeUm = 0,
            moedaDeCinquenta = 0,
            moedaDeVinteCinco = 0,
            moedaDeDez = 0,
            moedaDeCinco = 0,
            moedaDeUmCent = 0;
        
            entrada = sc.nextDouble();

        while (entrada != 0) {
      
            if (entrada >= 100.00) {
                notaDeCem++;
                entrada -= 100.00;
            } else if (entrada >= 50.00) {
                notaDeCinquenta++;
                entrada -= 50.00;
            } else if (entrada >= 20.00) {
                notaDeVinte++;
                entrada -= 20.00;
            } else if (entrada >= 10.00) {
                notaDeDez++;
                entrada -= 10.00;
            } else if (entrada >= 5.00) {
                notaDeCinco++;
                entrada -= 5.00;
            } else if (entrada >= 2.00) {
                notaDeDois++;
                entrada -= 2.00;
            } else if (entrada >= 1.00) {
                moedaDeUm++;
                entrada -= 1.00;
            }else if (entrada >= 0.50) {
                moedaDeCinquenta++;
                entrada -= 0.50;
            }else if (entrada >= 0.25) {
                moedaDeVinteCinco++;
                entrada -= 0.25;
            }else if (entrada >= 0.10) {
                System.out.println(entrada);
                moedaDeDez++;
                entrada -= 0.10;
            }else if (entrada >= 0.05) {
                moedaDeCinco++;
                entrada -= 0.05;
            }else if (entrada >= 0.01) {
                moedaDeUmCent++;
                entrada -= 0.01;
            }
        }

        System.out.println("Nota de Cem: " + notaDeCem);
        System.out.println("Nota de Cinquenta: " + notaDeCinquenta);
        System.out.println("Nota de Vinte: " + notaDeVinte);
        System.out.println("Nota de Dez: " + notaDeDez);
        System.out.println("Nota de Cinco: " + notaDeCinco);
        System.out.println("Nota de Dois: " + notaDeDois);
        System.out.println("Moeda de Um: " + moedaDeUm);
        System.out.println("Moeda de Cinquenta: " + moedaDeCinquenta);
        System.out.println("Moeda de Vinte e Cinco: " + moedaDeVinteCinco);
        System.out.println("Moeda de Dez: " + moedaDeDez);
        System.out.println("Moeda de Cinco: " + moedaDeCinco);
        System.out.println("Moeda de Um Cent: " + moedaDeUmCent);
        sc.close();
    }
}