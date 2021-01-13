package labs;

import java.util.Scanner;

public class Exer2 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com algum valor:");
        double valor = scan.nextDouble();

        if (valor >= 0) {
            System.out.println("Positivo");
        } else {
            System.out.println("Negativo");
        }
    }
}