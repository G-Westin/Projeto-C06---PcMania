package br.inatel.comp;

public class SistemaOperacional {
    private String nome;
    private int tipo;

    public SistemaOperacional(String nome, int tipo) {
        this.nome = nome;
        this.tipo = tipo;
    }

    // Getters necessários para o mostraPCConfigs()
    public String getNome() {
        return nome;
    }

    public int getTipo() {
        return tipo;
    }

}
