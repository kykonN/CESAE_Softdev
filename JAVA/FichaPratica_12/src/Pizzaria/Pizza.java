package Pizzaria;

import Pizzaria.enums.Tamanho;

import javax.swing.*;
import java.util.ArrayList;
import java.util.IllegalFormatCodePointException;

public class Pizza {

    private String codigo;
    private String nome;
    private String descricao;

    private Tamanho tamanho;

    private ArrayList<IngredientesPizza> ingrediente;


    private double preco;

    public Pizza(String codigo, String nome, String descricao, Tamanho tamanho, double preco) {
        this.codigo = codigo;
        this.nome = nome;
        this.descricao = descricao;
        this.tamanho = tamanho;
        this.preco = preco;
        this.ingrediente = new ArrayList<>();

    }


    public void adicionarelemento(IngredientesPizza novoIngrediente) {

        if (this.ingrediente.size() < 5) {
            this.ingrediente.add(novoIngrediente);
        } else {
            System.out.println("A lista atingiu o máximo de ingredientes possiveis");
        }

    }


    // para alterar a quantidade o vetor tem de ser verificado (for each)
    // depois se houver iguais ele substitui a quantidade por nova quantidade.

    /**
     * Metodo alterar quantidade
     *
     * @param novoingredientes
     * @param novaquantidade
     */
    public void alterarquantidade(Ingredientes novoingredientes, double novaquantidade) {

        for (IngredientesPizza ingredinteAtual : this.ingrediente) {

            if (ingredinteAtual.getIngrediente() == novoingredientes) {
                ingredinteAtual.setQuantidade(novaquantidade);
            }

        }
    }

    public void removeringerdiente(String codigoIngrediente) {

        for (IngredientesPizza idingrediente : this.ingrediente) {

            if (idingrediente.getIngrediente().getCodigo().equals(codigoIngrediente)) {
                this.ingrediente.remove(idingrediente);
                return;
            }
        }
    }


    public double totalCalorias() {

        double calorias = 0;

        for (IngredientesPizza atual : this.ingrediente) {
            //vai buscar a quantidade do ingrediente ( ex: 5 fatias fiambre)
            double quantidadeingrediente = atual.getQuantidade();
            //vai buscar a quantidade de calorias por unidade
            double caloriasQuantidade = atual.getIngrediente().getCaloriasKcal();

            // dá o total de calorias  fazendo quantidade de unidades * quant kcal
            double valorcalorias = quantidadeingrediente * caloriasQuantidade;

            calorias  += valorcalorias;


        }
        return calorias;

    }


    public void exibirDetalhes (){
        System.out.println(this.nome);
        System.out.println(this.codigo);
        System.out.println(this.descricao);
        System.out.println(this.preco);
        System.out.println(this.tamanho);

        int contador = 1;

        for (IngredientesPizza atual:this.ingrediente) {
            System.out.print("Ingrediente "+contador+"["+atual.getIngrediente().getCodigo() +"|"+atual.getIngrediente().getNome()+"|"+atual.getIngrediente().getUnidadeMedida()+"|"+atual.getIngrediente().getCaloriasKcal()+"|"+atual.getQuantidade() +"\n");

contador ++;
        }


    }

}
