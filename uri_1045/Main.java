package uri_1045;
/*
Leia 3 valores de ponto flutuante A, B e C e ordene-os em ordem decrescente, 
de modo que o lado A representa o maior dos 3 lados. 

A seguir, determine o tipo de triângulo que estes três lados formam, com base nos seguintes casos, 
sempre escrevendo uma mensagem adequada:

se A ≥ B+C, apresente a mensagem: NAO FORMA TRIANGULO
se A2 = B2 + C2, apresente a mensagem: TRIANGULO RETANGULO
se A2 > B2 + C2, apresente a mensagem: TRIANGULO OBTUSANGULO
se A2 < B2 + C2, apresente a mensagem: TRIANGULO ACUTANGULO
se os três lados forem iguais, apresente a mensagem: TRIANGULO EQUILATERO
se apenas dois dos lados forem iguais, apresente a mensagem: TRIANGULO ISOSCELES
Entrada
A entrada contem três valores de ponto flutuante de dupla precisão A (0 < A) , B (0 < B) e C (0 < C).

Saída
Imprima todas as classificações do triângulo especificado na entrada.
*/

import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        double lista[] = {
                sc.nextDouble(),
                sc.nextDouble(),
                sc.nextDouble()
        };
        ordenaLista(lista);

        double a = lista[0];
        double b = lista[1];
        double c = lista[2];

        double A2 = Math.pow(a, 2);
        double B2 = Math.pow(b, 2);
        double C2 = Math.pow(c, 2);

        double somaDosQuadradosDoCatetos = B2 + C2;

        if (a >= (b + c)) {
            System.out.println("NAO FORMA TRIANGULO");
        } else {

            if (A2 == somaDosQuadradosDoCatetos) {
                System.out.println("TRIANGULO RETANGULO");
            } else if (A2 > somaDosQuadradosDoCatetos) {
                System.out.println("TRIANGULO OBTUSANGULO");
            } else if (A2 < somaDosQuadradosDoCatetos) {
                System.out.println("TRIANGULO ACUTANGULO");
            }

            if (a == b && b == c) {
                System.out.println("TRIANGULO EQUILATERO");
            } else if (a == b || b == c || a == c) {
                System.out.println("TRIANGULO ISOSCELES");
            }

        }

        sc.close();
    }

    private static void ordenaLista(double lista[]) {
        int n = lista.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (lista[j] < lista[j + 1]) {
                    double temp = lista[j];
                    lista[j] = lista[j + 1];
                    lista[j + 1] = temp;
                }
            }
        }
    }
}
