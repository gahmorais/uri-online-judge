package uri_1050;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int DDD = sc.nextInt();
        String cidade = "";
        switch (DDD) {
            case 61:
                cidade = "Brasilia";
                break;
            case 71:
                cidade = "Salvador";
                break;
            case 11:
                cidade = "Sao Paulo";
                break;
            case 21:
                cidade = "Rio de Janeiro";
                break;
            case 32:
                cidade = "Juiz de Fora";
                break;
            case 19:
                cidade = "Campinas";
                break;
            case 27:
                cidade = "Vitoria";
                break;
            case 31:
                cidade = "Belo Horizonte";
                break;
            default:
                cidade = "DDD nao cadastrado";
        }

        System.out.println(cidade);
        sc.close();
    }
}
