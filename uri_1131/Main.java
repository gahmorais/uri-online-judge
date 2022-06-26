package uri_1131;



/**
 * A Federação Gaúcha de Futebol contratou você para escrever um programa para fazer uma estatística do resultado de vários GRENAIS. 
 * Escreva um programa para ler o número de gols marcados pelo Inter e pelo Grêmio em um GRENAL. Logo após escrever a mensagem 
 * "Novo grenal (1-sim 2-nao)" e solicitar uma resposta. Se a resposta for 1, o algoritmo deve ser executado novamente 
 * solicitando o número de gols marcados pelos times em uma nova partida, 
 * caso contrário deve ser encerrado imprimindo:

- Quantos GRENAIS fizeram parte da estatística.
- O número de vitórias do Inter.
- O número de vitórias do Grêmio.
- O número de Empates.
- Uma mensagem indicando qual o time que venceu o maior número de GRENAIS 
(ou "Nao houve vencedor", caso termine empatado).

Entrada
O arquivo de entrada contém 2 valores inteiros, correspondentes aos gols 
marcados pelo Inter e pelo Grêmio respectivamente. Em seguida háverá um 
inteiro (1 ou 2), correspondente à repetição do programa.

Saída
Após cada leitura dos gols, deve ser impressa a mensagem "Novo grenal (1-sim 2-nao)". 
Quando o algoritmo for encerrado devem ser mostradas as estatísticas conforme a descrição apresentada acima. 
Obs: a palavra "Gremio" deve ser impressa sem acento, conforme o exemplo abaixo.
 */

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        String resultado = "";
        ArrayList<String> resultados = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);
        int opcao = 1;
        do {
            if (opcao == 1) {
                resultado = sc.nextLine();
                resultados.add(resultado);
            } else {
                break;
            }
            System.out.println("Novo grenal (1-sim 2-nao)");
            opcao = sc.nextInt();
            sc.nextLine();
        } while (opcao != 2);

        sc.close();

        int quantidadeDeJogos = resultados.size();
        int vitoriasGremio = 0;
        int vitoriasInter = 0;
        int empates = 0;
        for (int i = 0; i < quantidadeDeJogos; i++) {
            String[] gols = resultados.get(i).split(" ");
            int golsInter = Integer.valueOf(gols[0]);
            int golsGremio = Integer.valueOf(gols[1]);
            if (golsInter > golsGremio) {
                vitoriasInter++;
            } else if (golsGremio == golsInter) {
                empates++;
            } else {
                vitoriasGremio++;
            }
        }
        String maiorVencedor = vitoriasGremio > vitoriasInter ? "Gremio venceu mais" : "Inter venceu mais";
        System.out.printf("%d grenais\n", quantidadeDeJogos);
        System.out.printf("Inter:%d\n", vitoriasInter);
        System.out.printf("Gremio:%d\n", vitoriasGremio);
        System.out.printf("Empates:%d\n", empates);
        System.out.println(maiorVencedor);

    }
}