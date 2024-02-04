package Ficha_revisão;

import java.util.Scanner;

public class Ex_05_while {

    public static void main(String[] args) {

        // 5. Faça um programa que leia dois números inteiros, representando os valores início e fim de um intervalo e
        //imprima os números inteiros neste intervalo.

        Scanner input = new Scanner(System.in);

        int inicio,fim;

        System.out.println("Insira o inicio : ");

        inicio = input.nextInt();

        System.out.println("Insira o fim do ciclo: ");
        fim = input.nextInt();


        while (inicio <= fim) {
            System.out.println(inicio);
            inicio ++;


        }


    }
}
