package View.Disney;

import Controllers.Heroi;

import java.io.FileNotFoundException;
import java.util.Random;
import java.util.Scanner;

import static View.Sala_Vendedor_geral.salaVendedorGeral;

public class Sala_Disney_6 {
    public static void salaDisney6Mulan(Heroi heroi) throws FileNotFoundException, InterruptedException {


        Scanner input = new Scanner(System.in);

        Random random = new Random();



        System.out.println("******************************  Training Camps ******************************  ");

        System.out.println("\n");
        System.out.println("\n");
        Thread.sleep(5000);
        System.out.println("[Lee Shang]: Welcome to the training camp . ");
        Thread.sleep(5000);
        System.out.println("[Lee Shang]: Here you will become MANs ready for WAR  or you WIll go home like maggots  ");
        Thread.sleep(5000);

        int op;
        do {
            System.out.println(" SO what do you want? ");
            System.out.println("\n");
            System.out.println(" 1- Be a man and train to be a Killing machine");
            System.out.println(" 2- Yeah I can't really see my blood, imagine killing - No thank you");

            op = input.nextInt();

            switch (op) {

                case 1:
                    System.out.println("[Lee Shang]: Will start by learning how to shoot an arrow properly.  ");
                    System.out.println("\n");
                    System.out.println("\n");
                    System.out.println(" [ ARROW SHOOT ] ");
                    System.out.println("[Lee Shang]: IF you manage to aim in target you will be rewarded ONLY if you go above 5 targets  ");
                    System.out.println("[Lee Shang]: So good luck to all of you, because if you miss more then 5... you are also rewarded...  ");
                    Thread.sleep(5000);
                    System.out.println("\n");
                    System.out.println("\n");

                    int acertos;

                    acertos = random.nextInt(0, 11);

                    System.out.println(acertos);

                    if (acertos >= 5) {
                        System.out.println("Wow you are on FIRE ... Maybe I setup this challenge as easy one ");
                        heroi.setOuro(heroi.getOuro() + 50);
                        System.out.println(heroi.getNome() + " Gets 50 gold ");
                    }
                    if (acertos < 5) {
                        System.out.println(" You are so bad you shot yourself in the foot... Luckly you did not kill anyone");
                        heroi.setHp(heroi.getHp() - 30);
                        System.out.println(heroi.getNome() + " Lost 30 HP ");
                    }

                    System.out.println("[Lee Shang]: Well not everything is bad... you are still Ugly and alive go rest ");

                    System.out.println("[NARRATOR] : As " +heroi.getNome() + "gets in the tent he passes into another dimension ...");

                    // Next room
                    salaVendedorGeral(heroi);

                    break;

                case 2:

                    System.out.println(" Expecting  that behaviour from a peasant like you ...");
                    System.out.println("[NARRATOR] : As " +heroi.getNome() + "gets in the tent to start packing, he teleports into another dimension ...");

                    // Next room
                    salaVendedorGeral(heroi);
                    break;

                default:
                    System.out.println("There are no 3rd option my friend, so stop being stupid and answer 1 or 2");
            }

        } while (op != 1 && op != 2);


    }


}
