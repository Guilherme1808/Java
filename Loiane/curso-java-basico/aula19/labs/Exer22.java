package labs;

import java.rmi.dgc.Lease;

public class Exer22 {

    public static void main(String[] args) {

        int[] A = new int[10];
        double contZero = 0;
        double contUm = 0;

        for (int i = 0; i < A.length; i++) {
            A[i] = (int) Math.round(Math.random() * 1);

            if (A[i] == 0) {
                contZero++;
            } else {
                contUm++;
            }
        }

        System.out.print("Vetor A:");
        for (int i = 0; i < A.length; i++) {
            System.out.print(A[i] + " ");
        }
        System.out.println();

        System.out.println("Percentual de 0's = " + (contZero * 100) / A.length + "%");
        System.out.println("Percentual de 1's = " + (contUm * 100) / A.length + "%");
    }
}