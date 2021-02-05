package labs;

import java.util.Scanner;

public class Exer26 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[] A = new int[10];
        int[] B = new int[A.length];
        int[] C = new int[A.length];

        System.out.println("Vetor A:");
        for (int i = 0; i < A.length; i++) {
            System.out.println("Entre com a posição " + i);
            A[i] = scan.nextInt();
        }
        System.out.println("Vetor B:");
        for (int i = 0; i < B.length; i++) {
            System.out.println("Entre com a posição " + i);
            B[i] = scan.nextInt();
        }

        for (int i = 0; i < C.length; i++) {
            if (A[i] > B[i]) {
                C[i] = 1;
            } else if (A[i] == B[i]) {
                C[i] = 0;
            } else if (A[i] < B[i]) {
                C[i] = -1;
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
        System.out.println();

        System.out.print("Vetor C: ");
        for (int i = 0; i < C.length; i++) {
            System.out.print(C[i] + " ");
        }
        System.out.println();
    }
}