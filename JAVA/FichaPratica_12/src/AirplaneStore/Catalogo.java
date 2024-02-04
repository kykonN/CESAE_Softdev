package AirplaneStore;

import java.util.ArrayList;

public class Catalogo {

    private ArrayList<Aviao> avioes;


    // 1 - Construtor

    // Inicializar construtor - Vazio -
    public Catalogo() {
       this.avioes=new ArrayList<>();
    }

    //Adquirir e vender aviões comprar

    public void adicionarAviao (Aviao novoAviao){
        this.avioes.add(novoAviao);
    }



    public void venderAviao (Aviao venderAviao){
        this.avioes.remove(venderAviao);
    }


    // Para fazer o somatorio dos avioes
    // Colocamos os avioes que queremos vender dentro do Array -
    //  iniciamos a variavel que ira albergar o preço do somatorio
    //e ira retornar essa variavel
    public double calcularTotal (){
        double valortotal = 0;

        for (Aviao atual : this.avioes){
            valortotal+=atual.getPreco();
        }
        return valortotal;
    }

    // Ciclo para imprimir Catalogo dos aviões

    // Ciclo For-each - variavel - variavel do array aviões
    // variavel - exibirdetalhes
    public void imprimirCatalogo(){
        System.out.println(" ****** Catalogo Aviões ******");
        for (Aviao aviaocatalogo : this.avioes){
            aviaocatalogo.exibirDetalhes();
        }
    }


}
