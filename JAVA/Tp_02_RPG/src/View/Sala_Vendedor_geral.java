package View;

import Controllers.Heroi;
import Domain.Item.Vendedor;

import java.io.FileNotFoundException;
import java.util.Scanner;

import static View.Boss.Sala_KONOHA.sala_konoha;
import static View.Boss.Sala_TEBAS.sala_tebas;

public class Sala_Vendedor_geral {




    public static void salaVendedorGeral (Heroi heroi) throws InterruptedException, FileNotFoundException {

        Scanner input = new Scanner(System.in);

        System.out.println("[Yc-Beg] : Look who's back man .... really nice to see you again ...    ");
        System.out.println("[Yc-Beg] : I mean would be amazing if you came back a midget or bitten by a spiderTiger ...");
        System.out.println("[Yc-Beg] : Those are horrible, they would make your guts melt and your feet turn grey....     ");
        Thread.sleep(3000);
        System.out.println("[" + heroi.getNome() + "]" +" I see you haven't lost your charm, and your humour... oooff ");
        System.out.println("[" + heroi.getNome() + "]" +" What do you have for me??? I might need stuff... ");
        Thread.sleep(3000);
        System.out.println("[Yc-Beg] : Always here to serve you my Lord... (wishpers) : little brat ... I show you... humhumhumm... ");
        System.out.println("\n");
        System.out.println("\n");

        Vendedor vendedor = new Vendedor();

        vendedor.loja(heroi);


        System.out.println("[Yc-Beg] : Well thank you anyways ... You might be my best customer... wont be for longer... ");
        Thread.sleep(3000);
        System.out.println("\n");
        System.out.println("[" + heroi.getNome() + "]" + " What can I say... I'm getting used to this Jumpie thing...  ");
        System.out.println("[" + heroi.getNome() + "]" + " But I will get back home... soon   ");
        Thread.sleep(3000);
        System.out.println("\n");


        System.out.println("[Yc-Beg] : Well options now are not really clear ... you either choose ");
        System.out.println("\n");
        System.out.println("\n");
        System.out.println("option 1 -Some weird place called :  Ὕδρα τῆς Λέρνης ");
        System.out.println("option 2 -Another weird place called : Konoha ");
        System.out.println("[Yc-Beg] Up to you boy .... and please don't freak out ... we have been through this before...  ");

        int op;
        op= input.nextInt();

        switch (op){

            case 1:
                // TEBAS
                sala_tebas(heroi);

                break;
            case 2:
                // konoha
                sala_konoha(heroi);
                break;

            default:
                break;
        }



    }
}
