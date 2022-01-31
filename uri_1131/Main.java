package uri_1131;

/**
 * 
 * A Federação Gaúcha de Futebol contratou você para escrever um programa para fazer uma estatística do resultado de vários GRENAIS. 
 * Escreva um programa para ler o número de gols marcados pelo Inter e pelo Grêmio em um GRENAL. 
 * Logo após escrever a mensagem "Novo grenal (1-sim 2-nao)" e solicitar uma resposta. 
 * Se a resposta for 1, o algoritmo deve ser executado novamente solicitando o número de 
 * gols marcados pelos times em uma nova partida, caso contrário deve ser encerrado imprimindo:

- Quantos GRENAIS fizeram parte da estatística.
- O número de vitórias do Inter.
- O número de vitórias do Grêmio.
- O número de Empates.
- Uma mensagem indicando qual o time que venceu o maior número de GRENAIS (ou "Nao houve vencedor", caso termine empatado).

Entrada
O arquivo de entrada contém 2 valores inteiros, 
correspondentes aos gols marcados pelo Inter e pelo Grêmio respectivamente. 
Em seguida háverá um inteiro (1 ou 2), correspondente à repetição do programa.

Saída
Após cada leitura dos gols, deve ser impressa a mensagem "Novo grenal (1-sim 2-nao)". 
Quando o algoritmo for encerrado devem ser mostradas as estatísticas conforme a descrição 
apresentada acima. Obs: a palavra "Gremio" deve ser impressa sem acento, conforme o exemplo abaixo.
 */
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        ArrayList<String> grenalList = new ArrayList<>();
        String grenal = sc.nextLine();
        grenalList.add(grenal);
        while(true){
            System.out.println("Novo grenal (1-sim 2-nao)");
            int opt = sc.nextInt();
            sc.nextLine();
            if(opt == 1){
                grenal = sc.nextLine();
                grenalList.add(grenal);
            }else if(opt == 2){
                break;
            }
        }
        apresentarResultados(grenalList);
    }

    private static void apresentarResultados(ArrayList<String> grenalList){
        int vitoriasGremio = 0;
        int vitoriasInter  = 0;
        int empates = 0;

        for(String resultados : grenalList){
            int golsInter = Integer.parseInt(resultados.split(" ")[0]);
            int golsGremio = Integer.parseInt(resultados.split(" ")[1]);
            if(golsGremio == golsInter){
                empates++;
            }else if(golsGremio > golsInter){
                vitoriasGremio++;
            }else{
                vitoriasInter++;
            }
        }

        System.out.printf("Inter:%d\n", vitoriasInter);
        System.out.printf("Gremio:%d\n", vitoriasGremio);
        System.out.printf("Empates:%d\n", empates);
        if(vitoriasGremio > vitoriasInter){
            System.out.println("Gremio venceu mais");
        }else{
            System.out.println("Inter venceu mais");
        }
        grenalList.clear();
    }
}
