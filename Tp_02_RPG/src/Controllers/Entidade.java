package Controllers;

public abstract class Entidade {


    private String nome;

    private int hp;

    private int hpatual;

    private int forca;

    public Entidade(String nome, int hpatual, int forca) {
        this.nome = nome;
        this.hp = hpatual;
        this.hpatual = hpatual;
        this.forca = forca;

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getHpatual() {
        return hpatual;
    }

    public void setHpatual(int hpatual) {
        this.hpatual = hpatual;
    }

    public int getForca() {
        return forca;
    }

    public void setForca(int forca) {
        this.forca = forca;
    }

    public void exibirDetalhes (){

        System.out.println(this.nome);
        System.out.println(this.hp);
        System.out.println(this.hpatual);
        System.out.println(this.forca);

    }
}
