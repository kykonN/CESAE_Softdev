package View.Pokemon;

import Controllers.Heroi;
import Controllers.NPC;

import java.io.FileNotFoundException;
import java.sql.SQLOutput;

import static View.Pokemon.Sala_Pokemon_4.salaPokemon4;

public class Sala_Pokemon_3 {


    public static void salaPokemon3(Heroi heroi) throws InterruptedException, FileNotFoundException {

        System.out.println("[Narrator] : As our hero starts descending from the cave the vegetation starts to get deeper and deeper");
        System.out.println("[Narrator] : It looks like a jungle, a weird one ... Full of ginormous trees and massive flowers and bugs.. ");
        Thread.sleep(3000);
        System.out.println("[Narrator] : And when  + [" + heroi.getNome() + "]" + "looked closely, he notice the sky had this brownish colour ....");
        System.out.println("[" + heroi.getNome() + "] oh noooo, I'm still inside the CAVE!! ");

        NPC gryemound = new NPC("Greymound",150,50,80);
        // NPC -Greymon
        //
        //pts Vida - 150
        //if - ataqueAgua == 100 dmg
        //Atque -50 (Charge)
        //Drop - 80 Ouro


        System.out.println("[Narrator]: As " + heroi.getNome() + " journeys deeper into the jungle, a formidable figure emerges from the lush foliage.");
        System.out.println("[" + heroi.getNome() + "] Who goes there?");
        Thread.sleep(3000);
        System.out.println("[Greymon]: Roar! I am Greymon, the guardian of this mysterious jungle! Prepare yourself!");
        System.out.println("[" + heroi.getNome() + "] Greymon? Isn't that a Digimon?");

       heroi.menuBatalha(gryemound);

        System.out.println("[Narrator] : - Our hero came out victorious, not in the best shape, but victorious nevertheless ....  ");

        System.out.println("[Narrator] : As he starts walking towards the jungle everything starts shaking and crumbling ...");
        Thread.sleep(5000);
        System.out.println("[Narrator]: The aftermath of the battle triggers a seismic disturbance, causing the very foundation of the jungle to quake.");
        System.out.println("[Narrator]: Massive trees sway dangerously, and the ground beneath " + heroi.getNome() + "'s feet becomes increasingly unstable.");
        Thread.sleep(5000);
        System.out.println("[Narrator]: A deafening roar reverberates through the air, leaving our hero in suspense....");
        System.out.println("[Narrator]: The seismic disturbance intensifies, and suddenly, the very ground beneath " + heroi.getNome() + " crumbles away.");
        System.out.println("[Narrator]: He plummets into an endless abyss, the air rushing past him as the jungle retreats into the distance.");
        Thread.sleep(5000);
        System.out.println("[Narrator]: Falling, falling, and falling, " + heroi.getNome() + " descends into pure darkness.");
        System.out.println("[Narrator]: Time seems to lose its meaning as he freefalls through the void, a solitary speck in the vast emptiness.");
        Thread.sleep(5000);
        System.out.println("[Narrator]: Until, finally, he comes to a sudden stop, surrounded by impenetrable darkness.");

// Moving to the next room
        salaPokemon4(heroi);

    }


}
