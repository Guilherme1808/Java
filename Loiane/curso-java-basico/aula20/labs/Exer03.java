package labs;

import java.util.Scanner;

public class Exer03 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[][] M = new int[3][3];

        for (int i = 0; i < M.length; i++) {
            for (int j = 0; j < M[i].length; j++) {
                System.out.println("Entre com o valor da posição i:" + i + " , j:" + j);
                M[i][j] = scan.nextInt();
            }
        }

        int qtdPares = 0;
        int qtdImpares = 0;
        for (int i = 0; i < M.length; i++) {
            for (int j = 0; j < M[i].length; j++) {

                if (M[i][j] % 2 == 0) {
                    qtdPares++;
                } else {
                    qtdImpares++;
                }
            }
        }
        for (int i = 0; i < M.length; i++) {
            for (int j = 0; j < M[i].length; j++) {
                System.out.print(M[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Pares: " + qtdPares);
        System.out.println("Ímpares: " + qtdImpares);
    }
}