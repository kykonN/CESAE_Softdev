package View;

import Controllers.Heroi;

import java.io.FileNotFoundException;
import java.util.Scanner;

import static View._3Sala_Vendedor_1.sala_vendedor;

public class _2Menu_Criar_Personagem {




    public static void sala_introdutoria (Heroi heroi) throws InterruptedException, FileNotFoundException {

        Scanner input = new Scanner(System.in);

        int op;

        System.out.println();
        System.out.println();
        System.out.println("****************************** THE BEGINNING ******************************  ");
        Thread.sleep(3000);
        System.out.println(" What an epic afternoon battling monsters in the park with friends...");
        Thread.sleep(3000);
        System.out.println(" Nightfall has arrived as " + heroi.getNome() + " embarks on the journey back home...  ");
        Thread.sleep(3000);
        System.out.println("As " + heroi.getNome() + " walks home, his mind races with excitement");
        Thread.sleep(3000);
        System.out.println("envisioning the monsters they'll face and the fun they'll have tomorrow.");

        System.out.println("Suddenly, a strange sound echoes through the dark path...  ");

        System.out.println(heroi.getNome()+ " Stops, and freezes, but his gut his way to strong to stay put...");
        System.out.println("\n ");
        System.out.println("\n ");
        System.out.println("\n ");
        System.out.println("chrsssss.....");
        Thread.sleep(3000);
        System.out.println("chrssSSSSss.....");
        Thread.sleep(3000);
        System.out.println("chrssSSSSss.....");
        Thread.sleep(3000);
        System.out.println("\n");
        Thread.sleep(3000);
        System.out.println("It comes from behind the dumpster...");
        System.out.println("\n");
        System.out.println(heroi.getNome()+ " Walks slowly to inspect that strange noise... ");
        Thread.sleep(3000);
        System.out.println("chrssSSSSss.....chrssSSSSss.....");
        Thread.sleep(3000);
        System.out.println("Oh it's just an old TV...says" +heroi.getNome());
        Thread.sleep(3000);
        System.out.println("but waitttt ... it's not plugged into anything.... WHATTTTTTTT ???? ");
        Thread.sleep(3000);
        System.out.println("chrZZZzzzZzzZzZz.....FssfsfsfsFSSFSSSFSFSsffsfsfss");
        Thread.sleep(3000);
        System.out.println("and in an instant the TV pulls " + heroi.getNome() + " in ");
        Thread.sleep(3000);
        System.out.println(" ..... ..... ..... ");

        System.out.println("\n");
        System.out.println("\n");



        // Segue para a Sala - Vendedor
        sala_vendedor(heroi);
    }


}
