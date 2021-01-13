package labs;

import java.util.Scanner;

public class Exer16 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double a, b, c, delta, raiz1, raiz2;

        System.out.println("Entre com o valor de A:");
        a = scan.nextDouble();
        if (a == 0) {
            System.out.println("A equação não é de segundo grau.");
            System.exit(0);
        } else {
            System.out.println("Entre com o valor de B:");
            b = scan.nextDouble();
            System.out.println("Entre com o valor de C:");
            c = scan.nextDouble();

            delta = Math.pow(b, 2) - 4 * a * c;

            if (delta < 0) {
                System.out.println("A equação não possui raízes reais.");
                System.exit(0);
            } else if (delta == 0) {
                raiz1 = (-b + Math.sqrt(delta)) / (2 / a);
                System.out.println("Raiz: " + raiz1);
            } else {
                raiz1 = (-b + Math.sqrt(delta)) / (2 / a);
                raiz2 = (-b - Math.sqrt(delta)) / (2 / a);
                System.out.println("Raiz 1: " + raiz1 + "\nRaiz 2: " + raiz2);
            }
        }
    }
}