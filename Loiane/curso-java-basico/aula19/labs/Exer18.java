package labs;

import java.util.Scanner;

public class Exer18 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        // int[] A = new int[10];
        // double maior = Double.MIN_VALUE;
        // double menor = Double.MAX_VALUE;
        // int posicaoMenor = 0;
        // int posicaoMaior = 0;

        // for (int i = 0; i < A.length; i++) {

        //     A[i] = i + 30;

        //     if (A[i] < menor) {
        //         menor = A[i];
        //         posicaoMenor = i;
        //     } else if (A[i] > maior) {
        //         maior = A[i];
        //         posicaoMaior = i;
        //     }
        // }
        // System.out.println("Menor idade: " + menor);
        // System.out.println("Posição: " + posicaoMenor);
        // System.out.println("Maior idade: " + maior);
        // System.out.println("Posição: " + posicaoMaior);

        int[] idades = new int[10];
        int menor = idades[0];
        int indexMenor = 0;
        int maior = idades[0];
        int indexMaior = 0;

        for (int i = 0; i < idades.length; i++) {
            if (idades[i] > maior) {
                maior = idades[i];
                indexMaior = i;
            } else if (idades[i] < menor) {
                menor = idades[i];
                indexMenor = i;
            }
        }

        System.out.print("Vetor de idades = ");
        for (int i = 0; i < idades.length; i++) {
            System.out.print(idades[i] + " ");
        }
        System.out.println();

        System.out.println("Menor idade: " + menor);
        System.out.println("Índice menor idade: " + indexMenor);
        System.out.println("Maior idade: " + maior);
        System.out.println("Índice maior idade: " + indexMaior);
    }
}