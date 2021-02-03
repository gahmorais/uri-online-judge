import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        double notaUm, notaDois, notaTres, media;
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);
        notaUm = sc.nextDouble();
        notaDois = sc.nextDouble();
        notaTres = sc.nextDouble();

        sc.close();

        media = (( notaUm * 2 ) + (notaDois * 3) + ( notaTres * 5 ))/10;

        System.out.printf(Locale.ENGLISH, "MEDIA = %.1f\n" , media);
    }    
}
