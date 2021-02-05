package labs;

import java.util.Scanner;

public class Exer23 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[] A = new int[10];

        for (int i = 0; i < A.length; i++) {
            System.out.println("Entre com o elemento da posição: " + i);
            A[i] = scan.nextInt();

            if (A[i] % 2 != 0) {
                break;
            }
        }
    }
}