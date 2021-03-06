package aula34.labs;

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

    public static int fatorial(int num1) {
        int f = 1;
        if (num1 == 0) {
            return 1;
        } else {
            for (int i = 1; i <= num1; i++) {
                f = f * i;
            }
            return f;
        }
    }
}