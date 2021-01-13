package labs;

import java.util.Scanner;

public class Exer10 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Em qual turno você estuda?");
        System.out.println("Digite M - matutino, V - Vespertino, N - Noturno");

        String turno = scan.next();

        if (turno.matches("[Mm Vv Nn]")) {
            switch (turno.toUpperCase()) {
                case "M":
                    System.out.println("Bom dia!");
                    break;
                case "V":
                    System.out.println("Boa tarde!");
                    break;
                case "N":
                    System.out.println("Boa noite!");
                    break;
            }
        } else {
            System.out.println("Valor inválido!");
        }
    }
}