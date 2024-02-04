package Ex_01;

public class Pessoa {


    //definir atributos de instancia
    private String nome;

    private int idade;

    private double altura;


    /**
     * Metodo construtor de Pessoa
     *
     * @param nome   Nome da Pessoa
     * @param idade  Idade da Pessoa
     * @param altura Altura da Pessoa (m.)
     */


    //Atribuir class - Pessoa
    Pessoa(String nome, int idade, double altura) {

        this.nome = nome;
        this.idade = idade;
        this.altura = altura;

    }

    //Dar GET DOS ATRIBUTOS QUE QUEREMOS PASSAR
    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public double getAltura() {
        return altura;
    }
}



