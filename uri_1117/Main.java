package uri_1117;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);
        ArrayList<Double> notas = new ArrayList<>();
        int notasValidas = 0;
        while (notasValidas != 2) {
            Double nota = sc.nextDouble();
            notas.add(nota);
            if (nota >= 0 && nota <= 10) {
                notasValidas++;
            }
        }

        int quantidadeDeInputs = notas.size();
        Double somaDasNotas = 0.0;
        for(int i =0; i< quantidadeDeInputs;i++){
            if(validaNota(notas.get(i))){
                somaDasNotas+=notas.get(i);
            }else{
                System.out.println("nota invalida");
            }
        }
        Double media = somaDasNotas / 2 ;
        System.out.printf("media = %.2f\n", media);
        sc.close();
    }

    private static boolean validaNota(Double nota){
        return nota >= 0 && nota <=10 ;
    }
}