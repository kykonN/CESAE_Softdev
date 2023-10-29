package Ficha_Pratica_03;

import java.util.Scanner;
import java.util.concurrent.atomic.AtomicLong;

public class Ex_14 {

    public static void main(String[] args) {

        //14. Escreva um programa que calcule e imprima o fatorial de um número inteiro não-negativo n. Utilize o ciclo
        //while.
        //Exemplo de Fatorial de 5: 5x4x3x2x1=120
        //Exemplo de Fatorial de 8: 8x7x6x5x4x3x2x1=40320;


        Scanner input = new Scanner(System.in);

        int inicio,extra,total;

        System.out.println("Insira um valor");

        inicio = input.nextInt();

        //ler numero e guardar
        extra = inicio;


        total = inicio;

        while (extra > 1){



            total= total * (extra-1);

            extra = extra-1;
        }

        System.out.println(" total: " + total);


    }
}
