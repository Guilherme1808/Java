package labs;

import java.util.Scanner;

public class Exer07 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double area, dobroArea, comprimento;

        System.out.println("Entre com o comprimento de uma das faces do quadrado:");
        comprimento = scan.nextDouble();

        area = comprimento * 2;
        dobroArea = area * 2;

        System.out.println("O dobro da área do quadrado é: " + dobroArea);
    }
}