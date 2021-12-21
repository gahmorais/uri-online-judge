package uri_1008;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        
        int numeroFuncionario, horasTrabalhadas;
        double salario, recebePorHora;

        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);
        numeroFuncionario = sc.nextInt();
        horasTrabalhadas = sc.nextInt();
        recebePorHora = sc.nextDouble();
        sc.close();

        salario = horasTrabalhadas * recebePorHora;

        System.out.println("NUMBER = " + numeroFuncionario);
        System.out.printf(Locale.ENGLISH, "SALARY = U$ %.2f\n",salario);

        
    }   
}
