import java.io.IOException;
import java.util.Scanner;
 
/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class Main {
 
    public static void main(String[] args) throws IOException {
 
        /**
         * Escreva a sua solução aqui
         * Code your solution here
         * Escriba su solución aquí
         */
         
         int a, b, x;
         Scanner sc = new Scanner(System.in);
         a = sc.nextInt();
         b = sc.nextInt();
         x = a + b;
         
         sc.close();
         System.out.println("X = "+x);
         
 
    }
 
}