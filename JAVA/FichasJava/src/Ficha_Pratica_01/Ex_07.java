package Ficha_Pratica_01;

import java.util.Scanner;

public class Ex_07 {

    /*7. Escreva um programa que requisite ao utilizador o preço de 3 produtos adquiridos. Apresente o valor
    a pagar, considerando que deverá ter um desconto de 10% sobre o total dos produtos */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double prod1,prod2,prod3,result,desc,fin;

        System.out.println("Produto 1");

        prod1 = input.nextDouble();

        System.out.println("Produto 2");

        prod2 = input.nextDouble();

        System.out.println("Produto 3");

        prod3 = input.nextDouble();

        result = prod1 + prod2 + prod3;

        System.out.println("Valor a pagar é de : " + result + "€");


        desc = result * 0.10;

        fin = result - desc;

        System.out.println(" O valor a pagar com o desconto de 10% é de " + fin + "€");



    }


}
