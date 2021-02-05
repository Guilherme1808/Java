package labs;

import java.util.Scanner;

public class Exer17 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[] A = new int[10];
        // int idade = 0;

        // for (int i = 0; i < A.length; i++) {

        //     A[i] = i + 30;

        //     if (A[i] > 35) {
        //         idade++;
        //     }
        // }
        // System.out.println("Pessoas com mais de 35 anos: " + idade);

        for (int i = 0; i < A.length; i++) {
            System.out.println("Entre com a idade da pessoa " + (i + 1));
            A[i] = scan.nextInt();
        }

        int qtd = 0;
        for (int i = 0; i < A.length; i++) {
            if (A[i] > 35) {
                qtd++;
            }
        }

        System.out.print("Vetor de idades = ");
        for (int i = 0; i < A.length; i++) {
            System.out.print(A[i] + " ");
        }
        System.out.println();

        System.out.println("Qtd pessoas > 35: " + qtd);
    }
}