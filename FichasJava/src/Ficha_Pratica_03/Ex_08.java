package Ficha_Pratica_03;

import java.util.Scanner;

public class Ex_08 {


    //8 -Faça um programa que vai pedindo números ao utilizador até que este introduza o número -1. O computador
    //deve dizer a média dos números introduzidos (excluindo o -1).
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //4 variaveis - valor = input do utilizador
        //media = será a soma dos valores do utilizador
        //totalidadevalor - loop de +1 para contar quantas vezes é inserido um valor pelo utilizador
        //termi = -1 (

        int valor,media,totalidadevalor,termi;

        //pedir o valor ao utilizador

        System.out.println("Insira um valor : ");

        //ler o valor

        valor = input.nextInt();

        //variavel de finalizar o programa

        termi = -1;

        // a variavel média vai correr no background em que a media será igual ao valor introduzido;

        media = valor;

        // totalidade irá ser 1 pois conta com o primeiro valor inserido

        totalidadevalor = 1;




        // enquanto o Valor for diferente de -1 - corre ou pára o programa;
        while (valor != termi) {

            // corre o programa e pede para inserir outro valor ;

            System.out.println("insira outro um valor : ");

            // pedimos para inserir outro valor;;

            // ler o valor

            valor = input.nextInt();

            //se o valor continuar a ser diferente de -1


            if (valor != termi){
                // a media irá guardar o primeiro valor e somar ao valor seguinte e consequentemente

            media = valor + media;

            // E a totalidade do valor será igual a 1 + 1;


            totalidadevalor = totalidadevalor + 1;}

            // enquanto correr os valores diferentes de -1 estas condições irão se verificar e ficarão em loop
        }
            // por fim quando o programa é finalizado a media (somatorio dos valores irá ser dividida pela totalidade (contador do nr de vezes o valor foi introduzido)
        media = media / totalidadevalor;

        // impressão da média
        System.out.println("A media dos seus numeros é : " + media);





    }
}
