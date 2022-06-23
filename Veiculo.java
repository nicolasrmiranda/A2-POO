package Avaliacao2_Veiculos;

import java.util.ArrayList;

public abstract class Veiculo {
    protected int anoFabricacao;
    protected int capacidade;
    protected String nomeVeiculo;

    protected String nomeFab;
    protected String paisDeOrig;

    public Veiculo(String nome, int anoFabricacao, int capacidade, String nomeFab, String paisDeOrig) {
        this.nomeVeiculo = nome;
        this.anoFabricacao = anoFabricacao;
        this.capacidade = capacidade;
        this.nomeFab = nomeFab;
        this.paisDeOrig = paisDeOrig;
    }

    public String getNomeFab() {
        return nomeFab;
    }

    public void setNomeFab(String nomeFab) {
        this.nomeFab = nomeFab;
    }

    public String getPaisDeOrig() {
        return paisDeOrig;
    }

    public void setPaisDeOrig(String paisDeOrig) {
        this.paisDeOrig = paisDeOrig;
    }

    public String getNome() {
        return nomeVeiculo;
    }

    public void setNome(String nome) {
        this.nomeVeiculo = nome;
    }

    public int getAnoFabricacao() {
        return anoFabricacao;
    }

    public void setAnoFabricacao(int anoFabricacao) {
        if(anoFabricacao < 0 )
            throw new IllegalArgumentException(
                   "Acho que não existia nenhum veículo automatizado nessa época...");
        this.anoFabricacao = anoFabricacao;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        if(capacidade < 0 )
            throw new IllegalArgumentException(
                    "Capacidade inválida.");
        this.capacidade = capacidade;
    }

    public abstract void acelerar();

    public abstract void mostrarDetalhes();

}