package Ficha_Pratica_01;

import java.util.Scanner;

public class Ex_02 {

    // 2- Escreva um programa que requisite dois valores. O programa deverá utilizá-los como operandos para
    //as seguintes operações aritméticas: soma, subtração, multiplicação e divisão. Apresente o resultado
    //das operações e teste os resultados obtidos com vários casos.
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);



        int num1,num2,soma,sub,mult,div;

        System.out.println("Insira o primeiro numero");
        //ler num1

        num1= input.nextInt();

        System.out.println("Insira o segundo numero");
        //ler num2

        num2= input.nextInt();

        //calcular a soma

        soma= num1 + num2;

        //calcular a subtração

        sub= num1 - num2;

        //calcular a multiplicação

        mult= num1 * num2;

        //calcular a divisão

        div= num1 / num2;

        System.out.println("Soma:" + soma + " \nSubtração:" + sub + "\nMultiplicação:" + mult + " \nDivisão" + div);

    }
}



