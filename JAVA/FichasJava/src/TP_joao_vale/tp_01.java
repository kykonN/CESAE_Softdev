package TP_joao_vale;

import java.io.File;
import java.io.FileNotFoundException;
import java.sql.SQLOutput;
import java.util.Scanner;

public class tp_01 {
    //****************************************** Funções [Matriz] **********************************************


    /**
     * Método que retorna número de linhas totais de um ficheiro
     *
     * @param caminhoFicheiro - caminho para o ficheiro
     * @return Numero de linhas totais
     * @throws FileNotFoundException Caso o ficheiro não seja encontrado
     */
    public static int contarlinhasficheiro(String caminhoFicheiro) throws FileNotFoundException {

        File ficheiro = new File(caminhoFicheiro);

        Scanner maquinaler = new Scanner(ficheiro);

        int contagemlinhas = 0;

        while (maquinaler.hasNextLine()) {
            maquinaler.nextLine();
            contagemlinhas++;
        }
        return contagemlinhas;
    }

    /**
     * Metodo para fazer contagem das colunas totais;
     *
     * @param caminhoFicheiro
     * @return Numero de colunas totais do ficheiro
     * @throws FileNotFoundException
     */
    public static int contarcolunasficheiro(String caminhoFicheiro, String delimitador) throws FileNotFoundException {

        File ficheiro = new File(caminhoFicheiro);
        Scanner maquinaler = new Scanner(ficheiro);

        int contagemcolunas = 0;

        String linha = maquinaler.nextLine();
        String[] itenslinha = linha.split(delimitador);

        contagemcolunas = itenslinha.length;

        return contagemcolunas;


    }


    /**
     * Metodo e armazenamento da matriz com o conteudo d ficheiro
     *
     * @param caminhoFicheiro Ocaminho do ficheiro
     * @return Matriz String [] []preenchida com conteudo
     * @throws FileNotFoundException caso o ficheiro não seja encontrado
     */

    public static String[][] lerficheiromatriz(String caminhoFicheiro) throws FileNotFoundException {

        File ficheiro = new File(caminhoFicheiro);

        Scanner maquinaler = new Scanner(ficheiro);

        int numerolinhas = (contarlinhasficheiro(caminhoFicheiro)) - 1;
        int numerocolunas = contarcolunasficheiro(caminhoFicheiro, ";");

        String[][] matriztotal = new String[numerolinhas][numerocolunas];

        String linha = maquinaler.nextLine();
        int linhamatriz = 0;

        while (maquinaler.hasNextLine()) {
            linha = maquinaler.nextLine();
            String[] itenslinha = linha.split(";");

            for (int i = 0; i < itenslinha.length && i < numerocolunas; i++) {
                matriztotal[linhamatriz][i] = itenslinha[i];


            }
            linhamatriz++;
        }
        return matriztotal;


    }

    //****************************************** Funções [ADMIN]**********************************************


    /**
     * Metodo para imprimir a matriz na forma correcta
     *
     * @param matriz Recebe a matriz do metodo lerficheiromatriz
     */
    public static void imprimirmatrizconsola(String[][] matriz) {
        for (int linha = 0; linha < matriz.length; linha++) {
            for (int coluna = 0; coluna < matriz[0].length; coluna++) {
                System.out.print(matriz[linha][coluna] + "\t|\t");
            }
            System.out.println();
        }
    }


    /**
     * Metodo que calcula o numero de linhas e quantidade vendida
     *
     * @param matriz
     * @throws FileNotFoundException
     */
    public static void valortotal(String[][] matriz) throws FileNotFoundException {


        int linhas;

        linhas = matriz.length;


        System.out.println("Numero de vendas efectuadas : " + linhas);

        double total = 0, quantidadevendida = 0;

        for (int indice = 0; indice < matriz.length; indice++) {
            quantidadevendida = Double.parseDouble(matriz[indice][8]);
            total += quantidadevendida;
        }

        System.out.println("Total de quantidade vendida : " + total + "€");


    }

    /**
     * Metodo para calcular o lucro total
     *
     * @param matriz
     */
    public static void lucro(String[][] matriz) {

        double total = 0, quantidadevendida = 0;

        for (int indice = 0; indice < matriz.length; indice++) {
            quantidadevendida = Double.parseDouble(matriz[indice][8]);
            total += quantidadevendida;
        }

        total = total * 0.2;

        System.out.println("O lucro total obtido  da venda dos jogos é de  : " + total + "€");


    }

    /**
     * Metodo para procurar Cliente por ID
     *
     * @param matriz
     */
    public static void procuraCliente(String[][] matriz) {

        Scanner input = new Scanner(System.in);

        int valor, contador = 0;

        System.out.println("Insira o ID que quer procurar : ");

        valor = input.nextInt();

        for (int indice = 0; indice < matriz.length; indice++) {

            if (valor == Integer.parseInt(matriz[indice][1]) && contador == 0) {
                System.out.println("Nome: " + matriz[indice][2] + " | Contacto " + matriz[indice][3] + " | Email " + matriz[indice][4]);
                contador++;
            }
        }


    }


    /**
     * Metodo para imprimir jogo mais e caro e clientes que o compraram
     *
     * @param matriz
     */
    public static void jogoMaisCaro(String[][] matriz) {

// O que é necessário para resolver este exercicio:

        //Saber o jogo mais caro
        // guardar preço do jogo
        // guardar o nome e imprimir linha como jogo mais caro ou linhas

// Declarar variaveis - 2 double para o jogo e o preço ( uma é para guardar o valor para comparar)
        // variavel String de nome inicializada com vazio para ir alterando consoante a comparação de jogos.
        double jogo = 0, preco;
        String nome = " ";

        //Ciclo para ler a matriz e todas as suas linhas
        for (int indice = 0; indice < matriz.length; indice++) {

            // inicializar variaveis  e passar a variavel preço para double pois estamos como String
            nome = matriz[indice][7];
            preco = Double.parseDouble(matriz[indice][8]);

            // Variavel para guardar o jogo mais caro*
            if (preco > jogo) {
                jogo = preco;
                // Assim que tiver o o jogo mais caro irá sempre guardar o nome
                nome = matriz[indice][7];
            }
        }

        // segundo ciclo para imprimir o nome + jogo + preço ...

        for (int indice = 0; indice < matriz.length; indice++) {

//              Não esquecer nome é string = .equals
            if (nome.equals(matriz[indice][7])) {
                System.out.println("Cliente nome:" + matriz[indice][2] + " " + nome + " " + jogo + "€");

            }

        }


    }

    //****************************************** Funções [CLIENTE]**********************************************

    /**
     * Metodo que retorna nr triangulares multiplos de 5
     */
    public static void triangulares() {


        int valor = 1;

        //Primeiro ciclo para encontrar os numeros primos
        // Formula para numeros primos

        while (valor * (valor + 1) / 2 < 121) {

            int formula = (valor * (valor + 1) / 2);

            // condiçã0 para verificar os numeros primos multiplos de 5

            if (formula % 5 == 0) {
                System.out.println(formula);


            }
            valor++;
        }


    }


    /**
     * Metodo para imprimir todos os jogos não repetindo
     *
     * @param matriz
     */
    public static void imprimirtitulos(String[][] matriz) {
        // inicializar variavel String como vazia

        String jogos = "";

//criar um ciclo para imprimir todos os jogos sendo comparado jogos para não duplicar
        for (int indice = 0; indice < matriz.length; indice++) {

            if (!matriz[indice][7].equals(jogos)) {
                jogos = matriz[indice][7];
                System.out.println(jogos);
            }


        }
    }


    /**
     * Metodo que retorna os jogos e categoria de uma editora
     *
     * @param matriz
     */
    public static void Editora(String[][] matriz) {

        //Dada uma Editora, imprima todas as categorias e os respetivos jogos

        Scanner input = new Scanner(System.in);

        String editora = "";


        System.out.println("Qual é a editora que procura informação?");

        editora = input.next();


// USAR boolean para parar a impressão no caso de já ter impresso o nome , aplicar  o mesmo aos jogos e Categoria.

        for (int indice = 0; indice < matriz.length; indice++) {

            //Primeiro ciclo para encontrar a Editora

            if (editora.equals(matriz[indice][5])) {
                System.out.println("******" + editora + "*******\n" + "CATEGORIA " + matriz[indice][6] + " | JOGO " + matriz[indice][7]);

            }
        }


    }

    //****************************************** NOTA  **********************************************

   /*NOTA: Depois de algum tempo a inspecionar o exercicio reparei que eram 22h da noite de domingo e que deveria ir descansar
     pelo que optei por uma versão não tão correcta mas com algum resultado, pelo que deixo o desenvolvimento da minha outra opção em comentário
     pode ser que ajude a identificar a linha de raciocinio ou os erros que tinha.

   /Dada uma Editora, imprima todas as categorias e os respetivos jogos

    Scanner input = new Scanner(System.in);

    String editora = "", value1;


        System.out.println("Qual é a editora que procura informação?");

    editora = input.next();

    boolean valor = true;

// USAR boolean para parar a impressão no caso de já ter impresso o nome , aplicar  o mesmo aos jogos e Categoria.

        for (int indice = 0; indice < matriz.length; indice++) {

        //Primeiro ciclo para encontrar a Editora

        if (editora.equals(matriz[indice][5])) {
            valor = true;
            System.out.println("******" + editora + "*******\n");
            String categoria = "";

            if (!matriz[indice][6].equals(categoria)) {
                valor = true;
                System.out.println(categoria);

                String jogo = "";

                if (!matriz[indice][7].equals(jogo)) {
                    valor = true;
                }
                System.out.println(jogo);
            } else {
                valor = false;
                System.out.println(" ** ** **");
            }
        }
    }


}*/


    //****************************************** MAIN  **********************************************


    public static void main(String[] args) throws FileNotFoundException {

        // Leitura da Matriz e o seu caminho
        String[][] matriz = lerficheiromatriz("TP_01/GameStart_V2.csv");

        // Scanner input para o utilizador introduzir as suas escolhas via menu
        Scanner input = new Scanner(System.in);
        int attempts = 0;
        int op;

        // [ Menu Principal ] - 1º Menu

        // Primeiro ciclo que da acesso à escolha do tipo de utilizador
        do {
            System.out.println("");
            System.out.println(" (\u2060 \u2060ꈍ\u2060ᴗ\u2060ꈍ\u2060) Hello my world\"(\u2060 \u2060ꈍ\u2060ᴗ\u2060ꈍ\u2060) ");
            System.out.println("\n ******* WELCOME TO GAMESTARTAPP *******\n");
            System.out.println("\n");
            System.out.println(" Do you want to login as :  \n 1- ADMIN \n 2- CLIENT");

            op = input.nextInt();

            // Switch case do 1º Ciclo

            switch (op) {
                case 1:// Menu admin

                    String password = null;

                    String correct_pwd = "theSims4life";

                    // Novo ciclo [do while] aninhado para inserir password no ADMIN com tentativas
                    do {
                        System.out.println("-> Please insert Password <- : ");


                        password = input.next();

                        if (!password.equals(correct_pwd)) {
                            System.out.println("Password is incorrect!\nTry again " + "[" + (2 - attempts) + "]" + " attempts left \n");
                            attempts++;


                        }
                        if (password.equals(correct_pwd)) {
                            System.out.println("\n ***** Welcome BOSS *****" + "\n **** Really nice to see you back handsome ****");
                            System.out.println(" (\u2060 \u2060˘\u2060 \u2060³\u2060˘\u2060)\u2060♥ ");
                            System.out.println(" ");

                            // 2 ciclo aninhado MENU ADMIN - Para escolher Opções
                            do {
                                System.out.println(" [Chose one of the following options]:\n \n ****************************************");
                                System.out.println(" 1- Print File");
                                System.out.println(" 2 -Print total sales value");
                                System.out.println(" 3 -Print total profit ");
                                System.out.println(" 4 -Search ID_ClIENT");
                                System.out.println(" 5 -TOP SALE [information]");
                                System.out.println(" 0 -Exit ");

                                op = input.nextInt();

                                switch (op) {
                                    case 1:

                                        imprimirmatrizconsola(matriz);

                                        break;
                                    case 2:
                                        valortotal(matriz);
                                        break;
                                    case 3:
                                        lucro(matriz);

                                        break;
                                    case 4:
                                        procuraCliente(matriz);

                                        break;
                                    case 5:
                                        jogoMaisCaro(matriz);
                                        break;

                                    case 0:
                                        System.out.println(" Good bye my love. \n(\u2060｡\u2060•́\u2060︿\u2060•̀\u2060｡\u2060)");
                                        break;

                                    default:
                                        System.out.println("\"System output Error in Menu - variable not match \"");
                                        break;


                                }

                            } while (op != 0);


                        }


                    } while (!password.equals(correct_pwd) && attempts < 3);
                    break;

                // Switch CASE 2 - CLIENTE
                case 2:// Menu Cliente

                    // 1 º Ciclo aninhado do Menu Cliente - Opções
                    do {
                        System.out.println(" [Chose one of the following options]:\n \n ****************************************");
                        System.out.println(" 1 - New customer registration  ");
                        System.out.println(" 2 - Looking for park ");
                        System.out.println(" 3 - print all game titles ");
                        System.out.println(" 4 - Search label and games information");
                        System.out.println(" 0 - Exit");


                        op = input.nextInt();


                        switch (op) {

                            case 1:
                                // inserir exericicio de registo
                                System.out.println("Please fill the form in order to create a new account ");

                                String nome, email;
                                int contato;

                                System.out.println(" Name ");
                                nome = input.next();

                                System.out.println(" Phone number");

                                contato = input.nextInt();

                                System.out.println(" Email");

                                email = input.next();

                                System.out.println("Client created with success :  " + "|Name:" + nome + "| Contact :" + contato + "| email :" + email + "\n");


                                break;

                            case 2:
                                triangulares();
                                break;

                            case 3:
                                imprimirtitulos(matriz);
                                break;

                            case 4:
                                Editora(matriz);
                                break;
                            case 0:
                                System.out.println("Next time bring a friend and let's PARTY!! (\u2060◠\u2060‿\u2060◕\u2060) ");
                                break;
                            default:
                                System.out.println("ERROR ");


                        }


                    } while (op != 0);


            }

        } while (attempts > 3);


    }


}
