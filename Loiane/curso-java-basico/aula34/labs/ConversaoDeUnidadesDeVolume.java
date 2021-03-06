package aula34.labs;

public class ConversaoDeUnidadesDeVolume {

    public static double litrosParacmCubico(double litro) {
        return (litro * 1000);
    }

    public static double metroCubicoParaLitro(double metro) {
        return (metro * 1000);
    }

    public static double metroCubicoParaPesCubicos(double metro) {
        return (metro * 35.32);
    }

    public static double galaoParaPolegadasCubicas(double galao) {
        return (galao * 231);
    }

    public static double galaoParaLitros(double galao) {
        return (galao * 3.785);
    }
}