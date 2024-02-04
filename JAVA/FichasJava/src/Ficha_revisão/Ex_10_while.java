package Ficha_revisão;

import java.util.Scanner;

public class Ex_10_while {

    public static void main(String[] args) {

        //10. Faça um programa que leia um número inteiro (variável limite), um incremento (variável salto) e imprima os
        //números inteiros de 0 até limite inclusive, com incremento de salto. Suponha que limite e salto são maiores que
        //zero.


        Scanner input = new Scanner(System.in);

        int limite,salto,extra;

        System.out.println("Insira o seu limite");

        limite = input.nextInt();
        System.out.println("Insira o seu incremento");
        salto = input.nextInt();

        extra = salto;

        while (salto<=limite){
            System.out.println(salto);

                salto = salto + extra;


        }
    }
}
