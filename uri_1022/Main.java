/*

Leia 4 valores inteiros A, B, C e D. 

A seguir, 
se B for maior do que C e 
se D for maior do que A, e a 
soma de C com D for maior que a 
soma de A e B e 
se C e D, ambos, forem positivos e 
se a variável A for par escrever a mensagem "Valores aceitos", 
senão escrever "Valores nao aceitos".

Entrada
Quatro números inteiros A, B, C e D.

Saída
Mostre a respectiva mensagem após a validação dos valores.

*/
package uri_1022;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 0,
                b = 0,
                c = 0,
                d = 0,
                somaAB = 0,
                somaCD = 0;
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        d = sc.nextInt();
        somaAB = a + b;
        somaCD = c + d;

        if (b > c && d > a && somaCD > somaAB && c > 0 && d > 0 && a % 2 == 0) {
            System.out.println("Valores aceitos");
        } else {
            System.out.println("Valores nao aceitos");
        }
        sc.close();
    }
}