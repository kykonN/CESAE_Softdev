package Ex_03.Entidades;

public abstract  class Pessoa {

    private String nome;

    private int anoNascimento;
    private String email;

    private String telemovel;


    public Pessoa(String nome, int anoNascimento, String email, String telemovel) {
        this.nome = nome;
        this.anoNascimento = anoNascimento;
        this.email = email;
        this.telemovel = telemovel;
    }


    public abstract void obterFuncao ();


    public void exibirDetalhes() {

        System.out.println(this.nome);
        System.out.println(this.anoNascimento);
        System.out.println(this.email);
        System.out.println(this.telemovel);

    }

    public abstract void imprimirHorario ();


}
