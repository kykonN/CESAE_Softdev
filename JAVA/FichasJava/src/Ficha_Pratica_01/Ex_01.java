package Ficha_Pratica_01;

import java.util.Scanner;

public class Ex_01 {

    //1 -Escreva um programa que faça a soma de dois números introduzidos pelo utilizador. Apresente o
    //resultado da operação.

    public static void main(String[] args) {



//Instanciar o Scanner (obrigatório para todos os exercícios)

        Scanner input = new Scanner(System.in);

        // Declarar variaveis

        int num1,num2,soma;

        System.out.println("Insira o primeiro numero");
        //ler num1

        num1= input.nextInt();
        System.out.println("Insira o segundo numero");
        //ler num2

        num2= input.nextInt();

        //calcular a soma

        soma= num1 + num2;

        //apresentar a soma

        System.out.println("A resultado da soma dos numeros é " + soma);

    }
}
