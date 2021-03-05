package aula33.labs;

public class ContaCorrente {

    private String numero;
    private String agencia;
    private double saldo;
    private double limite;
    private double limiteEspecial;
    private boolean especial;
    private double valorEspecialUsado;

    public ContaCorrente() {
    }

    public ContaCorrente(String numero, String agencia, double saldo, double limite, double limiteEspecial,
            boolean especial, double valorEspecialUsado) {
        this.numero = numero;
        this.agencia = agencia;
        this.saldo = saldo;
        this.limite = limite;
        this.limiteEspecial = limiteEspecial;
        this.especial = especial;
        this.valorEspecialUsado = valorEspecialUsado;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        setNumero(numero);
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        setAgencia(agencia);
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        setSaldo(saldo);
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        setLimite(limite);
    }

    public double getLimiteEspecial() {
        return limiteEspecial;
    }

    public void setLimiteEspecial(double limiteEspecial) {
        setLimiteEspecial(limiteEspecial);
    }

    public boolean isEspecial() {
        return especial;
    }

    public void setEspecial(boolean especial) {
        setEspecial(especial);
    }

    public double getValorEspecialUsado() {
        return valorEspecialUsado;
    }

    public void setValorEspecialUsado(double valorEspecialUsado) {
        setValorEspecialUsado(valorEspecialUsado);
    }

    public boolean realizarSaque(double quantiaASacar) {

        // tem saldo na conta
        if (this.saldo >= quantiaASacar) {
            this.saldo -= quantiaASacar;
            return true;
        } else { // não tem saldo na conta
            if (isEspecial()) {
                double limite = getLimiteEspecial() + getSaldo();
                if (limite >= quantiaASacar) {
                    setSaldo(-quantiaASacar);
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

    public void depositar(double valorDepositado) {
        this.saldo += valorDepositado;
    }

    public void consultarSaldo() {
        System.out.println("Saldo atual da conta = " + getSaldo());
    }

    public boolean verificarUsoChequeEspecial() {
        return this.saldo < 0;
    }
}