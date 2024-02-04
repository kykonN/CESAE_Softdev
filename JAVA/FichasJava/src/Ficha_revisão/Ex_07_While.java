package Ficha_revisão;

import java.util.Scanner;

public class Ex_07_While {


    //7- Faça um programa que leia um número inteiro e imprima os 5 anteriores e os 5 seguintes;
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        //variaveis

        // valor + valor+5  + valor-5

        int valor1,mais,menos;

        System.out.println("Insira um valor : ");

        valor1= input.nextInt();

        mais = valor1 +5;
        menos = valor1 -5;

        while (menos<valor1){
            System.out.println(menos);
            menos++;}

        valor1++;

        while (mais >=valor1 ){
            System.out.println(valor1);
            valor1++;}




    }
}
 /*numero = input.nextInt();

         aumenta = numero+5;

         diminui = numero-5;

         while (diminui < numero){
        System.out.println(diminui);
        diminui = diminui+1;
        }

        numero=numero+1;

        while (aumenta >= numero){
        System.out.println(numero);
        numero = numero+1;
        }*/