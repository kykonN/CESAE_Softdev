package Ficha_Pratica_05;

import java.util.Scanner;

public class Ex_07 {


    // 7. Implemente um programa que armazene num array 10 valores pedidos ao utilizador, e retorne o maior valor par
    //inserido. Caso não exista, deverá informar o utilizador

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        int [] vetor = new int[10];
        int extra;
        // Vetor com pedido para inserir valores


        // Ciclo For para armazenar as 10 variaveis no vetor  com pedido ao utilizador ...
        for (int indice=0;indice<10;indice++){
            System.out.println("Insira o seu numero : ");
            vetor[indice] = input.nextInt();
        }

        // variavel extra que será lida e irá armazenar  as variaveis
        // será a variavel que fará a verificação dos numeros pares *

        extra = vetor[0];

        for (int indice=0;indice<10;indice++){
            if (vetor[indice]%2==0){
                if (vetor[indice]> extra){
                    extra=vetor[indice];
                }

            }

        }
        if (extra != vetor[0]){
            System.out.println("o maior valor par é " + extra);
        }else {
            System.out.println("Não foi inserido nehum valor par");
        }











    }
}
