package uri_1048;

import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);
        double salario = sc.nextFloat();
        double novoSalario = 0;
        double totalReajuste = 0;
        double percentual = 0;

        if(salario <= 400 ){
            percentual = 0.15;
            novoSalario = salario * (percentual + 1);
        }else if(salario <= 800){
            percentual = 0.12;
            novoSalario = salario * (percentual + 1);
        }else if(salario <= 1200){
            percentual = 0.1;
            novoSalario = salario * (percentual + 1);
        }else if(salario <= 2000){
            percentual = 0.07;
            novoSalario = salario * (percentual + 1);
        }else {
            percentual = 0.04;
            novoSalario = salario * (percentual + 1);
        }

        totalReajuste = novoSalario - salario;
        DecimalFormat format = new DecimalFormat("# %");
        System.out.printf("Novo salario: %.2f\n", novoSalario);
        System.out.printf("Reajuste ganho: %.2f\n", totalReajuste);
        System.out.printf("Em percentual: %s\n", format.format(percentual));
        sc.close();
    }
    
}
