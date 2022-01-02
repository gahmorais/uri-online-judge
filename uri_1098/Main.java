package uri_1098;

import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {
        for(Double i = 0.0; i < 2;i+=0.2){
            DecimalFormat format = new DecimalFormat("#.#");
            for(Double j = i + 1; j < i + 4;j++){
                System.out.printf("I=%s J=%s\n", format.format(i), format.format(j));
            }
        }
    }
}