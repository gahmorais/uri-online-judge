/*
Leia os quatro valores correspondentes aos eixos x e y de dois pontos quaisquer no plano, p1(x1,y1) e p2(x2,y2)
e calcule a distância entre eles, mostrando 4 casas decimais após a vírgula, segundo a fórmula:

Distancia =((x2 - x1)² + (y2-y1)²))^1/2

Entrada
O arquivo de entrada contém duas linhas de dados.
A primeira linha contém dois valores de ponto flutuante: x1 y1 e a
segunda linha contém dois valores de ponto flutuante x2 y2.

Saída
Calcule e imprima o valor da distância segundo a fórmula fornecida,
com 4 casas após o ponto decimal.
*/

/*Para utilizar a biblioteca de funções matemáticas, ao compilar adicione o parametro -lm na comando de compilação!*/
#include <math.h>
#include <stdio.h>

int main() {
    double x1, x2, y1, y2, total_distance, distance_x, distance_y;
    scanf("%lf %lf", &x1, &y1);
    scanf("%lf %lf", &x2, &y2);
    distance_x = pow((x2 - x1), 2);
    distance_y = pow((y2 - y1), 2);
    total_distance = sqrt(distance_x + distance_y);
    printf("%.4f\n", total_distance);
    return 0;
}