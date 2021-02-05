package labs;

import java.util.Scanner;

public class Exer34 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[] A = new int[10];
        int[] B = new int[A.length];

        for (int i = 0; i < A.length; i++) {
            System.out.println("Entre com a posição " + i + " do vetor A:");
            A[i] = scan.nextInt();
        }

        for (int i = 0; i < A.length; i++) {

            System.out.println("Analizando o número " + A[i]);

            for (int j = 2; j < A[i]; j++) {
                if (j % 2 == 0) {
                    System.out.println(j + " é par.");
                }
            }
            System.out.println();
        }
    }
}