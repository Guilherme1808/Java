package labs;

import java.util.Scanner;

public class Exer03 {

    public static void main(String[] args) {

        int num1, num2, soma;

        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com dois números inteiros:");

        num1 = scan.nextInt();
        num2 = scan.nextInt();
        soma = num1 + num2;

        System.out.println("A soma dos números " + num1 + " e " + num2 + " é: " + soma);
    }
}