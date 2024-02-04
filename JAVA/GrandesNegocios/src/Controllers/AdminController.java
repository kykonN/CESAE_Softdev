package Controllers;

import Domain.Venda;
import Repository.VendasRepository;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public class AdminController {

    private ArrayList<Venda> totalVendas;

    public AdminController() throws FileNotFoundException {
        VendasRepository repository = new VendasRepository("Ficheiros/minimercado.csv");
       this.totalVendas = repository.getVendaArray();
    }




    public double valorVendas (){


        double somaVendas=0;

        for (Venda vendaAtual: this.totalVendas) {
            somaVendas += vendaAtual.getPrecoUnitario()* vendaAtual.getQuantidadeVendida();



        }
     return somaVendas;
    }


    public double mediaVendas (){
        double media = 0;
        double total= this.valorVendas();

       media=total/this.totalVendas.size();

     return media;
    }
}
