package labs;

import java.util.Scanner;

public class Exer4 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String vogais = scan.next();

        if (vogais.matches("[A-Z a-z Çç]")) {
            switch (vogais.toUpperCase()) {
                case "A":
                case "E":
                case "I":
                case "O":
                case "U":
                    System.out.println("Vogal");
                    break;
                default:
                    System.out.println("Consoante");
            }
        } else {
            System.out.println("Você não digitou uma letra.");
        }
    }
}