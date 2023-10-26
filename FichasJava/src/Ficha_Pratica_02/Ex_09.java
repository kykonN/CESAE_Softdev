package Ficha_Pratica_02;

import java.util.Scanner;

public class Ex_09 {

    public static void main(String[] args) {


        //9. Crie um programa que mostre o menor de três números inteiros lidos.

        Scanner input = new Scanner(System.in);


        // variaveis

        int valor1,valor2,valor3;

        System.out.println("Insira o primeiro valor");

        valor1 = input.nextInt();

        System.out.println(" Insira o segundo valor");

        valor2 = input.nextInt();

        System.out.println(" Insira o terceiro valor");

        valor3 = input.nextInt();

        //argumento

        if (valor1<valor2 && valor1< valor3) {
            System.out.println("O valor " + valor1 + " é o valor menor");
        }if (valor2<valor1 && valor2<valor3) {
            System.out.println("O valor " + valor2 + " é o menor valor");
        }if (valor3<valor1 && valor3<valor2 )
            System.out.println("O valor " + valor3 + " é o menor valor");





    }

}
