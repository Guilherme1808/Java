package labs;

import java.util.Scanner;

public class Exer14 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double arquivo, internet, download;

        System.out.println("Coloque em MB o tamanho do arquivo para downoad: ");
        arquivo = scan.nextDouble();

        System.out.println("Coloqueo em MB a velocidade do link de Internet:");
        internet = scan.nextDouble();

        download = arquivo / internet;

        System.out.println(download + " minutos para terminar o download.");
    }
}