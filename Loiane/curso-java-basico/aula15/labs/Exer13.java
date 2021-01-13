package labs;

import java.util.Scanner;

public class Exer13 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com um número enrte 1 e 7 para exibir o dia da semana");
        int dia = scan.nextInt();

        switch (dia) {
            case 1:
                System.out.println(dia + " - Domingo");
                break;
            case 2:
                System.out.println(dia + " - Segunda");
                break;
            case 3:
                System.out.println(dia + " - Terça");
                break;
            case 4:
                System.out.println(dia + " - Quarta");
                break;
            case 5:
                System.out.println(dia + " - Quinta");
                break;
            case 6:
                System.out.println(dia + " - Sexta");
                break;
            case 7:
                System.out.println(dia + " - Sábado");
                break;
            default:
                System.out.println("Valor inválido.");
        }
    }
}