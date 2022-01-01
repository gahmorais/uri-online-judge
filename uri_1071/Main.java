package uri_1071;

/**
 * 
 * Leia 2 valores inteiros X e Y. 
 * A seguir, calcule e mostre a soma dos números impares entre eles.

Entrada
O arquivo de entrada contém dois valores inteiros.

Saída
O programa deve imprimir um valor inteiro. 
Este valor é a soma dos valores ímpares que estão entre 
os valores fornecidos na entrada que deverá caber em um inteiro.
entrada:
6
-5

-3 -1 1 3 5
13



*/
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();

        if (y < x) {
            int aux = x;
            x = y;
            y = aux;
        }

        if (x % 2 != 0) {
            x++;
        }

        int soma = 0;
        while (x != y) {
            if (x % 2 != 0) {
                soma += x;
            }
            x++;
        }

        System.out.println(soma);
        sc.close();

    }
}