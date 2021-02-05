package labs;

import java.util.Scanner;

public class Exer33 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[] A = new int[5];

        for (int i = 0; i < A.length; i++) {
            System.out.println("Entre com a posição " + i + " do vetor A:");
            A[i] = scan.nextInt();
        }

        boolean primo;
        String msg;

        for (int i = 0; i < A.length; i++) {

            primo = true;
            for (int j = 2; j < A[i]; j++) {
                if (A[i] % j == 0) {
                    primo = false;
                    break;
                }
            }

            msg = "";
            if (primo) {
                msg = " primo.";
            } else {
                msg = " não é primo.";
            }

            System.out.println(A[i] + msg);
        }
    }
}