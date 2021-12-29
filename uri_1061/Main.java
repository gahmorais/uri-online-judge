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

        dia * 24 * 60 * 60 = 86400
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

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Dia ");
        int diaInicio = sc.nextInt();
        sc.nextLine();
        String tempoInicio[] = sc.nextLine().replace(" ", "").split(":");

        System.out.print("Dia ");
        int diaFim = sc.nextInt();
        sc.nextLine();

        String tempoFim[] = sc.nextLine().replace(" ", "").split(":");

        int horaInicio = Integer.parseInt(tempoInicio[0]);
        int minutoInicio = Integer.parseInt(tempoInicio[1]);
        int segundoInicio = Integer.parseInt(tempoInicio[2]);

        int horaFim = Integer.parseInt(tempoFim[0]);
        int minutoFim = Integer.parseInt(tempoFim[1]);
        int segundoFim = Integer.parseInt(tempoFim[2]);

        int UM_DIA = 24 * 60 * 60; /* 86400 segundos */
        int UMA_HORA = 60 * 60;

        int tempoInicioEmSegundos = (horaInicio * 3600) + (minutoInicio * 60) + segundoInicio;
        int tempoFimEmSegundos = (horaFim * 3600) + (minutoFim * 60) + segundoFim;

        int diferencaTempo = Math.abs(tempoFimEmSegundos - tempoInicioEmSegundos);

        int duracaoTotalEvento = (UM_DIA * (diaFim - diaInicio)) - diferencaTempo;

        /*
         * 
         * dia * 24 * 60 * 60 = 86400
         * ((8 * 3600) + (12 * 60) + 23)
         * 29543
         * ((6 * 3600) + (13 * 60) + 23)
         * 22403
         * 
         * 29543 - 22403 = 7140
         * 
         * duracaoEvento = 4 * 86400 - 7140 = 338460
         * 338460 / (24*3600) = 3
         * 338460 % (24*3600) / 60 = 22
         * 338460 - (3*24*3600) = 79260
         * 79260 / 60 = 22
         * 79260 - (22*60*60) = 60
         * 60 / 60 = 1
         * 
         */
        System.out.println(duracaoTotalEvento);

        int duracaoEvento_dia = duracaoTotalEvento / UM_DIA;
        duracaoTotalEvento -= duracaoEvento_dia * UM_DIA ;

        int duracaoEvento_hora = duracaoTotalEvento / 60;
        duracaoTotalEvento -= duracaoEvento_hora * UMA_HORA;

        int duracaoEvento_minutos = duracaoTotalEvento / 60;
        duracaoTotalEvento -= duracaoEvento_minutos * 60;

        int duracaoEvento_segundos = duracaoTotalEvento;

        System.out.println(duracaoEvento_dia);
        System.out.println(duracaoEvento_hora);
        System.out.println(duracaoEvento_minutos);
        System.out.println(duracaoEvento_segundos);

        sc.close();
    }

}
