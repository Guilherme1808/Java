package labs;

import java.util.Scanner;

public class Exer11 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int n1, n2;
        double n3, a, b, c;

        System.out.println("Entre com um número inteiro:");
        n1 = scan.nextInt();

        System.out.println("Entre com um número inteiro:");
        n2 = scan.nextInt();

        System.out.println("Entre com um número real:");
        n3 = scan.nextDouble();

        a = (n1 * 2) * (n2 / 2);
        b = n1 * 3 + n3;
        c = Math.pow(n3, 3);

        System.out.println("a: " + a);
        System.out.println("b: " + b);
        System.out.println("c:" + c);
    }
}