package labs;

import java.util.Scanner;

public class Exer12 {

    public static void main(String[] args) {

        double salarioBruto, salarioLiquido, valorHora, horasTrabalhadas, descontos;
        double ir = 0;
        double irValor = 0;
        double inss = 0.1;
        double inssValor = 0;
        double fgts = 0.11;
        double fgtsValor = 0;

        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com o valor hora do funcionário:");
        valorHora = scan.nextDouble();
        System.out.println("Entre com a quantidade de horas trabalhadas no mês:");
        horasTrabalhadas = scan.nextDouble();

        salarioBruto = valorHora * horasTrabalhadas;
        if (salarioBruto <= 900) {
            ir = 0;
            irValor = salarioBruto * ir;
        } else if (salarioBruto > 900 && salarioBruto <= 1500) {
            ir = 0.05;
            irValor = salarioBruto * ir;
        } else if (salarioBruto > 1500 && salarioBruto <= 2500) {
            ir = 0.1;
            irValor = salarioBruto * ir;
        } else if (salarioBruto > 2500) {
            ir = 0.2;
            irValor = salarioBruto * ir;
        }

        inssValor = salarioBruto * inss;
        fgtsValor = salarioBruto * fgts;
        descontos = inssValor + irValor;
        salarioLiquido = salarioBruto - descontos;

        System.out.println("Salário Bruto: (" + valorHora + " * " + horasTrabalhadas + ")\t: R$ " + salarioBruto);
        System.out.println("(-) IR (" + ir * 100 + "%)\t\t\t: R$ " + irValor);
        System.out.println("(-) INSS (10%) \t\t\t: R$ " + inssValor);
        System.out.println("FGTS (11%) \t\t\t: R$ " + fgtsValor);
        System.out.println("Total de descontos \t\t: R$ " + descontos);
        System.out.println("Salário Liquido \t\t: R$ " + salarioLiquido);
    }
}