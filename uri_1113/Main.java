package uri_1113;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<String> entradas = new ArrayList<>();

        while (true) {
            String arrayString = sc.nextLine();
            int[] numeros = createArray(arrayString);
            if (numeros[0] != numeros[1]) {
                entradas.add(arrayString);
            } else {
                break;
            }
        }

        int quantidadeDeInputs = entradas.size();
        for (int i = 0; i < quantidadeDeInputs; i++) {
            int numeros[] = createArray(entradas.get(i));
            if (numeros[0] < numeros[1]) {
                System.out.println("Crescente");
            } else {
                System.out.println("Decrescente");
            }
        }
        sc.close();

    }

    private static int[] createArray(String entrada) {
        String[] arrayString = entrada.split(" ");
        int x = Integer.parseInt(arrayString[0]);
        int y = Integer.parseInt(arrayString[1]);
        return new int[] { x, y };
    }
}