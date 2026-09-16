package br.inatel.comp;

public class Cliente {
    private String nome;
    private String cpf;
    private Computador[] computadores;

    public Cliente(String nome, String cpf){
        this.nome = nome;
        this.cpf = cpf;
        this.computadores = new Computador[10]; //limite de compras
    }

    public float calculaTotalCompra(){
        float total = 0;
        for(int i = 0; i < computadores.length; i++){
            if(computadores[i] != null){
                total += computadores[i].getPreco();
            }
        }
        return total;
    }

    //getter para main
    public Computador[] getComputadores(){
        return computadores;
    }

    public String getNome(){
        return nome;
    }

    public String getCpf(){
        return cpf;
    }
}
