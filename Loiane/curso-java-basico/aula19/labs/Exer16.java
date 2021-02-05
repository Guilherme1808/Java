package labs;

import java.util.Scanner;

public class Exer16 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[] A = new int[10];
        // int somaInferior = 0;
        // int contQuinze = 0;
        // int somaSuperior = 0;
        // int contSuperior = 0;
        // double media = 0;

        // for (int i = 0; i < A.length; i++) {

        //     A[i] = i + 10;
        //     System.out.println(A[i]);
        //     if (A[i] < 15) {
        //         somaInferior += A[i];
        //     } else if (A[i] == 15) {
        //         contQuinze++;
        //     } else if (A[i] > 15) {
        //         somaSuperior += A[i];
        //         contSuperior++;
        //         media = somaSuperior / contSuperior;
        //     }
        // }
        // System.out.println("Soma abaixo de 15: " + somaInferior);
        // System.out.println("Elementos iguais a 15: " + contQuinze);
        // System.out.println("Média acima de 15: " + media);

        for (int i = 0; i < A.length; i++) {
            System.out.println("Entre com o valor da posição " + i);
            A[i] = scan.nextInt();
        }

        int somaMenor15 = 0;
        int somaMaior15=0;
        int qtdMaior15=0;
        int igual15=0;

        for(int i =0;i<A.length;i++){
            if(A[i]==15){
                igual15++;
            }else if(A[i]<15){
                somaMenor15+=A[i];
            }else{
                qtdMaior15++;
                somaMaior15+=A[i];
            }
        }

        System.out.print("Vetor A = ");
        for (int i = 0; i < A.length; i++) {
            System.out.print(A[i] + " ");
        }
        System.out.println();

        System.out.println("Qtd números == 15: " + igual15);
        System.out.println("Qtd números < 15: " + somaMenor15);
        System.out.println("Média números > 15: " +(somaMaior15/qtdMaior15));
    }
}