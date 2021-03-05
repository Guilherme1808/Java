package aula33.labs;

public class TesteLampada {

    public static void main(String[] args) {
        
        Lampada lampada = new Lampada(null, null, null, null, 0, 0, 0, false);

        lampada.ligar();

        lampada.mostrarEstado();

        lampada.desligar();

        lampada.mostrarEstado();

        lampada.mudarEstado();

        lampada.mostrarEstado();
    }
}