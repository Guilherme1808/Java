package labs;

import java.util.Scanner;

public class Exer02 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        ContaCorrente conta01 = new ContaCorrente();

        int opcao;
        boolean sair = false;

        do {
            System.out.println("Digite 0 para sair");
            System.out.println("Digite 1 para consultar saldo");
            System.out.println("Digite 2 para saque");
            System.out.println("Digite 3 para depósito");

            opcao = scan.nextInt();

            switch (opcao) {
                case 0:
                    System.exit(0);
                    break;
                case 1:
                    conta01.consultarSaldo();
                    break;
                case 2:
                    System.out.println("Entre com o valor do saque:");
                    conta01.fazerSaque(scan.nextDouble());
                    conta01.consultarSaldo();
                    break;
                case 3:
                    System.out.println("Entre com o valor do depósito:");
                    conta01.depositar(scan.nextDouble());
                    conta01.consultarSaldo();
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente!");
            }
        } while (!sair);
    }
}