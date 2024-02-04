package Ex_01;

public class Main {

// Puxar o GET!
    public static void main(String[] args) {


        Pessoa joao = new Pessoa("Joao",24,1.7);
        Pessoa francisca = new Pessoa("Francisca",40,1.6);


        System.out.println("nome"+joao.getNome());
        System.out.println("idade"+joao.getIdade());
        System.out.println("altura"+joao.getAltura());


        System.out.println("nome"+francisca.getNome());
        System.out.println("idade"+francisca.getIdade());
        System.out.println("altura"+francisca.getAltura());

    }
}
