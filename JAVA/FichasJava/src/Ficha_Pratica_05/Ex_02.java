package Ficha_Pratica_05;

import java.util.Scanner;

public class Ex_02 {


    //2-Implemente um programa que permita adicionar comissões mensais a um array de tamanho 12 (1 posição para
    //cada mês) e calcular o seu total anual;


    public static void main(String[] args) {

        // Scanner para introduzir codigo
        Scanner input = new Scanner(System.in);



        // declarar o vetor ( dar nome ao vetor e o nr de "gavetas" que queremos)
        int [] vetor = new int [12];

        // para fazer o somatório necessitamos de uma variavel livre para armazenar o valor antigo;
        int soma = 0;

        // ciclo FOR - porque são ciclos precisos que sabemos quantos ciclos vão ter)
        // declaramos a gaveta dentro do ciclo - "indice" e comentamos que enquanto 0 < 12 iremos adicionar 1 gaveta - "" indice++"
        for (int indice=0;indice<12;indice++){
            System.out.println("insira o rendimento do mês [" + indice + "]:");
            // pedimos o valor para inserir em cada uma das gavetas!

            vetor[indice] = input.nextInt();

            // guardamos o valor antigo de cada gaveta e somamos ao novo introduzido
            soma = vetor[indice] + soma;
        }
            // apresentar resultados

        System.out.println("total comissões anual " + soma);










    }
}

