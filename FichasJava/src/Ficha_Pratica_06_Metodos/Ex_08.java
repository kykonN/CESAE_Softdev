package Ficha_Pratica_06_Metodos;

import java.util.Scanner;

public class Ex_08 {


    //8. Implemente funções que, dadas 2 matrizes de inteiros com a mesma dimensão, apresente (numa função) em
    //forma de matriz o resultado da soma das 2 matrizes e (noutra função) o somatório dos seus elementos.


    // começamos por criar uma função para i
    public static void somarMatrizes(int[][] matriz1, int[][] matriz2) {

        int[][] matrizsoma = new int[matriz1.length][matriz1[0].length];


        for (int linha = 0; linha < matrizsoma.length; linha++) {
            for (int colunas = 0; colunas < matrizsoma[0].length; colunas++) {
                matrizsoma[linha][colunas] = matriz1[linha][colunas] + matriz2[linha][colunas];
            }
        }

        for (int linha = 0; linha < matrizsoma.length; linha++) {
            for (int coluna = 0; coluna < matrizsoma[0].length; coluna++) {
                System.out.print(matrizsoma[linha][coluna] + " ");
            }
            System.out.println();
        }


    }

    public static void somatorio(int[][] matriz1, int[][] matriz2) {

        int somatorio = 0;
        int somatorio2 = 0;

        for (int linha = 0; linha < matriz1.length; linha++) {
            for (int coluna = 0; coluna < matriz1[0].length; coluna++) {

                somatorio = matriz1[linha][coluna] + somatorio;


            }
        }
        for (int linha = 0; linha < matriz2.length; linha++) {
            for (int coluna = 0; coluna < matriz2[0].length; coluna++) {

                somatorio2 = somatorio2 + matriz2[linha][coluna];


            }
        }

        somatorio2 = somatorio + somatorio2;
        System.out.println(somatorio2);
    }


    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);


        int linha, coluna;

        System.out.println("Insira o valor das suas linhas");

        linha = input.nextInt();

        System.out.println("Insira o valor das suas colunass");

        coluna = input.nextInt();

        int[][] matriz1 = new int[linha][coluna];

        int[][] matriz2 = new int[linha][coluna];

        for (int l = 0; l < matriz1.length; l++) {
            for (int c = 0; c < matriz1[0].length; c++) {
                System.out.println("Insira na matriz1" + "[" + l + "]" + "[" + c + "]");
                matriz1[l][c] = input.nextInt();

            }
        }

        for (int l = 0; l < matriz2.length; l++) {
            for (int c = 0; c < matriz2[0].length; c++) {
                System.out.println("Insira na matriz2" + "[" + l + "]" + "[" + c + "]");
                matriz2[l][c] = input.nextInt();


            }


        }



        System.out.println();

        System.out.println("Soma das Matrizes é : \n");

        somarMatrizes(matriz1,matriz2);

        System.out.println("O somatorio das suas matrizes : \n  ");
        somatorio(matriz1,matriz2);


    }
}
