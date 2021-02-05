package labs;

import java.util.Scanner;

public class Exer32 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[] A = new int[5];

        for (int i = 0; i < A.length; i++) {
            System.out.println("Entre com a posição " + i + " do vetor A:");
            A[i] = scan.nextInt();
        }

        for (int i = 0; i < A.length; i++) {
            int n = 0;
            System.out.println("Tabuada de: " + A[i]);
            
            // do {
            //     System.out.println(A[i] + " * " + n + " = " + (A[i] * n));
            //     n++;
            // } while (n <= 10);

            for (int j = 0; j <= 10; j++) {
                System.out.println(A[i] + " * " + j + " = " + (A[i] * j));
            }
        }
    }
}