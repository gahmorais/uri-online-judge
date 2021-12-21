package uri_1009;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        String nome;
        double salarioFixo, quantidadeVendas, totalAReceber, comissao;
    
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);
        nome = sc.next();
        salarioFixo = sc.nextDouble();
        quantidadeVendas = sc.nextDouble();

        sc.close();

        comissao = quantidadeVendas*0.15;

        totalAReceber = salarioFixo + comissao;
        System.out.printf(Locale.ENGLISH,"TOTAL = R$ %.2f", totalAReceber);


    }
}
