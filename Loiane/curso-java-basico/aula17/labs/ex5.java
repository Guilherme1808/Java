package labs;

import java.util.Scanner;

public class Ex5 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int anos = 0;
        int paisA = 0;
        int paisB = 0;
        double txA = 0;
        double txB = 0;

        while (paisA <= 0) {
            System.out.println("Entre com a população do país A:");
            paisA = scan.nextInt();
        }
        while (paisB <= 0) {
            System.out.println("Entre com a população do país B:");
            paisB = scan.nextInt();
        }

        while (txA <= 0) {
            System.out.println("Entre com a taxa de crescimento do país A:");
            txA = scan.nextDouble();
        }
        while (txB <= 0) {
            System.out.println("Entre com a taxa de crescimento do país B:");
            txB = scan.nextDouble();
        }

        if (paisA < paisB) {
            while (paisA < paisB) {
                paisA = (int) (paisA + ((paisA * txA) / 100));
                paisB = (int) (paisB + ((paisB * txB) / 100));
                anos++;
            }
        } else if (paisB < paisA) {
            while (paisB < paisA) {
                paisA = (int) (paisA + ((paisA * txA) / 100));
                paisB = (int) (paisB + ((paisB * txB) / 100));
                anos++;
            }
        }
        System.out.println("País A: " + paisA);
        System.out.println("País B: " + paisB);
        System.out.println("anos: " + anos);
    }
}