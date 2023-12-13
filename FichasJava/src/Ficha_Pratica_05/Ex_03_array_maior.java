package Ficha_Pratica_05;

import java.util.Scanner;

public class Ex_03_array_maior {

    public static void main(String[] args) {


        // 3. Escreva um programa que lê um array de tamanho 10 e encontra o maior elemento;

        // Scaner para introduzir numeros
        Scanner input = new Scanner(System.in);
        // declarar vetor e dizer qual o seu tamanho
        int[] vetor = new int[10];

        // Iniciar o ciclo - dizer que dentro do vetor - cada gaveta -indice - vão ser abertas e vai ser inserido um valor
        // em cada gaveta
        for (int indice = 0; indice < 10; indice++) {
            System.out.println("Insira um numero: ");

            vetor[indice] = input.nextInt();
        }

        // criar um variavel extra ( um gaveta para guardar o maior valor)

        int extra;
        extra = vetor[0];

        // criar um ciclo em que a gaveta extra seja comparada com cada uma das gavetas do vetor para que guarde o Maior valor

        for (int indice = 1; indice < 10; indice++) {
            if (extra < vetor[indice]) {
                extra = vetor[indice];
            }
        }
        //imprimir o maior valor que será guardado na "EXTRA"
        System.out.println("O maior numero dentro do array é " + extra);
    }
}


// Forma logica do exercicio
       /* EXTRA-200
        INDICE(1)-300

        ==

        EXTRA-300
        INDICE(2)-100

        ==

        EXTRA-300
        INDICE(3)-400 /*

        */






