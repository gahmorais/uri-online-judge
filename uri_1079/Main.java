package uri_1079;

/**
 * 
 * Leia 1 valor inteiro N, que representa o número de casos de teste que vem a seguir. 
 * Cada caso de teste consiste de 3 valores reais, cada um deles com uma casa decimal. 
 * Apresente a média ponderada para cada um destes conjuntos de 3 valores, 
 * sendo que o primeiro valor tem peso 2, o segundo valor tem peso 3 e o terceiro valor tem peso 5.

Entrada
O arquivo de entrada contém um valor inteiro N na primeira linha. 
Cada N linha a seguir contém um caso de teste com três valores com uma casa decimal cada valor.

Saída
Para cada caso de teste, imprima a média ponderada dos 3 valores, conforme exemplo abaixo.
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int quantidadeDeInputs = sc.nextInt();
        sc.nextLine();
        Double medias[] = new Double[quantidadeDeInputs];
        for (int i = 0; i < quantidadeDeInputs; i++) {
            String entrada[] = sc.nextLine().split(" ");
            Double valores[] = {
                    Double.parseDouble(entrada[0]),
                    Double.parseDouble(entrada[1]),
                    Double.parseDouble(entrada[2]),

            };
            medias[i] = calculaMedia(valores);
        }

        for (int i = 0; i < quantidadeDeInputs; i++) {
            System.out.printf("%.1f\n", medias[i]);
        }

        sc.close();

    }

    private static Double calculaMedia(Double valores[]) {
        return (valores[0] * 2 + valores[1] * 3 + valores[2] * 5) / 10;
    }
}