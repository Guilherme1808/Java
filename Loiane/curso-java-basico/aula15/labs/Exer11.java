package labs;

import java.util.Scanner;

public class Exer11 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double salarioAtual, reajuste, salarioNovo, aumento;

        System.out.println("Entre com o salário do funcionário:");
        salarioAtual = scan.nextDouble();

        if (salarioAtual < 280) {
            reajuste = 0.2;
            salarioNovo = salarioAtual + (salarioAtual * reajuste);
            aumento = salarioNovo - salarioAtual;
            System.out.println("Salário atual: R$" + salarioAtual + "\nReajuste: " + (reajuste * 100) + "%"
                    + "\nAumento: R$" + aumento + "\nSalário novo: R$" + salarioNovo);
        } else if (salarioAtual >= 280 && salarioAtual < 700) {
            reajuste = 0.15;
            salarioNovo = salarioAtual + (salarioAtual * reajuste);
            aumento = salarioNovo - salarioAtual;
            System.out.println("Salário atual: R$" + salarioAtual + "\nReajuste: " + (reajuste * 100) + "%"
                    + "\nAumento: R$" + aumento + "\nSalário novo: R$" + salarioNovo);
        } else if (salarioAtual >= 700 && salarioAtual < 1500) {
            reajuste = 0.1;
            salarioNovo = salarioAtual + (salarioAtual * reajuste);
            aumento = salarioNovo - salarioAtual;
            System.out.println("Salário atual: R$" + salarioAtual + "\nReajuste: " + (reajuste * 100) + "%"
                    + "\nAumento: R$" + aumento + "\nSalário novo: R$" + salarioNovo);
        } else if (salarioAtual >= 1500) {
            reajuste = 0.05;
            salarioNovo = salarioAtual + (salarioAtual * reajuste);
            aumento = salarioNovo - salarioAtual;
            System.out.println("Salário atual: R$" + salarioAtual + "\nReajuste: " + (reajuste * 100) + "%"
                    + "\nAumento: R$" + aumento + "\nSalário novo: R$" + salarioNovo);
        }
    }
}