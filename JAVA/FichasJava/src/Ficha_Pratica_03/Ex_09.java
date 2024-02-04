package Ficha_Pratica_03;

import java.util.Scanner;

public class Ex_09 {

            // 9. Faça um programa que leia um número inteiro e imprima os números pares entre 2 e o número lido inclusive.
            //Suponha que o número lido da entrada será maior que 2.

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        int valor,dois;

        System.out.println("Insira um valor: ");

        valor = input.nextInt();
        dois = 2;



        while (valor >= dois){

            System.out.println(dois);
            dois = dois + 2;
        }





    }
}
