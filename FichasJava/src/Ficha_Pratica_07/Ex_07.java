package Ficha_Pratica_07;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ex_07 {
    //7. Escreva um programa que leia o conteúdo de um ficheiro de texto e imprima o número de linhas e o
    //número de palavras presentes nesse ficheiro


    public static void main(String[] args) throws FileNotFoundException {


        File ex07 =new File("FichaPratica07/exercicio_07.txt");


        Scanner maquinaler = new Scanner(ex07);

        // Variaveis

        int contadorlinha=0,contadorpalavra0=0;
        String linha;

        // Ciclo - Contar as linhas com 1 contador
        while (maquinaler.hasNextLine()){

            linha =maquinaler.nextLine();

            contadorlinha ++;

            // Fazer o Split para conseguirmos contabilizar cada palavra
            // O vetor tera de ser dinamico de forma a não ter um numero fixo de memoria
            // e colocar um contador para cada palavra associada ao menu;

            String [] vetorpalavras = linha.split(" ");


            contadorpalavra0 += vetorpalavras.length;

        }



        System.out.println("  O seu ficheiro tem : " + contadorlinha + " Linhas " + " com  " + contadorpalavra0 +" Palavras");



    }


}
