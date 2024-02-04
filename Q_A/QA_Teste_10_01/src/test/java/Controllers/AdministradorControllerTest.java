package Controllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.File;


import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class AdministradorControllerTest {

    // 1- Instanciar o objeto
    private AdministradorController admin;

    // 2- Dar Setup - BeforeEach - para dar Reset antes de cada teste;

    @BeforeEach

    public void setup() throws FileNotFoundException {

        admin = new AdministradorController("src/test/resources/minimercadoTest.csv");
    }
    // 3- Iniciar Teste

    @Test
    public void produtoMaisVendidoTeste() {

        assertEquals(400.0, admin.produtoMaisVendido().getQuantidadeVendida());
        assertEquals("Jogos", admin.produtoMaisVendido().getTipoProduto());


    }

    @Test
    public void produtoQueMaisVendeuTeste() {


        assertEquals(200.0,admin.produtoQueMaisVendeu().getQuantidadeVendida());
        assertEquals("Jogos",admin.produtoQueMaisVendeu().getTipoProduto());
        assertNotEquals("Vinho Verde",admin.produtoQueMaisVendeu().getProduto());
        assertEquals("GTA5", admin.produtoQueMaisVendeu().getProduto());
    }

    @Test
    public void vendaMaisValorTeste() {

        assertEquals("GTA5",admin.vendaMaisValor().getProduto());
        assertNotEquals("Alimentacao",admin.vendaMaisValor().getTipoProduto());
        assertEquals(59.0,admin.vendaMaisValor().getPrecoUnitario());

    }
    @Test
    public void adicionarUtilizadorTest () throws IOException {

        String pathfile = "src/test/resources/login_grandesNegociosTest.csv";

        admin.adicionarUtilizador(pathfile,"ADMIN","tobias","softdev");

        File file = new File (pathfile);

        Scanner scanner = new Scanner(file);

        String tipoUtilizador = " ";
        String username = " ";
        String password = " ";

        while (scanner.hasNextLine()){
            String linha = scanner.nextLine();
            String [] linhaseparada = linha.split(";");

            tipoUtilizador = linhaseparada [0];
            username = linhaseparada[1];
            password = linhaseparada [2];


        }

        assertEquals("ADMIN",tipoUtilizador);
        assertEquals("vitor",username);
        assertEquals("cesae",password);
    }



    @Test
    public void valorVendasTeste () {

        assertEquals(34745.31,admin.valorVendas());
    }



    @Test
    public void mediaVendas (){

        assertNotEquals(2020.30,admin.mediaVendas());

        assertEquals(3158.664545454545,admin.mediaVendas());


    }
}