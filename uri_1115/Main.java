package uri_1115;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<String> entradas = new ArrayList<>();
        String entrada = "";
        while (true) {
            entrada = sc.nextLine();
            if (!entrada.contains("0")) {
                entradas.add(entrada);
            } else {
                break;
            }
        }

        int quantidadeDeInputs = entradas.size();
        for (int i = 0; i < quantidadeDeInputs; i++) {
            int numeros[] = criaArray(entradas.get(i));
            System.out.println(getQuadrante(numeros));
        }
        sc.close();
    }

    private static int[] criaArray(String string) {
        String array[] = string.split(" ");
        int x = Integer.parseInt(array[0]);
        int y = Integer.parseInt(array[1]);
        return new int[] { x, y };
    }

    private static String getQuadrante(int numeros[]) {
        int x = numeros[0];
        int y = numeros[1];
        if (x > 0) {
            if (y > 0) {
                return "primeiro";
            } else {
                return "quarto";
            }
        } else {
            if (y > 0) {
                return "segundo";
            } else {
                return "terceiro";
            }
        }
    }
}