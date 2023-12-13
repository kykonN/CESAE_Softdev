package Ex_02;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input =  new Scanner(System.in);

        int op;


        do {
            System.out.println("(\u2060☞\u2060 ͡\u2060°\u2060 ͜\u2060ʖ\u2060 ͡\u2060°\u2060)\u2060☞ " + " Escolha o seu Taco");

            System.out.println("\n");
            System.out.println(" [1] - Taco Carne De vaca" + "(\u2060◠\u2060‿\u2060◕\u2060");
            System.out.println("\n");
            System.out.println(" [2] - Taco De Frango" + "(\u2060 \u2060˘\u2060 \u2060³\u2060˘\u2060)\u2060♥");
            System.out.println("\n");
            System.out.println(" [3] - Taco Vegetariano" + "(\u2060｡\u2060•́\u2060︿\u2060•̀\u2060｡\u2060)");
            op=input.nextInt();

            switch (op){

                case 1 :
                    Vaca taco1 = new Vaca();
                    taco1.prepare();
                    taco1.bake();
                    taco1.box();
                    break;
                case 2:
                    Frango taco2 = new Frango();
                  taco2.bake();
                  taco2.prepare();
                  taco2.box();
                  break;
                case 3:
                    Vegetariano taco3= new Vegetariano();
                    taco3.bake();
                    taco3.prepare();
                    taco3.box();
                    break;

            }
        }while(op!=0);
    }
}


