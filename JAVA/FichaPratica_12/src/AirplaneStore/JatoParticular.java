package AirplaneStore;

import AirplaneStore.Enums.Categoria;
import AirplaneStore.Enums.Instalacoes;
import com.sun.security.jgss.GSSUtil;

import java.util.ArrayList;

//SUB CLASS DE AVIAO LOGO - EXTENDS - CLASSE PRINCIPAL .
public class JatoParticular extends Aviao {

    private int lotacao;

    private int bagagem;

    private Categoria categoria;

    // puxar o arraylist do pakage ENUMS - Arraylist (onde está) - nome
    private ArrayList<Instalacoes > instalacoes;

// 2 - CRIAR CONSTRUTOR

    // Só colocar os construtores


    public JatoParticular(int numeroSerie, String modelo, int anoFabrico, int peso, int fuselagem, int asas, int cauda, int nrMotores, int autonomia, int velocidade, double preco, int lotacao, int bagagem, Categoria categoria) {
        super(numeroSerie, modelo, anoFabrico, peso, fuselagem, asas, cauda, nrMotores, autonomia, velocidade, preco);
        this.lotacao = lotacao;
        this.bagagem = bagagem;
        this.categoria = categoria;

        // 3 - Inicializar o Array
        this.instalacoes= new ArrayList<>();
    }

// Adicionar elemento ao Erray
    public void addInstalcoes (Instalacoes addinstalcoes ){
        this.instalacoes.add(addinstalcoes);
    }

    // Para remover uma posicao do Array
    public void removerInstalacao (int index){
        this.instalacoes.remove(index);
    }

    // Para imprimir Array

    public void imprimirInstalacoes (){
        System.out.println("Instalacoes");
        System.out.println(this.instalacoes);
    }


}
