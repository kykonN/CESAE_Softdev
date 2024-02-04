package Ficha_Pratica_05;

import java.time.chrono.MinguoDate;
import java.util.Scanner;

public class Ex_05 {

    public static void main(String[] args) {


        // 5. Escreva um programa que lê um array de tamanho 10 e calcula a média dos elementos.

        Scanner input = new Scanner(System.in);

        int [] vetor= new int[10];

        double soma = 0;

        for (int indice=0;indice<10;indice++){
            System.out.println("Insira outro numero : ");

            vetor[indice] = input.nextInt();

            soma = vetor[indice] + soma;
        }

        soma = soma / 10;

        System.out.println("a sua média  é " + soma);









    }
}
