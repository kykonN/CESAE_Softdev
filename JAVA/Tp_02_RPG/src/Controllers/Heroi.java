package Controllers;

import ASCII.ASCII;
import Domain.Item.*;

import java.io.FileNotFoundException;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import static View.Disney.Sala_Disney_4_Bonus.salaDisney4Bonus;
import static View._2Menu_Criar_Personagem.sala_introdutoria;

public class Heroi extends Entidade {


    private int nivel;

    private int ouro;

    private ArmaPrincipal arma;

    ArrayList<Consumivel> inventario;

    public Heroi(String nome, int hpatual, int forca, int nivel, int ouro) {
        super(nome, hpatual, forca);
        this.nivel = nivel;
        this.ouro = ouro;
        this.arma = null;
        this.inventario = new ArrayList<>();
    }

    public int getNivel() {
        return nivel;
    }

    public int getOuro() {
        return ouro;
    }

    public ArrayList<Consumivel> getInventario() {
        return inventario;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public void setOuro(int ouro) {
        this.ouro = ouro;
    }

    public void setArma(ArmaPrincipal arma) {
        this.arma = arma;
    }

    public void setInventario(ArrayList<Consumivel> inventario) {
        this.inventario = inventario;
    }

    public void exibirDetalhes() {

        System.out.println("Nome" + this.getNome());
        System.out.println("hp" + this.getHpatual());
        System.out.println("Nivel" + this.getNivel());
        System.out.println("Forca" + this.getForca());
        System.out.println("Ouro" + this.getOuro());
    }


    /**
     * metodo remover Poção
     *
     * @param consumivelAtual
     */
    public void removeInventario(ConsumivelCombate consumivelAtual) {
        inventario.remove(consumivelAtual);
    }

    /**
     * Metodo remover pocao
     *
     * @param pocaoAtual
     */
    public void removeInventario(Pocao pocaoAtual) {
        inventario.remove(pocaoAtual);
    }

    /**
     * Metodo adicionar consumivel
     *
     * @param consumivelAtual
     */
    public void addInventario(ConsumivelCombate consumivelAtual) {

        inventario.add(consumivelAtual);
    }

    /**
     * Metodo batalha Adicionar Pocao
     *
     * @param pocaoAtual
     */
    public void addInventario(Pocao pocaoAtual) {
        inventario.add(pocaoAtual);
    }

    /**
     * Metodo -Game Over
     *
     * @throws FileNotFoundException
     * @throws InterruptedException
     */
    public void morte() throws FileNotFoundException, InterruptedException {
        System.out.println(" **************** GAME OVER ****************");
        System.out.println(" **************** YOU ARE TRASH ****************");
        ASCII.imprmirFile("src/Ficheiro/gameover.txt");
        System.out.println("\n");
        System.out.println("1- Start Over");
        System.out.println("2- You are a Shame to mankind");

        Scanner input = new Scanner(System.in);

        int op = input.nextInt();

        switch (op) {

            case 1:
                System.out.println(" ");
                sala_introdutoria(this);
                break;

            case 2:
                System.out.println(" Thank you for playing the game, it's fun to see you leaving chicken  ");

                return;

            default:
                System.out.println("You either play again or you don't ... Stop wasting time you already DEAD ");
        }
    }

    /**
     * Metodo de batalha Heroi
     *
     * @param inimigo
     */
    public void heroiAtacar(NPC inimigo) throws FileNotFoundException, InterruptedException {


        do {
            int totalDmg = this.getForca() + arma.getAtaque();

            //heroi ataca
            System.out.println(this.getNome() + " attacked with " + totalDmg + " " + inimigo.getNome());
            inimigo.setHp(inimigo.getHp() - totalDmg);


            //inimigo ataca
            System.out.println(inimigo.getNome() + " gives " + inimigo.getForca() + " damage");
            this.setHp(this.getHp() - inimigo.getForca());


            if (inimigo.getHp() <= 0 || this.getHp() <= 0) {

                if (inimigo.getHp() <= 0) {

                    System.out.println("*YOU WON " + inimigo.getOuro() + " GOLD*");
                    this.setOuro(this.getOuro() + inimigo.getOuro());

                    break;
                }


                if (this.getHp() <= 0) {

                    morte();


                }

            }


        } while (inimigo.getHp() > 0 || this.getHp() > 0); //podes por true


    }

    /**
     * Metodo Usar Poção
     */
    public void usarPocao() {

        Scanner input = new Scanner(System.in);

        // Imprimir o inventário de poções

        for (Consumivel consumivelAtual : inventario) {

            int indice = 0;

            // Se O consumivel for instanceof POCAO  então corre o inventário e mostra todos
            if (consumivelAtual instanceof Pocao) {
                Pocao pocaoAtual = (Pocao) consumivelAtual;
                inventario.get(indice++);
                pocaoAtual.exibirDetalhes();

                // o User escolhe a pocao

                System.out.println(" Poção que deseja usar? ");

                int usar = input.nextInt();

                if (usar == indice) {
                    // Retira do inventário
                    inventario.remove(indice);

                    //incrementar

                    this.setHp(this.getHp() + pocaoAtual.getCurarVida());
                    this.setForca(this.getForca() + pocaoAtual.getAumentoForca());

                    System.out.println("HP restored: " + this.getHp());
                    System.out.println("Strenght Gained :" + this.getForca());
                }
            }


        }
    }

    /**
     * Metodo Usar Consumivel
     *
     * @param inimigo
     */
    public void usarConsumivel(NPC inimigo) {

        Scanner input = new Scanner(System.in);

        // Imprimir o inventário de Consumiveis

        for (Consumivel consumivelAtual : inventario) {

            int indice = 0;

            // Se O consumivel for instanceof POCAO  então corre o inventário e mostra todos
            if (consumivelAtual instanceof ConsumivelCombate) {
                ConsumivelCombate atualCombat = (ConsumivelCombate) consumivelAtual;
                inventario.get(indice++);
                atualCombat.exibirDetalhes();

                // o User escolhe a pocao

                System.out.println(" Consumivel que deseja usar? ");

                int usar = input.nextInt();

                if (usar == indice) {
                    // Retira do inventário
                    inventario.remove(indice);

                    //incrementar

                    inimigo.setHp(inimigo.getHp() - consumivelAtual.getAtaqueInstant());
                    this.setHp(this.getHp() + consumivelAtual.getCurarVida());
                    this.setForca(this.getForca() + consumivelAtual.getAumentoForca());


                }
            }


        }


    }

    /**
     * Metodo batalha JaFAR
     *
     * @throws FileNotFoundException
     * @throws InterruptedException
     */
    public void jafarbatalha1() throws FileNotFoundException, InterruptedException {


        Scanner input = new Scanner(System.in);


        System.out.println("I'm small and furry, with big ears,\n" +
                "A long, fluffy tail, I love tasty cheeses.\n" +
                "Wearing red and baggy shorts,\n" +
                "Known to be Mickey's friend everywhere.\n");

        System.out.println("Answer:");
        String resposta;
        resposta = input.next();

        if (resposta.equalsIgnoreCase("Winnie The Pooh")) {
            System.out.println("\n");
            System.out.println("Congrats you are not that dumb I guess");

        } else {

            System.out.println("You Failed..\n Damage: 50");
            this.setHp(this.getHp() - 50);

        }
    }


    /**
     * Metodo Batalha JAFAR 2
     *
     * @throws FileNotFoundException
     * @throws InterruptedException
     */
    public void jafarbatalha2() throws FileNotFoundException, InterruptedException {

        System.out.println("Good luck for this Next round then ... I wont have mercy on you");
        Random randomRiddle = new Random();
        Scanner input = new Scanner(System.in);


        int respostaCerta = 0;

        do {
            int numeroRiddle;
            numeroRiddle = randomRiddle.nextInt(0, 7);

            if (numeroRiddle == 1) {

                System.out.println("I'm small and furry, with big ears,\n" +
                        "A long, fluffy tail, I love tasty cheeses.\n" +
                        "Wearing red and baggy shorts,\n" +
                        "Known to be Mickey's friend everywhere.\n");

                System.out.println("Answer:");
                String resposta;
                resposta = input.next();

                if (resposta.equalsIgnoreCase("Winnie The Pooh")) {

                    respostaCerta++;

                    System.out.println(" Nice one!  ");

                } else {

                    System.out.println("You Failed..\n Damage: 50");
                    this.setHp(this.getHp() - 50);

                }
            }
            if (numeroRiddle == 2) {

                System.out.println("In a castle, I reside,\n" +
                        "With golden attire, always neat.\n" +
                        "My hair is long, like a braid of gold,\n" +
                        "I faced a curse, my destiny I hold.");

                System.out.println("Answer:");
                String resposta;
                resposta = input.next();

                if (resposta.equalsIgnoreCase("Rapunzel")) {

                    respostaCerta++;

                } else {

                    System.out.println("You Failed..\n Damage: 50");
                    this.setHp(this.getHp() - 50);

                }
            }
            if (numeroRiddle == 3) {

                System.out.println("Born in the savannah, majestically I roam,\n" +
                        "Lush mane, royal to the bone.\n" +
                        "Strong roars echoing through the air,\n" +
                        "In the circle of life, king everywhere.");

                System.out.println("Answer:");
                String resposta;
                resposta = input.next();

                if (resposta.equalsIgnoreCase("Simba")) {

                    respostaCerta++;

                } else {

                    System.out.println("You Failed..\n Damage: 50");
                    this.setHp(this.getHp() - 50);

                }
            }
            if (numeroRiddle == 4) {

                System.out.println(" In the jungle where the sun warms,\n" +
                        "A simple philosophy that charms.\n" +
                        "No worries, no stress,\n" +
                        "This phrase, for me, is a bless." +
                        "What expression is this, unparalleled,\n" +
                        "That reminds us to live without fail?");

                System.out.println("Answer:");
                String resposta;
                resposta = input.next();

                if (resposta.equalsIgnoreCase("Hakuna Matata")) {

                    respostaCerta++;

                } else {

                    System.out.println("You Failed..\n Damage: 50");
                    this.setHp(this.getHp() - 50);

                }
            }
            if (numeroRiddle == 5) {

                System.out.println("In an underwater house, full of corals,\n" +
                        "With a shiny tail and beautiful royal hues.\n" +
                        "Dreamy and curious, wanting to explore,\n" +
                        "Who is this mermaid that never ceases to enchant?");

                System.out.println("Answer:");
                String resposta;
                resposta = input.next();

                if (resposta.equalsIgnoreCase("Ariel")) {

                    respostaCerta++;

                } else {

                    System.out.println("You Failed..\n Damage: 50");
                    this.setHp(this.getHp() - 50);

                }
            }
            if (numeroRiddle == 6) {

                System.out.println(" In an enchanted world where the carpet flies,\n" +
                        "A clever lad, destiny not denied.\n" +
                        "With a magic lamp, his wishes unfold,\n" +
                        "Who is this character, whose story is told?");

                System.out.println("Answer:");
                String resposta;
                resposta = input.next();

                if (resposta.equalsIgnoreCase("Aladdin")) {

                    respostaCerta++;

                } else {

                    System.out.println("You Failed..\n Damage: 50");
                    this.setHp(this.getHp() - 50);

                }
            }

        } while (respostaCerta == 3 || this.getHp() > 0);

        if (this.getHp() <= 0) {

            morte();
        }

        if (respostaCerta == 3) {

            System.out.println("[JA'FAR] : You have beat me... I guess ...I was to cocky to think I could outsmart someone like you " + this.getNome());
            System.out.println("[JA'FAR] : Here's my token of appreciation -");
            System.out.println("[JA'FAR] : Bibidi - Bobidi - Bu - I'm not the Great neither are YOU!!! .... ");

            salaDisney4Bonus(this);

        }

    }

    /**
     * Metodo Batalha Hidra
     *
     * @throws FileNotFoundException
     * @throws InterruptedException
     */
    public void batalhaHidra() throws FileNotFoundException, InterruptedException {

        Random randomSorte = new Random();
        Scanner input = new Scanner(System.in);

        int vidaHidra = 21;


        System.out.println(" How is that POSSIBLE? To chop 1 head off and 3 more emerge!! ");

        int cabeçasHidra = 0;
        do {


            int dmg = cabeçasHidra;


            if (cabeçasHidra < 21) {


                System.out.println(" Chopping heads off!! ");

                cabeçasHidra = cabeçasHidra + 3;

                System.out.println("They keep on attacking and damaging ");
                this.setHp(this.getHp() - dmg);

                System.out.println(cabeçasHidra);
            } else {

                System.out.println("Do you want to ask HERCULES for help? He might lend you some Powers!  ");
                System.out.println("1 - Yes Please HELP ME HERCULES!!! ");
                System.out.println("2 - Hercules Who??  ");
                int op;
                op = input.nextInt();

                do {


                    switch (op) {

                        case 1:

                            int sorte;
                            sorte = randomSorte.nextInt(6, 100);
                            System.out.println(" Hercules lend you " + sorte + " Strength");
                            System.out.println("\n");

                            if (sorte >= cabeçasHidra) {

                                System.out.println(" \n ");
                                System.out.println(" FINALLY OUR HERO SEE'S AN OPENING AND SLASHES ALL THE HEADS AT ONCE WITH A LIGHTNING STRIKE ");
                                System.out.println(" \n ");


                                vidaHidra = 0;


                            } else {
                                this.setHp(this.getHp() - dmg);
                                System.out.println(this.getNome() + " Took " + dmg + " dmg " + " - WE NEED MORE POWER!!");
                                System.out.println("\n");

                                System.out.println(this.getNome() + " " + this.getHp());
                            }


                            break;


                        case 2:

                            System.out.println(" \n ");
                            System.out.println("Keeps choping  heads off and 3 more emerge everytime...they are multiplying!! ");

                            cabeçasHidra = cabeçasHidra + 3;

                            System.out.println(" \n ");
                            System.out.println("You receiving " + dmg + "dmg"); //
                            this.setHp(this.getHp() - dmg);

                            break;

                        default:
                            System.out.println(" \n ");
                            System.out.println(" IT'S A LIFE DECISION DUDE!! MAKE THE RIGHT ONE!!!!!!");
                    }
                } while (vidaHidra != 0 || this.getHp() > 0);


            }


        } while (vidaHidra != 0 || this.getHp() > 0);

        if (this.getHp() <= 0) {

            morte();
        }
    }

    /**
     * Metodo batalha PAIN
     *
     * @throws FileNotFoundException
     * @throws InterruptedException
     */
    public void batalhaPain() throws FileNotFoundException, InterruptedException {

        Random randomPain = new Random();
        Scanner input = new Scanner(System.in);

        Thread.sleep(5000);
        System.out.println("Pains bring torment, a force hard to bear,\n" +
                this.getNome() + "spirit, a flame in the air.\n" +
                "My hero stands strong, ready to defy,\n" +
                "In the echoes of battle, where destinies lie ");

        System.out.println("\n");
        Thread.sleep(5000);
        System.out.println("As the ancient script foretold, in fortune's embrace, you shall unfold.");

        System.out.println("\n");
        Thread.sleep(5000);
        System.out.println("So in luck we shall face PAIN.\n Between 1 to 6 the dices we are going to roll!  ");

        int escolha;
        escolha = randomPain.nextInt(1, 7);

        if (escolha == 1) {

            System.out.println(" Sekai ni itami o. Shinra Tensei! ");

            System.out.println("\n");

            System.out.println("Everybody is dead !! ");

            morte();
        }

        if (escolha == 2) {

            NPC devaAsura = new NPC("Deva and Asura", 220, 40, 400);

            heroiAtacar(devaAsura);

            System.out.println(" We are now Going for the Source!!! To end it ALL!! ");

            NPC nagato = new NPC("Nagato", 400, 20, 1000);

            heroiAtacar(nagato);

        }

        if (escolha == 3) {

            System.out.println(" You are fighting Shurado e Ningendo");

            NPC shuradoNingendo = new NPC("Shurado e Ningendo", 150, 40, 400);

            heroiAtacar(shuradoNingendo);
            System.out.println(" We are now Going for the Source!!! To end it ALL!! ");

            NPC nagato = new NPC("Nagato", 400, 20, 1000);

            heroiAtacar(nagato);


        }
        if (escolha == 4) {

            System.out.println(" You are fighting Chikushodo and Gokido ");

            NPC chikushodoAndGokido = new NPC("Chikushodo and Gokido", 350, 40, 400);

            heroiAtacar(chikushodoAndGokido);

            System.out.println(" Nagato saw your pure Strenghth and Run away!! ");


        }
        if (escolha == 5) {

            System.out.println(" Better to fight the source then the clones - Nagato is PAIN ");

            NPC nagato = new NPC("Nagato", 400, 20, 1000);

            heroiAtacar(nagato);


        }

        if (escolha == 6) {

            System.out.println(this.getNome() + " Rasenshuriken - Throws everything and destroys all the PAIN characters");
            return;
        }


    }

    public void menuBatalha(NPC inimigo) throws FileNotFoundException, InterruptedException {

        Scanner input = new Scanner(System.in);

        int op;
        do {

            System.out.println(" ************************** ");
            System.out.println("\n");
            System.out.println(" 1- Do you want to fight? ");
            System.out.println(" 2 -Do you want to use a potion? ");
            System.out.println(" 3 -Use a Combat Boost? ");
            System.out.println("\n");
            System.out.println(" ************************** ");


            op = input.nextInt();

            switch (op) {

                case 1:
                    heroiAtacar(inimigo);
                    break;
                case 2:
                    usarPocao();
                    break;
                case 3:
                    usarConsumivel(inimigo);
                    break;
                default:
            }

        } while (op != 1 || inimigo.getHp() < 0);


    }
}