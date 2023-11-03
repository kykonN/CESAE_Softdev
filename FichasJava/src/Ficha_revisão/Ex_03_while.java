package Ficha_revisão;

public class Ex_03_while {

    //3 - . Faça um programa que imprima os números ímpares no intervalo de 531 a 750 inclusive. (Não necessita de
    //Scanner ou input do utilizador.
    public static void main(String[] args) {

        int valor;

        valor = 531;

        while (valor <=750){
            System.out.println(valor);
            valor = valor+2;
        }

    }
}
