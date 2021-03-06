package aula34.labs;

import java.util.Scanner;

public class TesteConversaoArea {

    static void imprimirTela(double num) {
        System.out.println(num);
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Quantos metros quadrados deseja converter para pés quadrados?");
        imprimirTela(ConversaoDeUnidadesDeArea.metroParaPes(scan.nextDouble()));

        System.out.println("Quantos pés quadrados deseja converter para centímetros quadrados?");
        imprimirTela(ConversaoDeUnidadesDeArea.peParaCentimetros(scan.nextDouble()));

        System.out.println("Quantas milhas quadradas deseja converter para acres?");
        imprimirTela(ConversaoDeUnidadesDeArea.milhaParaAcres(scan.nextDouble()));

        System.out.println("Quantos acres deseja converter para pés quadrados?");
        imprimirTela(ConversaoDeUnidadesDeArea.acreParaPes(scan.nextDouble()));
    }
}