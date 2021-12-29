package uri_1059;

/**

Faça um programa que mostre os números pares entre 1 e 100, inclusive.

Entrada
Neste problema extremamente simples de repetição não há entrada.

Saída
Imprima todos os números pares entre 1 e 100, inclusive se for o caso, um em cada linha.
 */

public class Main {
    public static void main(String[] args) {
        int valor = 1;

        while(valor <= 100){
            if(valor % 2 == 0){
                System.out.println(valor);
            }
            valor++;
        }
    }
}
