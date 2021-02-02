import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

import java.lang.Math;

public class Main {
    public static void main(String[] args) throws IOException{

        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        double n = 3.14159;
        double raio = sc.nextDouble();
        double area = n*raio*raio;

        sc.close();

        System.out.printf(Locale.US,"A=%.4f\n",area);

    }
}
