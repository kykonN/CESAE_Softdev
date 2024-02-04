package Ficha_Pratica_03;

import java.util.Scanner;

public class Ex_10 {

    //10. Faça um programa que leia um número inteiro (variável limite), um incremento (variável salto) e imprima os
    //números inteiros de 0 até limite inclusive, com incremento de salto. Suponha que limite e salto são maiores que
    //zero.

    public static void main(String[] args) {

        // variavel  limite,  salto

        Scanner input = new Scanner(System.in);

        //3 variaveis - limete do loop -
        // salto que queremos do loop -
        // extra ( variavel que vai armazenar o salto)

        int limite,salto,extra;

        // ler variaveis

        System.out.println("Insira um limite");

        limite = input.nextInt();

        System.out.println("Insira um incremento");

        salto= input.nextInt();

        extra = salto;

        // enquanto o limite não for atingido o ciclo corre os numeros começando no numero do salto que = ao extra
        while (limite > extra ){
            // vai imprimir o valor do extra ( este que será o primeiro valor o valor escolhido para o salto)
            System.out.println(extra);

            // iremos alterar o valor do extra para que acada vez que ocorra um ciclo o mesmo some o valor do salto!
            extra= extra+ salto;


        }









    }
}
