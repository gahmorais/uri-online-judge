package uri_1047;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int horaInicial = sc.nextInt();
        int minutoInicial = sc.nextInt();
        int horaFinal = sc.nextInt();
        int minutoFinal = sc.nextInt();
        int tempoDeJogo_hora = horaFinal - horaInicial;
        int tempoDeJogo_minutos = minutoFinal - minutoInicial;

        if (tempoDeJogo_hora <= 0) {
            tempoDeJogo_hora = tempoDeJogo_hora + 24;
        }

        if (tempoDeJogo_minutos <= 0) {
            // Subtrai uma hora pois, com tempo em minutos negativos, estamos na hora
            // anterior.
            if (tempoDeJogo_hora != 0) {
                tempoDeJogo_hora--;
                tempoDeJogo_minutos = tempoDeJogo_minutos + 60;
            } 
        }

        System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)\n", tempoDeJogo_hora, tempoDeJogo_minutos);
        sc.close();
    }
}
