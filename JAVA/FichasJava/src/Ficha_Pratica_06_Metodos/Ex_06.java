package Ficha_Pratica_06_Metodos;

import java.util.Scanner;

import static Ficha_Pratica_06_Metodos.Ex_05.*;

public class Ex_06 {


    //6. Implemente o programa “Análise de um Vetor” que pergunte um o tamanho do vetor que o utilizador deseja
    //inserir. De seguida, permita ao utilizador preencher o vetor. Posteriormente apresente um menu de opções
    //ao utilizador, que permitem analisar o vetor inserido. Esse menu de opções deve ter o seguinte aspeto:
    //7. Maior Elemento
    //8. Menor Elemento
    //9. Crescente ou Não Crescente


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        System.out.println("Quantos numeros quer no seu vetor? ");

        int tamanho = input.nextInt();

        int[] vetor = new int[tamanho];

        int op;


        for (int indice = 0; indice < vetor.length; indice++) {
            System.out.println("Insira numeros do seu vetor: ");

            vetor[indice] = input.nextInt();


            do {
                System.out.println("1 -Maior Elemento ");
                System.out.println("1 -Menor Elemento ");
                System.out.println("1 -Crescente ou Não Cresente ");

                System.out.println("Escolha uma opção ");
                op = input.nextInt();

                switch (op) {
                    case 1:
                        System.out.println(" O numero maior do seu vetor é " + maior(vetor));
                        break;

                    case 2:
                        System.out.println("O numero menor do seu vetor é  : " + menor(vetor));
                        break;

                    case 3:
                        ordemcrescente(vetor);
                        if (true
                        ) {
                            System.out.println("O seu vetor é crescente");
                        } else {
                            System.out.println("O seu vetor não é crescente");
                        }
                        break;
                    default:
                        System.out.println("Erro");


                }


            }while (op != 0);
        }


    }


}





