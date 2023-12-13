package Ficha_Pratica_06_Metodos;

import java.util.Scanner;

public class Ex_05 {

    //O exercício deve ser resolvido na mesma classe (por exemplo: Ex_05), deve acrescentar as funções conforme
    //solicitado. No início não conseguirá testar se as funções funcionam ou não (uma vez que não é pedido para
    //desenvolver nada no main), considere fazer o exercício 6 em concorrente para conseguir perceber se está
    //tudo como esperado


    //a) Escreva uma função que recebe um array de inteiros como parâmetro e retorna o maior valor do array.


// --------------------------Assinatura do Metodo --------------------------//

    // --------------------------  PARTE 1  --------------------------//


    static int maior(int[] vetor) {


        for (int indice = 0; indice < vetor.length; indice++) {

        }

        int extra;
        extra = vetor[0];

        for (int indice = 1; indice < vetor.length; indice++) {
            if (extra < vetor[indice]) {
                extra = vetor[indice];
            }
        }
        return extra;


    }


    // b) Escreva uma função que recebe um array de inteiros como parâmetro e retorna o menor valor do array.

    // --------------------------Assinatura do Metodo --------------------------//

    // --------------------------  PARTE 2 --------------------------//

    static int menor(int[] vetor) {

        for (int indice = 0; indice < vetor.length; indice++) {

        }

        int extra;
        extra = vetor[0];

        for (int indice = 1; indice < vetor.length; indice++) {
            if (extra > vetor[indice]) {
                extra = vetor[indice];
            }
        }
        return extra;

    }


    //c) Escreva uma função que recebe um array de inteiros como parâmetro e retorna se o array está crescente

    // --------------------------Assinatura do Metodo --------------------------//

    // --------------------------  PARTE 3 --------------------------//


    public static boolean ordemcrescente(int[] vetor) {


        for (int indice = 1; indice < vetor.length; indice++) {

            if (vetor[indice] < vetor[indice - 1]) {

                return false;


            }


        }

        return true;


    }



    public static void main(String[] args) {

    }
}
