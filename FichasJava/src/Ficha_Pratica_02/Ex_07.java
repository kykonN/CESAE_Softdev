package Ficha_Pratica_02;

import java.util.Scanner;

public class Ex_07 {

    // 7. Escreva um programa que leia um número, depois apresente se é par ou ímpar.

    public static void main(String[] args) {

        // para ser impar o numero não pode ser divisivel por 2 e dar inteiro
        // logo será no " INT" que teremos a resolução

        Scanner input = new Scanner(System.in);

        int valor1,resto;

        System.out.println("Insira o valor");

        valor1 = input.nextInt();

        resto = 0;

        if ((valor1 % 2) == resto ) {

            System.out.println("O valor é numero inteiro");

        }else System.out.println("O valor é impar");




    }

}
