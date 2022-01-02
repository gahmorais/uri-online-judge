package uri_1099;

/**
Leia um valor inteiro N que é a quantidade de casos de teste que vem a seguir. 
Cada caso de teste consiste de dois inteiros X e Y. 
Você deve apresentar a soma de todos os ímpares existentes entre X e Y.

Entrada
A primeira linha de entrada é um inteiro N que é a quantidade de casos de teste que vem a seguir. 
Cada caso de teste consiste em uma linha contendo dois inteiros X e Y.

Saída
Imprima a soma de todos valores ímpares entre X e Y.
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int quantidadeDeInputs = sc.nextInt();
        sc.nextLine();

        String casosDeTeste[] = new String[quantidadeDeInputs];
        int resultados[] = new int[quantidadeDeInputs];

        for (int i = 0; i < quantidadeDeInputs; i++) {
            casosDeTeste[i] = sc.nextLine();
            int x = Integer.parseInt(casosDeTeste[i].split(" ")[0]);
            int y = Integer.parseInt(casosDeTeste[i].split(" ")[1]);
            resultados[i] = somaImpares(x, y);
        }

        for (int i = 0; i < quantidadeDeInputs; i++) {
            System.out.println(resultados[i]);
        }

        sc.close();
    }

    private static int somaImpares(int x, int y) {
        /*ordena valores*/
        if (y < x) {
            int aux = y;
            y = x;
            x = aux;
        }

        if (ehImpar(x)) {
            x++;
        }

        int total = 0;
        while (x < y) {
            if (ehImpar(x)) {
                total += x;
            }
            x++;
        }

        return total;
    }

    private static boolean ehImpar(int valor) {
        return valor % 2 != 0;
    }
}