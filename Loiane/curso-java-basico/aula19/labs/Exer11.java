package labs;

import java.util.Scanner;

public class Exer11 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[] A = new int[10];
        // int cont = 0;

        // for (int i = 0; i < 10; i++) {
        //     A[i] = i;

        //     if (A[i] % 2 == 0) {
        //         cont++;
        //     }
        // }
        // System.out.println("Quantidade de pares: " + cont);

        for (int i = 0; i < A.length; i++) {
            System.out.println("Entre com o valor da posição " + i);
            A[i] = scan.nextInt();
        }
        int qtdPares = 0;
        for (int i = 0; i < A.length; i++) {
            if (A[i] % 2 == 0) {
                qtdPares++;
            }
        }

        System.out.print("Vetor A = ");
        for (int i = 0; i < A.length; i++) {
            System.out.print(A[i] + " ");
        }
        System.out.println();

        System.out.println("Qtd números pares: " + qtdPares);
    }
}