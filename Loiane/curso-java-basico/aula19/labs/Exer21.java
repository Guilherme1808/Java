package labs;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exer21 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com a cotação do dólar:");
        double dolar = scan.nextDouble();

        double[] A = new double[20];

        for (int i = 0; i < A.length; i++) {
            A[i] = dolar * (i + 1);
        }

        DecimalFormat df = new DecimalFormat("###,###.##");

        System.out.println("A = ");
        for (int i = 0; i < A.length; i++) {
            System.out.println(df.format(A[i]));
        }
        System.out.println();
    }
}