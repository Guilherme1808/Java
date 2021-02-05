package labs;

import java.util.Scanner;

public class Ex3 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String nome;
        int idade;
        double salario;
        String sexo;
        boolean sx = false;
        String estadoCivil;
        boolean ec = false;

        do {
            System.out.println("Entre com o nome:");
            nome = scan.next();
        } while (nome.length() < 3);

        do {
            System.out.println("Entre com a idade:");
            idade = scan.nextInt();
        } while (idade < 0 || idade > 150);

        do {
            System.out.println("Entre com o salário:");
            salario = scan.nextDouble();
        } while (salario <= 0);

        do {
            System.out.println("Entre com o sexo ('f'ou 'm'):");
            sexo = scan.next();

            if (sexo.equalsIgnoreCase("f")) {
                sx = true;
                sexo = "Feminino.";

            } else if (sexo.equalsIgnoreCase("m")) {
                sx = true;
                sexo = "Masculino.";
            } else {
                System.out.println("Sexo inválido.");
            }
        } while (!sx);

        do {
            System.out.println("Entre com o estado cível ('s','c','v','d')");
            estadoCivil = scan.next();

            if (estadoCivil.equalsIgnoreCase("s")) {
                ec = true;
                estadoCivil = "Solteiro(a).";
            } else if (estadoCivil.equalsIgnoreCase("c")) {
                ec = true;
                estadoCivil = "Casado(a).";
            } else if (estadoCivil.equalsIgnoreCase("v")) {
                ec = true;
                estadoCivil = "Viúvo(a).";
            } else if (estadoCivil.equalsIgnoreCase("d")) {
                ec = true;
                estadoCivil = "Divorciado(a).";
            } else {
                System.out.println("Estado cível não correspondente.");
            }
        } while (!ec);

        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Salário: " + salario);
        System.out.println("Sexo: " + sexo);
        System.out.println("Estado cível: " + estadoCivil);

    }
}