import Controllers.Heroi;
import Controllers.NPC;
import Domain.Item.Vendedor;

import java.io.FileNotFoundException;

public class Main_teste {

    public static void main(String[] args) throws InterruptedException, FileNotFoundException {

//        System.out.println("\n ... ");
//        System.out.println("\n ... ");
//
//
//        System.out.println(" [ ********* Ὕδρα τῆς Λέρνη ********* ]");
//        System.out.println("\n  ");
//        System.out.println("\n  ");
//
//
//        System.out.println("[Narrator] : In a realm forgotten by time, \n Tebas emerges from the shadows, \n a city once vibrant now lost to malevolence. \n With ancient curses and hidden pasts shrouding the city, your journey unfolds through treacherous passages and haunted realms. \n Unveil the mysteries, decipher cryptic messages, and confront shadows to save Tebas from its torment. \n In this epic adventure, your every step echoes with destiny, \n and the fate of Tebas rests in your hands.");
//
//
//        System.out.println("\n ... ");
//        System.out.println("\n ... ");
//        System.out.println("\n ... ");
//        System.out.println("\n ... ");
//
//        System.out.println( "EXCUSE MEEEE ??? What now?? SAVE TEBAS ? What am I? Hercules??? Holy F**  ");
//        System.out.println("\n  ");
//        System.out.println("\n  ");
//
//        System.out.println("[Narrator] : Would you like to increase your HP in order to not die so easly in the next room? ");
//        Thread.sleep(3000);
//        System.out.println("\n  ");
//        System.out.println("\n ");
//        System.out.println("OHHHHHHH.....  Fuck.... , F* , F* , F**** , I'M SO F****+ ");

        Heroi heroi = new Heroi("Sasori",100,5,1,100);

      /*  NPC npc = new NPC("Sakura",100,5,0);



        Vendedor vendedor = new Vendedor();

        vendedor.loja(heroi);


        heroi.heroiAtacar(npc);*/


        heroi.batalhaHidra();
    }









}
