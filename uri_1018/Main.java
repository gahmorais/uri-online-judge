import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int valorASacar,
        quantidadeNotaCem = 0, 
        quantidadeNotaCinquenta = 0, 
        quantidadeNotaVinte = 0, 
        quantidadeNotaDez = 0, 
        quantidadeNotaCinco = 0, 
        quantidadeNotaDois = 0, 
        quantidadeNotaUm = 0;

        valorASacar = sc.nextInt();

        while(valorASacar != 0){
            if(valorASacar >= 100){
                quantidadeNotaCem++;
                valorASacar -= 100;
            }else if(valorASacar >= 50){
                quantidadeNotaCinquenta++;
                valorASacar -= 50;
            }else if(valorASacar >= 20){
                quantidadeNotaVinte++;
                valorASacar -= 20;
            }else if(valorASacar >= 10){
                quantidadeNotaDez++;
                valorASacar -= 10;
            }else if(valorASacar >= 5){
                quantidadeNotaCinco++;
                valorASacar -= 5;
            }else if(valorASacar >= 2){
                quantidadeNotaDois++;
                valorASacar -= 2;
            }else if(valorASacar >=1){
                quantidadeNotaUm++;
                valorASacar -= 1;
                
            }
        }

        System.out.println(quantidadeNotaCem + " nota(s) de R$ 100,00");
        System.out.println(quantidadeNotaCinquenta + " nota(s) de R$ 50,00");
        System.out.println(quantidadeNotaVinte + " nota(s) de R$ 20,00");
        System.out.println(quantidadeNotaDez + " nota(s) de R$ 10,00");
        System.out.println(quantidadeNotaCinco + " nota(s) de R$ 5,00");
        System.out.println(quantidadeNotaDois + " nota(s) de R$ 2,00");
        System.out.println(quantidadeNotaUm + " nota(s) de R$ 1,00");

    }
}
