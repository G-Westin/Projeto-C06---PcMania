package br.inatel.comp;

public class MemoriaUSB {
    private String nome;
    private int capacidade;

    public MemoriaUSB(String nome, int capacidade) {
        this.nome = nome;
        this.capacidade = capacidade;
    }

    // Getters necessários para o mostraPCConfigs()
    public String getNome() {
        return nome;
    }

    public int getCapacidade() {
        return capacidade;
    }

}
