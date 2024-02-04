package Ex_04;

public class Circulo {

    //1- Definir atributos a definir para o objeto;
    //2- Metodo construtor para perimetro e area do retangulo;
    //3- lista de comportamento ou metodo;
    /* ----------------------------------------------------------------------------------------------------------------*/

    //1- Definir atributos a definir para o objeto;


    private double raio;



    /* ----------------------------------------------------------------------------------------------------------------*/

    //2- Metodo construtor para perimetro e area do retangulo;


    public Circulo(double raio) {

        this.raio = raio;
    }
    /* ----------------------------------------------------------------------------------------------------------------*/

    //3- lista de comportamento ou metodo;

    public double calcularArea (){
        return 3.14*(this.raio*raio);
    }

    public double calcularperimetro (){
        return 2*3.14*raio;
    }


}


