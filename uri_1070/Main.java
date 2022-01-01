package uri_1070;

/**
 * 
 * Leia um valor inteiro X. 
 * Em seguida apresente os 6 valores ímpares consecutivos a partir de X, 
 * um valor por linha, inclusive o X ser for o caso.

Entrada
A entrada será um valor inteiro positivo.

Saída
A saída será uma sequência de seis números ímpares.
 * 
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int valor = sc.nextInt();

        if (valor % 2 == 0) {
            valor++;
        }

        for (int i = 0; i < 6; i++) {
            System.out.println(valor);
            valor += 2;
        }

        sc.close();

    }
}