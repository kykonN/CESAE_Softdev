package Ficha_Pratica_02;

import java.util.Scanner;

public class Ex_15 {

    //15 -Escreva um programa que leia 3 números, seguidamente deve perguntar ao utilizador se quer ordem crescente
    //‘C’ ou decrescente ‘D’, e deve colocar os números no ecrã por ordem decrescente ou crescente de acordo com a
    //escolha

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //variaveis

        int valor1,valor2,valor3;

        System.out.println("Insira o primeiro numero ");

        valor1 = input.nextInt();

        System.out.println("Insira o segundo numero ");

        valor2= input.nextInt();

        System.out.println("Insira o terceiro numero ");

        valor3 = input.nextInt();

        //Formato pretendido - Switch + variavel

        System.out.println(" Que formato pretende? \n (D) : Decrescente \n (C) : Crescente");

        String opcao;

        opcao = input.next();

        switch (opcao){

            case "c":
                if (valor1 > valor2 && valor2 > valor3) {
                    System.out.println(" Os valores na forma crescente apresentam-se da seguinte forma " + valor3 + " " + valor2 + " " + valor1);
                }

                if (valor1 > valor3 && valor3 > valor2) {
                    System.out.println(" Os valores na forma crescente apresentam-se da seguinte forma " + valor2 + " " + valor3 + " " + valor1);
                }
                if (valor2 > valor1 && valor1 > valor3) {
                    System.out.println("Os valores na forma crescente apresentam-se da seguinte forma " + valor3 + " " + valor1 + " " + valor2);
                }

                if (valor2 > valor3 && valor3 > valor1) {
                    System.out.println("Os valores na forma crescente apresentam-se da seguinte forma " + valor1 + " " + valor3 + " " + valor2);
                }

                if (valor3 > valor1 && valor1 > valor2) {
                    System.out.println("Os valores na forma crescente apresentam-se da seguinte forma " + valor2 + " " + valor1 + " " + valor3);
                }

                if (valor3 > valor2 && valor2 > valor1) {
                    System.out.println("Os valores na forma crescente apresentam-se da seguinte forma " + valor1 + " " + valor2 + " " + valor3);
                }
                break;

            case "d":
                if (valor1 > valor2 && valor2 > valor3) {
                    System.out.println(" Os valores na forma crescente apresentam-se da seguinte forma " + valor1 + " " + valor2 + " " + valor3);
                }

                if (valor1 > valor3 && valor3 > valor2) {
                    System.out.println(" Os valores na forma crescente apresentam-se da seguinte forma " + valor1 + " " + valor3 + " " + valor2);
                }
                if (valor2 > valor1 && valor1 > valor3) {
                    System.out.println("Os valores na forma crescente apresentam-se da seguinte forma " + valor2 + " " + valor1 + " " + valor3);
                }

                if (valor2 > valor3 && valor3 > valor1) {
                    System.out.println("Os valores na forma crescente apresentam-se da seguinte forma " + valor2 + " " + valor3 + " " + valor1);
                }

                if (valor3 > valor1 && valor1 > valor2) {
                    System.out.println("Os valores na forma crescente apresentam-se da seguinte forma " + valor3 + " " + valor1 + " " + valor2);
                }

                if (valor3 > valor2 && valor2 > valor1) {
                    System.out.println("Os valores na forma crescente apresentam-se da seguinte forma " + valor3 + " " + valor2 + " " + valor1);
                }
                break;

            default:
                System.out.println("Escolha invalida");
                break;


        }














    }
}
