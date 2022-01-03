package uri_1101;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String entrada = "";
        ArrayList<String> entradas = new ArrayList<String>();

        Scanner sc = new Scanner(System.in);

        while (true) {
            entrada = sc.nextLine();
            if (!entrada.contains("0") && !entrada.contains("-")) {
                entradas.add(entrada);
            } else {
                break;
            }
        }

        int quantidadeDeInputs = entradas.size();
        for (int i = 0; i < quantidadeDeInputs; i++) {
            String arrayEntrada[] = entradas.get(i).split(" ");
            int x = Integer.parseInt(arrayEntrada[0]);
            int y = Integer.parseInt(arrayEntrada[1]);
            ordenaEApresenta(x, y);

        }

        sc.close();
    }

    private static void ordenaEApresenta(int x, int y) {
        if (x > y) {
            int aux = y;
            y = x;
            x = aux;
        }
        int resultado = 0;
        while (x <= y) {
            System.out.print(x + " ");
            resultado += x;
            x++;
        }

        System.out.printf("Sum=%d\n", resultado);
    }
}