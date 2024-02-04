package Controllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;

import static org.junit.jupiter.api.Assertions.*;

class ClientControllerTest {

    ClientController cliente;

    @BeforeEach
    void setUp() throws FileNotFoundException {

        cliente = new ClientController("src/test/resources/minimercadoTest.csv");

    }

    @Test
    void produtoMaisCaroTest() {

        assertEquals(100, cliente.produtoMaisCaro().getPrecoUnitario());
        assertEquals("Jogos",cliente.produtoMaisCaro().getTipoProduto());
        assertEquals("GTA6",cliente.produtoMaisCaro().getProduto());
    }

    @Test
    void produtosDisponiveisSemDuplicadosTest() {

        assertEquals(9, cliente.produtosDisponiveisSemDuplicados().size());
        assertEquals("GTA6", cliente.produtosDisponiveisSemDuplicados().get(8).getProduto());
    }



    @Test
    void produtosDeCategoriaTest() {


        assertEquals("Alimentacao", cliente.produtosDeCategoria("Alimentacao").get(0).getTipoProduto());
        assertEquals("Jogos", cliente.produtosDeCategoria("Jogos").get(0).getTipoProduto());



    }

    @Test
    void produtoMaisBaratoTest() {

      assertEquals("Pilhas AA", cliente.produtoMaisBarato().getProduto());
      assertEquals("Higiene", cliente.produtoMaisBarato().getTipoProduto());
      assertEquals(0.99, cliente.produtoMaisBarato().getPrecoUnitario());

    }
}