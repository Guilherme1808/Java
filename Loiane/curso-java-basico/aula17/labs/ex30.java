package labs;

import java.util.Scanner;

public class ex30 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        boolean invalido = true;
        int n, inicio, fim;

        do {

            System.out.println("Entre com o número a ser multiplicado:");
            n = scan.nextInt();

            System.out.println("Entre com o início da tabuada: ");
            inicio = scan.nextInt();

            System.out.println("Entre com o final da tabuada:");
            fim = scan.nextInt();

            if (fim > inicio) {
                invalido = false;
            }
        } while (invalido);

        System.out.println("Tabuada de " + n + ":");
        System.out.println("Começa por: +" + inicio);
        System.out.println("Termina em: " + fim);
        System.out.println();

        System.out.println("Tabuada de " + n + ":");
        for (int i = inicio; i <= fim; i++) {
            System.out.println(n + " X " + i + " = " + (n * i));
        }
    }
}