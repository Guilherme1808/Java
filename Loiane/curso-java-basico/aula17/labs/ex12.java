package labs;

import java.util.Scanner;

public class ex12 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com o número a ser multiplicado:");
        int n = scan.nextInt();

        System.out.println("Tabuada de " + n + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " X " + i + " = " + (n * i));
        }
    }
}