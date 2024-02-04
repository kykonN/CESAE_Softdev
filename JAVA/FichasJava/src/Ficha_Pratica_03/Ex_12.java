package Ficha_Pratica_03;

import java.util.Scanner;

public class Ex_12 {

    //12. Faça um algoritmo que leia dois números inteiros, representando os valores início e fim de um intervalo e
    //imprima os múltiplos de 5 entre eles.
    public static void main(String[] args) {

        // variaveis - inicio - fim - m5 -

        Scanner input = new Scanner(System.in);

        int inicio,fim;

        System.out.println("Insira  o inicio do seu intervalo : ");

        inicio = input.nextInt();

        System.out.println("Insira o fim do seu intervalo : ");

        fim = input.nextInt();



        while (inicio<= fim)  {
            if (inicio%5==0){
                System.out.println(inicio);
            } inicio = inicio+1;

        }




    }
}
