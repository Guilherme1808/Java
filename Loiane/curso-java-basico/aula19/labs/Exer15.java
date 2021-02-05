package labs;

import java.util.Scanner;

public class Exer15 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[] A = new int[10];

        // double percPar = 0;
        // double percImpar = 0;
        // int contPar = 0;
        // int contImpar = 0;

        // for (int i = 0; i < 10; i++) {

        //     A[i] = i;
        //     if (A[i] % 2 == 0) {
        //         contPar++;
        //         percPar = contPar * 10;
        //     } else {
        //         contImpar++;
        //         percImpar = contImpar * 10;
        //     }
        // }
        // System.out.println("Percentual par: " + percPar + "%");
        // System.out.println("Percentual ímpar: " + percImpar + "%");

        for (int i = 0; i < A.length; i++) {
            System.out.println("Entre com o valor da posição " + i);
            A[i] = scan.nextInt();
        }

        int soma = 0;
        int impar = 0;
        for (int i = 0; i < A.length; i++) {
            if (A[i] % 2 != 0) {
                soma += A[i];
                impar++;
            }
        }

        int par = A.length - impar;
        double porcPar = (par * 100) / A.length;
        double porcImpar = (impar * 100) / A.length;

        System.out.print("Vetor A = ");
        for (int i = 0; i < A.length; i++) {
            System.out.print(A[i] + " ");
        }
        System.out.println();

        System.out.println("Porcentagem pares: " + porcPar);
        System.out.println("Porcentagem ímpares: " + porcImpar);
    }
}