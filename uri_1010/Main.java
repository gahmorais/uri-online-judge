import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);
        int codigoPecaUm, codigoPecaDois, quantidadePecaUm, quantidadePecaDois;
        double valorPecaUm, valorPecaDois, totalPecaUm, totalPecaDois, valorTotalCompra;

        codigoPecaUm = sc.nextInt();
        quantidadePecaUm = sc.nextInt();
        valorPecaUm = sc.nextDouble();

        codigoPecaDois = sc.nextInt();        
        quantidadePecaDois = sc.nextInt();        
        valorPecaDois = sc.nextDouble();

        sc.close();

        totalPecaUm = valorPecaUm * quantidadePecaUm;
        totalPecaDois = valorPecaDois * quantidadePecaDois;

        valorTotalCompra = totalPecaUm + totalPecaDois;

        System.out.printf(Locale.ENGLISH, "VALOR A PAGAR: R$ %.2f\n", valorTotalCompra);

    }
}
