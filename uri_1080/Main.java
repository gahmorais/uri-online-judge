package uri_1080;



/**
 * Leia 100 valores inteiros. Apresente então o maior valor lido e a posição dentre os 100 valores lidos.

Entrada
O arquivo de entrada contém 100 números inteiros, positivos e distintos.

Saída
Apresente o maior valor lido e a posição de entrada, conforme exemplo abaixo.
 */

import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int valores[] = new int[100];
        int maiorValor = 0;
        int indiceMaiorValor = 0;
        
        preencheArray(valores); /* função de teste */
        // for(int i = 0; i < 100; i++){
        //     valores[i] = sc.nextInt();
        // }

        for (int i = 1; i < 100; i++) {
            if (maiorValor < valores[i]) {
                maiorValor = valores[i];
                indiceMaiorValor = i+1;
            }
        }

        System.out.printf("%d\n", maiorValor);
        System.out.printf("%d\n", indiceMaiorValor);

        sc.close();
    }

    /*****FUNÇÃO DE TESTE*****/
    private static void preencheArray(int valores[]) {
        int n = valores.length;
        for (int i = 0; i < n; i++) {
            int numeroAleatorio = new Random().nextInt(1000);
            valores[i] = numeroAleatorio;
        }
    }
}

