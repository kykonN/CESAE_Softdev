package Ex_10;

//1- Definir atributos a definir para o objeto;
//2- Metodo construtor
//3- lista de comportamento ou metodo;

public class Main {


    public static void main(String[] args) {

        Funcionario Joana = new Funcionario("Joana",1800,"SoftDev");


        Joana.exibirDados();

        Joana.aumentarSalario(0.1);
//
        Joana.exibirDados();


    }
}
