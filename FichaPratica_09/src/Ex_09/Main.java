package Ex_09;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {


        Produto leite = new Produto("Cerelác",3.22,0);


        leite.comprar(5);

        leite.venda(2);

        System.out.println(leite.getQuantidade());

        leite.comprar(10);

        leite.venda(35);
        System.out.println(leite.getQuantidade());
    }






}


