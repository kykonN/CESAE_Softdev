package Ex_08;

public class Aluno {

    //8. Crie uma classe Aluno que tenha os atributos nome, idade, curso e média.
    //a. Crie um construtor que receba os quatro atributos como parâmetros.
    //b. Crie um método chamado situacao que retorne "Aprovado" se a média for maior ou igual a 9.5,
    //"Reprovado" caso contrário.
    //c. No método main, crie um objeto dessa classe e apresente a situação do aluno


    //1- Definir atributos a definir para o objeto;
    //2- Metodo construtor
    //3- lista de comportamento ou metodo;

    //1- Definir atributos a definir para o objeto;
   private String nome;

    private String idade;

    private String curso;

    private double media;


    //2- Metodo construtor


    public Aluno(String nome, String idade, String curso) {
        this.nome = nome;
        this.idade = idade;
        this.curso = curso;

    }


    //3- lista de comportamento ou metodo

    public void medialuno(double media){

        if (media>=9.5){
           System.out.println("Aprovado");
        }else {
            System.out.println("Reprovado");
        }
    }
}
