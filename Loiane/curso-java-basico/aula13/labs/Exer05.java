package labs;

import java.util.Scanner;

public class Exer05 {

    public static void main(String[] args) {

        double metros, cm;

        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com o tamanho em metros:");

        metros = scan.nextDouble();
        cm = metros * 100;

        System.out.println(metros + " metros equivalem " + cm + "cm");
    }
}