package Ficha_Pratica_02;

import java.util.Scanner;

public class Ex_12 {

    //12. Implemente um programa de menu (opções do menu: 1. Criar 2. Atualizar 3. Eliminar 4. Sair). Se uma das opções
    //1, 2 ou 3 for escolhida, imprima na tela a opção selecionada, se for a 4 não deve fazer nada. Caso a opção for
    //inválida, deve informar o utilizador.

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int op, valor;


        System.out.println("Escolha a opção que deseja selecionar:\n \n1. Criar \n2. Atualizar \n3. Eliminar \n4. Sair");

        op = input.nextInt();
        switch (op) {
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
                System.out.println("sair");
                break;
            default:
                System.out.println("Opção invalida");
        }

    }
}
