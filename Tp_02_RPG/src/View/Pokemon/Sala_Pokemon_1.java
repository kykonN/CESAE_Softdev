package View.Pokemon;

import Controllers.Heroi;
import Controllers.NPC;

import java.io.FileNotFoundException;

import static View.Pokemon.Sala_Pokemon_2.salaPokemon2;

public class Sala_Pokemon_1 {


    public static void Pokemon1 (Heroi heroi) throws InterruptedException, FileNotFoundException {

        System.out.println(" ********* POKE-D-MON Dimension ********* ");

        System.out.println("\n");
        System.out.println("\n");
        System.out.println("\n");
        System.out.println("\n");
        Thread.sleep(3000);
        System.out.println("Enters");

        System.out.println(" towering grasses sway in the breeze, mythical creatures roam freely, and the air is filled with the promise of epic adventures waiting to unfold.");
        Thread.sleep(3000);
        System.out.println("[" + heroi.getNome() + "]"  + " Wait... what is this place ?? sounds Familiar..  ");
        System.out.println("\n");
        System.out.println("\n");
        Thread.sleep(5000);
        System.out.println("Prepare for Trouble!\n" +
                "Make it Double!\n" +
                "To protect the world from devestation!\n" +
                "To unite all peoples within our nation!\n" +
                "To denounce the evils of truth and love!\n" +
                "To extend our reach to the starts above!\n" +
                "Jessie!\n" +
                "James!\n" +
                "Team Rocket, blast off at the speed of light!\n" +
                "Surrender now or prepare to fight!\n" +
                "Meowth that's right!");

        Thread.sleep(5000);
        System.out.println("\n");
        System.out.println("\n");
        System.out.println("[" + heroi.getNome() + "]"  + " Ok!? ah? ... Team who? ....   ");
        Thread.sleep(5000);
        System.out.println("\n");
        System.out.println("[TEAM ROCKET]: Prepare to fight!! You little silly boy");

        System.out.println("\n");

       NPC teamrocket = new NPC("Team Rocket",100,30,35);

       heroi.menuBatalha(teamrocket);

        //NPC - Team Rocket
        //
        //pts Vida - 100
        //Atque -25 (Arbok - Poison)
        //Drop - 30 Ouro


        System.out.println("[TEAM ROCKET]: Thank badness we're alive!!");
        Thread.sleep(5000);
        System.out.println("[" + heroi.getNome() + "]" + " You guys are a pain in the *S... holy    ");
        System.out.println("[" + heroi.getNome() + "]" + " Well since I don't know the way, let's just walk...   ");
        System.out.println("...");
        Thread.sleep(5000);
        System.out.println("...walked");
        Thread.sleep(5000);
        System.out.println("... walked");
        Thread.sleep(5000);
        System.out.println("... walked");
        Thread.sleep(5000);
        System.out.println("... and walked ");
        Thread.sleep(5000);
        System.out.println("Our hero walked so much that people thought he was a professional jogger.... ");
        System.out.println("... and walked ");
        System.out.println("Until he sees a cave entrance.... Well only way is going through  the cave  ");






        System.out.println("[" + heroi.getNome() + "]" + " Well since I don't know the way, let's just walk...   ");
// Moving to the next room
        salaPokemon2(heroi);






    }
}
