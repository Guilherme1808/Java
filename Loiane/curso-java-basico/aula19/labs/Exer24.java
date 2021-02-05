package labs;

import java.util.Scanner;

public class Exer24 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[] A = new int[10];

        for (int i = 0; i < A.length; i++) {
            System.out.println("Entre com a posição " + i);
            A[i] = scan.nextInt();
        }

        boolean palindromo = true;
        for (int i = 0; i < (A.length / 2); i++) {

            if (A[i] != A[A.length - 1 - i]) {
                palindromo = false;
                break;
            }
        }

        System.out.print("Vetor A: ");
        for (int i = 0; i < A.length; i++) {
            System.out.print(A[i] + " ");
        }
        System.out.println();

        if (palindromo) {
            System.out.println("Palindromo");
        } else {
            System.out.println("Não é palindromo");
        }
    }
}