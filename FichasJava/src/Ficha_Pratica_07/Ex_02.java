package Ficha_Pratica_07;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Ex_02 {

    //2. Escreva um programa que crie um ficheiro de texto e escreva nele uma mensagem.


    public static void main(String[] args) throws FileNotFoundException {


        String mensagem = "Temos um total de 19 alunos no curso de Porgramação";

// Criar o novo ficheiro [File] - Nome do ficheiro = New File [caminho onde queremos guardar o novo ficheiro e o nome do mesmo];
        File novoFicheiro = new File("FichaPratica07/exercicio_02.txt");


// Criar um maquina de escrever naquele ficheiro
        PrintWriter escritaNoFicheiro = new PrintWriter(novoFicheiro);





        // o que queremos incluir no ficheiro = incluimos o nome da maquina de escrita e o println.
        escritaNoFicheiro.println(mensagem);



        escritaNoFicheiro.close();




    }


}
