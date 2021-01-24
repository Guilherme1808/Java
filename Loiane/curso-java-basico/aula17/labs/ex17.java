package labs;

import java.util.Scanner;

public class ex17 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int f = 1;

        System.out.println("Entre com um número:");
        int n = scan.nextInt();

        if (n == 0) {
            System.out.println("Fatorial de 0 é = 1");
        } else {
            for (int i = 1; i <= n; i++) {

                f = f * i;
            }
            System.out.println("Fatorial de " + n + " é: " + f);
        }
    }
}