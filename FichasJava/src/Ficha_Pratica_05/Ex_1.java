package Ficha_Pratica_05;

import java.util.Scanner;

public class Ex_1 {
    // Implemente um programa que permita adicionar 10 números inteiros a um array e que os imprima pela ordem
    // de inserção. Exemplo de execução

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] vetor = new int[10];

        // Ler o vetor

        for (int indice = 0; indice < 10; indice++) {
            System.out.println("vetor[" + indice + "]:");
            vetor[indice] = input.nextInt();
        }

        System.out.println("\n");
        for (int indice = 0; indice < 0; indice++) {
            if (indice < 9) {
                System.out.println(vetor[indice] + ", ");
            } else
                System.out.println(vetor[indice]);
        }
        System.out.println(" ) #");}
    }











}
