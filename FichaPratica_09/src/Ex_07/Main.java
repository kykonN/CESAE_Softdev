package Ex_07;

public class Main {

    //7. Crie uma classe chamada "Livro" com os seguintes atributos: título, autor, categoria, número de páginas e
    //ISBN. Em seguida, crie um método na classe "Livro" chamado "exibirDetalhes" que imprime na consola
    //todos os atributos do livro. De seguida, crie dois objetos da classe "Livro" e invoque o método
    //"exibirDetalhes" para cada um deles.

    public static void main(String[] args) {

        Livro livro_01 = new Livro("Crime do Pade amado","J.K.Rolling","Religião",8417);

        Livro livro_02 = new Livro("Homem nu com a faca no bolso","Pedro Padre Pisco Pascual","Realismo",9213);

        // invocar o metodo;

        livro_01.exibirDetalhes();

        livro_02.exibirDetalhes();

    }

}
