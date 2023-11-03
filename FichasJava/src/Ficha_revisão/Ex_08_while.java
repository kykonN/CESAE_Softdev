package Ficha_revisão;

import javax.crypto.spec.PSource;
import java.util.Scanner;

public class Ex_08_while {

    public static void main(String[] args) {

        //8 -Faça um programa que vai pedindo números ao utilizador até que este introduza o número -1. O computador
        //deve dizer a média dos números introduzidos (excluindo o -1).


        Scanner input = new Scanner(System.in);

        int valor1, termi, contador, soma;

        System.out.println("Insira um valor");

        valor1 = input.nextInt();

        termi = -1;

        soma = valor1;

        contador = 1;

        while (valor1 != termi) {
            System.out.println("Insira outro valor");
            valor1 = input.nextInt();

            soma = valor1 + soma;

            System.out.println("Somatorio é "+""+ soma);

            contador++;
            System.out.println("O seu contador é " + contador);

        }

        contador--;
        soma++;

        System.out.println("a tua soma é " + soma + "\n E o seu contador é " + contador);

        soma = soma / contador;

        System.out.println("A media dos seus numeros é " + soma);


    }

}
