package labs;

public class ContaCorrenteL {

    String numero;
    String agencia;
    double saldo;
    double limiteEspecial;
    boolean especial;
    double valorEspecialUsado;

    boolean realizarSaque(double quantiaASacar) {

        // tem saldo na conta
        if (saldo >= quantiaASacar) {
            saldo -= quantiaASacar;
            return true;
        } else { // não tem saldo na conta
            if (especial) {
                double limite = limiteEspecial + saldo;
                if (limite >= quantiaASacar) {
                    saldo -= quantiaASacar;
                    return true;
                } else {
                    return false;
                }
                // verificar se o limite especial tem saldo
            } else {
                return false; // não é especial e não tem saldo suficiente
            }
        }
    }

    void depositar(double valorDepositado) {
        saldo += valorDepositado;
    }

    void consultarSaldo() {
        System.out.println("Saldo atual da conta = " + saldo);
    }

    boolean verificarUsoChequeEspecial() {
        return saldo < 0;
    }
}