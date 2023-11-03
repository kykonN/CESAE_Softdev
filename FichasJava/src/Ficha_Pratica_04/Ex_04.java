package Ficha_Pratica_04;

import java.util.Scanner;

public class Ex_04 {

    //4- Escreva um programa que indique se um número pedido ao utilizador é primo. (Chamamos de número primo um
    //número natural que só possui dois divisores: 1 e ele mesmo). (Por exemplo: 1, 2, 3, 5, 7, 11, 13, 17, 19, 23, etc…

    public static void main(String[] args) {
        // Scanner
        Scanner input = new Scanner(System.in);
        // variavel do valor a ser introduzido
        int valor1;

        System.out.println("Insira  o numero que quer verificar o resultado : ");
        // leitura da variavel
        valor1 = input.nextInt();


        // FOR - [ Expressão ] , [Condição] , [ Experssão 2 ]
        // PARA - variavel = (v2)  , v2 < valor1; v2++

        // o ciclo inicia-se com a variavel = 2 para depois seguir a condição de ser variavel < valor e por fim entra na expressão 2 de variavel2 ++ ;

        // se a condição se mantiver ele irá realizar o ciclo o numero de vezes necessárias até ter a variavel2 > valor!

        boolean primo;

        primo = true;

        for (int divisor=2; divisor<valor1;divisor++){

            // Depois de realizar o ciclio dos divisores, adicionamos outra condição para continuar a leitura

            // SE  valor for divisivel pela variavel e der  0 - então o numero não é primo.

         System.out.println("Vou tentar dividir " + valor1 + "%" + divisor);


         if (valor1%divisor==0){
            primo = false;
             System.out.println("Numero deixou de ser primo");
         }

     }

        if (primo){
            System.out.println("Primo");

        }else
            System.out.println("Não Primo");







    }


}
