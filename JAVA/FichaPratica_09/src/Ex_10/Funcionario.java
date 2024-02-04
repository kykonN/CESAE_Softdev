package Ex_10;
//10. Crie uma classe Funcionário que tenha os atributos nome, salário e departamento, e os métodos
//aumentarSalario e exibirDados.
//a. O método aumentarSalario deve receber um valor percentual (número real) como parâmetro e
//atualizar o salário de acordo.
//b. O método exibirDados deve exibir na consola o nome, salário e departamento do funcionário.
//c. No método main, crie um objeto dessa classe e invoque os métodos para aumentar o salário em
//10% e exibir os dados do funcionário.



public class Funcionario {

    private String nome;

    private double salario;

    private String departamento;


    public Funcionario(String nome, double salario, String departamento) {
        this.nome = nome;
        this.salario = salario;
        this.departamento = departamento;
    }



    public void exibirDados(){
        System.out.println(this.nome);
        System.out.println(this.salario);
        System.out.println(this.departamento);
    }


    public double aumentarSalario(double valor) {
        this.salario=(valor*this.salario)+this.salario;
        return this.salario;
    }

}
