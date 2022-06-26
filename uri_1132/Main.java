package uri_1132;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        sc.nextLine();
        sc.close();
        if (x > y) {
            int aux = x;
            x = y;
            y = aux;
        }
        int resultado = calculaResultado(x, y);
        System.out.println(resultado);

    }

    private static int calculaResultado(int x, int y) {
        int count = x;
        int aux = 0;
        while (count <= y) {
            if (count % 13 != 0) {
                aux += count;
            }
            count++;
        }
        return aux;
    }
}