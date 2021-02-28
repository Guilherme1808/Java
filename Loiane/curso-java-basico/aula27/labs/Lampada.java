package labs;

public class Lampada {

    String modelo;
    String cor;
    String marca;
    String tipoLuz;
    int tensao;
    int potencia;
    int garantia;

    boolean ligada;

    // void ligarLampada() {
    //     System.out.println("Lâmpada ligada");

    // }

    // void desligarLampada() {
    //     System.out.println("Lâmpada desligada");
    // }

    void ligar() {
        ligada = true;
    }

    void desligar() {
        ligada = false;
    }

    void mostrarEstado() {
        if (ligada) {
            System.out.println("Lâmpada está ligada");
        } else {
            System.out.println("Lâmpada está desligada");
        }
    }

    void mudarEstado() {
        if (ligada) {
            desligar();
        } else {
            ligar();
        }
    }
}