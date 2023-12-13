package Pizzaria;

import Pizzaria.enums.UnidadeMedida;

public class Ingredientes {

    private String codigo;

    private String nome;

    private UnidadeMedida unidadeMedida;

    private double caloriasKcal;

    public Ingredientes(String codigo, String nome, UnidadeMedida unidadeMedida, double caloriasKcal) {
        this.codigo = codigo;
        this.nome = nome;
        this.unidadeMedida = unidadeMedida;
        this.caloriasKcal = caloriasKcal;
    }


    public String getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public UnidadeMedida getUnidadeMedida() {
        return unidadeMedida;
    }

    public double getCaloriasKcal() {
        return caloriasKcal;
    }
}
