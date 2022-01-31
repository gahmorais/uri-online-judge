package uri_1118;
/*
Escreva um programa para ler as notas da primeira e a segunda avaliação de um aluno. 
Calcule e imprima a média semestral. O programa só deverá aceitar notas válidas (uma nota válida deve pertencer ao intervalo [0,10]). 
Cada nota deve ser validada separadamente.

No final deve ser impressa a mensagem “novo calculo (1-sim 2-nao)”, 
solicitando ao usuário que informe um código (1 ou 2) indicando se ele deseja ou não executar o algoritmo novamente, 
(aceitar apenas os código 1 ou 2). Se for informado o código 1 deve ser repetida a execução de todo o programa para permitir um novo cálculo, 
caso contrário o programa deve ser encerrado.

Entrada
O arquivo de entrada contém vários valores reais, positivos ou negativos.
Quando forem lidas duas notas válidas, deve ser lido um valor inteiro X . 
O programa deve parar quando o valor lido para este X for igual a 2.

Saída
Se uma nota inválida for lida, deve ser impressa a mensagem “nota invalida”. 
Quando duas notas válidas forem lidas, deve ser impressa a mensagem “media = ” seguido do valor do cálculo.

Antes da leitura de X deve ser impressa a mensagem "novo calculo (1-sim 2-nao)" e 
esta mensagem deve ser apresentada novamente se o valor da entrada padrão para X for menor do que 1 ou maior do que 2, 
conforme o exemplo abaixo.

A média deve ser impressa com dois dígitos após o ponto decimal.


*/

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        sc.useLocale(Locale.ENGLISH);
        atribuiNotas();
        while (true) {
            mostraMensagem("novo calculo (1-sim 2-nao)");
            int opt = sc.nextInt();
            if (opt == 1) {
                atribuiNotas();
            } else if (opt == 2) {
                break;
            }
        }

        sc.close();
    }

    private static boolean validaNota(Double nota) {
        return nota >= 0 && nota <= 10;
    }

    private static Double somaDasNotas(ArrayList<Double> notas) {
        Double somaDasNotas = 0.0;
        for (int i = 0; i < notas.size(); i++) {
            if (validaNota(notas.get(i))) {
                somaDasNotas += notas.get(i);
            } else {
                mostraMensagem("nota invalida");
            }
        }

        return somaDasNotas;
    }

    private static void mostraMensagem(String s) {
        System.out.println(s);
    }

    private static void atribuiNotas() {
        int notasValidas = 0;
        ArrayList<Double> notas = new ArrayList<>();
        // sc.useLocale(Locale.ENGLISH);
        while (notasValidas != 2) {
            Double nota = sc.nextDouble();
            notas.add(nota);
            if (nota >= 0 && nota <= 10) {
                notasValidas++;
            }
        }

        Double somaDasNotas = somaDasNotas(notas);
        notas.clear();
        notasValidas = 0;
        Double media = somaDasNotas / 2;
        System.out.printf("media = %.2f\n", media);

    }
}