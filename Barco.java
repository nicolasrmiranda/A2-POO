package Avaliacao2_Veiculos;

public class Barco extends Veiculo {
    private int numVelas;
    public Barco(String nomeBarco, int anoFabricacao, int capacidade, String nomeFab, String paisDeOrig, int numVelas) {
        super(nomeBarco, anoFabricacao, capacidade, nomeFab, paisDeOrig);
        this.numVelas = numVelas;
    }
    public int getNumVelas() {
        return numVelas;
    }
    public int setNumVelas(int numVelas) {
        this.numVelas = numVelas;
        return numVelas;
    }

    @Override
    public void acelerar() {
        System.out.println("AJUSTEM AS VELAS! \nIREMOS A TODA VELoCIDADE!");
    }

    @Override
    public void mostrarDetalhes() {
        System.out.println("O modelo " + getNome()
                + ", produzido pela empresa " + getNomeFab()
                + ", no ano de'" + getAnoFabricacao()
                + "' (" + getPaisDeOrig() + ") "
                + ", tem capacidade para " + getCapacidade() + " passageiros."
                + " O barco possui " + getNumVelas() + " velas.");
    }

    /*IÇAR VELAS É A MESMA COISA QUE RECOLHER VELAS, então arrumei*/
    public void descerVelas() {
        System.out.println("Marujos, DESCAM VELAS! Iremos navegar...");
        System.out.println("Velas descidas, capitão!");
    }
    public void icarVelas(){
        System.out.println("TERRA A VISTA! Icar velas!");
    }
}