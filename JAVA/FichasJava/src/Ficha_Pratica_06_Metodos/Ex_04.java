package Ficha_Pratica_06_Metodos;

import java.util.Scanner;

import static Ficha_Pratica_06_Metodos.Ex_03.*;

public class Ex_04 {


    //4-Implemente o programa “Análise de um Número” que pergunte um número ao utilizador e, de seguida,
    //apresente um menu de opções ao utilizador, que permitem analisar o número inserido. Esse menu de opções
    //deve ter o seguinte aspeto:
    //1. Par ou Ímpar
    //2. Positivo ou Negativo
    //3. Primo ou Não Primo
    //4. Perfeito ou Não Perfeito
    //5. Triangular ou Não Triangular
    //6. Trocar de Número;


    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        int op, num;

        System.out.println("Insira um numero : ");

        num = input.nextInt();


        do {
            System.out.println("1 - Par ou impar");
            System.out.println("2 - Positivo ou Negativo");
            System.out.println("3 - Primo ou Não Primo");
            System.out.println("4 - Perfeito ou não Prefeito");
            System.out.println("5 - Triangular ou Não Triangular");
            System.out.println("6 - Trocar de Número");

            System.out.println("Escolha uma opção ");
            op = input.nextInt();

            switch (op) {
                case 1:
                    if (par(num)) {
                        System.out.println("O seu numero é Par \n");
                    } else {
                        System.out.println("O seu numero é impar\n");
                    }
                    break;
                case 2:
                    if (positivo(num)) {
                        System.out.println("O seu numero é Positivo\n");
                    } else {
                        System.out.println("O seu numero Negativo\n");
                    }
                    break;
                case 3:
                    if (primo(num)) {
                        System.out.println("O seu numero é Primo\n");
                    } else {
                        System.out.println("O seu numero não é Primo\n");
                    }
                    break;
                case 4:
                    if (perfeito(num)) {
                        System.out.println("O seu numero é Perfeito\n");
                    } else {
                        System.out.println("O seu numero não é Perfeito\n");
                    }
                    break;
                case 5:
                    if (triangular(num)) {
                        System.out.println("O seu numero é Triangular\n");

                    } else {
                        System.out.println("O seu numero não é Triangular\n");
                    }
                    break;
                case 6:
                    System.out.println("Escolha outro numero\n");
                    num = input.nextInt();
                    break;
                default:
                    System.out.println("Não válido\n");

            }


        } while (op != 7);
        {
            System.out.println("sair do programa\n");
        }


    }
}