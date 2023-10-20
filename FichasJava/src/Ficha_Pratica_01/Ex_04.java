package Ficha_Pratica_01;

import java.util.Scanner;

public class Ex_04 {

    // -4 Escreva um programa para calcular a área da circunferência. As dimensões devem ser requisitadas ao
    //utilizador
    public static void main(String[] args) {

        //Para introduzir e ler valores;

        Scanner input = new Scanner (System.in);

        //Adicionar variaveis que vão ser utilizadas e tipo de variavel;

        double Pi,r,area;

        // Variavel fixa

        Pi = 3.1415;

        //ler a variavel r (introduzida pelo utilizador)

        System.out.println("Introduza o valor do raio");

        r = input.nextDouble();

        //efectuar o calculo da area

        area = Pi * (r*r);

        //Apresentar resultado da area

        System.out.println("A area da circunferencia é:" + area +"m2");







    }
}
