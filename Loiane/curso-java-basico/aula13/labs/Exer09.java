package labs;

import java.util.Scanner;

public class Exer09 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double farenheit, celsius;

        System.out.println("Entre com a temperatura em Farenheit:");
        farenheit = scan.nextDouble();

        celsius = 5 * (farenheit - 32) / 9;
        System.out.println(celsius + " Celsius.");
    }
}