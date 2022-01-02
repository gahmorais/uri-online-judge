package uri_1094;



/*
Maria acabou de iniciar seu curso de graduação na faculdade de medicina e precisa de sua ajuda para organizar 
os experimentos de um laboratório o qual ela é responsável. 
Ela quer saber no final do ano, quantas cobaias foram utilizadas no laboratório e o 
percentual de cada tipo de cobaia utilizada.

Este laboratório em especial utiliza três tipos de cobaias: sapos, ratos e coelhos. 
Para obter estas informações, ela sabe exatamente o número de experimentos que foram realizados, 
o tipo de cobaia utilizada e a quantidade de cobaias utilizadas em cada experimento.

Entrada
A primeira linha de entrada contém um valor inteiro N que indica os vários casos de teste que vem a seguir. 
Cada caso de teste contém um inteiro Quantia (1 ≤ Quantia ≤ 15) que representa a quantidade de cobaias 
utilizadas e um caractere Tipo ('C', 'R' ou 'S'), indicando o tipo de cobaia (R:Rato S:Sapo C:Coelho).

Saída
Apresente o total de cobaias utilizadas, o total de cada tipo de cobaia utilizada e o percentual de cada 
uma em relação ao total de cobaias utilizadas, sendo que o percentual deve ser apresentado 
com dois dígitos após o ponto.
*/
import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int quantidadeDeInputs = sc.nextInt();
        sc.nextLine();
        int ratos = 0;
        int coelhos = 0;
        int sapos = 0;
        Double totalDeAnimais = 0.0;
        for (int i = 0; i < quantidadeDeInputs; i++) {
            String casoTeste[] = sc.nextLine().split(" ");
            char animal = casoTeste[1].charAt(0);
            int quantidade = Integer.parseInt(casoTeste[0]);
            totalDeAnimais += quantidade;
            switch (animal) {
                case 'R':
                    ratos += quantidade;
                    break;
                case 'C':
                    coelhos += quantidade;
                    break;
                case 'S':
                    sapos += quantidade;
                    break;
            }
        }

        Double percentualCoelhos = coelhos / totalDeAnimais;
        Double percentualRatos = ratos / totalDeAnimais;
        Double percentualSapos = sapos / totalDeAnimais;

        DecimalFormat format = new DecimalFormat("0.00 %");

        System.out.printf("Total: %.0f cobaias\n", totalDeAnimais);
        System.out.printf("Total de coelhos: %d\n", coelhos);
        System.out.printf("Total de ratos: %d\n", ratos);
        System.out.printf("Total de sapos: %d\n", sapos);
        System.out.printf("Percentual de coelhos: %s\n", format.format(percentualCoelhos));
        System.out.printf("Percentual de ratos: %s\n", format.format(percentualRatos));
        System.out.printf("Percentual de sapos: %s\n", format.format(percentualSapos));

        sc.close();

    }
}