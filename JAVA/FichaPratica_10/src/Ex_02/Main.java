package Ex_02;

public class Main {

    public static void main(String[] args) {

        Conta conta_01 = new Conta(01,1000,"JoaoVale");
        Conta conta_02 = new Conta(02,5000,"JoanaVagabunda");

        conta_01.exibirDados();
        conta_01.pedirEmprestimo(500);
        System.out.println(" \n");
        conta_01.exibirDados();
    }



}
