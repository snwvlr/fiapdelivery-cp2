package br.com.fiapdelivery.model;

public class Moto extends Veiculo {

    private boolean bau;

    public Moto(String placa, double capacidadeKg, boolean bau) {
        super(placa, capacidadeKg);
        this.bau = bau;
    }

    public boolean isBau() {
        return this.bau;
    }
}
