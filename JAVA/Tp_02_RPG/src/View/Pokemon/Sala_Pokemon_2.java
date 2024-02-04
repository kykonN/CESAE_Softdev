package View.Pokemon;

import Controllers.Heroi;

import java.io.FileNotFoundException;

import static View.Pokemon.Sala_Pokemon_3.salaPokemon3;

public class Sala_Pokemon_2 {


    public static void salaPokemon2 (Heroi heroi) throws InterruptedException, FileNotFoundException {



    System.out.println("Our hero walks into the cave, its entrance swallowing him in darkness.");
Thread.sleep(5000);
System.out.println("[" + heroi.getNome() + "] : It's so dark in here... Where am I even going?");
        System.out.println("\n");
        Thread.sleep(5000);
System.out.println("Days pass as our hero wanders through the labyrinthine cave, hugging every wall, his senses heightened with each eerie noise echoing in the darkness.");
Thread.sleep(5000);
        System.out.println("\n");
System.out.println("[" + heroi.getNome() + "] : What was that?! Is something following me?");
        System.out.println("\n");
        Thread.sleep(5000);
System.out.println("Freaking out with every step, our hero's courage wavers until, in the distance, a faint light emerges, gradually growing brighter.");
Thread.sleep(5000);
System.out.println("Hope flickers in our hero's heart as he moves towards the light, his pace quickening with anticipation.");
System.out.println("As the brilliance intensifies, the cave's grip loosens, revealing a breathtaking landscape beyond.");
Thread.sleep(5000);
System.out.println("Emerging from the cave, our hero stands on the threshold of a new world, bathed in the warm glow of an unknown land.");
System.out.println("[" + heroi.getNome() + "] : Where am I now? What adventures await in this uncharted realm?");

// Moving to the next room
        salaPokemon3(heroi);
}


}
