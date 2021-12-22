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
        float entrada = 0;
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
        
            entrada = sc.nextFloat()*100;

        while (entrada != 0.00) {
            
            if (entrada >= 10000) {
                notaDeCem++;
                entrada -= 10000;
            } else if (entrada >= 5000) {
                notaDeCinquenta++;
                entrada -= 5000;
            } else if (entrada >= 2000) {
                notaDeVinte++;
                entrada -= 2000;
            } else if (entrada >= 1000) {
                notaDeDez++;
                entrada -= 1000;
            } else if (entrada >= 500) {
                notaDeCinco++;
                entrada -= 500;
            } else if (entrada >= 200) {
                notaDeDois++;
                entrada -= 200;
            } else if (entrada >= 100) {
                moedaDeUm++;
                entrada -= 100;
            }else if (entrada >= 50) {
                moedaDeCinquenta++;
                entrada -= 50;
            }else if (entrada >= 25) {
                moedaDeVinteCinco++;
                entrada -= 25;
            }else if (entrada >= 10) {
                moedaDeDez++;
                entrada -= 10;
            }else if (entrada >= 5) {
                moedaDeCinco++;
                entrada -= 5;
            }else if (entrada >= 1) {
                moedaDeUmCent++;
                entrada -= 1;
            }
        }

        System.out.println("NOTAS:");
        System.out.println(notaDeCem + " nota(s) de R$ 100.00");
        System.out.println(notaDeCinquenta + " nota(s) de R$ 50.00");
        System.out.println(notaDeVinte + " nota(s) de R$ 20.00");
        System.out.println(notaDeDez + " nota(s) de R$ 10.00");
        System.out.println(notaDeCinco + " nota(s) de R$ 5.00");
        System.out.println(notaDeDois + " nota(s) de R$ 2.00");

        System.out.println("MOEDAS:");
        System.out.println(moedaDeUm + " moeda(s) de R$ 1.00");
        System.out.println(moedaDeCinquenta+ " moeda(s) de R$ 0.50");
        System.out.println(moedaDeVinteCinco+ " moeda(s) de R$ 0.25");
        System.out.println(moedaDeDez+ " moeda(s) de R$ 0.10");
        System.out.println(moedaDeCinco+ " moeda(s) de R$ 0.05");
        System.out.println(moedaDeUmCent+ " moeda(s) de R$ 0.01");
        sc.close();
    }
}