package aula35;

public class Calculadora {

    public static double somar(double num1, double num2) {
        return num1 + num2;
    }

    public static double subtrair(double num1, double num2) {
        return num1 - num2;
    }

    public static double multiplicar(double num1, double num2) {
        return num1 * num2;
    }

    public static double dividir(double num1, double num2) {
        return num1 / num2;
    }

    public static double potencia(double a, double b) {
        return Math.pow(a, b);
    }

    public static int fatorialNaoRecursiva(int num) {

        if (num == 0) {
            return 1;
        }
        int total = 1;
        for (int i = num; i > 1; i--) {
            total *= i;
        }
        return total;
    }

    // fatoria(5) = 5 * fatorial(4)
    // fatoria(4) = 4 * fatorial(3)
    // fatoria(3) = 3 * fatorial(2)
    // fatoria(2) = 2 * fatorial(1)
    // fatoria(1) = 1 * fatorial(0)
    // fatoria(0) = 1;
    public static int fatorial(int num) {

        if (num == 0) {
            return 1;
        }
        return num * (fatorial(num - 1));
    }
}