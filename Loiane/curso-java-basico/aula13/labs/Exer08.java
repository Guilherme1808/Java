package labs;

import java.util.Scanner;

public class Exer08 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double hora, valorHora, salario;

        System.out.println("Entre com o valor que você ganha por hora:");
        hora = scan.nextDouble();

        System.out.println("Entre com o número de horas trabalhadas no mês:");
        valorHora = scan.nextDouble();

        salario = hora * valorHora;
        System.out.println("Salário do mês: " + salario);
    }
}