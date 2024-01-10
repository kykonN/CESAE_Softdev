package View.Disney;

import Controllers.Heroi;

import java.io.FileNotFoundException;

import static View.Disney.Sala_Disney_6.salaDisney6Mulan;

public class Sala_Disney_5 {


    public static void salaDisney5Selva (Heroi heroi) throws InterruptedException, FileNotFoundException {

        System.out.println("******************************  Jungle ******************************  ");

        System.out.println("[NARRATOR]: As " + heroi.getNome() + " tumbles through the dimensional void, he suddenly crashes into a vibrant jungle.");
        Thread.sleep(5000);
        System.out.println("[NARRATOR]: The air is filled with the lively sounds of singing birds .");
        Thread.sleep(5000);
        System.out.println("[NARRATOR]: The scenery is a symphony of colors as friendly animals pass by, each seemingly humming the carefree tune of Hakuna Matata.");
        System.out.println("[NARRATOR]: It's a jungle paradise, where worries are left behind, and the circle of life is in perfect harmony.");
        Thread.sleep(5000);
        System.out.println("[NARRATOR]: " + heroi.getNome() + " finds himself in a magical dimension, a place where Hakuna Matata truly rules.");
        System.out.println("\n");
        Thread.sleep(5000);
        System.out.println("[" + heroi.getNome() + "]:" +" Ok I know where I am, I guess this is the best one so far... ?   ");
        Thread.sleep(5000);
        System.out.println("\n");

        System.out.println("[NARRATOR]: " + heroi.getNome() + " takes in the serene atmosphere, captivated by the enchanting jungle.");
        Thread.sleep(5000);
        System.out.println("[NARRATOR]: However, the tranquility is short-lived as a mysterious force disrupts the harmony, causing the jungle to ripple with uncertainty.");
        Thread.sleep(5000);
        System.out.println("\n");
        System.out.println("[" + heroi.getNome() + "]:" +" WAIT , WAIITT!! ... NOT AGAIN PLEASE....   ");
        Thread.sleep(5000);
        System.out.println("\n");

        System.out.println("[NARRATOR]: Suddenly, a rift in the dimension appears, and a powerful surge lifts " + heroi.getNome() + " once again.");
        Thread.sleep(5000);
        System.out.println("[NARRATOR]: As quickly as he arrived, " + heroi.getNome() + " is whisked away to another unknown destination, leaving the Hakuna Matata jungle behind.");
        Thread.sleep(5000);

        System.out.println("\n");
        System.out.println("[" + heroi.getNome() + "]:" +" SHI***** **** ****** ****  ( voice fades away while is taken away by the    ");
        Thread.sleep(5000);
        System.out.println("\n");
        System.out.println("[NARRATOR]: The journey continues, and the circle of life takes an unexpected turn in this ever-unpredictable dimension.");

        salaDisney6Mulan(heroi);

    }
}
