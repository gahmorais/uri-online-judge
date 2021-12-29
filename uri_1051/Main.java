package uri_1051;

/*

Logica para 30002

Ate 2000 - isento
2000 a 3000 - 1000 8% imposto
3000 a 3002 - 2 18% imposto

Logica para 4520

ate 2000 - isento
2000 a 3000 - 1000 8% imposto
3000 a 4500 - 1500 18% imposto
4500 a 4520 - 20 28% imposto


*/

import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);
        Double renda = sc.nextDouble();
        Double imposto = 0.0;

        if (renda <= 2000) {
        } else if (renda <= 3000) {
            imposto = (renda - 2000) * 0.08;
        } else if (renda <= 4500) {
            imposto = ((renda - 3000) * 0.18) + (1000 * 0.08);
        } else if (renda > 4500) {
            imposto = ((renda - 4500) * 0.28) + (1500 * 0.18) + (1000 * 0.08);
        }

        if (imposto != 0.0) {
            System.out.printf("R$ %.2f\n", imposto);
        } else {
            System.out.println("Isento");
        }

        sc.close();

    }
}