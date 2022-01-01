package uri_1061;

/*

Pedrinho está organizando um evento em sua Universidade.
O evento deverá ser no mês de Abril, iniciando e terminando dentro do mês. 
O problema é que Pedrinho quer calcular o tempo que o evento vai durar, 
uma vez que ele sabe quando inicia e quando termina o evento.

Sabendo que o evento pode durar de poucos segundos a vários dias, 
você deverá ajudar Pedrinho a calcular a duração deste evento.

Entrada
Como entrada, na primeira linha vai haver a descrição “Dia”, 
seguido de um espaço e o dia do mês no qual o evento vai começar. 
Na linha seguinte, será informado o momento no qual o evento vai iniciar, 
no formato hh : mm : ss. Na terceira e quarta linha de entrada haverá outra 
informação no mesmo formato das duas primeiras linhas, indicando o término do evento.

Saída
Na saída, deve ser apresentada a duração do evento, no seguinte formato:

W dia(s)
X hora(s)
Y minuto(s)
Z segundo(s)

Obs: Considere que o evento do caso de teste para o problema tem duração mínima de 1 minuto.

Calculo

/*
        diaCorridos * 24 * 60 * 60 = 86400
        ((8 * 3600) + (12 * 60) + 23)
        29543
        ((6 * 3600) + (13 * 60) + 23)
        22403

        29543 - 22403 = 7140

        duracaoEvento = 4 * 86400 - 7140 = 338460
        338460 / (24*3600) = 3
        338460 - (3*24*3600) = 79260
        79260 / 60 = 22
        79260 - (22*60*60) = 60
        60 / 60 = 1

*/

//https://www.beecrowd.com.br/judge/pt/problems/view/1061

import java.util.Scanner;

public class Main {
    private static final int UM_DIA = 24 * 60 * 60; /* 86400 segundos */
    private static final int UMA_HORA = 60 * 60; /* 3600 segundos */
    private static final int UM_MINUTO = 60;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int diaInicio           = Integer.parseInt(sc.nextLine().split(" ")[1]);
        String tempoInicio[]    = sc.nextLine().replace(" ", "").split(":");

        int diaFim          = Integer.parseInt(sc.nextLine().split(" ")[1]);
        String tempoFim[]   = sc.nextLine().replace(" ", "").split(":");

        int horaInicio      = Integer.parseInt(tempoInicio[0]);
        int minutoInicio    = Integer.parseInt(tempoInicio[1]);
        int segundoInicio   = Integer.parseInt(tempoInicio[2]);

        int horaFim     = Integer.parseInt(tempoFim[0]);
        int minutoFim   = Integer.parseInt(tempoFim[1]);
        int segundoFim  = Integer.parseInt(tempoFim[2]);

        int tempoInicioEmSegundos   = (horaInicio * UMA_HORA) + (minutoInicio * UM_MINUTO) + segundoInicio;
        int tempoFimEmSegundos      = (horaFim * UMA_HORA) + (minutoFim * UM_MINUTO) + segundoFim;

        int tempoDecorrido[] = calculaTempoDecorrido(diaInicio, 
                                                        diaFim, 
                                                        tempoInicioEmSegundos, 
                                                        tempoFimEmSegundos
                                                    );

        System.out.printf("%d dia(s)\n", tempoDecorrido[0]);
        System.out.printf("%d hora(s)\n", tempoDecorrido[1]);
        System.out.printf("%d minuto(s)\n", tempoDecorrido[2]);
        System.out.printf("%d segundo(s)\n", tempoDecorrido[3]);

        sc.close();
    }

    private static int[] calculaTempoDecorrido( int diaInicio, int diaFim, 
                                                int tempoInicial, int tempoFinal) {

        int diferencaTempo = tempoInicial - tempoFinal;
        int duracaoTotalEventoEmSegundos = UM_DIA * (diaFim - diaInicio) - diferencaTempo;

        int duracaoEvento_dia = duracaoTotalEventoEmSegundos / UM_DIA;
        duracaoTotalEventoEmSegundos %= UM_DIA;

        int duracaoEvento_hora = duracaoTotalEventoEmSegundos / UMA_HORA;
        duracaoTotalEventoEmSegundos %= UMA_HORA;

        int duracaoEvento_minutos = duracaoTotalEventoEmSegundos / UM_MINUTO;
        duracaoTotalEventoEmSegundos %= UM_MINUTO;

        int duracaoEvento_segundos = duracaoTotalEventoEmSegundos;

        int[] duracaoEvento = { duracaoEvento_dia, 
                                duracaoEvento_hora, 
                                duracaoEvento_minutos, 
                                duracaoEvento_segundos };
        return duracaoEvento;

    }

}
