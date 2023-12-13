package Ex_02;

public class Cao {

    // 1 -Primeiro digo o que define um cão


    private String nome;

    private String raca;

    private String latido = "au au au";


//2 -Definir atributos para o objeto

    Cao(String nome, String raca) {

        this.nome = nome;
        this.raca = raca;

    }

    // 3 - Dar get dos atributos
    public String getNome() {
        return nome;
    }

    public String getRaca() {
        return raca;
    }

    public String getLatido() {
        return latido;
    }

    public void setLatido(String latido) {
        this.latido = latido;

    }
}
