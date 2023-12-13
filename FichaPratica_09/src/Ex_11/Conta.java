package Ex_11;



//11. Crie um programa para fazer a gestão de contas bancárias:
//• Crie uma classe chamada "Conta" com os seguintes atributos: número da conta, saldo e titular da
//conta.
//• Crie um método “transferência” que tenha como parâmetros o valor a transferir e a conta de
//destinatário.
//• Crie os métodos depositar (aumentar saldo), levantar (diminuir saldo) e mostrarSaldo. (Exemplo
//de mostarSaldo: “Saldo da conta 12345: 950 EUR”)
//• O método depositar deve receber um valor como parâmetro e atualizar o saldo.
//• O método levantar deve receber um valor como parâmetro e verificar se é possível realizar a
//operação, considerando o saldo. De seguida, atualiza o saldo se a transação for possível.
//• O método exibirSaldo deve exibir na consola o saldo atual da conta.
//• No método main, crie um objeto da classe Conta e invoque os métodos para depositar 1000€ e
//exibir o saldo.
//• De seguida, invoque o método para levantar 120€ e exiba o saldo.
//• De seguida, crie mais dois objetos da classe e atribua valores aos seus atributos. De seguida,
//transfira um valor de uma conta para a outra.
//• No fim, deve exibir o saldo atual das três contas



//1- Definir atributos a definir para o objeto;
//2- Metodo construtor
//3- lista de comportamento ou metodo;

public class Conta {

    //1- Definir atributos a definir para o objeto;
private int numConta;

private double saldo;

private String titular;

    //2- Metodo construtor
    public Conta(int numConta, double saldo, String titular) {
        this.numConta = numConta;
        this.saldo = saldo;
        this.titular = titular;
    }
    //3- lista de comportamento ou metodo;

public void transferencia( Conta destino, double valor) {

    this.saldo -= valor;
    destino.saldo += valor;
}
public void exibirDados(){

        System.out.println(this.numConta);
        System.out.println(this.saldo);
        System.out.println(this.titular);
    }

    public void depositar ( double valor ){

        this.saldo += valor;

    }
    public void levantar ( double valor ){

       if (valor<=this.saldo){
           this.saldo -=saldo;
       }

    }

    public void mostrarSaldo (){

        System.out.println("Saldo da conta : " + this.saldo+ " € ");


    }



}



