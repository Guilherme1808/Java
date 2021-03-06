package aula34.labs;

import java.util.Scanner;

public class TesteConversaoVolume {

    static void imprimirTela(double num) {
        System.out.println(num);
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Quantos litros deseja converter para centímetros cúbicos?");
        imprimirTela(ConversaoDeUnidadesDeVolume.litrosParacmCubico(scan.nextDouble()));

        System.out.println("Quantos metros cúbicos deseja converter para litros?");
        imprimirTela(ConversaoDeUnidadesDeVolume.metroCubicoParaLitro(scan.nextDouble()));

        System.out.println("Quantos metros cúbicos deseja converter para pés cúbicos?");
        imprimirTela(ConversaoDeUnidadesDeVolume.metroCubicoParaPesCubicos(scan.nextDouble()));

        System.out.println("Quantos galões deseja converter para polegadas cúbicas?");
        imprimirTela(ConversaoDeUnidadesDeVolume.galaoParaPolegadasCubicas(scan.nextDouble()));

        System.out.println("Quantos galões deseja converter para litros?");
        imprimirTela(ConversaoDeUnidadesDeVolume.galaoParaLitros(scan.nextDouble()));
    }
}