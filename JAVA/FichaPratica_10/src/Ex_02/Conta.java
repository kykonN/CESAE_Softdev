package Ex_02;
//2. Atualize a classe Conta: para além dos atributos número da conta, saldo e titular da conta, deve também
//ter ano de abertura, margem de empréstimo e valor em divida

//1- Definir atributos a definir para o objeto;
//2- Metodo construtor
//3- lista de comportamento ou metodo;

public class Conta {

    //1- Definir atributos a definir para o objeto;
private int numConta;

private double saldo;

private String titular;

private int anoAbertura=2023;

private double emprestimo;

private double divida;

    //2- Metodo construtor
    public Conta(int numConta, double saldo, String titular) {
        this.numConta = numConta;
        this.saldo = saldo;
        this.titular = titular;
        this.emprestimo= this.saldo*0.9;
    }
    //3- lista de comportamento ou metodo;

public void transferencia( Conta destino, double valor) {

    this.saldo -= valor;
    destino.saldo += valor;
}
public void exibirDados(){

        System.out.println("Conta "+this.numConta);
        System.out.println("Saldo :"+this.saldo+"€");
        System.out.println("Titular :"+this.titular);
        System.out.println("Divida :"+this.divida+"€");
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

//d. Crie o método pedirEmprestimo, deve receber como parâmetro o valor a pedir. Seguidamente,
//avalie se a conta pode pedir um empréstimo com esse valor. Se houver qualquer valor em dívida,
//o pedido deve ser automaticamente desconsiderado (só pode ter um empréstimo de cada vez).
//Caso seja possível, atualize o saldo e valor em dívida com o dinheiro pedido e retorne true. Caso
//não seja possível, não atualize saldo nem valor em dívida e retorne false

    //valor - 800 => this emprestimo( this.saldo * .90 ) = 900

    public boolean pedirEmprestimo (double valor){


        if (valor<=this.emprestimo && this.divida==0 ){
            this.saldo += valor;
            this.divida=valor;

            return true;

        }if (valor>this.emprestimo || this.divida>0){
            return false;
        }else return false;

    }


}



