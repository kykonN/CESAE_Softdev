package View.Pokemon;

import Controllers.Heroi;

import java.io.FileNotFoundException;
import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;

import static View.Sala_Vendedor_geral.salaVendedorGeral;

public class Sala_Pokemon_4 {


    public static void salaPokemon4(Heroi heroi) throws InterruptedException, FileNotFoundException {

        Scanner input = new Scanner(System.in);

        Random random = new Random();

        Thread.sleep(5000);
        System.out.println(" [Shenglong] WHO ENTERS MY DOMAIN??? ");
        Thread.sleep(5000);
        System.out.println("\n");
        System.out.println("[Narrator] [" + heroi.getNome() + "]" + "looks around in sheer amazement, eyes wide open: 'WoOw!");
        Thread.sleep(5000);
        System.out.println("\n");

        System.out.println("[" + heroi.getNome() + "] For Sureeee I'm on Acids!! Theres no way I'm seeing dragons Ball Dragon ... ");
        Thread.sleep(5000);

        System.out.println("[" + heroi.getNome() + "] Probably that's it!! That Chocolate bar that Vitor gave me... ");
        Thread.sleep(5000);

        System.out.println("[" + heroi.getNome() + "] oh man, that Shit is CRAZYYYYY ... I can't wait to tell them about the TRIP... ");
        Thread.sleep(5000);
        System.out.println("\n");
        System.out.println(" [Shenglong] SILENCE! You have 2 options you filthy human,\n\n you  can either \n 1-  go and leave this realm \n 2- Stay and try your luck  ");

        int op;
        op = input.nextInt();
        switch (op) {

            case 1:
                // Leave and move the hero to - Sala_Vendedor_Geral
                System.out.println("[Shenglong] - Farewell tiny human. Do NOT COMEBACK! ");
                Thread.sleep(5000);
                salaVendedorGeral(heroi);
                break;

            // - Play Game
            case 2:


                System.out.println("[Shenglong] - A number will pop up ... you have 3 possible ways o ");

                int sorte;

                sorte = random.nextInt(0, 101);

                System.out.println(sorte);

                if (sorte % 5 == 0) {
                    System.out.println("Guess the goods are on your side  ");
                    heroi.setOuro(heroi.getOuro() + 50);
                    System.out.println(" Added 50 Gold to your account ");
                }
                if (sorte % 2 == 0) {
                    System.out.println(" For a tiny Human you are not that bad ");
                    heroi.setOuro(heroi.getOuro() + 20);
                    System.out.println(" Added 20 Gold to your account ");
                }
                if (sorte % 3 == 0) {

                    System.out.println(" Try find love my friend ... and go touch some grass ");
                    heroi.setOuro(heroi.getOuro() - 60);
                    System.out.println(" Removed 60 gold from your account ");

                }

                salaVendedorGeral(heroi);
                break;

            default:
                System.out.println(" YOU HAVE 2 OPTIONS YOU FILTHY, BRAINDEAD HUMAN ... 1 FINGER , 2 FINGERS pick one!");


        }

    }
}
