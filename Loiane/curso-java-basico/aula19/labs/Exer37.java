package labs;

import java.util.Scanner;

public class Exer37 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[] A = new int[15];
        int[] B = new int[A.length];

        for (int i = 0; i < A.length; i++) {
            System.out.println("Entre com a posição " + i + " do vetor A:");
            A[i] = scan.nextInt();
        }

        for (int i = 0; i < A.length; i++) {

            B[i] = 1;
            for (int j = 1; j <= A[i]; j++) {
                B[i] *= j;
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