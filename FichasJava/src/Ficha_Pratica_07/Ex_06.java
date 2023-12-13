package Ficha_Pratica_07;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ex_06 {


    //6. Escreva um programa que leia um ficheiro de texto contendo nomes e idades separados por vírgulas e
    //imprima o nome da pessoa mais velha na consola.


    public static void main(String[] args) throws FileNotFoundException {


        File ficheiroaler = new File("FichaPratica07/exercicio_06.txt");


        Scanner maquinaler = new Scanner(ficheiroaler);

// variaveis

        int idadeatual = 0;
        String linha, nomeatual;


        int idadedomaisvelho=0;
        String Nomedomaisvelho=" ";

        // Ciclo é iniciado igual para todos ;

        while (maquinaler.hasNextLine()){
            linha = maquinaler.nextLine();


            // declarar array de strings e onde vamos fazer o split ",";

            String [] itenslinha = linha.split(",");

            // Depois do split temos a divisão do array em 2 variaveis

            //  [ Nome da pessoa = 0 ] [idade da pessoa = 1 ]  - Posição [0] [1]


            // nomeamos as variaveis com as respetivas posições dentro do array - 0 e 1

            // 0 para  a String  e 1 para os int;
            nomeatual = itenslinha[0];

            idadeatual = Integer.parseInt(itenslinha[1]);
            //

                // depois de divididos, iniciamos o ciclo para identificar a idade do maior

            // Inicializamos mais 2 variaveis - 1 para guardar a idade do mais velho e uma outra para guardar  o nome do mais velho.


            if (idadeatual>idadedomaisvelho){
                idadedomaisvelho=idadeatual;
                Nomedomaisvelho=nomeatual;






            }

        }
        System.out.println(" Pessoa mais velha :" +Nomedomaisvelho + " com " + idadedomaisvelho + " anos");














    }



}
