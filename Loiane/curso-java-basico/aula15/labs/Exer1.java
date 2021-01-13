package labs;

import java.util.Scanner;

public class Exer1 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com o primeiro número:");
        int n1 = scan.nextInt();
        System.out.println("Entre com o segundo número:");
        int n2 = scan.nextInt();

        if (n1 > n2) {
            System.out.println(n1);
        } else {
            System.out.println(n2);
        }
    }
}