package Ficha_Pratica_02;

import java.util.Scanner;

public class Ex_01 {

    // 1- Leia dois números inteiros e escreva na consola o maior deles

    public static void main(String[] args) {

        //instanciar o Scanner (Obrigatório)

        Scanner input = new Scanner(System.in);

        //Declarar variaveis

        int num1,num2;

        //ler num1

        System.out.println("Insira um numero");

        num1 = input.nextInt();


        //ler num2

        System.out.println("Insira um numero");

        num2 = input.nextInt();

        if (num1>num2){
            System.out.println(" O primeiro valor é o maior");


        } if (num2>num1) {
            System.out.println(" O segundo valor é o maior");

    }   if (num1==num2) {
            System.out.println("Os valores são iguais");
        }
}}
