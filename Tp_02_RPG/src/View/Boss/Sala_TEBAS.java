package View.Boss;

import Controllers.Heroi;

import java.io.FileNotFoundException;
import java.util.Scanner;

import static View.Boss.Sala_KONOHA_BOSS.bosskonoha;
import static View.Boss.Sala_TEBAS_BOSS.tebasBoss;

public class Sala_TEBAS {

    public static void sala_tebas(Heroi heroi) throws InterruptedException, FileNotFoundException {

        Scanner input = new Scanner(System.in);


        System.out.println(" [ ********* Ὕδρα τῆς Λέρνη ********* ]");

        System.out.println("[Narrator] : In a realm forgotten by time, \n Tebas emerges from the shadows, \n a city once vibrant now lost to malevolence. \n With ancient curses and hidden pasts shrouding the city, your journey unfolds through treacherous passages and haunted realms. \n Unveil the mysteries, decipher cryptic messages, and confront shadows to save Tebas from its torment. \n In this epic adventure, your every step echoes with destiny, \n and the fate of Tebas rests in your hands.");


        System.out.println("\n ... ");
        System.out.println("\n ... ");
        System.out.println("\n ... ");
        System.out.println("\n ... ");

        System.out.println("[" + heroi.getNome() + "]" + "EXCUSE MEEEE ??? What now?? SAVE TEBAS ? What am I? Hercules??? Holy F**  ");

        System.out.println("[Narrator] : Would you like to increase your HP in order to not die so easly in the next battle ?? ");
        Thread.sleep(5000);
        System.out.println("[" + heroi.getNome() + "]" + "OHHHHHHH.....  Fuck.... , F* , F* , F**** , I'M SO F****+ ");

        System.out.println("\n");

        System.out.println("1- Take Potion");
        System.out.println("2- You think I need that? I will WIN with my bear HANDS!! and NAKED! ");

        int op = input.nextInt();

        switch (op) {

            case 1:
                heroi.usarPocao();
                System.out.println(heroi.getNome() + " Used a potion ");
                tebasBoss(heroi);
                break;

            case 2:
                System.out.println("\n");
                System.out.println("[Narrator] : Don't go naked or you will get a cold...  ?? ");
                Thread.sleep(5000);
                tebasBoss(heroi);
                break;

            default:
                System.out.println(" ... I have no more strength  to keep arguing with you... do as you wish... ");


        }

    }
}
