package View.Disney;

import ASCII.ASCII;
import Controllers.Heroi;
import Domain.Item.ConsumivelCombate;

import java.io.FileNotFoundException;

import static View.Disney.Sala_Disney_5.salaDisney5Selva;

public class Sala_Disney_4_Bonus {

    public static void salaDisney4Bonus (Heroi heroi) throws InterruptedException, FileNotFoundException {




        System.out.println("****************************** THE CAVE OF WONDERS ******************************  ");
        System.out.println("\n");
        System.out.println("\n");
        Thread.sleep(5000);
        System.out.println("\n");
        System.out.println("[GENIE] : Oy! Ten thousand years in a tin can'll give you such a crick in the neck!");
        ASCII.imprmirFile("src/Ficheiro/genio.txt");

        Thread.sleep(5000);
        System.out.println("\n");

        System.out.println("[" + heroi.getNome() + "]:" + " What the Hell ?" );

        Thread.sleep(5000);
        System.out.println("\n");


        System.out.println("[GENIE] : C'mon, kid, what's it gonna be? Cash, camels, Casbahs?");

        Thread.sleep(5000);
        System.out.println("\n");

        System.out.println("[" + heroi.getNome() + "]:" + "I'm so lost right now .... Who are you ? " );

        Thread.sleep(5000);
        System.out.println("\n");

        System.out.println("[GENIE] :Excuse me? Did you came to my cave didn't you? ? Did I not offer you the standard wish package? ");
        Thread.sleep(5000);
        System.out.println("[GENIE] :So It's not hard to think about who I am .... Blue ,  BIG , STRONGGG , impressively Sexy and with tons of money ");
        Thread.sleep(5000);
        System.out.println("[GENIE] :Yes kid, I'm the Genie ... So what's it gonna be? You want to be Like Ronaldo?");
        Thread.sleep(5000);
        System.out.println("[GENIE] :Or do you want to sing like Shakira? maybe Adele?...  ");
        Thread.sleep(5000);
        System.out.println("[GENIE] :Maybe you are looking for money ? fortune? ... I can MAKE all that happen ...  ");
        Thread.sleep(5000);
        System.out.println("\n");
        System.out.println("[" + heroi.getNome() + "]:" + "I don't know what to say... I'm on drugs for sure...   " );
        System.out.println("\n");
        Thread.sleep(5000);
        System.out.println("[GENIE] :DRUGS? you want what? Small drugs? BIG drugs? Tasty drugs? smelly drugs? I have all the drugs you can imagine...    ");
        System.out.println("\n");
        Thread.sleep(5000);
        System.out.println("[" + heroi.getNome() + "]:" + "NO DRUGS!! ...This is so weird I thought I was the one on Drugs...    " );
        System.out.println("\n");
        Thread.sleep(5000);
        System.out.println("[GENIE] :Well think twice  because this is pretty real and you have 1 wish to redeem... so?     ");
        System.out.println("\n");
        Thread.sleep(5000);
        System.out.println("[" + heroi.getNome() + "]:" + "I just want to go back Home.... back to planet Earth ..." );
        System.out.println("\n");
        Thread.sleep(5000);
        System.out.println("[GENIE] :Of course I can do that, so,  what Earth you want me to send you to?  Earth 2034? Earth i#rqq ? Earth 0093?     ");
        Thread.sleep(5000);
        System.out.println("[GENIE] :There are around 1,958,328,609,128 possible Earths. So witch one it's yours?");
        System.out.println("\n");
        Thread.sleep(5000);
        System.out.println("[" + heroi.getNome() + "]:" + "Jesus... I guess .... Well .... Bro just give me something so I can defeat all monsters." );
        System.out.println("\n");
        Thread.sleep(5000);

        System.out.println("[GENIE] :Your wishes are my orders ");
        System.out.println("\n");
        Thread.sleep(5000);
        System.out.println("[GENIE] : With the power of the GOD'S I present you with ....   ");


        heroi.addInventario(new ConsumivelCombate("Black Onion",0,new String[]{"Simpson","Naruto","Disney"},500,500,500));
        System.out.println("\n");
        Thread.sleep(5000);
        System.out.println("[" + heroi.getNome() + "]:" + "BRO? Really?? a black onion? " );
        System.out.println("\n");
        Thread.sleep(5000);

        System.out.println("[GENIE] :Trust me, you might cry a bit but it will be worth it!!!  ");
        System.out.println("\n");
        Thread.sleep(5000);
        System.out.println("[" + heroi.getNome() + "]:" + " I'm not sure about this one, still ... I will save it for later " );
        System.out.println("\n");
        Thread.sleep(5000);

        System.out.println("[GENIE] :Well... I might send you away for disrespecting my powers and being rude!   ");
        System.out.println("\n");
        Thread.sleep(5000);

        System.out.println("[" + heroi.getNome() + "]:" + " NO WAIT, I HAVE MORE QUESTIO...... " );
        System.out.println("\n");
        Thread.sleep(5000);
        System.out.println("[GENIE] :Bye Byeeeee  ");
        System.out.println("[NARRATOR] - Genie just blows " + heroi.getNome() + " into another dimension ");
        Thread.sleep(5000);




        salaDisney5Selva(heroi);

    }
}
