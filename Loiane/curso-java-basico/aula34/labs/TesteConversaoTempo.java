package aula34.labs;

import java.util.Scanner;

public class TesteConversaoTempo {

    static void imprimirTela(double num) {
        System.out.println(num);
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Quantos minutos deseja converter para segundos?");
        imprimirTela(ConversaoDeUnidadesDeTempo.minutosParaSegundos(scan.nextDouble()));

        System.out.println("Quantas horas deseja converter para minutos?");
        imprimirTela(ConversaoDeUnidadesDeTempo.horasParaMinutos(scan.nextDouble()));

        System.out.println("Quantos dias deseja converter para horas?");
        imprimirTela(ConversaoDeUnidadesDeTempo.diasParaHoras(scan.nextDouble()));

        System.out.println("Quantas semanas deseja converter para dias?");
        imprimirTela(ConversaoDeUnidadesDeTempo.semanasParaDias(scan.nextDouble()));

        System.out.println("Quantos meses deseja converter para dias?");
        imprimirTela(ConversaoDeUnidadesDeTempo.mesesParaDias(scan.nextDouble()));

        System.out.println("Quantos anos deseja converter para dias?");
        imprimirTela(ConversaoDeUnidadesDeTempo.anosParaDias(scan.nextDouble()));
    }
}