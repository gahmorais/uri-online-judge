package uri_1012;
import java.util.Locale;
import java.util.Scanner;
import java.lang.Math;

public class Main {
    public static void main(String[] args){
        double a,b,c, areaTriangulo, areaCirculo, areaTrapezio, areaQuadrado, areaRetangulo;
        double pi = 3.14159;

        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();
        
        sc.close();

        areaTriangulo = a*c/2;
        areaCirculo = pi*Math.pow(c, 2);
        areaTrapezio = (a + b)*c/2;
        areaQuadrado = b*b;
        areaRetangulo = a * b;

        System.out.printf(Locale.ENGLISH,"TRIANGULO: %.3f\n", areaTriangulo);
        System.out.printf(Locale.ENGLISH,"CIRCULO: %.3f\n", areaCirculo);
        System.out.printf(Locale.ENGLISH,"TRAPEZIO: %.3f\n", areaTrapezio);
        System.out.printf(Locale.ENGLISH,"QUADRADO: %.3f\n", areaQuadrado);
        System.out.printf(Locale.ENGLISH,"RETANGULO: %.3f\n", areaRetangulo);

    }
}
