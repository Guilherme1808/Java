package labs;

import java.util.Scanner;

public class Exer12 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[] A = new int[10];
        // int soma = 0;

        // for (int i = 0; i < 10; i++) {
        //     A[i] = i;
        //     soma += A[i];
        // }
        // System.out.println("A soma dos elementos é: " + soma);

        for (int i = 0; i < A.length; i++) {
            System.out.println("Entre com o valor da posição " + i);
            A[i] = scan.nextInt();
        }

        int soma = 0;
        for (int i = 0; i < A.length; i++) {
            soma += A[i];
        }

        System.out.print("Vetor A = ");
        for (int i = 0; i < A.length; i++) {
            System.out.print(A[i] + " ");
        }
        System.out.println();

        System.out.println("Soma: " + soma);
    }
}