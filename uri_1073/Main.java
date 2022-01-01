package uri_1073;

/**
 * Leia um valor inteiro N. 
 * Apresente o quadrado de cada um dos valores pares, de 1 até N, inclusive N, se for o caso.

Entrada
A entrada contém um valor inteiro N (5 < N < 2000).

Saída
Imprima o quadrado de cada um dos valores pares, de 1 até N, conforme o exemplo abaixo.

Tome cuidado! Algumas linguagens tem por padrão apresentarem como saída 1e+006 ao invés de 1000000 
o que ocasionará resposta errada. Neste caso, configure a precisão adequadamente para que isso não ocorra.
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int valor = sc.nextInt();
        int contador = 0;
        while (contador <= valor) {
            if (contador % 2 == 0 && contador > 0) {
                int quadrado = contador * contador;
                System.out.printf("%d^2 = %d\n", contador, quadrado);
            }
            contador++;
        }
        sc.close();

    }
}