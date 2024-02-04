package Ficha_Pratica_07;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ex_10 {

//10. Escreva um programa que leia um ficheiro CSV contendo informações de vendas (tipo de produto, produto,
//quantidade vendida, valor unitario) e calcule o valor total das vendas


    public static void main(String[] args) throws FileNotFoundException {

        File ficheiroler = new File("FichaPratica07/exercicio_10.csv");

        Scanner maquinaler = new Scanner(ficheiroler);

        // Linha do cabeçalho - para não ser lida

        String linha = maquinaler.nextLine();


        // declarar variaveis - aquelas que serão numeros
        double quantidadeVendida,precoUnitario,total=0;

        //Ciclo - Enquanto o Scanner tiver linhas para ler , irá guardar na variavel linha;
        // Fazemos o split na linha para conseguir separar

        while (maquinaler.hasNextLine()){
            linha = maquinaler.nextLine();

            String [] itenslinha = linha.split(",");

            // enumerar as variaveis do split e dar-lhes conotação de Double como acima referido
            // pois as mesmas saiem como String e é preciso leitura de Double .




            quantidadeVendida=Double.parseDouble(itenslinha[2]);

            precoUnitario=Double.parseDouble(itenslinha[3]);

            total += (quantidadeVendida*precoUnitario);

        }

        System.out.println("Total: " + total +"€");










    }





    /*

    File
    Scanner

    - linha do cabeçalho -
    String linhas = Scanner.nextline


    While (scanner.hasnextline()){

    linha = scanner.nextline ();

    Criar variavel

    Double  total=0,quantidadeVendida,precounitario

    Criar Split para iterar as linhas e separar as variaveis pelas ",";


    String [] itenslinha = linha.split( " , " ) ;


    quantidadeVemdoda



     */
}
