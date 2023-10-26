/*package Ficha_Pratica_02;

import java.util.Scanner;

public class Ex_16 {
    //16. Escreva um programa que lê um valor em euros (múltiplo de 5) e calcula qual o menor número possível de notas
    //de 200, 100, 50, 20, 10, 5 em que o valor pode ser decomposto. Escrever o valor lido e a relação de notas
    //necessárias.

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //variaveis

        int valor;

        System.out.println("Insira o valor que quer decompor");

        valor = input.nextInt();

        //ler o valor

        //Irá ler o valor o valor contudo terá de se seguir pelo resto para que continue a sua divisão
        // ex : 500 / 200 = 2 ( 2 notas de 200 ) falta 100 € ( logo o resto teria de seguir a divisão seguinte (100 /100 €)
        // ficando - 2 notas de 200€ e 1 nota de 100€


        if (valor >= 200 ) {
            System.out.println("O valor pode ser decomposto em: " + (valor / 200));
            if(
        }
        if (valor < 200 && valor <= 100) {
            System.out.println("O valor pode ser decomposto em:  " + (valor / 100));
        }
        if (valor < 100 && valor >= 50) {
            System.out.println("O valor pode ser decomposto em: " + (valor / 50));
        }
        if (valor < 50 && valor >= 20) {
            System.out.println("O valor pode ser decomposto em: " + (valor / 20));
        }
        if (valor < 20 && valor >= 10) {
            System.out.println("O valor pode ser decomposto em: " + (valor / 10));
        }
        if (valor < 10 && valor >= 5) {
            System.out.println("O valor pode ser decomposto em: " + (valor / 5));
        }

    }


}*/


