package Ex_07;

public class Livro {


    //7. Crie uma classe chamada "Livro" com os seguintes atributos: título, autor, categoria, número de páginas e
    //ISBN. Em seguida, crie um método na classe "Livro" chamado "exibirDetalhes" que imprime na consola
    //todos os atributos do livro. De seguida, crie dois objetos da classe "Livro" e invoque o método
    //"exibirDetalhes" para cada um deles.


    //1- Definir atributos a definir para o objeto;
    //2- Metodo construtor
    //3- lista de comportamento ou metodo;

    private String titulo;

    private String autor;

    private String categoria;

    private int ISBN;


    public Livro(String titulo, String autor, String categoria, int ISBN) {
        this.titulo = titulo;
        this.autor = autor;
        this.categoria = categoria;
        this.ISBN = ISBN;
    }

    public void exibirDetalhes (){

        System.out.println(this.titulo);
        System.out.println(this.autor);
        System.out.println(this.categoria);
        System.out.println(this.ISBN);



    }
}
