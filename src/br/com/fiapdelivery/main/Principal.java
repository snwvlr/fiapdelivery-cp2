package br.com.fiapdelivery.main;

import br.com.fiapdelivery.model.Caminhao;
import br.com.fiapdelivery.model.Moto;
import br.com.fiapdelivery.model.Pacote;
import br.com.fiapdelivery.model.Rota;

public class Principal {

    public static void main(String[] args) {
        System.out.println("--- FiapDelivery ---");

        Caminhao caminhao = new Caminhao("ABC1234", 500.0, 2);
        Moto moto = new Moto("DEF5678", 20.0, true);

        System.out.println("Caminhão: " + caminhao.getPlaca()
                + " | Capacidade: " + caminhao.getCapacidadeKg() + " kg"
                + " | Eixos: " + caminhao.getQuantidadeEixos());
        System.out.println("Moto: " + moto.getPlaca()
                + " | Capacidade: " + moto.getCapacidadeKg() + " kg");
        if (moto.isBau()) {
            System.out.println("A moto possui baú.");
        }

        Pacote pacoteCaminhao = new Pacote("BR999", 10.5);
        Pacote pacoteMoto = new Pacote("BR1000", 5.0);

        Rota rotaCaminhao = new Rota(pacoteCaminhao, caminhao);
        Rota rotaMoto = new Rota(pacoteMoto, moto);

        System.out.println("\nEntrega com caminhão:");
        rotaCaminhao.realizarEntrega();

        System.out.println("\nEntrega com moto:");
        rotaMoto.realizarEntrega();

        System.out.println("\nTentativa de cadastrar capacidade negativa:");
        new Caminhao("GHI9012", -500.0, 2);
    }
}
