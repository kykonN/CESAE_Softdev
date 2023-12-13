package Pizzaria;

import Pizzaria.enums.Tamanho;
import Pizzaria.enums.UnidadeMedida;

public class Main {

    public static void main(String[] args) {

        Ingredientes base_fina = new Ingredientes("i-1202","Base Fina", UnidadeMedida.GRAMAS,150);
        Ingredientes pepperoni = new Ingredientes("i-2021","pepperoni",UnidadeMedida.UNIDADES,26);
        Ingredientes ananas = new Ingredientes("i-2021","Ananas",UnidadeMedida.UNIDADES,50);
        Ingredientes tomatesouce = new Ingredientes("i-2030","Molho de tomate",UnidadeMedida.LITROS,300);


        Pizza cincoestacoes = new Pizza("p-001","5 Estacoes","Pizza sem apiadeiros", Tamanho.MEDIO,15);





        cincoestacoes.adicionarelemento(new IngredientesPizza(20,tomatesouce));
        cincoestacoes.adicionarelemento(new IngredientesPizza(300,base_fina));
        cincoestacoes.adicionarelemento(new IngredientesPizza(25,ananas));
        cincoestacoes.adicionarelemento(new IngredientesPizza(60,pepperoni));
        cincoestacoes.adicionarelemento(new IngredientesPizza(80,tomatesouce));


        cincoestacoes.exibirDetalhes();








    }






}
