package Avaliacao2_Veiculos;

public class Automovel extends Veiculo {
    private int diametroRoda;
    public Automovel(String nomeAutomovel, int anoFabricacao, int capacidade, String nomeFab, String paisDeOrig, int diametroRoda) {
        super(nomeAutomovel, anoFabricacao, capacidade, nomeFab, paisDeOrig);
        this.diametroRoda = diametroRoda;
    }
    public int getDiametroRoda() {
        return diametroRoda;
    }
    public void setDiametroRoda(int diametroRoda) {
        this.diametroRoda = diametroRoda;
    }
    public void abrirPortaMalas(){
        System.out.println("Abrindo porta-malas...\nPorta-malas aberto.");
    }
    @Override
    public void acelerar() {
        System.out.println("Taca-lhe pau nesse carrinho, marco!");
    }
    @Override
    public void mostrarDetalhes() {
            System.out.println("O modelo de automóvel " + getNome() + ", produzido pela empresa " + getNomeFab()
                + ", no ano de '" + getAnoFabricacao()
                + "' (" + getPaisDeOrig() + ") "
                + ", possui a capacidade de " + getCapacidade() + " passageiros."
                + " Suas rodas possuem o diametro de " + getDiametroRoda() + " centimetros!");
        }
    }