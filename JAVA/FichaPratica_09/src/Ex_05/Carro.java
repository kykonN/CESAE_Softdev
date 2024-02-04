package Ex_05;

public class Carro {

    //5-Crie uma classe chamada "Carro" com os seguintes atributos: marca, modelo e ano de fabrico.
    //a. Crie um método na classe "Carro" chamado "ligar" que imprime a mensagem "O carro está
    //ligado".
    //b. Crie um objeto da classe "Carro" e invoque o método "ligar"


    //1- Definir atributos a definir para o objeto;
    //2- Metodo construtor para perimetro e area do retangulo;
    //3- lista de comportamento ou metodo;
    /* ----------------------------------------------------------------------------------------------------------------*/

private String marca;

private String modelo;

private int ano;

    public Carro(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    public void ligar (){
        System.out.println("O carro está ligado");

    }
}





