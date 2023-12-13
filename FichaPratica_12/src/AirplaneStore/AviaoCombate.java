package AirplaneStore;

import java.util.ArrayList;
import AirplaneStore.Enums.Armas;
public class AviaoCombate extends Aviao {

    private String pais;

    private boolean camuflagem;


   private ArrayList<Armas> armas;


    public AviaoCombate(int numeroSerie, String modelo, int anoFabrico, int peso, int fuselagem, int asas, int cauda, int nrMotores, int autonomia, int velocidade, double preco, String pais, boolean camuflagem) {
        super(numeroSerie, modelo, anoFabrico, peso, fuselagem, asas, cauda, nrMotores, autonomia, velocidade, preco);
        this.pais = pais;
        this.camuflagem = camuflagem;

        this.armas=new ArrayList<>();
    }


    //PARA ADICIONAR ARMA - NECESSÁRIO- CONDICAO - O TAMANHO DO ARRAY - ARMANOVA
    public void addArma (Armas armanova) {

        if (this.armas.size()<3){
            this.armas.add(armanova);
        }

    }

// Para remover arma do ARRAY - Inicializamos variavel INDEX - Efazemos .remove
    public  void removerArma (int index){

        this.armas.remove(index);
    }


    // Para Imprimir ARRAY
    public void imprimirArmas (){
        System.out.println("Armas");
        System.out.println(this.armas);
    }





}
