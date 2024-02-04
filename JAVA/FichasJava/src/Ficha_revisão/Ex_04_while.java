package Ficha_revisão;

import java.util.Scanner;

public class Ex_04_while {

    public static void main(String[] args) {

        // 4-. Faça um programa que leia um número inteiro e imprima os números inteiros de 0 até este número.

        Scanner input = new Scanner(System.in);

        int valor,contador;

        contador = 0;

        System.out.println("Insira um numero : ");
        valor = input.nextInt();

        while (valor>=contador){
            System.out.println(contador);
            contador++;
        }


    }
}
