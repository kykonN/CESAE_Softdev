package Ex_04;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RetanguloTest {

  private  Retangulo novoretangulo;
   private Retangulo retanguloteste;


    @BeforeEach
    public void setup () {

        novoretangulo = new Retangulo(20,10);
        retanguloteste = new Retangulo(5,10);
    }

    @Test
    public void perimetroTest (){
        assertEquals(60,novoretangulo.calcularPerimetro());
        assertEquals(30,retanguloteste.calcularPerimetro());
    }

@Test
    public void areaTeste () {

        assertEquals(200,novoretangulo.calcularArea());
        assertEquals(50,retanguloteste.calcularArea());

    }
    }


