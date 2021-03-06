package aula34.labs;

public class Contador {

    private static int cont;

    public Contador() {
        cont++;
    }

    public static void zerar() {
        cont = 0;
    }

    public static void incrementar() {
        cont++;
    }

    public static int retornar() {
        return cont;
    }
}