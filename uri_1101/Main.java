package uri_1101;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //System.arraycopy(i, 0, j, 0, i.length);

        String entrada = "";
        String valores[] = new String[10];

        Scanner sc = new Scanner(System.in);

        int i = 0;

        while (true) {
            entrada = sc.nextLine();
            if(!entrada.contains("0")){
                if(i > 9){
                    String novoArray[] = new String[i+1];
                    System.arraycopy(valores, 0, novoArray, 0, valores.length);
                    i = 0;
                }
                valores[i] = entrada;
                i++;
            }else{
                break;
            }
        }
        sc.close();
    }
}