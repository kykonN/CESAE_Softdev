package Ficha_Pratica_01;

import java.util.Scanner;

public class teste {

    public static void main(String[] args) {

        // Instanciar scanner

        Scanner input = new Scanner(System.in);

        // declarar variaveis
        double num1, num2, soma, subtracao, multiplicacao, divisao;


        // ler num1
        System.out.print("Insira um numero: ");

        num1= input.nextDouble();

        //ler num2
        System.out.print("Insira um numero: ");
        num2= input.nextDouble();

        //calcular soma
        soma = num1+num2;

        //apresentar soma
        System.out.println("soma: " + soma);

        //calcular subtração
        subtracao = num1-num2;

        //apresentar sub
        System.out.println("subtracao: " + subtracao);

        //calcular multiplicaçao
        multiplicacao = num1*num2;

        //apresentar multiplicaçao
        System.out.println("multiplicacao: " + multiplicacao);

        // calcular divisao
        divisao = num1/num2;

        //apresentar divisão
        System.out.println("divisão: " + divisao);
    }
}


