package Ex_04;

public class Main {

    public static void main(String[] args) {

        Imovel castelo = new Imovel("rua monte escuro","1","cidade",4000,20,10,acabamento.USADA,tipo_casa.MANSAO,30);

        Imovel barracashreck = new Imovel("pantano shreck","2","far-far-away",40,1,1,acabamento.ALTO_ACABAMENTO,tipo_casa.CASA,5);

        System.out.println("Castelo");
        System.out.println("");
        castelo.valorimovelTotal();
        System.out.println("");
        castelo.exibirDetalhes();

        System.out.println("\n");

        System.out.println("Barraca Shreck");
        System.out.println("");
        barracashreck.valorimovelTotal();
        System.out.println("");
        barracashreck.exibirDetalhes();

    }
}
