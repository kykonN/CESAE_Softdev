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

        //variaveis a introduzir - inicio - valor a colocar pelo utilizador
        // extra - variavel que ira guardar o valor do utilizador
        // total- dará a conta do fatorial

        int inicio,extra,total;

        System.out.println("Insira um valor");

        inicio = input.nextInt();

        //ler numero e guardar
        extra = inicio;

// total é igual ao inicio porque a variavel encontra-se vazia
        total = inicio;

        // enquanto o extra for menor que 1 fazemos
        while (extra > 1){

            // o total = total x (extra-1)  = se o inicio for 9  o total será = 9x ( extra -1 = 8 )



            total= total * (extra-1);

            //após a multiplicação temos de retirar -1 ao extra para que volte a fazer o circulo novamente
        // extra extra = 8
            extra = extra-1;
        }

        // imprimir a totalidade no fim
        System.out.println(" total: " + total);


    }
}
