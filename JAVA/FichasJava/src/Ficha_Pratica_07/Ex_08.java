package Ficha_Pratica_07;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Ex_08 {


    //8. Escreva um programa que leia o conteúdo de um ficheiro de texto e grave apenas as linhas que contêm
    //uma palavra específica num outro ficheiro


    public static void main(String[] args) throws FileNotFoundException {

        // Ficheiro que irá ser lido

        File lerficheiro = new File("FichaPratica07/exercicio_08.txt");

        // Scanner - ação para ler o ficheiro
        Scanner maquinaler = new Scanner(lerficheiro);


        // Ficheiro que irá ser criado e gravado informação
        File novoficheiro = new File("FichaPratica07/exercicio_08_novo.txt");

        // Ação para escrever o ficheiro
        PrintWriter maquinaescrever = new PrintWriter(novoficheiro);

        String linha, palavra;

        Scanner input = new Scanner(System.in);

        System.out.println("Insira a palavra que procura : ");

        palavra = input.next();


        while (maquinaler.hasNextLine()) {

            linha = maquinaler.nextLine();


            String[] separarlinha = linha.split(" ");

            for (int i = 0; i < separarlinha.length; i++) {

                if (palavra.equals(separarlinha[i])) {

                    maquinaescrever.println(linha);


                }
            }


        }
        maquinaescrever.close();
        maquinaler.close();
    }
}
