package uri_1116;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int quantidadeDeInputs = sc.nextInt();
        sc.nextLine();
        String entradas[] = new String[quantidadeDeInputs];
        for (int i = 0; i < quantidadeDeInputs; i++) {
            entradas[i] = sc.nextLine();
        }

        for (int i = 0; i < quantidadeDeInputs; i++) {
            int numeros[] = criaArray(entradas[i]);
            if (numeros[1] != 0) {
                Double divisao = (1.0 * numeros[0] / numeros[1]);
                System.out.printf("%.1f\n", divisao);
            } else {
                System.out.println("divisao impossivel");
            }
        }
        sc.close();

    }

    private static int[] criaArray(String s) {
        String arrayString[] = s.split(" ");
        int x = Integer.parseInt(arrayString[0]);
        int y = Integer.parseInt(arrayString[1]);
        return new int[] { x, y };
    }
}