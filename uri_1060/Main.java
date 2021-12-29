package uri_1060;



/**
 
Faça um programa que leia 6 valores. 
Estes valores serão somente negativos ou positivos (desconsidere os valores nulos). 
A seguir, mostre a quantidade de valores positivos digitados.

Entrada
Seis valores, negativos e/ou positivos.

Saída
Imprima uma mensagem dizendo quantos valores positivos foram lidos.
 */

import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);
        Double numbers[] = {
                sc.nextDouble(),
                sc.nextDouble(),
                sc.nextDouble(),
                sc.nextDouble(),
                sc.nextDouble(),
                sc.nextDouble()
        };

        int n = numbers.length;
        int positivos = 0;
        for (int i = 0; i < n; i++) {
            if (numbers[i] > 0) {
                positivos++;
            }
        }

        System.out.printf("%d valores positivos\n", positivos);
        sc.close();
    }
}
