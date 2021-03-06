package aula35.labs;

public class Exer01 {

    public static int fibonacci(int n) {

        if (n < 2) {
            return 1;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}