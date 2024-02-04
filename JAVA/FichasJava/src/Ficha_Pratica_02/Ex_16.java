package Ficha_Pratica_02;

import java.util.Scanner;

public class Ex_16 {
    //16. Escreva um programa que lê um valor em euros (múltiplo de 5) e calcula qual o menor número possível de notas
    //de 200, 100, 50, 20, 10, 5 em que o valor pode ser decomposto. Escrever o valor lido e a relação de notas
    //necessárias.

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //variaveis

        int valor,quantidadenotas;

        System.out.println("Insira o valor que quer decompor");

        valor = input.nextInt();

        //ler o valor

        //Irá ler o valor o valor contudo terá de se seguir pelo resto para que continue a sua divisão
        // ex : 500 / 200 = 2 ( 2 notas de 200 ) falta 100 € ( logo o resto teria de seguir a divisão seguinte (100 /100 €)
        // ficando - 2 notas de 200€ e 1 nota de 100€


        if (valor%5==0){
            quantidadenotas=valor/200;
            System.out.println("notas de 200" + quantidadenotas );
            valor=valor%200;


            quantidadenotas=valor/100;
            System.out.println("notas de 100" + quantidadenotas);
            valor=valor%100;

            quantidadenotas=valor/50;
            System.out.println("notas de 50" + quantidadenotas);
            valor=valor%50;

            quantidadenotas=valor/20;
            System.out.println("notas de 20" + quantidadenotas);
            valor=valor%20;

            quantidadenotas=valor/10;
            System.out.println("notas de 10" + quantidadenotas);
            valor=valor%10;
        }

    }


}


