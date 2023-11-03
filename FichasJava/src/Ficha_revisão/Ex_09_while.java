package Ficha_revisão;

import java.util.Scanner;

public class Ex_09_while {
    // 9. Faça um programa que leia um número inteiro e imprima os números pares entre 2 e o número lido inclusive.
    //Suponha que o número lido da entrada será maior que 2.
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int valor1,salto;


        System.out.println("Insira o seu numero");

        valor1 = input.nextInt();
        salto = 2;

        while (salto<=valor1){
            System.out.println(salto);
            salto = salto +2;
        }





    }
}
