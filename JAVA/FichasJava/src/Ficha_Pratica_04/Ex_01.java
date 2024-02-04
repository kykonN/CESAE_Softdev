package Ficha_Pratica_04;

import java.util.Scanner;

public class Ex_01 {


    //1 - Implemente um programa que peça ao utilizador dois valores e um carácter representando uma das quatro
    //operações aritméticas (+, -, *, /). Apresente o resultado de aplicar a operação correspondente aos valores. No
    //final, deverá perguntar ao utilizador se deseja repetir, permitindo-lhe efetuar novos cálculos. Exemplo: Deseja
    //continuar? (introduza s/n)
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        int valor1, valor2;

        String op, s;


        do {


            System.out.println("Insira o seu primeiro valor");

            valor1 = input.nextInt();

            System.out.println("Inisra o segundo valor");

            valor2 = input.nextInt();

            System.out.println("Insira um sinal para a operação que quer realizar (+ - * /)");

            op = input.next();

           // Escolhe operação menu
            switch (op) {
                case "+":
                    System.out.println(" Resultado " + (valor1 + valor2));
                    break;

                case "-":
                    System.out.println(" Resultado " + (valor1 - valor2));
                    break;
                case "*":
                    System.out.println("Resultado " + (valor1 * valor2));
                    break;
                case "/":
                    System.out.println("Resultado " + (valor1 / valor2));
                    break;
                default:
                    System.out.println("Erro");
            }

            do {
                System.out.println(" quer continuar? s - para continuar e  n - para parar ");

                s = input.next();



                // enquanto não escrever s ou n o ciclo não pára de repetir - .equals é para String variaveis.
            } while (!s.equals("s") && !s.equals("n"));







        } while (!s.equals("n")) ;
    }
}