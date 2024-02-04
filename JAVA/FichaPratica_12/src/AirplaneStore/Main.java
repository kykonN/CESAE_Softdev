package AirplaneStore;

import AirplaneStore.Enums.Armas;
import AirplaneStore.Enums.Categoria;
import AirplaneStore.Enums.Instalacoes;

import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {

        JatoParticular Pinocada = new JatoParticular(4701,"Jet44",2202,7000,66,82,55,4,19,900,25000,12,5, Categoria.LIGHT);
        AviaoCombate Mordida = new AviaoCombate(02,"fight",2023,2000,236,235,55,8,8,15000,45000,"Vietnam",true);
        AviaoCombate momo = new AviaoCombate(03,"fight",2023,2000,236,235,55,8,8,15000,60000,"Russo",true);





        Pinocada.exibirDetalhes();
        System.out.println("");
        Pinocada.addInstalcoes(Instalacoes.CHUVEIRO);
        Pinocada.addInstalcoes(Instalacoes.COZINHA);
        Pinocada.addInstalcoes(Instalacoes.CINEMA);
        System.out.println("");
        Pinocada.exibirDetalhes();
        Pinocada.imprimirInstalacoes();

        System.out.println("\n");
        System.out.println("\n");
        System.out.println("\n");
        Mordida.exibirDetalhes();
        Mordida.addArma(Armas.MISSEIS);
        Mordida.addArma(Armas.BOMBAS);
        System.out.println("");
        Mordida.exibirDetalhes();
        System.out.println("");
        Mordida.imprimirArmas();
        System.out.println("");
        momo.exibirDetalhes();
        System.out.println("");
        momo.addArma(Armas.MISSEIS);
        momo.addArma(Armas.METRELHADORAS);
        momo.addArma(Armas.BOMBAS);
        momo.addArma(Armas.METRELHADORAS);
        momo.imprimirArmas();

        System.out.println("***************************** CATALOGO *********************************");

        Catalogo meucatologo = new Catalogo();
        meucatologo.adicionarAviao(Pinocada);
        meucatologo.adicionarAviao(Mordida);
        meucatologo.adicionarAviao(momo);
        System.out.println("TOTAL");

        System.out.println(meucatologo.calcularTotal());

        System.out.println("CATALOGO IMPRESSO");
        meucatologo.imprimirCatalogo();
    }
}
