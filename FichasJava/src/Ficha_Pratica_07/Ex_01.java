package Ficha_Pratica_07;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ex_01 {
//1. Escreva um programa que leia o conteúdo de um ficheiro de texto e imprima na consola.



    //Iniciar MAIN - {

    //Para Leitura de Ficheiros - Iniciar com Scanner [nome de ficheiro] = new Scanner (new File( Caminho do ficheiro a ler);

    //Adicionar Variavel  = String Linha!

    //CICLO WHILE - ENQUANTO - [Nome que demos ao ficheiro] - [has.NextLine - tiver uma linha para ler] {

    // variavel será igual ao [nome do ficheiro].nextline();

    // imprimimos o resultado que será (linha)
    public static void main(String[] args) throws FileNotFoundException {

        String linha;

        Scanner leituradeficheiro = new Scanner(new File("FichaPratica07/exercicio_01.txt"));

        while(leituradeficheiro.hasNextLine()){

            linha = leituradeficheiro.nextLine();
            System.out.println(linha);
        }

    }








    }


