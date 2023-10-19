package Ficha_Pratica_01;

import java.util.Scanner;

public class Ex_03 {

    //3 - Escreva um programa que calcule e apresente a área e o perímetro de um retângulo. As dimensões
    //devem ser requisitadas ao utilizador.

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double cump,larg,perimetro,area;

        System.out.println("Insira o valor do cumprimento do terreno");

        cump = input.nextInt();


        System.out.println(" Insira o valor da largura do terreno");


        larg = input.nextInt();

        perimetro= (larg * 2 ) + (cump * 2 );

        area = cump * larg;

        System.out.println( "O valor do perimetro do terro é " + perimetro + "\nArea do terreno:" + area +"m2");


    }


}
