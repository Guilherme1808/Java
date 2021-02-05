package labs;

import java.util.Scanner;

public class Ex1 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double nota = -1;
        do {
            System.out.println("Entre com uma nota entre 0 e 10:");
            nota = scan.nextDouble();

            if (nota < 0 || nota > 10) {
                System.out.println("Valor inválido.");
            } else {
                System.out.println("Valor válido.");
            }
        } while (nota < 0 || nota > 10);
    }
}