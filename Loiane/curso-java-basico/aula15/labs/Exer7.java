package labs;

import java.util.Scanner;

public class Exer7 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o primeiro número");
        int num1 = scan.nextInt();
        System.out.println("Digite o segundo número");
        int num2 = scan.nextInt();
        System.out.println("Digite o terceiro número");
        int num3 = scan.nextInt();

        if (num1 > num2 && num1 > num3) {
            if (num2 > num3) {
                System.out.println("Maior: " + num1 + "\nMenor: " + num3);
            } else {
                System.out.println("Maior: " + num1 + "\nMenor: " + num2);
            }
        } else if (num1 > num2 && num1 < num3) {
            System.out.println("Maior: " + num3 + "\nMenor: " + num2);
        } else if (num2 > num1 && num2 > num3) {
            if (num1 > num3) {
                System.out.println("Maior: " + num2 + "\nMenor: " + num3);
            } else {
                System.out.println("Maior: " + num2 + "\nMenor: " + num1);
            }
        } else if (num2 > num1 && num2 < num3) {
            System.out.println("Maior: " + num3 + "\nMenor: " + num1);
        }
    }
}