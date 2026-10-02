package br.com.fiapdelivery.model;

public class Veiculo {

    private String placa;
    private double capacidadeKg;

    public Veiculo(String placa, double capacidadeKg) {
        this.setPlaca(placa);
        this.setCapacidadeKg(capacidadeKg);
    }

    public String getPlaca() {
        return this.placa;
    }

    public double getCapacidadeKg() {
        return this.capacidadeKg;
    }

    private void setPlaca(String placa) {
        if (placa != null && !placa.trim().isEmpty()) {
            this.placa = placa.trim();
        } else {
            System.out.println("Erro: A placa não pode ficar vazia.");
        }
    }

    private void setCapacidadeKg(double capacidadeKg) {
        if (capacidadeKg > 0) {
            this.capacidadeKg = capacidadeKg;
        } else {
            System.out.println("Erro: A capacidade deve ser um número maior que zero.");
        }
    }
}
