package br.inatel.comp;

public class HardwareBasico {
    private String nome;
    private float capacidade;

    public HardwareBasico(String nome, float capacidade) {
        this.nome = nome;
        this.capacidade = capacidade;
    }

    // Getters necessários para o mostraPCConfigs()
    public String getNome() {
        return nome;
    }

    public float getCapacidade() {
        return capacidade;
    }

}
