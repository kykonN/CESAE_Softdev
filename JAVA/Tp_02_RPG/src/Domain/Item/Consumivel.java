package Domain.Item;

public class Consumivel extends ItemHeroi {



    public Consumivel(String nome, int preco, String[] heroispermitidos, int ataqueInstant, int curarVida, int aumentoForca) {
        super(nome, preco, heroispermitidos, 0, 0, ataqueInstant, curarVida, aumentoForca);
    }
}
