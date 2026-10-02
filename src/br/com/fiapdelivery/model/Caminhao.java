package br.com.fiapdelivery.model;

public class Caminhao extends Veiculo {

    private int quantidadeEixos;

    public Caminhao(String placa, double capacidadeKg, int quantidadeEixos) {
        super(placa, capacidadeKg);
        this.setQuantidadeEixos(quantidadeEixos);
    }

    public int getQuantidadeEixos() {
        return this.quantidadeEixos;
    }

    private void setQuantidadeEixos(int quantidadeEixos) {
        if (quantidadeEixos >= 2) {
            this.quantidadeEixos = quantidadeEixos;
        } else {
            System.out.println("Erro: O caminhão deve ter pelo menos dois eixos.");
        }
    }
}
