package Ficha_Pratica_03;

public class Ex_06 {


    //6. Faça um programa que imprima os números inteiros de 1 a 100 inclusive, e no final imprima também o valor do
    //seu somatório. (Não necessita de Scanner ou input do utilizador).
    public static void main(String[] args) {


        int valor1, somatorio;

        valor1 = 1;
        somatorio= valor1;

        while (valor1<100){
            System.out.println(valor1);

        valor1++;

        somatorio=valor1+somatorio;}

        System.out.println(somatorio);



    }
    }


