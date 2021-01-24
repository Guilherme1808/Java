package labs;

import java.util.Scanner;

public class ex7 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n;
        int num;
        int maior = Integer.MIN_VALUE;

        // System.out.println("Entre com o primeiro número:");
        // int num1 = scan.nextInt();
        // System.out.println("Entre com o segundo número:");
        // int num2 = scan.nextInt();
        // System.out.println("Entre com o terceiro número:");
        // int num3 = scan.nextInt();
        // System.out.println("Entre com o quarto número:");
        // int num4 = scan.nextInt();
        // System.out.println("Entre com o quinto número:");
        // int num5 = scan.nextInt();

        // if (num1 >= num2) {
            // n = num1;
        // } else {
            // n = num2;
        // }
        // if (n <= num3) {
            // n = num3;
        // }
        // if (n <= num4) {
        //     n = num4;
        // }
        // if (n <= num5) {
        //     n = num5;
        // }
        // System.out.println("Maior: " + n);
        // System.out.println(num1 + " " + num2 + " " + num3 + " " + num4 + " " + num5);

        for (int i = 0; i < 5; i++) {
            System.out.println("Entre com um número:");
            num = scan.nextInt();

            if (num > maior) {
                maior = num;
                System.out.println("O número maior mudou: " + maior);
            }
        }
        System.out.println("O maior número digitado foi: " + maior);
    }
}