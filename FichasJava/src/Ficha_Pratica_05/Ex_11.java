package Ficha_Pratica_05;

import java.util.Scanner;

public class Ex_11 {


    public static void main(String[] args) {

        //11. Faça um programa que preencha cada posição de uma matriz (3x3 elementos inteiros) com um valor introduzido
        //pelo utilizador. Deverá indicar qual o maior e qual o menor dos valores guardados na matriz, e deverá imprimir
        //todo o conteúdo da matriz de forma semelhante ao exercício 8


        Scanner input = new Scanner(System.in);

        // Declarar matriz - formula - tipo_dados[ ][ ] nome_matriz = new tipo_dados[nº de linhas] [nº de colunas];

        int[][] matriz = new int[3][3];

        for (int linha = 0; linha < 3; linha++) {
            for (int coluna = 0; coluna < 3; coluna++) {
                System.out.print("Insira um número para a linha " + (linha + 1) + " e coluna " + (coluna + 1) + ": ");
                matriz[linha][coluna] = input.nextInt();
            }
        }
        // ------------------------- Divisão do Projeto Logico -----------------------------------------//

        int extra;
        extra = matriz[0][0];

        for (int linha = 0; linha < 3; linha++) {
            for (int coluna = 0; coluna < 3; coluna++) {
                if (extra < matriz[linha][coluna]) {
                    extra = matriz[linha][coluna];

                }

            }
        }System.out.println(" O seu numero maior é : " + extra);
        // ------------------------- Divisão do Projeto Logico -----------------------------------------//


        extra = matriz[0][0];

        for (int linha = 0; linha < 3; linha++) {
            for (int coluna = 0; coluna < 3; coluna++) {
                if (extra > matriz[linha][coluna]) {
                    extra = matriz[linha][coluna];

                }

            }
        }
        System.out.println(" O seu numero menor é : " + extra);
        // ------------------------- Divisão do Projeto Logico -----------------------------------------//
        for (int linha = 0; linha < 3; linha++) {
            for (int coluna = 0; coluna < 3; coluna++) {
                System.out.print(matriz[linha][coluna] + " ");
            }
            System.out.println();
        }
    }
}

