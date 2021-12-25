package uri_1041;

/*
Leia 2 valores com uma casa decimal (x e y), que devem representar as coordenadas de um ponto em um plano. 
A seguir, determine qual o quadrante ao qual pertence o ponto, ou se está sobre um dos eixos cartesianos ou na origem (x = y = 0).

Se o ponto estiver na origem, escreva a mensagem “Origem”.
Se o ponto estiver sobre um dos eixos escreva “Eixo X” ou “Eixo Y”, conforme for a situação.

Entrada
A entrada contem as coordenadas de um ponto.

Saída
A saída deve apresentar o quadrante em que o ponto se encontra.

*/

/*
 * x == 0 && y == 0 => Origem
 * x == 0 => Eixo Y
 * y == 0 => Eixo X
 * 
 * x > 0 && y > 0 => Q1
 * && y < 0 => Q4
 * 
 * x < 0 && y > 0 => Q2
 * && y < 0 => Q3
 * 
 */
import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);
        float x = 0, y = 0;
        x = sc.nextFloat();
        y = sc.nextFloat();

        if (x == 0 && y == 0) {
            System.out.println("Origem");
        } else if (x == 0) {
            System.out.println("Eixo Y");
        } else if (y == 0) {
            System.out.println("Eixo X");
        } else if (x > 0) {
            if (y > 0) {
                System.out.println("Q1");
            } else {
                System.out.println("Q4");
            }
        } else {
            if (y > 0) {
                System.out.println("Q2");
            } else {
                System.out.println("Q3");
            }
        }

        sc.close();

    }
}
