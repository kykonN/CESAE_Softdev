package Ficha_Pratica_07;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ex_04 {

    //4. Escreva um programa que leia um ficheiro CSV (Comma-Separated Values) e imprima o conteúdo na
    //consola


    public static void main(String[] args) throws FileNotFoundException {

        //1 - Enumerar o ficheiro que iremos abrir

        File ficheiroaler = new File("FichaPratica07/exercicio_04.csv");

        // 2 - Criar a Maquina de ler


        Scanner maquinadeler = new Scanner(ficheiroaler);

        // 3- Criar variavel para ler


        String linha;


        while (maquinadeler.hasNextLine()){
            linha= maquinadeler.nextLine();
            System.out.println(linha);


        }






    }

}
