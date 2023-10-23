package Ficha_Pratica_02;

import java.util.Scanner;

public class Ex_02 {

   /* 2- Determine e escreva o montante de impostos a pagar sobre um salário anual lido, tendo em conta o seguinte:
    a. Salário até 15.000€ inclusive paga taxa de 20%
    b. Salário superior a 15.000€ paga taxa de 30%

    */

    public static void main(String[] args) {

        // Scan para introdução de dados
        Scanner input = new Scanner(System.in);

        // variavel salário

        double salario;

        System.out.println("Insira o seu salário para verificar taxa");

        salario = input.nextDouble();

        // Condições IF caso seja A ou B
        if (salario <= 15000) {
            System.out.println("Paga taxa de 20 % " + salario * 0.2 + "€");



    }if (salario > 15000) {
            System.out.println("Paga taxa de 30% " + salario * 0.3 + "€");}

}
}
