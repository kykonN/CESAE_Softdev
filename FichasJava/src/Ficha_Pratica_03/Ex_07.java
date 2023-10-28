package Ficha_Pratica_03;

import java.util.Scanner;

public class Ex_07 {

    //7- Faça um programa que leia um número inteiro e imprima os 5 anteriores e os 5 seguintes;
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Insira um numero: ");

        int numero,aumenta,diminui;

     numero = input.nextInt();

      aumenta = numero+5;

      diminui = numero-5;

      while (diminui < numero){
          System.out.println(diminui);
                  diminui = diminui+1;
      }

      numero=numero+1;

      while (aumenta >= numero){
          System.out.println(numero);
          numero = numero+1;
      }










    }
}
