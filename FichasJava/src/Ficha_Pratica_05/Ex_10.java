package Ficha_Pratica_05;

import java.util.Scanner;

public class Ex_10 {

    // 10. Faça um programa que preencha cada posição de uma matriz 3x5 com valores inteiros introduzidos pelo
    //utilizador. Deverá depois ler um outro valor do utilizador e indicar quantos vezes existe na matriz.

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Declarar matriz - formula - tipo_dados[ ][ ] nome_matriz = new tipo_dados[nº de linhas] [nº de colunas];

        int[][] matriz = new int[3][5];


        for (int linha = 0; linha < 3; linha++) {
            for (int coluna = 0; coluna < 5; coluna++) {
                System.out.print("Insira um número para a linha " + (linha + 1) + " e coluna " + (coluna + 1) + ": ");
                matriz[linha][coluna] = input.nextInt();

            }
        }
        // ------------------------- Divisão do Projeto Logico -----------------------------------------//

        // Utilizador quer verificar nr na matriz

        //Variavel extra para gravar  o numero que o utilizador procura na matriz ;
        int extra;

        System.out.println("Qual o numero que quer procurar? ");

        extra = input.nextInt();

        int contador = 0;

            // para verificar se o numero se encontra na matriz fazemos novo ciclo à matriz

        for (int linha = 0; linha < 3; linha++) {
            for (int coluna = 0; coluna < 5; coluna++) {
                // recorrendo a um contador - sempre que o numero se encontrar na matriz o contador acrescenta +1;

                if (extra == matriz[linha][coluna]) {
                    contador++;
                }
            }

            // ------------------------- Divisão do Projeto Logico -----------------------------------------//


            //Ultima condicionante - se o numero do contador for maior que 0 - significa que o numero aparece na matriz
        }
        if (contador > 0) {
            System.out.println("O numero aparece representado : " + contador);
            // caso contrario - ELSE .!
        } else {
            System.out.println(" O seu numero não aparece ");
        }
    }
}
