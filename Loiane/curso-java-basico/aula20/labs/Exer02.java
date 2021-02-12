package labs;

import java.util.Random;

public class Exer02 {

    public static void main(String[] args) {

        int[][] numerosAleatorios = new int[10][10];

        Random numeroRandom = new Random();

        for (int i = 0; i < numerosAleatorios.length; i++) {
            for (int j = 0; j < numerosAleatorios[i].length; j++) {
                numerosAleatorios[i][j] = numeroRandom.nextInt(100);
            }
        }

        for (int i = 0; i < numerosAleatorios.length; i++) {
            for (int j = 0; j < numerosAleatorios[i].length; j++) {
                System.out.print(numerosAleatorios[i][j] + " - ");
            }
            System.out.println();
        }
        System.out.println();

        int maior5 = 0;
        int menor5 = 101;
        int linha5 = 5;
        int maior7 = 0;
        int menor7 = 101;
        int coluna7 = 7;

        for (int i = 0; i < numerosAleatorios[linha5].length; i++) {
            if (numerosAleatorios[linha5][i] > maior5) {
                maior5 = numerosAleatorios[linha5][i];
            }
            if (numerosAleatorios[linha5][i] < menor5) {
                menor5 = numerosAleatorios[linha5][i];
            }
        }

        System.out.println("Maior valor da linha 5 = " + maior5);
        System.out.println("Menor valor da linha 5 = " + menor5);

        for (int i = 0; i < numerosAleatorios.length; i++) {
            if (numerosAleatorios[i][coluna7] > maior7) {
                maior7 = numerosAleatorios[i][coluna7];
            }
            if (numerosAleatorios[i][coluna7] < menor7) {
                menor7 = numerosAleatorios[i][coluna7];
            }
        }

        System.out.println("Maior valor da coluna 7 = " + maior7);
        System.out.println("Menor valor da coluna 7 = " + menor7);
    }
}