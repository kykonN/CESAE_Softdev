package Ficha_Pratica_01;

import java.util.Scanner;

public class Ex_08 {

        /* 8- Escreva um programa que calcule a duração (no formato hh:mm:ss) de um álbum musical com 5
canções. A duração de cada canção é lida em minutos e segundos.*/


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);



        int minutosTotais,segundosTotais,segundosTotaisdoalbum,horas,minutos,segundos;

                //  ler min musica 1
        System.out.println("Insira minutos da musica 1: ");

        minutosTotais = input.nextInt();

            //  ler segunds musica 1

        System.out.println("Insira segundos da musica 1: ");

        segundosTotais = input.nextInt();

        //  ler min musica 2

        System.out.println("Insira minutos da musica 2: ");
        minutosTotais = minutosTotais + input.nextInt();

        //  ler segunds musica 2
        System.out.println("Insira segundos da musica 2: ");

        segundosTotais = segundosTotais + input.nextInt();


        //  ler min musica 3
        System.out.println("Insira minutos da musica 3: ");
        minutosTotais = minutosTotais + input.nextInt();

        //  ler segunds musica 3
        System.out.println("Insira segundos da musica 3: ");
        segundosTotais = segundosTotais + input.nextInt();


        //Criar variavel que terá os segundos totais segundosTotaisdoalbum

        segundosTotaisdoalbum = (minutosTotais*60) + segundosTotais;

        System.out.println("Segundos totais do Album" + segundosTotaisdoalbum);

        //acrescentar variavel horas
        // horas é igual aos segundos totais do album a dividir por 3600 segundos

        horas = segundosTotaisdoalbum / 3600;

        System.out.println((horas + "h"));

        minutos = segundosTotaisdoalbum/60;

        segundos = segundosTotais;
        //  calcular os segundos

        segundos= segundosTotais - (horas*3600) - (minutos * 60);

        System.out.println(horas +"h" + minutos + "m" + segundos + "s");




    }
}
