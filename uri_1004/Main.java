import java.util.Locale;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        double a,b,media;
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        a = sc.nextDouble();
        b = sc.nextDouble();

        media = ((3.5*a)+ (7.5*b))/11;
        
        System.out.printf(Locale.ENGLISH, "MEDIA = %.5f\n", media);

    }
}