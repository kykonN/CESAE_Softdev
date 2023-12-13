package Ficha_Pratica_06_Metodos;


import java.util.Scanner;

public class Ex_01_v1 {

    /*tipo_da_função nome_da_funcao(lista_de_parâmetros){ declaração_de_variáveis_locais; bloco_instruções; return(valor_ou_expressão);*/


    // 1 - Implemente uma função void fazerBarulho( ) que receba um animal (String) como argumento. De seguida, de
    //acordo com o animal deve fazer o barulho característico (Ex.: Cão – “Au au au” | Gato – “Miau” | Peixe - “Glub
    //Glub” | Vaca – “Muuuu” | Porco – “Oinc oinc”)


    // --------------------------Assinatura do Metodo --------------------------//

    /**
     * Metodo que lê uma String tipo void...
     * @param animal
     */
    public static void barulho(String animal) {


        switch (animal) {
            case "cao":
                System.out.println("Au au au");
                break;

            case "gato":
                System.out.println("Miauuuu");
                break;
            case "peixe":
                System.out.println("Glub Glub");
                break;
            case "vaca":
                System.out.println("Muuuuuuu");
                break;
            case "Porco":
                System.out.println("Oinc Oinc");
                break;
            default:
                System.out.println("Não temos esse animal");

        }


    }

    // --------------------------Assinatura do Metodo --------------------------
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Insira o animal que pretende ");

        String animal = input.next();

        barulho(animal);





    }
}
