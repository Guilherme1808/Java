package aula33.labs;

public class Lampada {

    private String modelo;
    private String cor;
    private String marca;
    private String tipoLuz;
    private int tensao;
    private int potencia;
    private int garantia;

    private boolean ligada;

    public Lampada() {
    }

    public Lampada(String modelo, String cor, String marca, String tipoLuz, int tensao, int potencia, int garantia,
            boolean ligada) {
        this.modelo = modelo;
        this.cor = cor;
        this.marca = marca;
        this.tipoLuz = tipoLuz;
        this.tensao = tensao;
        this.potencia = potencia;
        this.garantia = garantia;
        this.ligada = ligada;
    }

    public String getModelo() {
        return modelo;
    }

    public boolean isLigada() {
        return ligada;
    }

    public void setLigada(boolean ligada) {
        this.ligada = ligada;
    }

    public int getGarantia() {
        return garantia;
    }

    public void setGarantia(int garantia) {
        this.garantia = garantia;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public int getTensao() {
        return tensao;
    }

    public void setTensao(int tensao) {
        this.tensao = tensao;
    }

    public String getTipoLuz() {
        return tipoLuz;
    }

    public void setTipoLuz(String tipoLuz) {
        this.tipoLuz = tipoLuz;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void ligar() {
        setLigada(true);
    }

    public void desligar() {
        setLigada(false);
    }

    public void mostrarEstado() {
        if (isLigada()) {
            System.out.println("Lâmpada está ligada");
        } else {
            System.out.println("Lâmpada está desligada");
        }
    }

    public void mudarEstado() {
        if (isLigada()) {
            desligar();
        } else {
            ligar();
        }
    }
}