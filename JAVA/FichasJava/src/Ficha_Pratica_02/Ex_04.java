package Ficha_Pratica_02;

import java.util.Scanner;

public class Ex_04 {

    /* 4 - . Na fórmula 1, os pontos no final de cada corrida são atribuidos da seguinte forma:
        a. 1º Lugar: 10 pontos
        b. 2º Lugar: 8 pontos
        c. 3º Lugar: 6 pontos
        d. 4º Lugar: 5 pontos
        e. 5º Lugar: 4 pontos
        f. 6º Lugar: 3 pontos
        g. 7º Lugar: 2 pontos
        h. 8º Lugar: 1 ponto
        Escreva um programa que leia o lugar em que o piloto terminou e escreva quantos pontos ganhou.
        */

    public static void main(String[] args) {

        //Scanner para ler comandos do utilizador

        Scanner input = new Scanner(System.in);

        //caracterizar variaveis

        int lugar;
        // Dar informação da variavel ao utilizador

        System.out.println("Escolha qual o lugar a conferir pontuação");

        //colocar comando para o receber o pedido dessa informação

        lugar = input.nextInt();





        // argumento para escolher quantos pontos ganha cada posição - resposta ao pedido


        switch (lugar) {

            case 1 :
                System.out.println("Obteve 10 pontos");
                break;

            case 2:
                System.out.println("Obteve 8 pontos");
                break;

            case 3:
                System.out.println("Obteve 6 pontos");
                break;

            case 4:
                System.out.println("Obteve 5 pontos");

            case 5:
                System.out.println("Obteve 6 pontos");
                break;

            case 6:
                System.out.println("Obteve 3 pontos");
                break;
            case 7:
                System.out.println("Obteve 2 pontos");
                break;
            case 8:
                System.out.println("Obteve 1 pontos");
                break;

            default:
                System.out.println("Não obteve pontos");
        }



    }

}
