import java.util.Locale;
import java.util.Scanner;
import java.lang.Math;

public class Main {
    public static void main(String[] args){
        double raioEsfera, volumeEsfera;
        double pi = 3.14159;

        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);
        raioEsfera = sc.nextDouble();
        sc.close();

        volumeEsfera = (4.0/3)*pi*Math.pow(raioEsfera, 3);

        System.out.printf(Locale.ENGLISH,"VOLUME = %.3f\n", volumeEsfera);
    }
}
