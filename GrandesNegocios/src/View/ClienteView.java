package View;

import Controllers.ClientController;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class ClienteView {
    public ClienteView() {
    }

    public static void menuCliente() throws FileNotFoundException {
        Scanner input = new Scanner(System.in);

        ClientController clientController = new ClientController();
        int opcao = 0;

        do {

            System.out.println("\n********** Bem-Vindo/a Cliente **********");
            System.out.println("1. Consultar Produtos Disponiveis");
            System.out.println("2. Consultar Produtos de Categoria");
            System.out.println("3. Consultar Produto Mais Barato");
            System.out.println("4. Consultar Produto Mais Caro");
            System.out.println("0. Sair");
            System.out.print("Selecione uma opção: ");
            opcao = input.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("\n*** Consultar Produtos Disponiveis ***\n");
                    break;

                case 2:
                    System.out.println("\n*** Consultar Produtos de Categoria ***\n");
                    break;

                case 3:
                    System.out.println("\n*** Consultar Produto Mais Barato ***\n");
                    break;

                case 4:
                    System.out.println("\n*** Consultar Produto Mais Caro ***\n");
                    clientController.produtoMaisCaro().exibirDetalhesProduto();
                    break;

                case 0:
                    System.out.println("\n*** Voltar... ***\n");
                    break;


            }

        } while (opcao != 0);

    }
}
