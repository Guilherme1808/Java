package aula35.labs;

public class Exer02 {

    public static int soma(int n) {

        if (n == 1) {
            return 1;
        }
        return n + (soma(n - 1));
    }
}