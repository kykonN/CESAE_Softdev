package Ficha_Pratica_03;

import java.util.Scanner;

public class Ex_05 {


    public static void main(String[] args) {

        //5. Faça um programa que leia dois números inteiros, representando os valores início e fim de um intervalo e
        //imprima os números inteiros neste intervalo.

        Scanner input = new Scanner(System.in);
        int valor1,valor2;

        System.out.println("Insira o primeiro valor");

        valor1 = input.nextInt();

        System.out.println("Insira o segundo valor");

        valor2 = input.nextInt();

        while (valor1 <= valor2){
            System.out.println(valor1);
            valor1++;// = valor1 = valor + 1;
        }

    }
}
