package Ficha_Pratica_02;

import java.util.Scanner;

public class Ex_05 {
// 5 - Escreva um programa que leia dois valores numéricos e apresente o menor e depois o maior.

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int valor1,valor2;

        System.out.println("Introduza um valor");

        valor1 = input.nextInt();

        System.out.println("Introduza outro valor");

        valor2 = input.nextInt();



        if (valor1<valor2) {
            System.out.println("O valor menor é o primeiro " + valor1 + " - " +  valor2 );
        } if (valor2 < valor1) {
            System.out.println( "O valor menor é o segundo  " + valor2 +" - "+  valor1 );
            if (valor1==valor2) {
                System.out.println(" Os valores são iguais");
            }
    }
}}
