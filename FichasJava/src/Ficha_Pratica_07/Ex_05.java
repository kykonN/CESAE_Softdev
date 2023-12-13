package Ficha_Pratica_07;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ex_05 {



    // 5- Escreva um programa que leia um ficheiro de texto contendo números inteiros separados por espaço e
    //calcule a soma desses números.


    public static void main(String[] args) throws FileNotFoundException {


//          1- Iniciar o ficheiro a trabalhar

        File lerficheiro = new File("FichaPratica07/exercicio_05_31.txt");

//          2- Criar maquina de leitura

        Scanner maquinaler = new Scanner(lerficheiro);

        //  3 - criar variavel para albergar os numeros

        int valor,total=0;



        // 4 - Começar Ciclo
        // ENQUANTO - MAQUINA ESTA A LER OS VALORES
        // OS Valores são guardados na variavel
        // e posteriormente é feito o somatório;


        while (maquinaler.hasNextLine()){
            valor = maquinaler.nextInt();

            total +=valor;




        }
// Fechar  o ciclo
        System.out.println("Total : " + total);
        maquinaler.close();



    }
}
