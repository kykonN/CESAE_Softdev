package Ex_06;

import java.util.Scanner;

public class Main {



    // criar objeto :

    public static void main(String[] args) {

        //Scanner

        Scanner input = new Scanner(System.in);

        // instancia de calculadora

        Calculadora calculadora = new Calculadora();

        //Declarar variaveis;

        double num1, num2;

        //ler n1

        System.out.println("Insira um numero");
        num1=input.nextDouble();

        System.out.println("Insira um numero");
        num2 = input.nextDouble();


        System.out.println("Soma: "+calculadora.soma(num1,num2));
        System.out.println("Subtracao: "+calculadora.subtracao(num1,num2));
        System.out.println("Multiplicacao: "+calculadora.multiplicacao(num1,num2));
        System.out.println("Divisao: "+calculadora.divisao(num1,num2));


    }
}
