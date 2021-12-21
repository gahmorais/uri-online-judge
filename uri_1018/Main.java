package uri_1018;
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int valorASacar = sc.nextInt();
        int quantidadeNotaCem = 0;
        int quantidadeNotaCinquenta = 0;
        int quantidadeNotaVinte = 0;
        int quantidadeNotaDez = 0;
        int quantidadeNotaCinco = 0;
        int quantidadeNotaDois = 0;
        int quantidadeNotaUm = 0;

        int variavelAuxiliar = valorASacar;

        sc.close();

        while(variavelAuxiliar != 0){
            if(variavelAuxiliar >= 100){
                quantidadeNotaCem++;
                variavelAuxiliar -= 100;
            }else if(variavelAuxiliar >= 50){
                quantidadeNotaCinquenta++;
                variavelAuxiliar -= 50;
            }else if(variavelAuxiliar >= 20){
                quantidadeNotaVinte++;
                variavelAuxiliar -= 20;
            }else if(variavelAuxiliar >= 10){
                quantidadeNotaDez++;
                variavelAuxiliar -= 10;
            }else if(variavelAuxiliar >= 5){
                quantidadeNotaCinco++;
                variavelAuxiliar -= 5;
            }else if(variavelAuxiliar >= 2){
                quantidadeNotaDois++;
                variavelAuxiliar -= 2;
            }else if(variavelAuxiliar >=1){
                quantidadeNotaUm++;
                variavelAuxiliar -= 1;
                
            }
        }
        System.out.println(valorASacar);
        System.out.println(quantidadeNotaCem + " nota(s) de R$ 100,00");
        System.out.println(quantidadeNotaCinquenta + " nota(s) de R$ 50,00");
        System.out.println(quantidadeNotaVinte + " nota(s) de R$ 20,00");
        System.out.println(quantidadeNotaDez + " nota(s) de R$ 10,00");
        System.out.println(quantidadeNotaCinco + " nota(s) de R$ 5,00");
        System.out.println(quantidadeNotaDois + " nota(s) de R$ 2,00");
        System.out.println(quantidadeNotaUm + " nota(s) de R$ 1,00");

    }
    
}
