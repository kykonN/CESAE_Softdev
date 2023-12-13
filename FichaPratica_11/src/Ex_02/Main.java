package Ex_02;

public class Main {

    public static void main(String[] args) {


        Pessoa pessoa1 = new Pessoa("JJ",88,"915566324","JJ@HOTCHICKS.COM");
        Pessoa pessoa2 = new Pessoa("Ana Julia",12,"9879879","anajuju@hotmail.com");
        Pessoa pessoa3 = new Pessoa("eusebio",44,"84698755","zebinho@futebol.iol");
        Pessoa pessoa4 = new Pessoa("Julieta",77,"98954420","romeojulieta@hot.mail.com");
        Pessoa pessoa5 = new Pessoa("OlariLoLe",18,"92998789","olariolel@gostodever.gaitas.com");


        Sorteio trofeucaneca = new Sorteio(200);

        trofeucaneca.adicionarParticipantes(pessoa1);
        trofeucaneca.adicionarParticipantes(pessoa2);
        trofeucaneca.adicionarParticipantes(pessoa3);
        trofeucaneca.adicionarParticipantes(pessoa4);
        trofeucaneca.adicionarParticipantes(pessoa5);

        trofeucaneca.imprimirLista();

        System.out.println("");

        System.out.println("VENCEDOR");
        Pessoa vencedora = trofeucaneca.sortearvencedor();


        vencedora.exibirDetalhes();


    }




}
