package uri_1042;

/* 
Leia 3 valores inteiros e ordene-os em ordem crescente. 
No final, mostre os valores em ordem crescente, uma linha em branco e em seguida, os valores na sequência como foram lidos.

Entrada
A entrada contem três números inteiros.

Saída
Imprima a saída conforme foi especificado.
a = b = c
a > b
a > c
b > a = a < b
b > c = c < b
c > b = b < c
c > a = a < c



*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt(),
                b = sc.nextInt(),
                c = sc.nextInt();

        int lista[] = { a, b, c };
        String entrada = a + "\n" + b + "\n" + c;

        int n = lista.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (lista[j] > lista[j + 1]) {
                    int temp = lista[j];
                    lista[j] = lista[j + 1];
                    lista[j + 1] = temp;
                }
            }
        }
        for (int k = 0; k < n; k++) {
            System.out.println(lista[k]);
        }
        System.out.println();
        System.out.println(entrada);
        sc.close();
    }
}
