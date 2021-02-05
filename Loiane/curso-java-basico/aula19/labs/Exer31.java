package labs;

import java.util.Scanner;

public class Exer31 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[] A = new int[20];
        int[] B = new int[A.length];

        for (int i = 0; i < A.length; i++) {
            System.out.println("Entre com a posição " + i + " do vetor A:");
            A[i] = scan.nextInt();
        }

        int posB = 0;

        for (int i = 0; i < A.length; i++) {

            if (A[i] % 2 == 0) {
                B[posB] = A[i];
                posB++;
            }
        }

        for (int i = 0; i < A.length; i++) {

            if (A[i] % 2 != 0) {
                B[posB] = A[i];
                posB++;
            }
        }

        System.out.print("Vetor A: ");
        for (int i = 0; i < A.length; i++) {
            System.out.print(A[i] + " ");
        }
        System.out.println();

        System.out.print("Vetor B: ");
        for (int i = 0; i < B.length; i++) {
            System.out.print(B[i] + " ");
        }
    }
}