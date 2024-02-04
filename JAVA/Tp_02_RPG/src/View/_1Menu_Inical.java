package View;

import ASCII.ASCII;

import java.io.FileNotFoundException;
import java.util.Scanner;

import static Controllers.CriarPersonagem.criarHeroi;
import static View._2Menu_Criar_Personagem.sala_introdutoria;

public class _1Menu_Inical {



    public static void menuInicial() throws FileNotFoundException, InterruptedException {


        // TITULO DO JOGO
        ASCII.imprmirFile("src/Ficheiro/Titulo.txt");

        // Menu Introdutório


        Scanner input = new Scanner(System.in);

        String op;


        System.out.println("\n ********************* Welcome to DIE_MENSIONS *********************");


        System.out.println("\n ********************* Start a New Game? ********************* ");

        do {
            System.out.println("\n");


            System.out.println("(y) - Yes I'm ready to lose my time playing ");
            System.out.println("\n");
            System.out.println("(n) - No I have better things to do like Coding C++ ");

            op = input.next();
            switch (op) {
                case "y":
                    // link inicio do jogo + Puxar CriarPersonagem

                    sala_introdutoria(criarHeroi());
                    break;

                case "n":

                    System.out.println("Loseeer - You are not worth my time ... Leave then!");
                    break;
                default:
                    System.out.println(" \n ****** Error - Imagine having fat fingers? Yep that's you!! (y) or (n) PLEASE ******" );

            }


        }while (!op.equals("n")) ;
    }


}
