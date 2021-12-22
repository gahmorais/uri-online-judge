package uri_1038;

import java.util.Scanner;
import java.util.Locale;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);
        int codigo = 0, quantidade = 0;
        Double total = 0.0;

        codigo = sc.nextInt();
        quantidade = sc.nextInt();

        switch (codigo) {
            case 1:
                total = quantidade * 4.00;
                break;
            case 2:
                total = quantidade * 4.50;
                break;
            case 3:
                total = quantidade * 5.00;
                break;
            case 4:
                total = quantidade * 2.00;
                break;
            case 5:
                total = quantidade * 1.50;
                break;
        }
        sc.close();
        System.out.printf("Total: R$ %.2f\n", total);
    }
}
