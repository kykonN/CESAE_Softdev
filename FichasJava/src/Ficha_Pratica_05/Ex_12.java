package Ficha_Pratica_05;

import java.util.Scanner;

public class Ex_12 {

    public static void main(String[] args) {

        //12. Escreva um programa que lê dois arrays de tamanho 10 // e gera uma matriz 10x2 com os elementos da primeira
        //junto aos elementos da segunda

        Scanner input = new Scanner(System.in);


        // Declarar os arrays e abrir para colocar valores ;

        int[] v1 = new int[10];
        int[] v2 = new int[10];
        int[][] matriz = new int[10][2];

        for (int primeiralinha = 0; primeiralinha < 10; primeiralinha++) {
            System.out.println("insira os valores do primeiro vetor [" + primeiralinha + "]:");
            v1[primeiralinha] = input.nextInt();

            matriz[primeiralinha][0] = v1[primeiralinha];
        }

        for (int slinha = 0; slinha < 10
                ; slinha++) {
            System.out.println("insira os valores do segundo vetor [" + slinha + "]:");
            v2[slinha] = input.nextInt();

            matriz[0][slinha] = v2[slinha];
        }
        // ------------------------- Divisão do Projeto Logico -----------------------------------------//


        //Gerar a matriz  com os elementos dos errays já criados

        // Declarar matriz - formula - tipo_dados[ ][ ] nome_matriz = new tipo_dados[nº de linhas] [nº de colunas];


    }


}
