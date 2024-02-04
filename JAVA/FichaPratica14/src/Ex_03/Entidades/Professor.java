package Ex_03.Entidades;


import Ex_03.enums.AreaFormacao;

import java.util.ArrayList;

public class Professor extends Pessoa {

    private int nivelAcademico;

    private ArrayList<AreaFormacao>areaFormacaos ;

    public Professor(String nome, int anoNascimento, String email, String telemovel, int nivelAcademico) {
        super(nome, anoNascimento, email, telemovel);
        this.nivelAcademico = nivelAcademico;
        this.areaFormacaos = new ArrayList<>();
    }

    @Override
    public void obterFuncao() {

    }

    @Override
    public void imprimirHorario() {

    }
}
