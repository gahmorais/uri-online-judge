package uri_1043;

/*
Leia 3 valores reais (A, B e C) e verifique se eles formam ou não um triângulo. 
Em caso positivo, calcule o perímetro do triângulo e apresente a mensagem:

Perimetro = XX.X
Em caso negativo, calcule a área do trapézio que tem A e B como base e C como altura, mostrando a mensagem

Area = XX.X

Entrada
A entrada contém três valores reais.

Saída
O resultado deve ser apresentado com uma casa decimal.
*/

/*

Definição de triângulo -> |b-c|<a<b+c
*/
import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);
        float   abs = 0,
                resultado = 0,
                a = sc.nextFloat(),
                b = sc.nextFloat(),
                c = sc.nextFloat();
        abs = Math.abs(b-c);
        if(a > abs && a < (b+c)){
            //Perimetro do triângulo
            resultado = a + b + c;
            System.out.printf("Perimetro = %.1f\n", resultado);
        }else{
            //Área do trapézio
            resultado = ((a+b)*c)/2;
            System.out.printf("Area = %.1f\n", resultado);
        }
        sc.close();
    }
}
