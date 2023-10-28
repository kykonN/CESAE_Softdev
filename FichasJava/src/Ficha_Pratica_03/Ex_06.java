package Ficha_Pratica_03;

public class Ex_06 {


    //6. Faça um programa que imprima os números inteiros de 1 a 100 inclusive, e no final imprima também o valor do
    //seu somatório. (Não necessita de Scanner ou input do utilizador).
    public static void main(String[] args) {

        int n,c;
        n = 0;
        c= 0;

        while (n<=100){
            System.out.println(n);


            c= c+n;

            n= n+1;



        }
        System.out.println("A soma dos seus numeros " + c );

    }
}
