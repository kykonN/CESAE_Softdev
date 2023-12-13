package Ex_09;

//9. Crie uma classe Produto que tenha os atributos nome, preço e quantidade em stock (deve ser inicializada a
//0), e os métodos comprar e vender, que recebam a quantidade desejada como parâmetro e atualizem o
//stock.
//a. Para vender um produto, deve analisar se existe stock suficiente. Caso exista stock suficiente deve
//atualizar o stock. Caso não exista stock suficiente deve informar o utilizador que tal transação não
//é possível por quebra de stock do produto.
//b. No método main, crie um objeto dessa classe Produto e chame o método para comprar 5
//unidades.
//c. Invoque o método para vender 2 unidades, e imprima a quantidade de stock.
//d. Invoque o método para comprar 10 unidades.
//e. Invoque o método para vender 35 unidades
public class Produto {


    //1- Definir atributos a definir para o objeto;
    //2- Metodo construtor
    //3- lista de comportamento ou metodo;


    //ATRIBUTOS

    private String nome;

    private double preco;

    private int quantidade = 0;


    //METODOS


    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }


    public int comprar(int valor) {

        this.quantidade = this.quantidade + valor;
        return this.quantidade;
    }

    public void venda(int valor) {

        this.quantidade = this.quantidade - valor;

        if (this.quantidade > 0) {
            System.out.println("Venda concluida");
        } else {
            System.out.println("Venda não concluida, Stock insuficiente ");
        }
    }

    public int getQuantidade() {
        return quantidade;
    }
}





