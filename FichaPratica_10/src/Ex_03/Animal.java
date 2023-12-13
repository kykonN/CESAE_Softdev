package Ex_03;

public class Animal {

    // 3. Crie uma classe animal, que tenha como atributos: nome, espécie, país de origem, peso (em kg) e
    //alimentação (array de Strings).
    //a. Crie um método para o animal comer, receba como parâmetro o alimento e o peso (em g). Se o
    //alimento constar na lista de alimentos que o animal come, incremente o seu peso com o peso da
    //refeição e imprima na consola “O animal comeu”. Caso contrário, não deve atualizar e imprimir na
    //consola “O animal recusou essa comida”.
    //b. Teste a classe instanciando um animal e apresentado uma refeição que ele goste, seguidamente
    //imprima o seu novo peso. A seguir, apresente uma refeição que ele não goste e imprima o seu
    //peso

    private String nome;

    private String especie;

    private String pais;

    private double peso;

    private String [] alimentacao;

    public Animal(String nome, String especie, String pais, double peso, String[] alimentacao) {
        this.nome = nome;
        this.especie = especie;
        this.pais = pais;
        this.peso = peso;
        this.alimentacao = alimentacao;
    }



    public void comer(double pesoalimento,String alimento){

        // conversão para Gramas
        pesoalimento=pesoalimento/1000;

        for (int indice=0;indice<this.alimentacao.length;indice++){
            if (alimento.equals(this.alimentacao[indice])){
                System.out.println("Peso do animal sem comer "+this.peso+"\n");
                System.out.println("O animal comeu");
                this.peso += pesoalimento;
                System.out.println("Peso do animal após refeição " + this.peso);
                return;

            } if (indice==this.alimentacao.length-1){
                System.out.println("O animal recusou essa comida ");
            }
        }



    }

}
