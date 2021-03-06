package aula34.labs;

public class ConversaoDeUnidadesDeTempo {

    public static double minutosParaSegundos(double minuto) {
        return (minuto * 60);
    }

    public static double horasParaMinutos(double hora) {
        return (hora * 60);
    }

    public static double diasParaHoras(double dia) {
        return (dia * 24);
    }

    public static double semanasParaDias(double semana) {
        return (semana * 7);
    }

    public static double mesesParaDias(double mes) {
        return (mes * 30);
    }

    public static double anosParaDias(double ano) {
        return (ano * 365.25);
    }
}