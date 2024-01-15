package Controllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class LoginControllerTest {

    private LoginController loginTest;

    @BeforeEach
    void setUp() throws FileNotFoundException {
        loginTest = new LoginController("src/test/resources/login_grandesNegociosTest.csv");
    }

    @Test
    void validarLogin() throws FileNotFoundException {


        File file = new File("src/test/java/Controllers/LoginControllerTest.java");
        Scanner scanner = new Scanner(file);

        String tipoUtilizador = "";
        String username = "";
        String passeword = "";

        String linha = scanner.nextLine();

        while (scanner.hasNextLine()) {

            linha = scanner.nextLine();
            String[] linhaDividida = linha.split(";");


            tipoUtilizador = linhaDividida[0];
            username = linhaDividida[1];
            passeword = linhaDividida[2];

        }

        assertEquals("ADMIN", tipoUtilizador);
        assertEquals("vitor", username);
        assertEquals("cesae", passeword);

    }
}