package Domain.Item;

public class ConsumivelCombate extends Consumivel {



    public ConsumivelCombate(String nome, int preco, String[] heroispermitidos, int ataqueInstant, int curarVida, int aumentoForca) {
        super(nome, preco, heroispermitidos, ataqueInstant, curarVida, aumentoForca);
    }

    public void exibirDetalhes (){

        System.out.println("Nome: " + this.getNome());
        System.out.println("Tipo: Consumivel de Combate");
        System.out.println("Preço: " + this.getPreco());
        System.out.println("Ataque Instantaneo: " + this.getAtaqueInstant());
    }
}
