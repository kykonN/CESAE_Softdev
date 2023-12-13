package Ficha_Pratica_06_Metodos;

import java.util.Scanner;

public class Ex_07 {

    // 7- Escreva um programa para desenhar um quadrado no ecrã. Esse quadrado deverá ser desenhado por uma
    //função para a qual são passados três argumentos: caracter a utilizar, número de linhas e número de colunas.
    //Segue-se um exemplo do algoritmo a ser executado, ilustrando o pretendido:


public static void quadrado (String matriz, int linhas, int colunas  ){


    for (int indicelinhas=0;indicelinhas<linhas;indicelinhas++){



        for (int indicolunas=0;indicolunas<colunas;indicolunas++){

            if (indicelinhas==0 || indicolunas == 0 || indicelinhas == linhas-1 || indicolunas==colunas-1){
                System.out.print(matriz);
            }else {
                System.out.print(" ");
            }

        }System.out.print("\n");
    };

}


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        int linhas,colunas;
        String matriz;

        System.out.println("Quantas linhas quer imprimir?");

        linhas = input.nextInt();

        System.out.println("Quantas colunas quer imprimir?");

        colunas = input.nextInt();

        System.out.println("Que caracter quer imprimir?");

        matriz = input.next();




        quadrado(matriz,linhas,colunas);

    }
}
