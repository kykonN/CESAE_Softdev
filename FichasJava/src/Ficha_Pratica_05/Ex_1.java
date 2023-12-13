package Ficha_Pratica_05;

import java.util.Scanner;

public class Ex_1 {
    // 1 - Implemente um programa que permita adicionar 10 números inteiros a um array e que os imprima pela ordem
    // de inserção.

    public static void main(String[] args) {

        // scaner para introdução de numeros

        Scanner input = new Scanner(System.in);

        // declarar variavel de vetor

        int[] vetor = new int[10];


        // Ler o vetor


        // ciclo for para o numero exacto de ciclos que queremos correr.


        // primeiro ciclo para introduzir os valores;

        for (int indice = 0; indice < 10; indice++) {
            System.out.println("vetor[" + indice + "]:");
            vetor[indice] = input.nextInt();
        }

        // segundo ciclo para correr os valores introduzidos no primeiro ciclo;

        System.out.println("\n");

        for (int indice = vetor.length -1; indice >= 0; indice--){
            System.out.println(vetor[indice]);

        }

    }











}
