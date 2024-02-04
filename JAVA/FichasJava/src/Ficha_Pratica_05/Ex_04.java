package Ficha_Pratica_05;

import java.time.chrono.MinguoDate;
import java.util.Scanner;

public class Ex_04 {

    //4. Escreva um programa que lê um array de tamanho 10 e encontra o menor elemento.

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int [] vetor = new int[10];
        int extra;


        for (int indice=0;indice<10;indice++){
            System.out.println("Insira os numeros do seu ciclo :");

            vetor[indice]= input.nextInt();
        }


        extra = vetor[0];

        for (int indice=1;indice<10;indice++){
            if (extra>vetor[indice]){
                extra = vetor[indice];}
        }
        System.out.println(" o seu numero mais pequeno é : " + extra);

    }
}
