package labs;

import java.util.Scanner;

public class ex23 {

    public static void main(String[] args) {

        System.out.println("Lojas Quase Dois - Tabela de precos:");

        for (int i = 1; i <= 50; i++) {
            System.out.println(i + " - R$" + (1.99 * i));
        }
    }
}