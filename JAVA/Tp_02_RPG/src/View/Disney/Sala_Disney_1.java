package View.Disney;

import Controllers.Heroi;
import Controllers.NPC;

import java.io.FileNotFoundException;
import java.sql.SQLOutput;

import static View.Disney.Sala_Disney_2.salaDisney2Toy;

public class Sala_Disney_1 {


    public static void salaDisney1Monster (Heroi heroi) throws InterruptedException, FileNotFoundException {


        System.out.println(" ********* DIESNEY Dimension ********* ");
        System.out.println("\n");
        System.out.println("\n");
        System.out.println("\n");
        System.out.println("\n");
        Thread.sleep(3000);


        //pts Vida - 100
        //Atque - 15 (Susto) - Sonic Burp
        //Drop - 25 Ouro


        NPC mikeWazowski = new NPC("Mike Wazowski",100,15,25);


        System.out.println("[" + heroi.getNome() + "]"  + " Wait... I'm in bed??? Was this a dream???  ");
        System.out.println("\n");
        System.out.println("\n");
        System.out.println("[" + heroi.getNome() + "]"  + " Can't be... This is not my bedroom ... where am I??  ");
        System.out.println("\n");
        System.out.println("\n");
        System.out.println("\"Closet start to cranking ... the door start to slowly open ... ");
        System.out.println("\n");
        System.out.println("\"BUMMM..... a green ONE eye monster JUMPS FROM THE CLOSET ... he wants to steal our scream... ");
        System.out.println("\n");
        Thread.sleep(3000);
        System.out.println("Mike Wazowski : I won't  leave until I get all your screams even if that cost your LIFE!!! muahahaaha");

        heroi.menuBatalha(mikeWazowski);



        System.out.println("[" + heroi.getNome() + "] :" +" I'm getting out of here ...jesus ...  ");
        System.out.println("[" + heroi.getNome() + "] :" +" Opens the door and exits the room...  ");

        // Ligação ao quarto seguinte .
        salaDisney2Toy(heroi);
    }
}
