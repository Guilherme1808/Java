package labs;

import java.util.Scanner;

public class Exer14 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double nota1, nota2, media;

        System.out.println("Entre com a primeira nota:");
        nota1 = scan.nextDouble();
        System.out.println("Entre com a segunda nota:");
        nota2 = scan.nextDouble();

        media = (nota1 + nota2) / 2;

        if (media >= 9 && media <= 10) {
            System.out.println(
                    "Nota 1: " + nota1 + "\nNota 2: " + nota2 + "\nMédia: " + media + "\nConceito : A" + "\nAPROVADO");
        } else if (media >= 7.5 && media < 9) {
            System.out.println(
                    "Nota 1: " + nota1 + "\nNota 2: " + nota2 + "\nMédia: " + media + "\nConceito : B" + "\nAPROVADO");
        } else if (media >= 6 && media < 7.5) {
            System.out.println(
                    "Nota 1: " + nota1 + "\nNota 2: " + nota2 + "\nMédia: " + media + "\nConceito : C" + "\nAPROVADO");
        } else if (media >= 5 && media < 6) {
            System.out.println(
                    "Nota 1: " + nota1 + "\nNota 2: " + nota2 + "\nMédia: " + media + "\nConceito : D" + "\nREPROVADO");
        } else if (media >= 0 && media < 4) {
            System.out.println(
                    "Nota 1: " + nota1 + "\nNota 2: " + nota2 + "\nMédia: " + media + "\nConceito : E" + "\nREPROVADO");
        }
    }
}