package Ficha_Pratica_05;

import java.util.Scanner;

public class Ex_09 {


    public static void main(String[] args) {


        //9. Escreva um programa que lê uma matriz de tamanho 5x5 e imprima a soma de todos os elementos.


        Scanner input = new Scanner(System.in);

        // Declarar matriz - formula - tipo_dados[ ][ ] nome_matriz = new tipo_dados[nº de linhas] [nº de colunas];

        int[][] matriz = new int[5][5];

        int soma = 0;


        for (int linha = 0; linha < 5; linha++) {
            for (int coluna = 0; coluna < 5; coluna++) {
                System.out.print("Insira um número para a linha " + (linha + 1) + " e coluna " + (coluna + 1) + ": ");
                matriz[linha][coluna] = input.nextInt();

                soma  += matriz[linha][coluna];

            }
        }
        System.out.println(" Soma : " + soma);
    }
}