import Controllers.AdministradorController;
import Domain.Venda;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class AdministradorControllerTest {

    // 1- Instanciar o objeto
    private AdministradorController admin;

    // 2- Dar Setup - BeforeEach - para dar Reset antes de cada teste;

    @BeforeEach

    public void setup() throws FileNotFoundException {

        admin = new AdministradorController("src/test/resources/minimercadoTeste.csv");
    }
    // 3- Iniciar Teste

    @Test
    public void produtoMaisVendidoTeste() {

        assertEquals(1000.0, admin.produtoMaisVendido().getQuantidadeVendida());
        assertEquals("Produtos para Casa", admin.produtoMaisVendido().getTipoProduto());


    }

    @Test
    public void produtoQueMaisVendeuTeste() {


        assertEquals(1000.0,admin.produtoQueMaisVendeu().getQuantidadeVendida());
        assertEquals("Produtos para Casa",admin.produtoQueMaisVendeu().getTipoProduto());
        assertNotEquals("Vinho Verde",admin.produtoQueMaisVendeu().getProduto());
        assertEquals("Balde", admin.produtoQueMaisVendeu().getProduto());
    }

    @Test
    public void vendaMaisValorTeste() {

        assertEquals("Balde",admin.vendaMaisValor().getProduto());
        assertNotEquals("Alimentacao",admin.vendaMaisValor().getTipoProduto());
        assertEquals(6.9,admin.vendaMaisValor().getPrecoUnitario());

    }
    @Test
    public void adicionarUtilizadorTest () throws IOException {

        String pathfile = "src/test/resources/login_grandesNegociosTeste.csv";

        admin.adicionarUtilizador(pathfile,"ADMIN","tobias","softdev");

        File file = new File(pathfile);

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
        assertEquals("tobias",username);
        assertEquals("softdev",password);
    }



    @Test
    public void valorVendasTeste () {

        assertEquals(7555.71,admin.valorVendas());
    }



    @Test
    public void mediaVendas (){

    assertNotEquals(2020.30,admin.mediaVendas());

    assertEquals(944.46375,admin.mediaVendas());


    }




}
