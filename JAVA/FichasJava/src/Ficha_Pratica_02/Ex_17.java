package Ficha_Pratica_02;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Ex_17 {

//Um banco autoriza a conceção de um crédito especial aos seus clientes, num montante variável com base no seu
//saldo médio do último ano. Faça um programa que leia o saldo médio de um cliente e calcule o valor do crédito
//especial de acordo com a seguinte tabela. Mostre uma mensagem com o saldo médio e o valor de crédito.
//Saldo Médio Percentagem
//De 0 a 2000 (inclusive) Nenhum crédito
//De 2000 a 4000 (inclusive) 20% do valor do saldo médio
//De 4000 a 6000 (inclusive) 30% do valor do saldo médio
//Acima de 6000 40% do valor do saldo médio
    public static void main(String[] args) {


        //scaner

        Scanner input = new Scanner(System.in);

        // Variaveis

        int saldomedio;

        System.out.println("Introduza o seu saldo médio:");

        saldomedio = input.nextInt();

        if (saldomedio<=2000){
            System.out.println("Não tem direito a nenhum crédito");
        }
        if (saldomedio<=4000){
            System.out.println("Pode fazer um crédito de 20% o valor do seu saldo médio : voce irá receber " + saldomedio * 0.2 + " € ");
        }
        if (saldomedio<=6000){
            System.out.println("Pode fazer um crédito de 30% o valor do seu saldo médio : voce irá receber " + saldomedio * 0.3 + " € ");
        }
        if (saldomedio>6000){
            System.out.println("Pode fazer um crédito de 40% o valor do seu saldo médio : voce irá receber " + saldomedio * 0.4 + "€ ");
        }




    }
}
