package Domain.Item;

public class Pocao extends Consumivel {


    public Pocao(String nome, int preco, String[] heroispermitidos, int curarVida, int aumentoForca) {
        super(nome, preco, heroispermitidos, 0, curarVida, aumentoForca);
    }

    public void exibirDetalhes (){

        System.out.println("Nome: " + this.getNome());
        System.out.println("Tipo: Poção");
        System.out.println("Preço: " + this.getPreco());
        System.out.println("Vida: " + this.getCurarVida());
        System.out.println("Força: " + this.getAumentoForca());
    }
}
