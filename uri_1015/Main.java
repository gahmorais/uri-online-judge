import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);
        double x1, y1, x2,y2, distancia;
        double subtracaoX, susbtracaoY;

        x1 = sc.nextDouble();
        y1 = sc.nextDouble();
        x2 = sc.nextDouble();
        y2 = sc.nextDouble();

        subtracaoX = x2 -x1;
        susbtracaoY = y2 - y1;


        distancia = Math.sqrt(Math.pow(subtracaoX, 2) + Math.pow(susbtracaoY, 2));

        System.out.printf(Locale.ENGLISH, "%.4f\n", distancia);

    }
}
