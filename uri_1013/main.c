/*
Faça um programa que leia três valores e apresente o maior dos três valores lidos seguido da mensagem “eh o maior”.
Utilize a fórmula:

MAIORAB = (a + b + abs(a-b))
          -----------------
                 2
Obs.: a fórmula apenas calcula o maior entre os dois primeiros (a e b).
Um segundo passo, portanto é necessário para chegar no resultado esperado.

Entrada
O arquivo de entrada contém três valores inteiros.

Saída
Imprima o maior dos três valores seguido por um espaço e a mensagem "eh o maior".
*/

#include <stdio.h>
#include <stdlib.h>

int calcBiggest(int a, int b) {
    return (a + b + abs(a - b)) / 2;
}
int main() {
    int a, b, c, bigger;
    scanf("%d", &a);
    scanf("%d", &b);
    scanf("%d", &c);
    bigger = calcBiggest(a, calcBiggest(b, c));
    printf("%d eh o maior\n", bigger);
    return 0;
}