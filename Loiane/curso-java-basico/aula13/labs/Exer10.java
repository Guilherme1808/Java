package labs;

import java.util.Scanner;

public class Exer10 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double celsius, farenheit;

        System.out.println("Entre com a temperatura em Celsius:");
        celsius = scan.nextDouble();

        farenheit = (celsius * 9 / 5) + 32;
        System.out.println(farenheit + " Fahrenheit.");

    }
}