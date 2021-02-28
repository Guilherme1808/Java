package labs;

public class Exer01 {

    public static void main(String[] args) {

        Lampada lampada = new Lampada();

        // lampada.ligarLampada();
        // System.out.println("----");
        // lampada.desligarLampada();

        lampada.ligar();

        lampada.mostrarEstado();

        lampada.desligar();

        lampada.mostrarEstado();

        lampada.mudarEstado();

        lampada.mostrarEstado();
    }
}