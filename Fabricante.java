package Avaliacao2_Veiculos;

public class Fabricante {

    private String nome;
    private String paisDeOrigem;

    public Fabricante(String nome, String paisDeOrigem) {
        this.nome = nome;
        this.paisDeOrigem = paisDeOrigem;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPaisDeOrigem() {
        return paisDeOrigem;
    }

    public void setPaisDeOrigem(String paisDeOrigem) {
        this.paisDeOrigem = paisDeOrigem;
    }

    @Override
    public String toString() {
        return this.nome + " ("
                + this.paisDeOrigem +
                ')';
    }
}
