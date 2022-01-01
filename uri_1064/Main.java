package uri_1064;
/*Leia 6 valores. 
Em seguida, mostre quantos destes valores digitados foram positivos. 
Na próxima linha, deve-se mostrar a média de todos os valores positivos digitados, com um dígito após o ponto decimal.

Entrada
A entrada contém 6 números que podem ser valores inteiros ou de ponto flutuante. Pelo menos um destes números será positivo.

Saída
O primeiro valor de saída é a quantidade de valores positivos. 
A próxima linha deve mostrar a média dos valores positivos digitados.
*/

import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);
        Double valores[] = {
                sc.nextDouble(),
                sc.nextDouble(),
                sc.nextDouble(),
                sc.nextDouble(),
                sc.nextDouble(),
                sc.nextDouble()
        };
        int n = valores.length;
        int contador = 0;
        Double media = 0.0;
        for (int i = 0; i < n; i++) {
            if (valores[i] > 0) {
                contador++;
                media += valores[i];
            }
        }

        media = media / contador;
        System.out.printf("%d valores positivos\n", contador);
        System.out.printf("%.1f\n", media);
        sc.close();

    }
}