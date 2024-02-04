package Ficha_Pratica_04;

import java.util.Scanner;

public class Ex_03 {

    //Crie um jogo, que peça ao jogador 1 um valor entre 0 e 100. De seguida, deverá permitir ao jogador 2 tentar
    //acertar no valor inserido pelo jogador 1. A cada iteração, enquanto o valor não for descoberto, deverá informar
    //se o valor introduzido pelo jogador 2 é inferior ou superior ao valor inserido pelo jogador 1. No final (quando o
    //valor é descoberto) deverá apresentar o número de tentativas que o jogador 2 necessitou para acertar.

    public static void main(String[] args) {

        //Scanner  = ler dados introduzidos;
        Scanner input = new Scanner(System.in);

        // mensagem - para introduzir dados + variavel 1 ;
        System.out.println("Escolha um numero de 0-100");

        // variaveis
        // - valor1 - Para o 1º Jogador ;
        // tentativa - Para o 2º Jogador ;
        // contador - Contabilizar nr de vezes que se introduz tentativas.
        // Salto = espaçamento ;
        int valor1,  tentativa,contador, salto;

        //  primeira variavel
        valor1 = input.nextInt();


        for (salto=0;salto <= 50; salto++){
            System.out.println();
        }

        // segunda variavel mensagem introdutoria

        System.out.println("jogador 2 adivinha o numero");

        // 2º varivavel - leitura

        tentativa = input.nextInt();

        //contador de tentativas

        contador = 1;

        // Enquanto - o valor1 for diferente da tentativa o ciclo vai repetir
        // Se a tentativa for mais pequena que o valor escolhido - imprime - "baixo"

        while (valor1 != tentativa) {
            if (tentativa < valor1) {
                System.out.println("Baixo");
            }

            // Se a tentativa for maior que o valor escolhido - imprime - "alto"
            if (tentativa > valor1) {
                System.out.println("Alto");
            }
            // segue o ciclo depois de impresso - baixo ou alto - e imprime - try again,
            System.out.println("Tente novamente");

            // terminar o ciclo para recomeçar - volta a ler  o numero ;
            tentativa = input.nextInt();

            // contador  - conta cada tentativa feita - ou cada volta ao ciclo que deu
            contador++;


        }

        //quando valor1 == tentativa - o ciclo termina e é impresso a mensagem com o nr de tentativas !




        System.out.println("Parabens voce acertou com um numero máximo de " + contador +  " tentativas" );

    }






}


