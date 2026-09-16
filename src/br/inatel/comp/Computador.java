package br.inatel.comp;

public class Computador {
    private String marca;
    private float preco;
    private SistemaOperacional so;
    private HardwareBasico[] hw;
    private MemoriaUSB musb;

    // Construtor
    public Computador(String marca, float preco, String soNome, int soTipo) {
        this.marca = marca;
        this.preco = preco;
        this.so = new SistemaOperacional(soNome, soTipo);
        this.hw = new HardwareBasico[10]; // limite hipotetico de peças
    }

    // metodo para nao quebrar a composicao
    public void addHardware(String nome, float capacidade) {
        // CORREÇÃO 1: hw.length (escrita correta)
        for(int i = 0; i < hw.length; i++) {
            if(hw[i] == null) {
                hw[i] = new HardwareBasico(nome, capacidade);
                break;
            }
        }
    }

    // Agregacao
    // CORREÇÃO 2: parâmetro renomeado para musb para bater com o this.musb
    public void addMemoriaUSB(MemoriaUSB musb) {
        this.musb = musb; // CORREÇÃO 2: faltava o ponto
    }

    // CORREÇÃO 3: mostraPCConfigs (C maiúsculo para seguir o UML)
    public void mostraPCConfigs() {
        System.out.println("Marca: " + marca);
        System.out.println("Preco: " + preco);
        System.out.println("Sistema Operacional: " + so.getNome() + " (" + so.getTipo() + " Bits)");
        System.out.println("Hardware Basicos: ");
        for(int i = 0; i < hw.length; i++) {
            if(hw[i] != null) {
                System.out.println(" - " + hw[i].getNome() + " (Capacidade: " + hw[i].getCapacidade() + ")");
            }
        }
        if(musb != null) {
            // CORREÇÃO 3: musb.getNome() com N maiúsculo
            System.out.println("Acompanha Memoria USB: " + musb.getNome() + " (Capacidade: " + musb.getCapacidade() + "Gb)");
        }
    }

    // Getter para acesso ao calculo total
    public float getPreco() {
        return preco;
    }
}