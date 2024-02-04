package Domain.Item;

public abstract class ItemHeroi {

    private String nome;


    private int preco;

    String[] heroisPermitidos;

    private int ataque ;

    private int ataqueEspecial;

    private int ataqueInstant;


    private int curarVida;

    private int aumentoForca;

    public ItemHeroi(String nome, int preco, String[] heroispermitidos, int ataque, int ataqueEspecial, int ataqueInstant, int curarVida, int aumentoForca) {
        this.nome = nome;
        this.preco = preco;
        this.ataque = ataque;
        this.ataqueEspecial = ataqueEspecial;
        this.ataqueInstant = ataqueInstant;
        this.curarVida = curarVida;
        this.aumentoForca = aumentoForca;
        this.heroisPermitidos=heroispermitidos;
    }


    public String getNome() {
        return nome;
    }

    public int getPreco() {
        return preco;
    }

    public String[] getHeroisPermitidos() {
        return heroisPermitidos;
    }

    public int getAtaque() {
        return ataque;
    }

    public int getAtaqueEspecial() {
        return ataqueEspecial;
    }

    public int getAtaqueInstant() {
        return ataqueInstant;
    }

    public int getCurarVida() {
        return curarVida;
    }

    public int getAumentoForca() {
        return aumentoForca;
    }


    public void exibirDetalhes (){

        System.out.println("Nome: " + this.nome );
        System.out.println("Preço:" + this.preco);

    }
}
