package labs;

import java.util.Scanner;

public class Exer04 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double nota1, nota2, nota3, nota4, media;

        System.out.println("Entre com as 4 notas para obter a média:");

        System.out.println("Nota 1:");
        nota1 = scan.nextDouble();
        System.out.println("Nota 2:");
        nota2 = scan.nextDouble();
        System.out.println("Nota 3:");
        nota3 = scan.nextDouble();
        System.out.println("Nota 4:");
        nota4 = scan.nextDouble();

        media = (nota1 + nota2 + nota3 + nota4) / 4;

        System.out.println("Média: " + media);
    }
}