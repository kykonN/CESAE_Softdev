package Ficha_Pratica_03;

import java.util.Scanner;

public class Ex_04 {

    //4- Faça um programa que leia um número inteiro e imprima os números inteiros de 0 até este número.
    //Exemplo de Execução

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int valor,inicial;

         //inicial será o valor de começo = 0
        //valor = ao numero máximo que o utilizador quero ciclo

        System.out.println("insira um numero : ");
        valor = input.nextInt();
        inicial = 0;

        while (inicial<=valor){
            System.out.println(inicial);
            inicial=inicial+1;
        }




    }
}
