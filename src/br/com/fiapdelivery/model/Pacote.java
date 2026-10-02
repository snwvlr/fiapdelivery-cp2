package br.com.fiapdelivery.model;

public class Pacote {

    private String codigo;
    private double pesoKg;
    private String status;

    public Pacote(String codigo, double pesoKg) {
        this.setCodigo(codigo);
        this.setPesoKg(pesoKg);
        this.status = "Pendente";
    }

    public String getCodigo() {
        return this.codigo;
    }

    public double getPesoKg() {
        return this.pesoKg;
    }

    public String getStatus() {
        return this.status;
    }

    public void atualizarStatus(String novoStatus) {
        if (novoStatus == null || novoStatus.trim().isEmpty()) {
            System.out.println("Erro: O status não pode ficar vazio.");
            return;
        }
        this.status = novoStatus.trim();
    }

    private void setCodigo(String codigo) {
        if (codigo != null && !codigo.trim().isEmpty()) {
            this.codigo = codigo.trim();
        } else {
            System.out.println("Erro: O código do pacote não pode ficar vazio.");
        }
    }

    private void setPesoKg(double pesoKg) {
        if (pesoKg > 0) {
            this.pesoKg = pesoKg;
        } else {
            System.out.println("Erro: O peso deve ser um número maior que zero.");
        }
    }
}
