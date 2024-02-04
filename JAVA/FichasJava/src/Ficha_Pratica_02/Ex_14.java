package Ficha_Pratica_02;

import java.util.Scanner;

public class Ex_14 {
    // 14. Escreva um programa que leia 3 números, seguidamente deve colocar os números no ecrã por ordem crescente.
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int valor1, valor2, valor3;

        System.out.println("insira o primeiro valor");

        valor1 = input.nextInt();

        System.out.println("Insira o segundo valor");

        valor2 = input.nextInt();

        System.out.println("Insira o terceiro valor");

        valor3 = input.nextInt();


        if (valor1 > valor2 && valor2 > valor3) {
            System.out.println(" Os valores na forma crescente apresentam-se da seguinte forma " + valor3 + " " + valor2 + " " + valor1);
        }

        if (valor1 > valor3 && valor3 > valor2) {
            System.out.println(" Os valores na forma crescente apresentam-se da seguinte forma " + valor2 + " " + valor3 + " " + valor1);
        }
        if (valor2 > valor1 && valor1 > valor3) {
            System.out.println("Os valores na forma crescente apresentam-se da seguinte forma " + valor3 + " " + valor1 + " " + valor2);
        }

        if (valor2 > valor3 && valor3 > valor1) {
            System.out.println("Os valores na forma crescente apresentam-se da seguinte forma " + valor1 + " " + valor3 + " " + valor2);
        }

        if (valor3 > valor1 && valor1 > valor2) {
            System.out.println("Os valores na forma crescente apresentam-se da seguinte forma " + valor2 + " " + valor1 + " " + valor3);
        }

        if (valor3 > valor2 && valor2 > valor1) {
            System.out.println("Os valores na forma crescente apresentam-se da seguinte forma " + valor1 + " " + valor2 + " " + valor3);
        }


    }
}





//A > B > C
// A > C > B
// A >