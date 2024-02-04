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
    void produtoMaisCaro() {

        assertEquals(5, cliente.produtoMaisCaro().getPrecoUnitario());
        assertEquals(40000.99, cliente.produtoMaisCaro().getPrecoUnitario());
    }

    @Test
    void produtosDisponiveisSemDuplicados() {
    }

    @Test
    void produtosDeCategoria() {
    }

    @Test
    void produtoMaisBarato() {
    }
}