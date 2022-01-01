package uri_1075;

/**
 * Leia um valor inteiro N. 
 * Apresente todos os números entre 1 e 10000 que divididos por N dão resto igual a 2.

Entrada
A entrada contém um valor inteiro N (N < 10000).

Saída
Imprima todos valores que quando divididos por N dão resto = 2, um por linha.
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int valor = sc.nextInt();
        int contador = 1;
        int LIMITE = 10000;
        while (contador < LIMITE) {
            if (contador % valor == 2) {
                System.out.println(contador);
            }
            contador++;
        }
        sc.close();

    }
}