package Ex_03.Escola;

import Ex_03.enums.AreaFormacao;

import java.util.Scanner;

public class Disciplina {

    private String nome;

    private AreaFormacao areaFormacao;

    private int duracaoHoras;

    public Disciplina(String nome, AreaFormacao areaFormacao, int duracaoHoras) {
        this.nome = nome;
        this.areaFormacao = areaFormacao;
        this.duracaoHoras = duracaoHoras;
    }


    public Disciplina () {

        Scanner input = new Scanner(System.in);

        System.out.println("Insira nome da disciplina");

        this.nome = input.next();

        System.out.println("Insira area de Formação");
        this.areaFormacao = AreaFormacao.valueOf(input.next());

        System.out.println("Adicione a duração da disciplina");
        this.duracaoHoras = input.nextInt();
    }
}
