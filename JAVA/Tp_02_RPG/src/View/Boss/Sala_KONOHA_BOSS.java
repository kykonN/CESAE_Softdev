package View.Boss;

import ASCII.ASCII;
import Controllers.Heroi;

import java.io.FileNotFoundException;
import java.util.Random;

public class Sala_KONOHA_BOSS {

    public static void bosskonoha (Heroi heroi) throws FileNotFoundException, InterruptedException {


        System.out.println("****************************** PAIN FIGHT ******************************  ");
        System.out.println("\n");
        Thread.sleep(4000);
        System.out.println("[Narrator]: Smoke billows into the night sky, and an ominous aura fills the air.");
        Thread.sleep(5000);
        System.out.println("[Narrator]: Little does " + heroi.getNome() + " know that the chaos he witnesses is merely the prelude to an even greater threat.");
        Thread.sleep(5000);
        System.out.println("[Narrator]: In the heart of the devastation, Pain, the enigmatic leader of Akatsuki, emerges with purpose.");
        Thread.sleep(5000);
        System.out.println("[Narrator]: Six figures, each bearing the Rinnegan, stand alongside him, ready to bring their vision of peace through pain to fruition.");
        Thread.sleep(5000);
        System.out.println("[Narrator]: Konoha braces for the storm as Pain's invasion begins, marking a chapter of darkness in the village's chronicles.");



        heroi.batalhaPain();



        System.out.println("[" + heroi.getNome() + "]:" + "Finally it's over.... (Says the Hero in bad shape while bleeding...) ");

        Thread.sleep(5000);

        System.out.println("[Narrator]: The villagers, once gripped by fear, now cheer in gratitude, celebrating the hero's bravery.");
        Thread.sleep(5000);

        System.out.println("[" + heroi.getNome() + "] : (looking at the horizon) This journey has been intense, but I've made it through.");
        Thread.sleep(5000);

        System.out.println("[Narrator]: The sun sets over Konoha, casting a warm glow on the village that stands resilient against the shadows.");
        Thread.sleep(5000);

        System.out.println("[Hero]: (smiling) Time to  finally rest. He falls unconscious.");
        Thread.sleep(5000);

        System.out.println("[Narrator]: And so, " + heroi.getNome() + " wakes up to a new life as Hokage of Konoha village, keeping it safe....");
        Thread.sleep(5000);

        System.out.println("[Narrator]: The hero's tale continues, for there are always new adventures on the horizon...");

        Thread.sleep(5000);
        ASCII.imprmirFile("src/Ficheiro/konoha.txt");
        Thread.sleep(5000);
    }

    }

