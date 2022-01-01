package uri_1065;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int valores[] = {
            sc.nextInt(),
            sc.nextInt(),
            sc.nextInt(),
            sc.nextInt(),
            sc.nextInt(),
        };
        int n = valores.length;
        int numerosPares = 0;
        for(int i = 0; i< n; i++){
            if(valores[i] %2 == 0){
                numerosPares++;
            }
        }

        System.out.printf("%d valores pares\n", numerosPares);
        sc.close();
    }
}
