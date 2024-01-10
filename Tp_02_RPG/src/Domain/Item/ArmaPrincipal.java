package Domain.Item;

public class ArmaPrincipal extends ItemHeroi {

    public ArmaPrincipal(String nome, int preco, String[] heroispermitidos, int ataque, int ataqueEspecial, int ataqueInstant) {
        super(nome, preco, heroispermitidos, ataque, ataqueEspecial, ataqueInstant, 0, 0);
    }

    public void exibirDetalhes (){

        System.out.println("Nome: " + this.getNome());
        System.out.println("Tipo: Arma Principal");
        System.out.println("Preço:" + this.getPreco());


    }


}
