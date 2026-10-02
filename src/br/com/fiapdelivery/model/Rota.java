package br.com.fiapdelivery.model;

public class Rota {

    private Pacote pacoteTransportado;
    private Veiculo veiculoUtilizado;

    public Rota(Pacote pacoteTransportado, Veiculo veiculoUtilizado) {
        this.setPacoteTransportado(pacoteTransportado);
        this.setVeiculoUtilizado(veiculoUtilizado);
    }

    public Pacote getPacoteTransportado() {
        return this.pacoteTransportado;
    }

    public Veiculo getVeiculoUtilizado() {
        return this.veiculoUtilizado;
    }

    public void realizarEntrega() {
        if (this.pacoteTransportado == null || this.veiculoUtilizado == null) {
            System.out.println("Erro: A rota precisa de um pacote e um veículo.");
            return;
        }

        if (this.pacoteTransportado.getCodigo() == null || this.veiculoUtilizado.getPlaca() == null) {
            System.out.println("Erro: O pacote precisa de código e o veículo precisa de placa.");
            return;
        }

        if (this.pacoteTransportado.getPesoKg() <= 0 || this.veiculoUtilizado.getCapacidadeKg() <= 0) {
            System.out.println("Erro: O peso do pacote e a capacidade do veículo devem ser maiores que zero.");
            return;
        }

        if (this.pacoteTransportado.getPesoKg() > this.veiculoUtilizado.getCapacidadeKg()) {
            System.out.println("Erro: O peso do pacote ultrapassa a capacidade do veículo.");
            return;
        }

        System.out.println("Levando pacote " + this.pacoteTransportado.getCodigo()
                + " no veículo " + this.veiculoUtilizado.getPlaca());
        this.pacoteTransportado.atualizarStatus("Em transporte");
        System.out.println("Status do pacote: " + this.pacoteTransportado.getStatus());
    }

    private void setPacoteTransportado(Pacote pacoteTransportado) {
        if (pacoteTransportado != null) {
            this.pacoteTransportado = pacoteTransportado;
        } else {
            System.out.println("Erro: A rota precisa de um pacote.");
        }
    }

    private void setVeiculoUtilizado(Veiculo veiculoUtilizado) {
        if (veiculoUtilizado != null) {
            this.veiculoUtilizado = veiculoUtilizado;
        } else {
            System.out.println("Erro: A rota precisa de um veículo.");
        }
    }
}
