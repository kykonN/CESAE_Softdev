package Ficha_Pratica_04;

import java.util.Scanner;

public class Ex_02_Menu {


    // 2- Implemente um programa que leia a opção do menu desejada (opções: 1. Criar, 2. Atualizar, 3. Eliminar, 4. Sair).
    //Se uma das opções 1, 2 e 3 for escolhida, deverá apresentar um texto com a opção escolhida. Caso a escolha
    //esteja fora das opções válidas, deverá informar o utilizador. De seguida, deverá apresentar novamente o menu
    //para poder selecionar novas opções até que a opção 4 seja escolhida.


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int opcao;

        do {
            System.out.println("1. Criar");
            System.out.println("2. Atualizar");
            System.out.println("3. Eliminar");
            System.out.println("4. Sair");

            System.out.println("Insira a opcção = ");

            opcao =input.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Criar");
                    break;

                case 2:
                    System.out.println("Atualizar");
                    break;

                case 3:
                    System.out.println("Eliminar");
                    break;

                case 4:
                    System.out.println("Sair");
                    break;
                default:
                    System.out.println("Erro");
            }

        }
        while (opcao!= 4);







    }
}
