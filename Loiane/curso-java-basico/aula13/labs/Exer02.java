package labs;

import java.util.Scanner;

public class Exer02 {

    public static void main(String[] args) {

        int num;
        System.out.println("Entre com um número inteiro.");

        Scanner scan = new Scanner(System.in);

        num = scan.nextInt();

        System.out.println("O número digitado foi: " + num);
    }
}