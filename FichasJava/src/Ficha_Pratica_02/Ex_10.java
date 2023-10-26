package Ficha_Pratica_02;

import java.util.Scanner;

public class Ex_10 {

    public static void main(String[] args) {

        //10. Escreva um programa que leia dois números reais e pergunte ao utilizador qual a operação aritmética que quer
        //realizar e apresente o resultado. O utilizador deve responder usando o símbolo da operação (exemplo: para fazer
        //a soma, o utilizador deve escrever ‘+’). Se for inválido apresente erro.

        Scanner input = new Scanner(System.in);

        //variaveis


        String opcao;
        int valor1,valor2;

        //ler variaveis

        System.out.println("insira o primeiro valor");

        valor1 = input.nextInt();

        System.out.println("insira o segundo valor");

        valor2 = input.nextInt();

        System.out.println("Insira um sinal para a operação que quer realizar (+ - * /)");

        opcao = input.next();


        switch (opcao) {
            case  "+" :
                System.out.println(" Resultado " + (valor1 + valor2));
                break;

            case "-":
                System.out.println(" Resultado " +( valor1 - valor2));
                break;
            case "*":
                System.out.println("Resultado " + (valor1 * valor2));
                break;
            case "/":
                System.out.println("Resultado " + (valor1 / valor2));
                break;
            default:
                System.out.println("Erro");


    }

}}
