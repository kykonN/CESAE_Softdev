package Ficha_revisão;

import java.util.Scanner;

public class Ex_11_while {

    //11. Escreva um algoritmo que leia uma quantidade desconhecida de números inteiros positivos fornecidos pelo
    //utilizador e conte quantos deles estão nos seguintes intervalos: [0.25], [26,50], [51,75] e [76,100]. A entrada de
    //dados deve terminar quando for lido um número negativo.


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // variaveis por periodo

        int limite1, limite2, limite3, limite4, valor1;

        System.out.println("Insira um valor");
        valor1 = input.nextInt();
        ;

        limite1 = 0; //[0.25]
        limite2 = 0;// [26,50]
        limite3 = 0;// [51,75]
        limite4 = 0;// [76,100]

        while (valor1 >= 0 && valor1 <= 100) {
            if (valor1 >= 0 && valor1 <= 25) {
                limite1++;
            }
            if (valor1 > 25 && valor1 <= 50) {
                limite2++;
            }
            if (valor1 > 50 && valor1 <= 75) {
                limite3++;
            }
            if (valor1 > 75 && valor1 <= 100) {
                limite4++;
            }
            System.out.println("Insira outro numero");
            valor1 = input.nextInt();

        }

        System.out.println("Os valores que introduziram-se encontram-se contabilizados nos seguintes periodos: ");
        System.out.println("[ 00 - 25 ] : " + limite1);
        System.out.println("[ 26 - 50 ] : " + limite2);
        System.out.println("[ 51 - 75 ] : " + limite3);
        System.out.println("[ 76 - 100] : " + limite4);

    }

}
