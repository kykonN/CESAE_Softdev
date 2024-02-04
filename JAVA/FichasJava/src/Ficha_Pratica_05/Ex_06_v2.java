package Ficha_Pratica_05;

import java.util.Scanner;

public class Ex_06_v2 {

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        int[] vetor = new int[10];
        //
        // primeiro for loop para inserir o numero

        for (int indice = 0; indice < 10; indice++) {
            System.out.println("Insira o seu número: ");
            vetor[indice] = input.nextInt();
        }

        // boleana = true or false para o caso de a informação

        boolean crescente = true;

        for (int indice = 1; indice < 10; indice++) {
            if (vetor[indice] < vetor[indice - 1]) {
                crescente = false;
                break; // Se encontrarmos um elemento fora de ordem, podemos sair do loop imediatamente
            }
        }

        if (crescente) {
            System.out.println("A sequência é crescente.");
        } else {
            System.out.println("A sequência não é crescente.");
        }
    }
}

