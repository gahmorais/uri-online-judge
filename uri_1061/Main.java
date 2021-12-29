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
*/
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Dia ");
        int diaInicio = Integer.parseInt(sc.nextLine());
        int horaInicio = Integer.parseInt(sc.nextLine());
        // sc.nextLine();
        // System.out.print(" : ");
        // int minutoInicio = sc.nextInt();
        // sc.nextLine();
        // System.out.print(" : ");
        // int segundoInicio = sc.nextInt();
        // sc.nextLine();
        // int diaFim = sc.nextInt();
        // int horaFim = sc.nextInt();
        // sc.nextLine();
        // System.out.print(" : ");
        // int minutoFim = sc.nextInt();
        // sc.nextLine();
        // System.out.print(" : ");
        // int segundoFim = sc.nextInt();

        sc.close();
    }
    
}
