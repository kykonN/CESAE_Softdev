package Ficha_revisão;

import java.util.Scanner;

public class Ex_12_while {


    ////12. Faça um algoritmo que leia dois números inteiros, representando os valores início e fim de um intervalo e
    //    //imprima os múltiplos de 5 entre eles.

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int inicio,fim;

        System.out.println("insira o inicio do seu ciclo");

        inicio = input.nextInt();

        System.out.println("Insira o fim do seu ciclo");

        fim = input.nextInt();

        while (inicio<=fim){
            if (inicio%5==0){
            System.out.println(inicio);

        }
            inicio++;
        }
    }
}
