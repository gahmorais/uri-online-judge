package uri_1044;

/*
Leia 2 valores inteiros (A e B). 
Após, o programa deve mostrar uma mensagem "Sao Multiplos" ou "Nao sao Multiplos", 
indicando se os valores lidos são múltiplos entre si.

Entrada
A entrada contém valores inteiros.

Saída
A saída deve conter uma das mensagens conforme descrito acima.
*/
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int resultado = a > b ? a%b : b%a;

        if (resultado == 0) {
            System.out.println("Sao Multiplos");
        } else {
            System.out.println("Nao Sao Multiplos");
        }

        sc.close();

    }
}