package Avaliacao2_Veiculos;

public class Aviao extends Veiculo {
    private int numTurbinas;
    public Aviao(String nomeAviao, int anoFabricacao, int capacidade, String nomeFab, String paisDeOrig, int numTurbinas) {
        super(nomeAviao, anoFabricacao, capacidade, nomeFab, paisDeOrig);
        this.numTurbinas = numTurbinas;
    }
    public int getNumTurbinas() {
        return numTurbinas;
    }
    public void setNumTurbinas(int numTurbinas) {
        this.numTurbinas = numTurbinas;
    }
    @Override
    public void acelerar() {
        System.out.println("Atencao senhores passageiros \nIremos pilotar a toda velocidade. \nCaso alguem passe mal, por favor, o dirijam-se ao lavabo mais proximo. \nObrigado.");
    }
    @Override
    public void mostrarDetalhes() {
        System.out.println("O modelo " + getNome() + ", produzido pela empresa " + getNomeFab()
                + ", no ano de '" + getAnoFabricacao()
                + "' (" + getPaisDeOrig() + ") "
                + ", possui a capacidade de " + getCapacidade() + " passageiros."
                + " O aviao possui " + getNumTurbinas() + " turbinas!");
    }
    public void decolar(){
        System.out.println("Estamos decolando!");
    }
    public void pousar(){
        System.out.println("Atenção senhores passageiros\nIremos pousar.");
    }
}