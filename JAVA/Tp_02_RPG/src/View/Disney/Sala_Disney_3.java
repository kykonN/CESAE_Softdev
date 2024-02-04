package View.Disney;

import Controllers.Heroi;

import java.io.FileNotFoundException;
import java.util.Scanner;

import static View.Disney.Sala_Disney_4_Bonus.salaDisney4Bonus;
import static View.Disney.Sala_Disney_5.salaDisney5Selva;

public class Sala_Disney_3 {

    //TODO: ASCII IF POSSIBLE.


    public static void salaDisney3Jafar (Heroi heroi) throws InterruptedException, FileNotFoundException {

        Scanner input = new Scanner(System.in);

        System.out.println("WHO HAS THE AUDACITY OF DISTURBING MY SLEEP??? ");
        System.out.println("LAGO - PRAAAAA ... DISTURBING MY MASTERS SLEEP ... PRAAAA");
        Thread.sleep(3000);
        System.out.println("[" + heroi.getNome() + "] : " + "Well I guess that's me your majesty  ");
        System.out.println("[" + heroi.getNome() + "] : " + "But don't worry, I lead my self out, Thank you ... ");
        Thread.sleep(3000);
        System.out.println("[JA'FAR] : Since you have disturbed my peace and awaken my parrot...") ;
        System.out.println("[JA'FAR] : You can no longer leave, the only way for you to leave is to answer my riddles...") ;
        System.out.println("\n");
        System.out.println("\n");
        Thread.sleep(3000);
        System.out.println("[" + heroi.getNome() + "] : " + "Bro ... is all this people CRAZYYY? WTF ** ");


        //NPC -  Ja'Far
        //ataque - Ridles - 50 pts
        //ouro - 30
        //acerta - 1 para continuar
        //acerta - 3 para chamar o Génio




        heroi.jafarbatalha1();

        System.out.println("Wanna play again?");
        System.out.println(" 1 - Give me more of those Riddles , I'm going to BEAT YOU BADLYYYY!!");
        System.out.println(" 2- Bro I have no more time for this crap... Let me just Leave !");

        int op;
        op= input.nextInt();

        switch (op){

            case 1 :
                heroi.jafarbatalha2();
                break;

            case 2:

                System.out.println("As you wish young boy ... There are no dreams when you are dead  [Pushes" + heroi.getNome() +"into  a hole on the floor]");
                salaDisney5Selva(heroi);
                break;

            default:
        }




    }
}
