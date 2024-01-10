package Ex_05;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FuncionarioTeste {

    private Funcionario joao;

    private Funcionario joanaF;

    @BeforeEach
    public void setup () {

        joao = new Funcionario("joao",2500.0,"Devop");

        joanaF = new Funcionario("joanaF",5000.0,"teamleading");
    }


    @Test
    public void aumentarSalarioTeste (){

        assertEquals(33750.0,joao.aumentarSalario(1250.0));

        assertEquals(130000.0,joanaF.aumentarSalario(2500.0));
    }
}
