package View.Boss;

import ASCII.ASCII;
import Controllers.Heroi;

import java.io.FileNotFoundException;

public class Sala_TEBAS_BOSS {

    public static void tebasBoss(Heroi heroi) throws FileNotFoundException, InterruptedException {


        System.out.println("\n");

        System.out.println("[Narrator]: The ancient city of Tebas, shrouded in mystery, becomes the battleground for our hero's next formidable challenge.");
        Thread.sleep(5000);
        System.out.println("\n");
        System.out.println("[" + heroi.getNome() + "]:" + " What the HELL IS THAT SOUND????  ");
        System.out.println("\n");
        Thread.sleep(5000);
        System.out.println("[Sudden roar pierces the night]");
        Thread.sleep(5000);

        System.out.println("[Narrator]: The ground trembles as a monstrous creature emerges from the shadows – the legendary Hydra, a serpentine terror .");
        Thread.sleep(5000);

        System.out.println("[" + heroi.getNome() + "]:" + " I do believe I pied my pants... (looks down)... yup ...   ");
        System.out.println("\n");
        Thread.sleep(5000);
        System.out.println("[Hydra]: (sinister hiss) You dare intrude upon my domain, mortal?");
        Thread.sleep(5000);

        System.out.println("[Narrator]: The Hydra's eyes glow with malevolence as it prepares to unleash its wrath upon our hero. Tebas, once a city of myths and wonders, now becomes the stage for an epic battle against the ancient serpent.");
        Thread.sleep(4000);

        System.out.println("[Hero]: If it's a fight you want, Hydra, then it's a fight you'll get!");
        Thread.sleep(3000);

        System.out.println("[Hydra]: (roaring) Prepare for your demise, insolent one!");
        System.out.println("\n");
        System.out.println("\n");
        Thread.sleep(5000);
        ASCII.imprmirFile("src/Ficheiro/Hydra.txt");
        Thread.sleep(5000);


        //Metodo batalha com a Hidra

        heroi.batalhaHidra();

        System.out.println("[Narrator]: With a triumphant roar, " + heroi.getNome() + " emerges victorious against the mighty Hydra.");
        Thread.sleep(5000);

        System.out.println("[Hero]: By the gods, Tebas is safe once more!");
        Thread.sleep(5000);

        System.out.println("[Narrator]: The once-menacing Hydra lies defeated, its multiple heads severed, bringing a newfound peace to the ancient city.");
        Thread.sleep(5000);
        System.out.println("\n");
        System.out.println("[" + heroi.getNome() + "]:" + "Finally it's over.... ( Says the New TEBAS hero while his conscious slowly fades ) ");
        System.out.println("\n");
        Thread.sleep(5000);

        System.out.println("[Narrator]: As " + heroi.getNome() + " makes their way out of Tebas, the city breathes a sigh of relief, its mythical aura undisturbed.");
        Thread.sleep(5000);

        System.out.println("[Narrator]: The night sky above Tebas twinkles with stars, a silent witness to the hero's valor.");
        Thread.sleep(5000);
        System.out.println("\n");
        System.out.println("\n");

        System.out.println("[Narrator]: And so, " + heroi.getNome() + " falls into a deep sleep only awakening by its own mother...");
        System.out.println("[Narrator]: back at his place in the universe ... wondering if all wasn't more than a dream.");
        Thread.sleep(9000);
        System.out.println("[Narrator]: He turns to the side ... looks to his hand and sees the weapon he killed the Hydra with....");
        Thread.sleep(9000);


    }


}
