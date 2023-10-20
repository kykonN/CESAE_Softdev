package Ficha_Pratica_01;

import java.util.Scanner;

public class Ex_06 {

    // 6-  Escreva um programa que leia dois valores inteiros e os armazene na variáveis valor1 e valor2. Permute
    //o valor das variáveis e apresente o resultado. De seguida, verifique se consegue efetuar esta troca sem
    //criar variáveis adicionais


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //Variaveis

        int valor1,valor2,op1;

        //inserir valores das variaveis

        //variavel 1
        System.out.println("Insira o primeiro valor");

        valor1 = input.nextInt();

        //variavel 2
        System.out.println("Insira o segundo valor");

        valor2 = input.nextInt();

        // Alterar os valores das variaveis acrescentando 1 variavel -
        // Variavel Auxilar = Variavel 1
        // Variavel 1 = Variavel 2
        // Variavel 2 = Variavel Auxilar ( que é a variavel 1)

        /*op1 = valor1;

        valor1 = valor2;

        valor2 = op1;*/


        valor1 = valor1 + valor2;

        valor2 = valor1 - valor2;

        valor1= valor1 - valor2;






        System.out.println("Valor 1 é : " + valor1);

        System.out.println("valor 2 é : " + valor2);











    }
}
