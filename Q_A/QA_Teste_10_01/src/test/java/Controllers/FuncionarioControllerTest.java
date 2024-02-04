package Controllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class FuncionarioControllerTest {

    private FuncionarioController funcionarioTeste;
    @BeforeEach
    void setUp() throws FileNotFoundException {
        funcionarioTeste = new FuncionarioController("src/test/resources/minimercadoTest.csv");
    }

    @Test
    void addVenda() throws IOException {



        funcionarioTeste.addVenda("Doçuras","Bola Berlim",55,0.99);

        File file = new File("src/test/resources/minimercadoTest.csv");
        Scanner scanner = new Scanner(file);

        String tipoProduto="";
        String nomeProduto="";
        int quantidadeProduto = 0;
        double precoProduto=0;

        String linha = scanner.nextLine();

        while (scanner.hasNextLine()){

            linha = scanner.nextLine();
            String [] linhaDividida = linha.split(",");

            tipoProduto= linhaDividida[0];
            nomeProduto=linhaDividida[1];
            quantidadeProduto= Integer.parseInt(linhaDividida[2]);
            precoProduto= Double.parseDouble(linhaDividida[3]);



        }


        assertEquals("Doçuras",tipoProduto);
        assertEquals("Bola Berlim",nomeProduto);
        assertEquals(55,quantidadeProduto);
        assertEquals(0.99,precoProduto);

        assertNotEquals("Hospitalar",tipoProduto);
        assertNotEquals("Fraldas velhote",nomeProduto);
        assertNotEquals(99,quantidadeProduto);
        assertNotEquals(150.20,precoProduto);






    }

    @Test
    void consultarStockProduto() {


        assertEquals(800, funcionarioTeste.consultarStockProduto("GTA5"));

        assertEquals(1188, funcionarioTeste.consultarStockProduto("Presunto"));

        assertNotEquals(20, funcionarioTeste.consultarStockProduto("Bacalhau"));
        assertNotEquals(5, funcionarioTeste.consultarStockProduto("Papel Higienico"));


    }
}