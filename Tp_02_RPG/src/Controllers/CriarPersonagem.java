package Controllers;

import java.sql.SQLOutput;
import java.util.Scanner;

public class CriarPersonagem {


    public static Heroi criarHeroi() {

        Scanner input = new Scanner(System.in);

        String nome;
        int hpAtual;
        int forca = 0;
        int nivel;
        int ouro = 0;


        System.out.println("********************* Choose the difficulty level *********************");
        System.out.println("\n");
        System.out.println("1- EASY - like stealing candy from a baby   (\u2060◠\u2060‿\u2060◕\u2060) ");
        System.out.println("2 -HARD - Warming: !! Not suitable for momma's boys   ୧\u2060|\u2060 ͡\u2060ᵔ\u2060 \u2060﹏\u2060 ͡\u2060ᵔ\u2060 \u2060|\u2060୨  ");

        int op;
            // Atribuição dos GP consoante dificuldade. Menu escolha - Criar Personagem
        int ptsjogo = 0;
        do {
            op = input.nextInt();

            switch (op) {

                case 1:
                    ptsjogo = 300;
                    System.out.println(" EASY - Starting the game with 300 (GP = Game Points) ");
                    System.out.println("\n");
                    break;

                case 2:
                    ptsjogo = 220;
                    System.out.println(" HARD - Starting the game with 220 (GP =  Game Points) ");
                    System.out.println("\n");
                    break;

                default:
                    System.out.println("I guess you didn't know about this 2 options...\n You are a Special person I see ... \n Try again please...\n Option 1 or 2?");


            }
        } while (op != 1 && op != 2);

        System.out.println("Enter your character's name: ");
        System.out.println("\n");

        nome = input.next();
        // Setup Forca =  GamePoints * 5
        System.out.println(" You have " + ptsjogo + " GP");
        System.out.println(" Use them wisely to set up your character's strength and HP  ");
        System.out.println("\n");
        System.out.println(" Remember, balance is key ");
        System.out.println("\n");
        System.out.println(" [ Each 1 strength point = 5 game points ]");
        System.out.println("\n");
        System.out.println(" ********************* SETUP YOUR STRENGTH ********************* ");
        System.out.println("\n");

        if (ptsjogo == 300) {
            System.out.println(" Choose between [1 and 59]");
            int gamepts = input.nextInt();
            gamepts = gamepts * 5;
            forca = gamepts;
            ouro = 20;
            System.out.println("Strength : " + "["+forca+"]");
            System.out.println("\n");

        }
        if (ptsjogo == 220) {

            System.out.println("Choose between [1 and 43]");
            int gamepts = input.nextInt();
            gamepts = gamepts * 5;
            forca = gamepts;
            ouro = 10;
            System.out.println("Strength : " + "["+forca+"]");
            System.out.println("\n");

        }


        // Setup HP ( HP = Game Points - Forca )
        hpAtual = ptsjogo - forca;
        System.out.println("Your Stats : [ HP ] " + hpAtual);
        System.out.println("Your Stats : [ STRENGTH ] " + forca);
        System.out.println("Good luck .....You will need it");


        System.out.println(" \n ");
        nivel = 1;


        return new Heroi(nome, hpAtual, forca, nivel, ouro);
    }


}
