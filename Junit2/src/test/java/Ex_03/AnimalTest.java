package Ex_03;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AnimalTest {

    private Animal tobias;


    private Animal rolex;


    @BeforeEach
    public void setup() {


        tobias = new Animal("tobias", Alimento.CARNE);

        rolex = new Animal("rolex", Alimento.FRUTAS);
    }

    @Test
    public void nomeTest() {
        assertEquals("tobias", tobias.getNome());
        assertEquals("rolex", rolex.getNome());

    }


    // A verificação não pode ser feita a funções VOID ...
    // verificar as funções não Voids
    @Test
    public void comerCarneTest (){
        assertTrue(tobias.estaComFome());
        tobias.comer(Alimento.CARNE);
        assertFalse(tobias.estaComFome());


        assertTrue(rolex.estaComFome());
        rolex.comer(Alimento.CARNE);
        assertTrue(rolex.estaComFome());
    }

    public void comerFruta (){
        assertTrue(tobias.estaComFome());
        tobias.comer(Alimento.FRUTAS);
        assertTrue(tobias.estaComFome());

        assertTrue(rolex.estaComFome());
        rolex.comer(Alimento.FRUTAS);
        assertFalse(rolex.estaComFome());

    }

    public void comerPeixeTest (){
        assertTrue(tobias.estaComFome());
        tobias.comer(Alimento.PEIXE);
        assertTrue(tobias.estaComFome());

        assertTrue(rolex.estaComFome());
        rolex.comer(Alimento.PEIXE);
        assertTrue(rolex.estaComFome());
    }


    public void comerVegetais (){
        assertTrue(tobias.estaComFome());
        tobias.comer(Alimento.VEGETAIS);
        assertTrue(tobias.estaComFome());

        assertTrue(rolex.estaComFome());
        rolex.comer(Alimento.VEGETAIS);
        assertTrue(rolex.estaComFome());
    }
}
