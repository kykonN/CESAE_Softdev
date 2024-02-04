package AirplaneStore;

public class Aviao {

    private int numeroSerie;

    private String modelo;

    private int anoFabrico;

    private int peso;

    private int fuselagem;

    private int asas;

    private int cauda;

    private int nrMotores;

    private int autonomia;

    private int velocidade;

    private double preco;

    // Construtor
    public Aviao(int numeroSerie, String modelo, int anoFabrico, int peso, int fuselagem, int asas, int cauda, int nrMotores, int autonomia, int velocidade, double preco) {
        this.numeroSerie = numeroSerie;
        this.modelo = modelo;
        this.anoFabrico = anoFabrico;
        this.peso = peso;
        this.fuselagem = fuselagem;
        this.asas = asas;
        this.cauda = cauda;
        this.nrMotores = nrMotores;
        this.autonomia = autonomia;
        this.velocidade = velocidade;
        this.preco = preco;
    }

    public double getPreco() {
        return preco;
    }

    public void exibirDetalhes (){

        System.out.println(this.modelo);
        System.out.println(this.numeroSerie);
        System.out.println(this.anoFabrico);
        System.out.println(this.nrMotores);
        System.out.println(this.autonomia);
        System.out.println(this.velocidade);
        System.out.println(this.preco);
        System.out.println();

    }
}
