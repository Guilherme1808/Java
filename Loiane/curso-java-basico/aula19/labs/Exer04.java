package labs;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exer04 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[] A = new int[15];
        double[] B = new double[A.length];

        // for (int i = 0; i < 15; i++) {
        //     A[i] = i;
        //     B[i] = Math.sqrt(A[i]);

        //     System.out.println("i:" + i);
        //     System.out.println("A[i] = " + A[i]);
        //     System.out.println("B[i] = " + B[i]);
        //     System.out.println("-----");
        // }

        for (int i = 0; i < A.length; i++) {
            System.out.println("Entre com o valor da posição: " + i);
            A[i] = scan.nextInt();
            B[i] = Math.sqrt(A[i]);
        }
        System.out.print("Vetor A = ");
        for (int i = 0; i < A.length; i++) {
            System.out.print(A[i] + " ");
        }
        System.out.println();

        DecimalFormat df = new DecimalFormat("###,###.##");

        System.out.print("Vetor B = ");
        for (int i = 0; i < B.length; i++) {
            System.out.print(df.format(B[i]) + " ");
        }
        System.out.println();
    }
}