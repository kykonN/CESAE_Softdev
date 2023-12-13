package AppVeiculo;

import AppVeiculo.Enums.TipoCombustivel;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) throws FileNotFoundException {


        Carro carro_01 = new Carro ("BMW","Serie1",2005,250,2000,TipoCombustivel.DIESEL,8,4);

        Mota mota_01 = new Mota("R1 ","Fireblade",2020,1250,400,TipoCombustivel.GASOLINA,12);

        Camiao camiao_01 = new Camiao("Renault","HH",2023,200,120,TipoCombustivel.DIESEL,5,1000);

        Camiao camiao_02 = new Camiao("Honda","jesus",2300,400,2500,TipoCombustivel.DIESEL,19,2000);




        mota_01.exibirDetalhes();

        mota_01.imprimirMota();
        System.out.println("***********");
        System.out.println("***********");
        camiao_02.Viagem(1500,50);
        System.out.println("***********");
        System.out.println("***********");
        camiao_02.Viagem(2500,50);

        System.out.println("***********");
        System.out.println("***********");
        carro_01.exibirDetalhes();


    }




}
