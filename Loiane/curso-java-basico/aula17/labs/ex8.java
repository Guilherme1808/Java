package labs;

import java.util.Scanner;

public class ex8 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

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

        // int soma = num1 + num2 + num3 + num4 + num5;
        // double media = (num1 + num2 + num3 + num4 + num5) / 5;

        // System.out.println("Soma: " + soma);
        // System.out.println("Média: " + media);

        int num;
        int soma = 0;
        int media;

        for (int i = 0; i < 5; i++) {
            System.out.println("Digite um número:");
            num = scan.nextInt();

            soma += num;
        }
        media = soma / 5;

        System.out.println("Soma: " + soma);
        System.out.println("Média: " + media);

    }
}