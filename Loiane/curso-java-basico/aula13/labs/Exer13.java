package labs;

import java.util.Scanner;

public class Exer13 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double valorHora, horasTrabalhadas, salarioBruto, salarioLiquido, ir, inss, sindicato;

        System.out.println("Entre com o valor hora:");
        valorHora = scan.nextDouble();

        System.out.println("Entre com o número de horas trabalhadas:");
        horasTrabalhadas = scan.nextDouble();

        salarioBruto = valorHora * horasTrabalhadas;
        ir = salarioBruto * 0.11;
        inss = salarioBruto * 0.08;
        sindicato = salarioBruto * 0.05;
        salarioLiquido = salarioBruto - ir - inss - sindicato;

        System.out.println("Salario Bruto: " + salarioBruto);
        System.out.println("INSS: " + inss);
        System.out.println("Sindicato: " + sindicato);
        System.out.println("Salário liquido: " + salarioLiquido);
    }
}
