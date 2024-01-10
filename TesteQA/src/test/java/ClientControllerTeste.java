import Controllers.ClientController;
import Domain.Venda;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ClientControllerTeste {

    ClientController clienteTeste;



    @BeforeEach
    public void setup (String path) throws FileNotFoundException {

        clienteTeste = new ClientController ("src/test/resources/minimercadoTeste.csv");
    }

@Test
    public void produtoMaisCaro() {

       assertEquals(12.99, clienteTeste.produtoMaisCaro());



    }


}
