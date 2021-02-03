import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int a,b,c, maior;

        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        sc.close();

        maior = maiorValor(a,maiorValor(b, c));

        System.out.println(maior + " eh o maior");

    }

    public static int maiorValor(int valorUm, int valorDois){

        int maiorValor = ((valorUm + valorDois + Math.abs(valorUm-valorDois))/2);
        return maiorValor;

    }
}
