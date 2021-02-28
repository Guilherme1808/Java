package labs;

public class ContaCorrente {

    String numero;
    String agencia;
    double saldo;
    double limite;
    boolean especial;

    double fazerSaque(double valor) {
        System.out.println("Você está retirando: " + valor);
        saldo -= valor;
        return saldo;
    }

    double depositar(double valor) {
        System.out.println("Você está depositando: " + valor);
        saldo += valor;
        return saldo;

    }

    void consultarSaldo() {
        System.out.println("Seu saldo atual: " + saldo);
        if (saldo < 0) {
            System.out.println("Você se encontra no cheque especial.");
            especial = true;
        } else {
            especial = false;
        }
        System.out.println();
    }
}