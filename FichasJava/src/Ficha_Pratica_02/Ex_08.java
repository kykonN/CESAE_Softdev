package Ficha_Pratica_02;

import java.util.Scanner;

public class Ex_08 {

   // 8. Escreva um programa que leia três notas (0-20 valores) de um aluno, calcule a sua média final ponderada, e diga
   // se está aprovado ou não (mais de 9.5). Ponderações: Nota 1: 25%; Nota 2: 35%; Nota 3:40%.

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        //Variaveis a usar

        double nota1,nota2,nota3,media;

        System.out.println("Insira a 1º nota");

        nota1 =  input.nextDouble() * 0.25;

        System.out.println("Insira a 2º nota");

        nota2 = input.nextDouble() * 0.35;

        System.out.println("Insira a 3º nota");

        nota3 = input.nextDouble() * 0.4;

        media = (nota1+nota2+nota3);

        // argumento

        if (media<9.5) {
            System.out.println(" O aluno não está aprovado" + " " + media);
        }else System.out.println( "O aluno esta aprovado" + " " + media);


    }
}
