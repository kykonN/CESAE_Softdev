package Ficha_Pratica_06_Metodos;

import java.util.Scanner;

public class Ex_02 {


    // 2- [Escreva uma função que leia um valor inteiro positivo] (deve solicitar números até que seja inteiro e positivo) e
    //crie uma [função que imprima numa linha um número de asteriscos igual ao valor inserido pelo utilizador.]


    // --------------------------Assinatura do Metodo --------------------------//

    // --------------------------  PARTE 1  --------------------------//


    // 1ª função -public static int - irá da return de nr inteiro.

    // Como queremos dar return de um numero positivo temos de queriar uma função que obrigue o utilizador a introduzir um
    // nr inteiro.


    // - 1 Nomeamos o metodo - lerinteiropositivo
    public static int lerinteiropositivo() {


        //2- introduzimos o scanner para leitura da introdução de dados
        Scanner input = new Scanner(System.in);

        // 3- declaramos a variavel
        int num;


        //4- criamos um loop - do - while - para obrigar o utilizador a colocar um numero inteiro.
        do {
            System.out.println("Insira um numero positivo");
            num = input.nextInt();
        } while (num < 0);

        // 5- O ciclo irá acontecer até ser inserido um numero inteiro que depois dará return ->
        return num;


    }
    // -------------------------- PROJECTO LOGICO -----------------------------//
    // --------------------------  PARTE 2  --------------------------//

    // 6- Nomeamos o 2 metodo a utilizar como função que irá imprimir os asteriscos - asterisco - que irá imprimir um int
    public static void asterisco(int nrasteristos) {

        // 7 - Ciclo for para que quando for lido o nr de astericos necessários o mesmo seguir o ciclo para
        // imprimir o ciclo até atingir o montante indicado pelo utilizador

        //Para - inteiro =0; enquanto o inteiro for menor que o nr de asteriscos , i++ - o i soma +1 e repete o ciclo até igualar nrasteriscos
        // este "nrasteriscos" será igual ao nrinteiro ex : [ nrastericos = 10; - enquanto i< 10 - o mesmo (i) irá somar +1 até chegar ao 10 e irão imprimir astericos
        for (int i = 0; i < nrasteristos; i++) {
            System.out.print("*");
        }


    }
    // --------------------------PROJECTO LOGICO --------------------------//
    // --------------------------  PARTE 3  --------------------------//

    //8- Ligação entre funções para utilização directa no Main;

    public static void main(String[] args) {

        //9 - o nr inteiro será igual ao resultado do metodo - lerinteiropositivo

        int nrinteiro = lerinteiropositivo();
        // 10 - e o metodo asterisco irá utilizar o nrinteiro como montante para impressão do "*"
        asterisco(nrinteiro);


    }


}
