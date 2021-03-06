package aula34.labs;

import java.util.Scanner;

public class TesteCalculadora {

    static void imprimirTela(double num) {
        System.out.println(num);
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int menu;

        do {
            System.out.println(
                    "Entre com: \n1- Soma\n2- Subtração\n3- Multiplicação\n4- Divisão\n5- Potência\n6- Fatorial\n0- Sair ");
            menu = scan.nextInt();
            switch (menu) {
            case 0:
                System.out.println("Programa encerrado.");
                break;
            case 1:
                System.out.println("Entre com os números da soma:");
                imprimirTela(Calculadora.somar(scan.nextDouble(), scan.nextDouble()));

                break;
            case 2:
                System.out.println("Entre com os números da subtração:");
                imprimirTela(Calculadora.subtrair(scan.nextDouble(), scan.nextDouble()));
                break;
            case 3:
                System.out.println("Entre com os números da multiplicação:");
                imprimirTela(Calculadora.multiplicar(scan.nextDouble(), scan.nextDouble()));
                break;
            case 4:
                System.out.println("Entre com os números da divisão:");
                imprimirTela(Calculadora.dividir(scan.nextDouble(), scan.nextDouble()));
                break;
            case 5:
                System.out.println("Entre com os números da base da potência e do expoente:");
                imprimirTela(Calculadora.potencia(scan.nextDouble(), scan.nextDouble()));
                break;
            case 6:
                System.out.println("Entre com o número que deseja obter o fatorial:");
                imprimirTela(Calculadora.fatorial(scan.nextInt()));
                break;
            default:
                System.out.println("Opção inválida. Tente novamente!");
            }
        } while (menu != 0);
    }
}