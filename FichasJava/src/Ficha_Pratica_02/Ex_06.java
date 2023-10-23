package Ficha_Pratica_02;

import java.util.Scanner;

public class Ex_06 {

    // 6. Escreva um programa que leia dois valores numéricos e apresente o maior e depois o menor.

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int valor1,valor2;

        System.out.println("Insira o primeiro valor");

        valor1= input.nextInt();

        System.out.println("Insira o segundo valor");

        valor2 = input.nextInt();

        if (valor1>valor2) {
            System.out.println("O primeiro valor é o maior " + valor1 + " " + valor2);




    }if (valor2>valor1){
            System.out.println("O segundo valor é o maior " + valor2 + " " + valor1);

        }if (valor1==valor2){
            System.out.println(" Os valores são iguais");

}

    }

}
