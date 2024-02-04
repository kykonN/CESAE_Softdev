package Domain.Item;

import Controllers.Heroi;
import Repository.MerchantRepository;

import javax.swing.plaf.basic.BasicArrowButton;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Vendedor {

    ArrayList<ItemHeroi> merchant;

    //construtor
    public Vendedor() throws FileNotFoundException {

        MerchantRepository merchantRepositoryAtual = new MerchantRepository("src/Ficheiro/ItensHeroiRPG.csv");
        this.merchant = merchantRepositoryAtual.getMerchantArray();

    }


    //loja
    public void loja(Heroi heroi) {

        Scanner input = new Scanner(System.in);

        Random items = new Random();

        //"montra"
        ArrayList<Integer> arrayIndexAleatorio = new ArrayList<>();

        while (arrayIndexAleatorio.size() <= 10) {

            int itemAleatorio = items.nextInt(0, merchant.size());

            // Se o item aleatorio não contiver dentro do array "montra" == add
            if (!arrayIndexAleatorio.contains(itemAleatorio)) {

                arrayIndexAleatorio.add(itemAleatorio);
            }
        }

        for (int i = 0; i <= 10; i++) {

            //indice do item
            System.out.println("\nItem " + i);

            //exibir detalhes do item
            merchant.get(arrayIndexAleatorio.get(i)).exibirDetalhes();
        }

        //Criar o inventário do heroi- array que vai .add item de compra
        ArrayList<Consumivel> inventarioHeroi = new ArrayList<>();

        int choice;
            // Primeiro Menu  - Do while -  para fazer varias compras
        do {
            System.out.println("\nDo you want to buy anything? ");
            System.out.println("1 - Yes oh Please YES!! ");
            System.out.println("2 - No way !!! ");


            choice = input.nextInt();

            switch (choice) {

                case 1:
                    System.out.println(" What Item would you like to buy?");
                    int itembuy = input.nextInt();
                    for (int i = 0; i < arrayIndexAleatorio.size(); i++) {
                        // analisar o item ID
                        if (i == itembuy) {
                                // vai buscar os items
                            ItemHeroi itemHeroi = merchant.get(arrayIndexAleatorio.get(itembuy));


                            //analisar se tem ouro sufiente
                            if (heroi.getOuro() >= itemHeroi.getPreco()) {

                                //compra

                                // verificação tipo obj

                                if (itemHeroi instanceof ArmaPrincipal) {
                                    //aquele item heroi é uma arma principal
                                    ArmaPrincipal armaPrincipal = (ArmaPrincipal) itemHeroi;
                                    //da arma ao heroi
                                    heroi.setArma(armaPrincipal);


                                    // Igual para Consumiveis - apenas adiciona ao inventário do heroi.
                                } else if (itemHeroi instanceof Consumivel) {
                                    Consumivel consumivel = (Consumivel) itemHeroi;
                                    heroi.getInventario().add(consumivel);


                                }

                                //retirar ouro

                                heroi.setOuro(heroi.getOuro() - itemHeroi.getPreco());
                                System.out.println("Congrats you have purchased :" + itemHeroi.getNome());

                            } else {
                                System.out.println("U DONT HAVE MONEY ASSHOLE");
                            }
                        }
                    }

                    System.out.println("Thank you");

                    break;

                case 2:
                    System.out.println("\n");
                    System.out.println("See ya later alligator");

                    break;

                default:
                    System.out.println(" By any means I will sell you drugs !!! Are you a cop? ... Maybe try again");
            }


        } while (choice != 2);


    }


}
