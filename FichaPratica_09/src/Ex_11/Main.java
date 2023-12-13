package Ex_11;

public class Main {


    public static void main(String[] args) {



        Conta conta_01=new Conta(1,2000,"Joao");
        Conta conta_02=new Conta(2,3000,"zacarias");
        Conta conta_03=new Conta(3,1999,"Pastor");

        conta_01.exibirDados();
        conta_01.depositar(1000);
        conta_01.mostrarSaldo();
        conta_01.transferencia(conta_02,2000);
        conta_02.exibirDados();
        conta_02.mostrarSaldo();

    }
}
