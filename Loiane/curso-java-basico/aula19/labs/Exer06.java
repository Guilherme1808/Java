package labs;

import java.util.Scanner;

public class Exer06 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[] A = new int[10];
        int[] B = new int[A.length];
        int[] C = new int[A.length];

        // for (int i = 0; i < 10; i++) {
        //     A[i] = i;
        //     B[i] = i;
        //     C[i] = A[i] + B[i];

        //     System.out.println("i:" + i);
        //     System.out.println("A[i] = " + A[i]);
        //     System.out.println("B[i] = " + B[i]);
        //     System.out.println("C[i] = " + C[i]);
        //     System.out.println("-----");
        // }

        for (int i = 0; i < A.length; i++) {
            System.out.println("Entre com o valor do vetor A da posição: " + i);
            A[i] = scan.nextInt();
        }
        for (int i = 0; i < B.length; i++) {
            System.out.println("Entre com o valor do vetor B da posição: " + i);
            B[i] = scan.nextInt();
        }
        for (int i = 0; i < C.length; i++) {
            C[i] = A[i] + B[i];
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

        System.out.print("Vetor C = ");
        for (int i = 0; i < C.length; i++) {
            System.out.print(C[i] + " ");
        }
        System.out.println();
    }
}