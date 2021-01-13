package labs;

import java.util.Scanner;

public class Exer8 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com o preço do primeiro produto:");
        double produto1 = scan.nextDouble();
        System.out.println("Entre com o preço do segundo produto:");
        double produto2 = scan.nextDouble();
        System.out.println("Entre com o preço do terceiro produto:");
        double produto3 = scan.nextDouble();

        if (produto1 <= produto2 && produto1 <= produto3) {
            System.out.println("Você deve comprar o produto 1: " + produto1);
        } else if (produto2 <= produto1 && produto2 <= produto3) {
            System.out.println("Você deve comprar o produto 2: " + produto2);
        } else if (produto3 <= produto1 && produto3 <= produto2) {
            System.out.println("Você deve comprar o produto 3: " + produto3);
        }
    }
}