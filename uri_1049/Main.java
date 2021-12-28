package uri_1049;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String descricao_1 = sc.next();
        String descricao_2 = sc.next();
        String descricao_3 = sc.next();

        if (descricao_1.equals("vertebrado")) {
            if (descricao_2.equals("ave")) {
                if (descricao_3.equals("carnivoro")) {
                    System.out.println("aguia");
                } else {
                    System.out.println("pomba");
                }
            } else {
                if (descricao_3.equals("onivoro")) {

                    System.out.println("homem");
                } else {
                    System.out.println("vaca");
                }
            }

        } else {
            if (descricao_2.equals("inseto")) {
                if (descricao_3.equals("hematofago")) {
                    System.out.println("pulga");
                } else {
                    System.out.println("lagarta");
                }

            } else {
                if (descricao_3.equals("hematofago")) {
                    System.out.println("sanguessuga");
                } else {
                    System.out.println("minhoca");
                }
            }

        }
        sc.close();
    }
}
