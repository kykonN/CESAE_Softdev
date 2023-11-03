package Ficha_revisão;

public class Ex_06_while {

    // 6 - Faça um programa que imprima os números inteiros de 1 a 100 inclusive, e no final imprima também o valor do
    //seu somatório. (Não necessita de Scanner ou input do utilizador)

    public static void main(String[] args) {

        int inicio,soma;

        inicio = 1 ;

        soma = inicio;

        System.out.println();

        while (inicio <100){
            System.out.println(inicio);

           inicio = inicio+1;

            soma = soma + inicio;

            System.out.println( "Somatorio" + soma);


            System.out.println("Somatorioa " + soma);        }





    }
}
