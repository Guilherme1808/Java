package labs;

import java.util.Scanner;

public class Exer02 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[] A = new int[8];
        int[] B = new int[A.length];

        // for (int i = 0; i < 5; i++) {
        //     A[i] = i;
        //     B[i] = A[i] * 2;

        //     System.out.println("A[i] = " + A[i]);
        //     System.out.println("B[i] = " + B[i]);
        //     System.out.println("-----");
        // }

        for (int i = 0; i < A.length; i++) {
            System.out.println("Entre com o valor da posição: " + i);
            A[i] = scan.nextInt();
            B[i] = A[i] * 2;
        }
        System.out.print("Vetor A = ");
        for (int i = 0; i < A.length; i++) {
            System.out.print(A[i] + " ");
        }
        System.out.println();

        System.out.print("Vetor B = ");
        for (int i = 0; i < B.length; i++) {
            System.out.print(B[i] + " ");
        }
        System.out.println();
    }
}