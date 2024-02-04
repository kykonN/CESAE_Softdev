package Ex_02;

import java.util.ArrayList;
import java.util.Random;

public class Sorteio {

    public Sorteio(double premio) {
        this.premio = premio;
        this.participantes = new ArrayList<>();
    }

    private double premio;

    // Arraylist depois <CLASSE> nome arraylist = new arraylist <>()
    ArrayList <Pessoa>participantes = new ArrayList<>();

    public void adicionarParticipantes (Pessoa novoparticipante){

        // 1 - Fizemos o metodo de add pessoa
        // 2 - acrescentamos a condicionante ao array
        // condição adicionar pessoas

        if (novoparticipante.getIdade()>=18){
            this.participantes.add(novoparticipante);
            System.out.println("Parabéns você irá participar");
        }else
        {
            System.out.println("Você é menor, volte mais tarde!");
        }
    }


    // Random random = new Random();
    //int variavelAleatoria = random.nextInt();
    //int variavelAleatoria = random.nextInt(base,limite);
    public Pessoa sortearvencedor (){

        Random random = new Random();
        int randovariavel = random.nextInt(0,this.participantes.size());

        return this.participantes.get(randovariavel);
    }


    public void imprimirLista (){
        int contador = 1;

        System.out.println(" **** Lista de Participantes **** ");
        for (Pessoa pessoaAtual: this.participantes){
            System.out.println("Participantes " + contador++ +" :");
            pessoaAtual.exibirDetalhes();
        }

    }

}
