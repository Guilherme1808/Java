package labs;

import java.util.Scanner;

import jdk.internal.vm.compiler.word.Pointer;

public class Ex13 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        // int potencia = 1;

        System.out.println("Entre com a base:");
        int base = scan.nextInt();
        System.out.println("Entre com o expoente:");
        int expoente = scan.nextInt();

        // for (int i = 0; i < expoente; i++) {
        // potencia = potencia * base;
        // }
        // System.out.println("Resultado: " + potencia);

        int resultado = base;
        for (int i = 1; i < expoente; i++) {
            resultado *= base;
        }
        System.out.println("Resultado: " + resultado);
    }
}