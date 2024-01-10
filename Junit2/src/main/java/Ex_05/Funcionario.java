package Ex_05;

public class Funcionario {

    // Atributos de instância
    private String nome, departamento;
    private double salario;

    public Funcionario(String nome, double salario, String departamento){
        this.nome=nome;
        this.salario=salario;
        this.departamento=departamento;
    }

    /**
     * Método para aumentar o salário
     * @param aumento - Recebe um valor percentual
     */
    public double aumentarSalario(double aumento){
        this.salario*=(1+(aumento/100));

        return this.salario;
    }

    public void exibirDados(){
        System.out.println("Nome: "+this.nome);
        System.out.println("Salário: "+this.salario);
        System.out.println("Departamento: "+this.departamento);
    }


}