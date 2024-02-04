package Ficha_Pratica_03;

import java.util.IllegalFormatCodePointException;
import java.util.Scanner;

public class Ex_13 {


   // 13. Escreva um programa que leia uma sequência de números inteiros do utilizador e determine se a sequência
   // está em ordem crescente

    public static void main(String[] args) {
        //variaveis - maximo- ler - extra-contador

       Scanner input = new Scanner(System.in);

       int maximo,valor1,extra,contador,check;

        System.out.println("Quantos numeros deseja inserir : ");

       maximo = input.nextInt();

       contador = 0;

       check = 0;

       while (maximo > contador){
           System.out.println("Introduza um numero :");

           valor1 = input.nextInt();

           extra = valor1;

           contador = contador+1;



           if (valor1<=extra){

               check = check+1;

           }




       }
        if (check > 0){
            System.out.println("Não crescente");
        }else {
            System.out.println(" Crescente!!!!!!!");
        }








    }
}
