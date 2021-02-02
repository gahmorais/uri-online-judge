import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        int a,b, produto;

        Scanner sc = new Scanner(System.in);

        a = sc.nextInt();
        b = sc.nextInt();

        produto = a * b;

        sc.close();

        System.out.println("PROD = " + produto);
    }
    
}
