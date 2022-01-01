package uri_1066;

/**
 * 
 * 
 * 
 * Leia 5 valores Inteiros. 
 * A seguir mostre quantos valores digitados foram pares, quantos valores digitados foram ímpares, 
 * quantos valores digitados foram positivos e quantos valores digitados foram negativos.

Entrada
O arquivo de entrada contém 5 valores inteiros quaisquer.

Saída
Imprima a mensagem conforme o exemplo fornecido, 
uma mensagem por linha, não esquecendo o final de linha após cada uma.
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int valores[] = {
                sc.nextInt(),
                sc.nextInt(),
                sc.nextInt(),
                sc.nextInt(),
                sc.nextInt()
        };

        int n = valores.length;
        int positivos = 0,
            negativos = 0,
            pares = 0,
            impares = 0;
        for (int i = 0; i < n; i++) {
            if (valores[i] % 2 == 0) {
                pares++;
            } else {
                impares++;
            }

            if (valores[i] > 0) {
                positivos++;
            } else if (valores[i] < 0) {
                negativos++;
            }
        }

        System.out.printf("%d valor(es) par(es)\n", pares);
        System.out.printf("%d valor(es) impar(es)\n", impares);
        System.out.printf("%d valor(es) positivo(s)\n", positivos);
        System.out.printf("%d valor(es) negativo(s)\n", negativos);
        sc.close();
    }
}
