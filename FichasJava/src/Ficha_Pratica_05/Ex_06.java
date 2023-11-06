package Ficha_Pratica_05;

import java.util.Scanner;

public class Ex_06 {

    public static void main(String[] args) {

        // 6. Escreva um programa que lê um array de tamanho 10 e verifica se os elementos estão em ordem crescente.

        Scanner input = new Scanner(System.in);

        int[] vetor = new int[10];


        for (int indice = 0; indice < 10; indice++) {
            System.out.println("Insira o seu numero: ");

            vetor[indice] = input.nextInt();


        }
        int extra;

        int check = 0;

        extra = vetor[0];

        for (int indice = 1; indice < 10; indice++) {
            if (extra > vetor[indice]) {

                if (vetor[indice]<=extra){
                    check++;
                }


            }
        }

        if (check > 0) {
            System.out.println("N é crescente");
        } else
            System.out.println(" Crescente");
    }
}



       /* 1 A - 8

        2 B - 10
            == Check = 1

        3 C - 25


        if (valor1 <= extra) {

            check = check + 1;

        }


    }
        if(check >0)

    {
        System.out.println("Não crescente");
    }else

    {
        System.out.println(" Crescente!!!!!!!"); */
