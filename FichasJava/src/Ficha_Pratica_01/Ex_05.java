package Ficha_Pratica_01;

import java.util.Scanner;

public class Ex_05 {

    // 5- 5. Escreva um programa que determine a média aritmética de um conjunto de 3 valores introduzidos pelo
    //utilizador. Tendo em consideração os valores introduzidos, deverá também apresentar a média
    //ponderada considerando as seguintes ponderações: 20%, 30%, 50%

    public static void main(String[] args) {

        Scanner input = new Scanner (System.in);

        // Adicionar variaveis

        double num1,num2,num3,media;

        // adicionar a leitura das variaveis que serão lidas

        System.out.println("Introduza o primeiro numero");

        num1 = input.nextInt();

        System.out.println("Introudza o segundo valor");

        num2 = input.nextInt();

        System.out.println("Introduza o terceiro valor");

        num3 = input.nextInt();


        //adicionar a leitura da media aritmetica

        media = (num1 + num2 + num3) / 3 ;

        System.out.println("A media aritmética é:" + media);

        media = num1 * 0.2 + num2 * 0.3 + num3 * 0.5;

        System.out.println("A media ponderada é:" + media + "%10");



    }
}
