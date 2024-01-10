package View.Disney;

import Controllers.Heroi;
import Controllers.NPC;

import java.io.FileNotFoundException;
import java.util.Scanner;

import static View.Disney.Sala_Disney_3.salaDisney3Jafar;
import static View.Disney.Sala_Disney_5.salaDisney5Selva;
import static View.Disney.Sala_Disney_6.salaDisney6Mulan;

public class Sala_Disney_2 {


    public static void salaDisney2Toy (Heroi heroi) throws InterruptedException, FileNotFoundException {

        Scanner input = new Scanner(System.in);
        System.out.println("[" + heroi.getNome() + "]" + "Holy Molly another ROOM???");
        System.out.println("\n");

        System.out.println("This  smaller room full of toys ... with a desk and an old tv...");
        System.out.println("While inspecting the room .... 2 of the TOYS jump in front of " + heroi.getNome());

        System.out.println("[BUZ AND WOODY] : INVASOR,YOU ARE TRANSPASING ANDY DOMAIN... YOU SHALL PAY FOR YOUR SINS ...");
        System.out.println("[" + heroi.getNome() + "]" + " Oh my GOD....NOT AGAIN.... REALLY???  ");

        NPC buzz = new NPC(" Buzz & Woody ",200,45,100);

        heroi.menuBatalha(buzz);


        //NPC -  Buzz lightyear
        //pts vida - 120
        //ataque - Raio laser  - 30 pts
        //
        //NPC - Xerife Woody
        //pts vida - 80
        //ataque - Laçada de Cabra - 15 pts
        //ouro - 100


        System.out.println(heroi.getNome() + "is tired... he sees a few options to leave this room ... ");
        System.out.println(" 1st Option - THE TV .... SAME TV that took him to the VOID ...");
        System.out.println(" 2nd Option - The window... I mean at least is not another DOOR ...");
        System.out.println(" 3th Option - Theres a poster on the wall kinda shining towards him...   ");


        int op;

        System.out.println("Sooo...what should I choose??");
        op = input.nextInt();


        // Diferente Options - Rooms

        switch (op){
            case 1:
                // TV -Conects to JA'FAR room ...
                salaDisney3Jafar(heroi);
                break;
            case 2:
                // WINDOW -STRAIGHT TO JUNGLE - NO NPC
                salaDisney5Selva(heroi);

                break;
            case 3:
                // POSTER - Straight to Mulan Trainning camp
                salaDisney6Mulan(heroi);
                break;

            default:
                System.out.println("Would be nice of you choosing one of the following 3 options");
        }



    }
}
