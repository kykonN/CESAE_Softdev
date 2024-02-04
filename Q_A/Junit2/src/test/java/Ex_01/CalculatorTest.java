package Ex_01;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculatorTest {


    // 1- Instanciar o objeto
    private Calculator calculadora;

    // 2- Dar Setup - BeforeEach - para dar Reset antes de cada teste;
    @BeforeEach
    public void setup() {
        calculadora = new Calculator();
    }

    // 3- Iniciar Teste
    @Test
    public void addTest() {
        assertEquals(10, calculadora.add(5, 5));
        assertEquals(0, calculadora.add(-5, 5));
        assertEquals(-5, calculadora.add(0, -5));
    }

    // Em cada Teste 1- @Test
    // ir metodo a metodo com pelo menos 3 verificações diferentres


    @Test
    public void subtractTest() {
        assertEquals(20, calculadora.subtract(30, 10));
        assertEquals(0, calculadora.subtract(30, 30));
        assertEquals(-30, calculadora.subtract(0, 30));
    }

    @Test
    public void multiplyTest() {
        assertEquals(5, calculadora.multiply(5, 1));
        assertEquals(0, calculadora.multiply(0, 0));
        assertEquals(-5, calculadora.multiply(1, -5));
    }

    @Test
    public void divideTest() {
        assertEquals(2, calculadora.divide(2, 1));


    }


    @Test
    public void testDivideByZero() {
        assertThrows(IllegalArgumentException.class, () -> {
            calculadora.divide(10, 0);
        });


    }
}
