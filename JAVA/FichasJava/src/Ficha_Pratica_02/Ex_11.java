package Ficha_Pratica_02;

import java.util.Scanner;

public class Ex_11 {

    public static void main(String[] args) {

        //11. Implemente um programa que, após pedir ao utilizador o saldo da conta bancária e montante a creditar/debitar
        //(montante positivo ou negativo, respetivamente), apresente se a operação é válida, ou seja, se o saldo final se
        //mantém positivo depois da operação.

        Scanner input = new Scanner(System.in);

        //variaveis

        int saldo, valor, op;

        System.out.println("Qual o saldo da sua conta?");

        saldo = input.nextInt();

        System.out.println("Deseja creditar (1) ou debitar (2)?");

        op = input.nextInt();

        switch (op) {
            case 1:
                System.out.println("Insira o valor a creditar");

                valor = input.nextInt();

                System.out.println("O seu saldo é " + (saldo + valor)+ "€");

                if (saldo+valor > 0) {
                    System.out.println("O seu saldo é positivo");
                    if (saldo + valor<0)
                        System.out.println("O seu saldo é negativo ");
                if (saldo+ valor == 0)
                    System.out.println("O seu saldo é 0");}

                break;

            case 2:
                System.out.println("Debitar");

                valor = input.nextInt();

                System.out.println("O  seu saldo é " +( saldo - valor) + "€");
                if (saldo - valor > 0 )
                    System.out.println(" O seu saldo é positivo");
                if (saldo - valor < 0)
                    System.out.println(" O seu saldo é negativo não consegue realizar esta operação");
                if (saldo - valor == 0)
                    System.out.println(" Operação realizada");

                break;

        }
    }
}
