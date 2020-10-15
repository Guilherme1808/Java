package labs;

import java.util.Scanner;

public class Exer06 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double raio, area;

        System.out.println("Entre com o raio do círculo:");
        raio = scan.nextDouble();

        area = Math.PI * Math.pow(raio, 2);

        System.out.println("Área do círculo: " + area);
    }
}