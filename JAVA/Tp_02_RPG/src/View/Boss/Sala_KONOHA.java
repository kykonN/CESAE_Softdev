package View.Boss;

import Controllers.Heroi;

import java.io.FileNotFoundException;
import java.util.Scanner;

import static View.Boss.Sala_KONOHA_BOSS.bosskonoha;

public class Sala_KONOHA {


    public static void sala_konoha(Heroi heroi) throws InterruptedException, FileNotFoundException {

        Scanner input = new Scanner(System.in);


        System.out.println("****************************** Konoha ******************************  ");
        System.out.println("\n");
        System.out.println("\n");
        Thread.sleep(5000);
        System.out.println("[Narrator]: " + heroi.getNome() + " finds himself within the hidden village of Konoha, a place where tradition and modernity seamlessly coexist.");
        Thread.sleep(5000);
        System.out.println("[Narrator]: The architecture reflects a harmonious blend of nature and human craftsmanship, with rooftops adorned by the emblematic leaf symbol of Konoha.");
        Thread.sleep(5000);
        System.out.println("[Narrator]: Walking through the streets, the air is alive with the hustle and bustle of villagers, and vibrant market stalls showcase an array of unique goods.");
        Thread.sleep(5000);
        System.out.println("[Narrator]: In the heart of the village, the Hokage Monument stands tall, a testament to the resilience and strength of the Hidden Leaf.");
        Thread.sleep(5000);
        System.out.println("[Narrator]: Konoha is not just a village; it's a living testament to the spirit of its people, where each structure tells a tale of endurance and unity.");
        System.out.println("\n");
        System.out.println("\n");
        Thread.sleep(5000);
        System.out.println("[" + heroi.getNome() + "] : This will never end... I could just be a farmer  ... somewhere , maybe ... ");
        System.out.println("\n");
        Thread.sleep(5000);
        System.out.println("[Narrator]: As this story keeps evolving our hero feels something is not right in Konoha" );
        System.out.println("\n");
        Thread.sleep(5000);
        System.out.println("\n");
        Thread.sleep(5000);
        System.out.println("[Narrator]: A massive explosion happens as " + heroi.getNome() + "starts getting closer to the village" );
        System.out.println("\n");
        System.out.println("\n");
        System.out.println("******* Do you want to use a potion ? Narrator says it's better if you do! ******* ");
        System.out.println("\n");
        System.out.println("1- Yes , Juice me UP!!!  ");
        System.out.println("2- No, no need for that I m the Best in the world!! Let's move on...");
        int op = input.nextInt();
        switch (op){

            case 1:
                heroi.usarPocao();
                System.out.println(heroi.getNome() + " Used a potion ");
                bosskonoha(heroi);
                break;

            case 2:
                bosskonoha(heroi);
                break;

            default:
                System.out.println("I have no more strength  to keep arguing with you... do as you wish");

        }




    }


}
