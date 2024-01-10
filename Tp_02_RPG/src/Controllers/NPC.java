package Controllers;

public class NPC extends Entidade {


    private int ouro;

    public NPC(String nome,int hpatual, int forca, int ouro) {
        super(nome,hpatual,forca);
        this.ouro = ouro;
    }

    public int getOuro() {
        return ouro;
    }

    public void setOuro(int ouro) {
        this.ouro = ouro;
    }

    public void exibirDetalhes (){
        System.out.println(this.ouro);
    }

}