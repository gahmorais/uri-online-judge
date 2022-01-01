package uri_1072;

/**
 * Leia um valor inteiro N. 
 * Este valor será a quantidade de valores inteiros X que serão lidos em seguida.
Mostre quantos destes valores X estão dentro do intervalo [10,20] 
e quantos estão fora do intervalo, mostrando essas informações.

Entrada
A primeira linha da entrada contém um valor inteiro N (N < 10000), 
que indica o número de casos de teste.
Cada caso de teste a seguir é um valor inteiro X (-107 < X <107).
 

Saída
Para cada caso, imprima quantos números estão dentro (in) e quantos valores estão fora (out) do intervalo.
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int quantidadeDeInputs = sc.nextInt();

        int valor = 0;
        int dentroDaFaixa = 0;
        int foraDaFaixa = 0;

        for (int i = 0; i < quantidadeDeInputs; i++) {
            valor = sc.nextInt();
            if (valor >= 10 && valor <= 20) {
                dentroDaFaixa++;
            }else{
                foraDaFaixa++;
            }
        }

        System.out.printf("%d in\n", dentroDaFaixa);
        System.out.printf("%d out\n", foraDaFaixa);
        sc.close();

    }
}