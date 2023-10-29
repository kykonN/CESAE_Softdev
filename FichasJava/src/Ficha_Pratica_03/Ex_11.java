package Ficha_Pratica_03;

import java.util.Scanner;

public class Ex_11 {

    //11. Escreva um algoritmo que leia uma quantidade desconhecida de números inteiros positivos fornecidos pelo
    //utilizador e conte quantos deles estão nos seguintes intervalos: [0.25], [26,50], [51,75] e [76,100]. A entrada de
    //dados deve terminar quando for lido um número negativo.

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // variaveis :
        // - Valor -
        // - interv1 -[0.25]
        // - interv2 -[26,50]
        // - interv3 -[51,75]
        // - interv4 -[76,100]

        int valor,interv1,interv2,interv3,interv4;



        interv1 = 0;
        interv2 = 0;
        interv3 = 0;
        interv4 = 0;


        System.out.println("Insira um valor ");

        valor = input.nextInt();

        while (valor >= 0 &&  valor <= 100  ){

            if (valor>=0 && valor <=25){
                interv1 = interv1+1;
            }
            if (valor >= 26 && valor <= 50){
                interv2 = interv2+1;
            }
            if (valor >= 51 && valor <= 75){
                interv3 = interv3+1;
            }
            if (valor >= 76 && valor <= 100) {
                interv4 = interv4 + 1;

            }if (valor >100){
                break;
            }

            System.out.println("Insira outro valor");
            valor = input.nextInt();
        }
        System.out.println("Os valores que escolheu encontram-se nos intervalos : " + "\n" +"[0.25] - " + interv1 + "\n"  + "[26,50] -" +interv2 + "\n" +"[51,75] -"+ interv3 + "\n" + "[76,100] -" +interv4 );





    }
}
