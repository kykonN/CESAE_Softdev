package Ficha_Pratica_05;

import java.util.Scanner;

public class Ex_08 {

    //Implemente um programa que permita adicionar 9 números inteiros (ler input do utilizador) a uma matriz 3x3 e
    //que os imprima com o seguinte aspeto gráfico:

    public static void main(String[] args) {


        // Scaner para ler valores introduzidos pelo utilizador

        Scanner input = new Scanner(System.in);

        // Declarar matriz - formula - tipo_dados[ ][ ] nome_matriz = new tipo_dados[nº de linhas] [nº de colunas];

        int[][] matriz = new int[3][3];

        // declarada a matriz é necessário um loop para pedir ao utilizador que valores quer na sua matriz

        // sendo que a matriz tem 3x3 = 9 variaveis terá de inserir 9 valores


        // Primeiro declaramos a variavel da linha da matriz -
        // esta será em loop pois ira receber 3 valores .
        for (int linha = 0; linha < 3; linha++) {
            // seguimos para declarar a variavel da coluna - tambem em loop - for - for para receber 3 valores
            for (int coluna = 0; coluna < 3; coluna++) {
                System.out.print("Insira um número para a linha " + (linha + 1) + " e coluna " + (coluna + 1) + ": ");
                matriz[linha][coluna] = input.nextInt();
            }
        }
        System.out.println("A sua matriz:");


        // Novo loop dos dois vetores  - de forma a ler os valores inseridos
        for (int linha = 0; linha < 3; linha++) {
            for (int coluna = 0; coluna < 3; coluna++) {
                System.out.print(matriz[linha][coluna] + " ");
            }
            System.out.println();
        }
    }
}


