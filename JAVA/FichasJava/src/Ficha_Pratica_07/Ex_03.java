package Ficha_Pratica_07;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Ex_03 {

    //3. Escreva um programa que leia o conteúdo de um ficheiro de texto e grave-o num outro arquivo.


    public static void main(String[] args) throws FileNotFoundException {

        // 1 - Enumerar os ficheiros que vamos utilizar

        // O ficheiro existe na pasta logo irá abrir este ficheiro

        File ficheiroOriginal = new File("FichaPratica07/exercicio_01_Alternativa02.txt");

        // O ficheiro não existe então será criado um novo

        File novoficheiro = new File("FichaPratica07/exercicio_03_resolucao.txt");


        // 2- Criar as máquinas necessárias para utilizar nos ficheiros ( Maquina Ler e Maquina Escrever)

        // Maquina de Ler - Scanner [nome dado à maquina de escrever] = new Scanner (Nome dado ao ficheiro que vamos ler);

        Scanner maquinaler = new Scanner(ficheiroOriginal);

        //Maquina de escrever
        // Maquina de escrever - printwrite [nome dado ao Printwriter] = new PrintWriter (nome do ficheiro que vamos escrever);

        PrintWriter maquinaescrever = new PrintWriter(novoficheiro);


        //3 - Criar Variavel para armazenar informação do scanner

            String Linha;

        //4 -ENQUANTO - a Maquina de ler - tiver linhas
        //   A variavel irá gravar a ultima linha e irá verificar se tem mais linhas
        //   E a Maquina de escrever irá passar o que está na Variavel para o ficheiro.

            while (maquinaler.hasNextLine()){
                Linha = maquinaler.nextLine();
                maquinaescrever.println(Linha);




            }

            // 5- Gravar o que foi escrito
                maquinaescrever.close();



















        // String LinhaAtual;

        //while
        //

        //enquanto ler a maquina de ler - temos de guardar a informação numa variavel para guardar o

    }


}
